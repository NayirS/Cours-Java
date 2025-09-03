package com.isitech.bibliotheque;

import com.isitech.bibliotheque.models.*;

public class Main {
    public static void main(String[] args) {
        // Création d'un étudiant
        Etudiant etu = new Etudiant("Alice", "alice@email.com", "E123", 2, "Informatique");

        // Création d'un livre
        Livre livre = new Livre("Java pour les nuls", "John Doe", "1234567890");

        // Affichage des infos
        System.out.println(etu);
        System.out.println(livre);

        if (etu.peutEmprunter()) {
            etu.incrementerEmprunts();
            livre.setDisponible(false);
            System.out.println("Emprunt Fait");
        }

        System.out.println(etu);
        System.out.println(livre);
    }
}
