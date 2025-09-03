package services;

import com.isitech.bibliotheque.models.Livre;
import java.util.ArrayList;
import java.util.List;

public class BibliothequeService {
    private List<Livre> livres;
    private String nom;

    public BibliothequeService(String nom) {
        this.nom = nom;
        this.livres = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        for (Livre l : livres) {
            if (l.getIsbn().equals(livre.getIsbn())) {
                System.out.println("❌ Livre déjà existant (même ISBN) !");
                return;
            }
        }
        livres.add(livre);
    }

    public boolean supprimerLivre(String isbn) {
        return livres.removeIf(l -> l.getIsbn().equals(isbn));
    }

    public Livre rechercherParTitre(String titre) {
        for (Livre l : livres) {
            if (l.getTitre().equalsIgnoreCase(titre)) return l;
        }
        return null;
    }

    public Livre rechercherParAuteur(String auteur) {
        for (Livre l : livres) {
            if (l.getAuteur().equalsIgnoreCase(auteur)) return l;
        }
        return null;
    }

    public Livre rechercherParISBN(String isbn) {
        for (Livre l : livres) {
            if (l.getIsbn().equals(isbn)) return l;
        }
        return null;
    }

    public void afficherCatalogue() {
        System.out.println("\n=== Catalogue de " + nom + " ===");
        if (livres.isEmpty()) {
            System.out.println("Aucun livre dans la bibliothèque.");
        } else {
            for (int i = 0; i < livres.size(); i++) {
                System.out.println((i + 1) + ". " + livres.get(i));
            }
        }
    }

    public void afficherStatistiques() {
        long disponibles = livres.stream().filter(Livre::isDisponible).count();
        long empruntes = livres.size() - disponibles;

        System.out.println("\n=== Statistiques ===");
        System.out.println("Total livres: " + livres.size());
        System.out.println("Disponibles: " + disponibles);
        System.out.println("Empruntés: " + empruntes);
    }
}
