/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


public class Controller {

    private final Modell model;
    private final Nezet view;

    public Controller(Modell model, Nezet view) {
        this.model = model;
        this.view = view;
    }

    public void jatek() {
        view.udvozles();
        view.ladakMegjelenitese(model);

        boolean megtalalta = false;
        while (!megtalalta) {
            int tipp = view.tippBekeres(model.getLadakSzama());
            if (model.tippel(tipp)) {
                megtalalta = true;
            } else {
                view.rossz(model.getNev(tipp));
            }
        }
        view.nyert(model.getKincsLadaNev(), model.getProbalkozasok());
    }
}
