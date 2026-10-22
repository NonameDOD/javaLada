package controller;

import modell.Modell;
import nezet.Nezet;

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
