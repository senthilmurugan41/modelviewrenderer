package com.modelrenderer.model;

import lombok.*;

import java.util.ArrayList;


@NoArgsConstructor
@Builder
@AllArgsConstructor
public class DataSet {
    private ArrayList<String> origins = new ArrayList<>();
    private ArrayList<String> intersections = new ArrayList<>();
    private ArrayList<String> courses = new ArrayList<>();
    private ArrayList<String> nerves = new ArrayList<>();

    public ArrayList<String> getOrigins() {
        return origins;
    }

    public void setOrigins(ArrayList<String> origins) {
        this.origins = origins;
    }

    public ArrayList<String> getIntersections() {
        return intersections;
    }

    public void setIntersections(ArrayList<String> intersections) {
        this.intersections = intersections;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public ArrayList<String> getNerves() {
        return nerves;
    }

    public void setNerves(ArrayList<String> nerves) {
        this.nerves = nerves;
    }
}
