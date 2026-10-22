/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

/**
 *
 * @author foti.david
 */
public class Modell {
 
    private final String[] nevek = {"arany", "ezüst", "bronz"};
    private final String[] feliratok = {
        "Én rejtem a kincset.",
        "Nem én rejtem a kincset.",
        "Az arany hazudik."
    };
 
    private final int kincsHelye;   // 0, 1 vagy 2
    private int probalkozasok;
 
    public Modell() {
        this.kincsHelye = megold();
        this.probalkozasok = 0;
    }
    private boolean allitasIgaz(int lada, int kincsHelye) {
        switch (lada) {
            case 0:  return kincsHelye == 0;       
            case 1:  return kincsHelye != 1;       
            case 2:  return !allitasIgaz(0, kincsHelye);
            default: throw new IllegalArgumentException("Ismeretlen láda: " + lada);
        }
    }
    private int megold() {
        for (int t = 0; t < nevek.length; t++) {
            int igazak = 0;
            for (int l = 0; l < nevek.length; l++) {
                if (allitasIgaz(l, t)) {
                    igazak++;
                }
            }
            if (igazak == 1) {
                return t;
            }
        }
        throw new IllegalStateException("A feladatnak nincs megoldása.");
    }
    public boolean tippel(int lada) {
        probalkozasok++;
        return lada == kincsHelye;
    }
    public int getLadakSzama() {
        return nevek.length;
    }
    public String getNev(int lada) {
        return nevek[lada];
    }
    public String getFelirat(int lada) {
        return feliratok[lada];
    }
    public int getProbalkozasok() {
        return probalkozasok;
    }
    public String getKincsLadaNev() {
        return nevek[kincsHelye];
    }
}
