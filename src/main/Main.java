package main;

import model.ModelRFC;
import view.ViewRFC;
import controller.ControllerRFC;

public class Main {

    public static void main(String[] args) {
        ModelRFC modelRFC = new ModelRFC();
        ViewRFC viewRFC = new ViewRFC();
        ControllerRFC controllerRFC = new ControllerRFC(modelRFC, viewRFC);
    }

}
