public class Livre {
    private String titre;
    private String auteur;
    private String isbn;
    private boolean disponible;

    // Constructeurs
    public Livre() {
        this.disponible = true;
    }

    public Livre(String titre, String auteur, String isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.disponible = true;
    }

    // Getters et Setters
    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }

    public String getAuteur() { return auteur; }
    public void setAuteur(String auteur) { this.auteur = auteur; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    public String toString() {
        String statut = disponible ? "Disponible" : "Emprunté";
        return String.format("'%s' par %s (ISBN: %s) - %s", titre, auteur, isbn, statut);
    }


    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Livre)) return false;
        Livre autre = (Livre) obj;
        return this.isbn.equals(autre.isbn);
    }

}
