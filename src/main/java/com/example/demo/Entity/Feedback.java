package com.example.demo.Entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int number;

    private int rating;

    // Getters and Setters
    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", name=" + name + ", number=" + number + ", rating=" + rating + "]";
	}
    
    
}