package model;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
public class Utilisateur {

    @NotEmpty(message = "prenom vide")
    private String prenom;
    @NotEmpty
    private String nom;
    @NotEmpty
    private String username;
    @Length(min = 3)
    private String password;

    public Utilisateur() {
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
