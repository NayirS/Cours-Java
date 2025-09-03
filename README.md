
# Projet Java avec IntelliJ IDEA, JDK 21 et JavaFX 21
## Prérequis
- IntelliJ IDEA 
- JDK 21 
- JavaFX 21 SDK 

## Installation JDK 21
1. Télécharger JDK 21 : [OpenJDK 21 - Adoptium Temurin] (pas réussi à trouver un autre lien dans la doc)
2. Installer JDK 21 
3. Dans IntelliJ : `File > Project Structure > Project SDK` → ajouter le JDK 21 si non détecté, et le sélectionner pour le projet.

## Installation JavaFX 21
1. Télécharger le SDK complet 
2. Extraire le ZIP dans un dossier simple
3. Vérifier que le dossier `lib` contient les `.jar` (`javafx.controls.jar`, etc.)

## Configuration JavaFX dans IntelliJ
1. `File > Project Structure > Libraries > + > Java`
2. Sélectionner **tous les `.jar` dans le dossier lib**
3. Choisir **Classes**
4. Vérifier que le module de ton projet dépend de cette librairie.

## Configuration Run Configuration
1. `Run > Edit Configurations > + > Application`
2. Paramètres :
   - Main class : `Main` 
   - Use classpath of module
   - JRE : JDK 21
3. exécuter.

# Projet Java – Exercices et Fil Rouge

Ce projet regroupe plusieurs travaux réalisés pour pratiquer la programmation en Java, allant des exercices simples à un mini-projet de gestion de bibliothèque orienté objet.

# Projet Java – TP1 et TP2

Ce projet contient les travaux réalisés dans le cadre des TP1 et TP2 du cours de Java, allant d'exercices simples à un projet fil rouge plus complet.

---

## TP1 – Exercices

### 1. Calculatrice

* Calculatrice simple pour les opérations de base (+, -, \*, /).
* Gestion des erreurs : division par zéro, saisie invalide.

```java
double resultat = Exo1.calculer(10, 5, '+'); // 15
double division = Exo1.calculer(10, 2, '/'); // 5
```

### 2. Nombres Premiers

* Vérification des nombres premiers dans une liste.

```java
int[] nombres = {2, 3, 4, 17, 25, 29, 97, 100};
for (int n : nombres) {
    if (Exo2.estPremier(n)) {
        System.out.println(n + " est premier");
    } else {
        System.out.println(n + " n'est pas premier");
    }
}

public static boolean estPremier(int n) {
    if (n < 2) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
}
```

### 3. FizzBuzz

* Affiche les nombres de 1 à 100 selon les règles FizzBuzz.

```java
for (int i = 1; i <= 100; i++) {
    System.out.println(Exo3.fizzBuzz(i));
}

public static String fizzBuzz(int n) {
    if (n % 15 == 0) return "FizzBuzz";
    else if (n % 3 == 0) return "Fizz";
    else if (n % 5 == 0) return "Buzz";
    else return String.valueOf(n);
}
```

### 4. Fil Rouge – Gestion de bibliothèque (POO)

* Gestion d’une bibliothèque avec utilisateurs et livres.
* Implémentation de classes abstraites et concrètes : `Utilisateur`, `Etudiant`, `Professeur`, `Personnel`, `Livre`, `Bibliotheque`.

```java
Etudiant etu = new Etudiant("Alice", "alice@email.com", "E001", 2, "Info");
Professeur prof = new Professeur("Bob", "bob@email.com", "Math");
Personnel pers = new Personnel("Claire", "claire@email.com", "Accueil", "Secrétaire");

Livre livre1 = new Livre("Java pour les nuls", "John Doe", "ISBN001");
Livre livre2 = new Livre("Clean Code", "Robert Martin", "978-0132350884");
```

* Exemple d’emprunt :

```java
if (etu.peutEmprunter()) {
    etu.incrementerEmprunts();
    livre1.setDisponible(false);
    System.out.println("Emprunt effectué !");
}

System.out.println(etu);
System.out.println(livre1);
```

---

## TP2 – Création des entités de base avec POO

### Objectif

* Appliquer les concepts POO avancés : héritage, polymorphisme, interfaces.
* Refactoriser le projet TP1 vers une architecture orientée objet.
* Utiliser les collections Java et implémenter des patterns simples.

### Classes principales créées

* `Utilisateur` (abstraite) avec sous-classes : `Etudiant`, `Professeur`, `Personnel`
* `Livre` : informations et disponibilité
* `BibliothequeService` : gestion des livres et des utilisateurs
* `Main.java` : point d'entrée pour tester les entités et la logique

```java
BibliothequeService bibliotheque = new BibliothequeService("Bibliothèque ISITECH");
Etudiant etu = new Etudiant("Alice", "alice@email.com", "E001", 2, "Info");
Livre livre = new Livre("Clean Code", "Robert Martin", "978-0132350884");

bibliotheque.ajouterLivre(livre);
System.out.println(etu);
System.out.println(livre);
```

* Chaque classe est dans son propre fichier, avec getters/setters, méthodes abstraites et polymorphisme.
* Exemple d’initialisation et menu interactif dans `Main.java` :

```java
Main.main(args);
```

* Menu proposé : afficher catalogue, ajouter un livre, rechercher un livre, supprimer un livre, statistiques.

### Notes

* Les entités de TP2 servent de base pour les futurs services et l’intégration de la logique métier.
* Tous les codes respectent l’architecture POO.





