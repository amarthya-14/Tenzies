package com.codecademy.tenzies_backend;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.CollectionCallback;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Tenzies_Leaderboard")
public class LeaderBoard {
    @Id
    private String id;
    private String name;
    private double time;

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
