package org.elmaghrani.States;

import org.elmaghrani.Client.Avion;

public class GarageState implements State {
    @Override
    public void sortirDuGarage() {
        System.out.println("Avion sur la piste");
    }

    @Override
    public void entrerAuGarage() {
        System.out.println("L'avion est déjà dans le garage");
    }

    @Override
    public void decoller() {
        System.out.println("Impossible de décoller depuis le garage");
    }

    @Override
    public void atterrir() {
        System.out.println("Impossible d'atterrir dans le garage");
    }
}

