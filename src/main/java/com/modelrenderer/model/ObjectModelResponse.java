package com.modelrenderer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;


@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ObjectModelResponse {
    private ArrayList<String> muscles = new ArrayList<>();
    private ArrayList<String> origins = new ArrayList<>();
    private ArrayList<String> intersections = new ArrayList<>();
    private ArrayList<String> courses = new ArrayList<>();
    private ArrayList<String> nerves = new ArrayList<>();

    public ArrayList<String> getMuscles() {
        return muscles;
    }

    public void setMuscles(ArrayList<String> muscles) {
        this.muscles = muscles;
    }

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
