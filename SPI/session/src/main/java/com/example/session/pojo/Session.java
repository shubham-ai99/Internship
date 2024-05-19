package com.example.session.pojo;

import java.util.ArrayList;
import java.util.List;

public class Session {
    private static int idCounter = 1;

    private int id;
    private String name;
    private String email;
    private List<LineItem> lineItems;

    public Session() {
        this.id = idCounter++;
        this.lineItems = new ArrayList<>();
    }

    public static void incrementIdCounter() {
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Session.idCounter = idCounter;
    }


    // Getters and setters for id, name, and email
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public void put(int id, Session session) {
    }

    // Other methods as needed
}

