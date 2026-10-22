/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import controller.Controller;
import modell.Modell;
import nezet.Nezet;

public class KincsLada {

    public static void main(String[] args) {
        Modell model = new Modell();
        Nezet view = new Nezet();
        Controller controller = new Controller(model, view);
        controller.jatek();
    }
   
}
