package com.gamingroom;

public class Entity {

//private section
private long id;
private String name;

//Default constructor
private Entity() {
}

//Default constructor
public Entity(long id, String name) {
this(); 
this.id = id;
this.name = name;
}

//get ID
public long getId() {
return id;
}

//Get Name
public String getName() {
return name;
}

//Show ID and Name
public String toString() {
return "Entity [id=" + id + ", name=" + name + "]";
}
}