package com.isitech.bibliotheque.interfaces;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface Cherchable<T> {

    Optional<T> rechercherParId(String id);

    List<T> rechercherPar(Predicate<T> critere);

    List<T> rechercherTexte(String texte);

    List<T> obtenirTous();


    long compter(Predicate<T> critere);
}
