package com.isitech.bibliotheque.models;

public class Etudiant extends Utilisateur {
    private String numeroEtudiant;
    private int niveau; // 1=L1, 2=L2, 3=L3, 4=M1, 5=M2
    private String filiere;

    public Etudiant(String nom, String email, String numeroEtudiant, int niveau, String filiere) {
        super(nom, email);
        this.numeroEtudiant = numeroEtudiant;
        this.niveau = niveau;
        this.filiere = filiere;
        this.maxEmprunts = niveau <= 3 ? 3 : 5;
    }

    @Override
    public int getDureeEmpruntMax() {
        return 15;
    }

    @Override
    public boolean peutEmprunterType(Livre livre) {
        return true;
    }

    @Override
    public String getTypeUtilisateur() {
        return "Étudiant " + getNiveauLibelle();
    }

    private String getNiveauLibelle() {
        return switch (niveau) {
            case 1 -> "L1";
            case 2 -> "L2";
            case 3 -> "L3";
            case 4 -> "M1";
            case 5 -> "M2";
            default -> "N/A";
        };
    }

    // Getters
    public String getNumeroEtudiant() { return numeroEtudiant; }
    public int getNiveau() { return niveau; }
    public String getFiliere() { return filiere; }
}
