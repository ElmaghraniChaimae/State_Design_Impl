package org.elmaghrani.States;

public class AirState implements State {
    @Override
    public void sortirDuGarage() {
        System.out.println("Impossible de sortir du garage en étant en l'air");
    }

    @Override
    public void entrerAuGarage() {
        System.out.println("Impossible d'entrer au garage en étant en l'air");
    }

    @Override
    public void decoller() {
        System.out.println("L'avion est déjà en l'air");
    }

    @Override
    public void atterrir() {
        System.out.println("Avion sur la piste");
    }
}
