package org.elmaghrani.Client;

import org.elmaghrani.States.GarageState;
import org.elmaghrani.States.State;

public class Avion {
    private State state;

    public Avion() {
        // État initial
        this.state = new GarageState();
    }

    public void changerEtat(State newState) {
        this.state = newState;
    }

    public void sortirDuGarage() {
        state.sortirDuGarage();
    }

    public void entrerAuGarage() {
        state.entrerAuGarage();
    }

    public void decoller() {
        state.decoller();
    }

    public void atterrir() {
        state.atterrir();
    }
}

