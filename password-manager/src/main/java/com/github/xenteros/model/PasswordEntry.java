package com.github.xenteros.model;

/**
 * Klasa powinna przechowywać hasło wraz z kluczem (np nazwą serwisu, do którego jest dedykowane).
 * Ponadto, niech pozwala na przechowanie loginu do tego serwisu.
 */
public class PasswordEntry {

    private Long id;
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
}
