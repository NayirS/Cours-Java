package com.isitech.bibliotheque.exceptions;

/**
 * Exception generique pour la bibliotheque
 * pour attraper tout ce qui concerne la biblio
 */
public class BibliothequeException extends Exception {

    /**
     * Constructeur simple avec message
     */
    public BibliothequeException(String message) {
        super(message);
    }

    /**
     * Constructeur avec message et cause
     */
    public BibliothequeException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructeur avec cause seulement
     */
    public BibliothequeException(Throwable cause) {
        super(cause);
    }
}
