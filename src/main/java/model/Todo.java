package model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "idea")
public class Todo {

    // generation value indiqueque l id est genere de facon automatique lors e l
    // inettion en base, Elle est utilisée avec une autre annotation @Id qui permet
    // de mapper une clé primaire sur un champ unique.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String titre;

    private String texte;

    private int date;

    private boolean done;

    public Todo() {
    }

    public Todo(Long id, String titre, String texte, int date, boolean done) {
        this.id = id;
        this.titre = titre;
        this.texte = texte;
        this.date = date;
        this.done = done;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return this.titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getTexte() {
        return this.texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public int getDate() {
        return this.date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public boolean isDone() {
        return this.done;
    }

    public boolean getDone() {
        return this.done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Todo id(Long id) {
        setId(id);
        return this;
    }

    public Todo titre(String titre) {
        setTitre(titre);
        return this;
    }

    public Todo texte(String texte) {
        setTexte(texte);
        return this;
    }

    public Todo date(int date) {
        setDate(date);
        return this;
    }

    public Todo done(boolean done) {
        setDone(done);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Todo)) {
            return false;
        }
        Todo todo = (Todo) o;
        return Objects.equals(id, todo.id) && Objects.equals(titre, todo.titre) && Objects.equals(texte, todo.texte)
                && date == todo.date && done == todo.done;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titre, texte, date, done);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", titre='" + getTitre() + "'" +
                ", texte='" + getTexte() + "'" +
                ", date='" + getDate() + "'" +
                ", done='" + isDone() + "'" +
                "}";
    }

}
