package com.isitech.bibliotheque.interfaces;

import com.isitech.bibliotheque.exceptions.BibliothequeException;

@FunctionalInterface
public interface Validateur<T> {

    /**
     * Valide un objet
     * @param objet a valider
     * @throws BibliothequeException si c'est pas valide
     */
    void valider(T objet) throws BibliothequeException;

    /**
     * Combine deux validateurs (ET logique)
     * genre tu peux mettre deux regles en meme temps
     */
    default Validateur<T> et(Validateur<T> autre) {
        return objet -> {
            this.valider(objet);
            autre.valider(objet);
        };
    }

    /**
     * Validateur qui fait rien (pattern Null Object)
     * utile si tu veux juste un valideur vide
     */
    static <T> Validateur<T> vide() {
        return objet -> { /* rien a faire */ };
    }
}
