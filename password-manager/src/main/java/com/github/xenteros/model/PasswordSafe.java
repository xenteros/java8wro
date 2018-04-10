package com.github.xenteros.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Ta klasa powinna przechowywać PasswordEntries w wybranej przez Ciebie strukturze. Do wyboru masz: List, Set, Map.
 * Zanim podejmiesz decyzję, poświęć 5 minut na wypisanie zalet i wad każdej ze struktur. Powstrzymaj się od strzelania!
 */
public class PasswordSafe {

    private Map<Long, PasswordEntry> entries = new HashMap<>();

    public void addEntry(String service, String login, char[] password) {

    }

    public void removeEntry(String service, String login) {

    }

    public char[] getPassword(String service, String login) {
        return null;
    }
}
