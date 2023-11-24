package org.elmaghrani.States;

import org.elmaghrani.Client.Avion;

public class PisteState implements State {
    public PisteState(Avion avion) {

    }

    @Override
    public void sortirDuGarage() {
        System.out.println("L'avion est déjà sur la piste");
    }

    @Override
    public void entrerAuGarage() {
        System.out.println("Avion dans le garage");
    }

    @Override
    public void decoller() {
        System.out.println("Avion en l'air");
    }

    @Override
    public void atterrir() {
        System.out.println("Impossible d'atterrir sur la piste");
    }
}

