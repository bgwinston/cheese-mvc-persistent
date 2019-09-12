package org.launchcode.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Menu {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 3, max = 15)
    private String name;

    //join column
    @ManyToMany
    private List<Cheese> cheeses = new ArrayList<>();

    // Implementations
    public Menu() { }

    public Menu(String name) {
        this.name = name;
    }

    // Add cheese item to given menu's cheese list
    public void addItem(Cheese item) {
        cheeses.add(item);
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cheese> getCheeses() {
        return cheeses;
    }
}