package com.github.xenteros.dto;

import java.util.List;

public class AuthorDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String country;
    private List<BookDTO> bookDTOs;

    public AuthorDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public List<BookDTO> getBookDTOs() {
        return bookDTOs;
    }

    public void setBookDTOs(List<BookDTO> bookDTOs) {
        this.bookDTOs = bookDTOs;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
