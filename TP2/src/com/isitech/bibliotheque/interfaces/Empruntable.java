package com.isitech.bibliotheque.interfaces;

import com.isitech.bibliotheque.models.Utilisateur;
import com.isitech.bibliotheque.exceptions.EmpruntImpossibleException;

public interface Empruntable {
    boolean estDisponible();
    void emprunter(Utilisateur utilisateur) throws EmpruntImpossibleException;
    void retourner();
    Utilisateur getEmprunteur();
    java.time.LocalDate getDateEmprunt();
    java.time.LocalDate getDateRetourPrevue();
}
