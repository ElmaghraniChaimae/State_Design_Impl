package org.elmaghrani;

import org.elmaghrani.Client.Avion;

public class Main {
    public static void main(String[] args) {
        Avion avion = new Avion();

        avion.sortirDuGarage();  // Avion sur la piste
        avion.atterrir();        // Impossible d'atterrir sur la piste

        avion.decoller();        // Avion en l'air
        avion.sortirDuGarage();  // Impossible de sortir du garage en étant en l'air
        avion.entrerAuGarage();  // Impossible d'entrer au garage en étant en l'air

        avion.atterrir();        // Avion sur la piste
        avion.entrerAuGarage();  // Avion dans le garage    }
}
}