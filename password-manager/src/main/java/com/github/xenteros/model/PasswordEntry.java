package com.github.xenteros.model;

import java.util.UUID;

/**
 * Klasa powinna przechowywać hasło wraz z kluczem (np nazwą serwisu, do którego jest dedykowane).
 * Ponadto, niech pozwala na przechowanie loginu do tego serwisu.
 */
public class PasswordEntry {

    private Long id;
    private final String uuid = UUID.randomUUID().toString();
    private String service;
    private String login;
    private char[] password;

    public PasswordEntry(Long id, String service, String login, char[] password) {
        this.id = id;
        this.service = service;
        this.login = login;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getService() {
        return service;
    }

    public String getLogin() {
        return login;
    }

    public char[] getPassword() {
        return password;
    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof PasswordEntry)) {
            return false;
        }
        PasswordEntry that = (PasswordEntry) obj;
        return this.uuid.equals(that.uuid);
    }
}
