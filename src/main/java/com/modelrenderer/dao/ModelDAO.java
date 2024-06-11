package com.modelrenderer.dao;

import com.modelrenderer.model.DataSet;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
@CrossOrigin
public class ModelDAO {

    public HashMap<String, DataSet> constructModel()
    {
        HashMap<String,DataSet> dataset = new HashMap<>();
        ArrayList<String> origin = new ArrayList<>();
        origin.add("Scapula");
        origin.add("Clavicle");
        ArrayList<String> intersection = new ArrayList<>();
        intersection.add("Humerus");
        ArrayList<String> nerves = new ArrayList<>();
        nerves.add("Axillary");
        DataSet dataSet1 = new DataSet();
        dataSet1.setIntersections(intersection);
        dataSet1.setOrigins(origin);
        dataSet1.setNerves(nerves);
        dataset.put("Deltoid",dataSet1);
        ArrayList<String> intersection1 = new ArrayList<>();
        intersection1.add("Radius");
        ArrayList<String> origin1 = new ArrayList<>();
        origin1.add("Scapula");
        ArrayList<String> course  = new ArrayList<>();
        course.add("Humerus");
        ArrayList<String> nerves1 = new ArrayList<>();
        nerves1.add("Musculocut nerve");
        DataSet dataSet2 = new DataSet();
        dataSet2.setIntersections(intersection1);
        dataSet2.setCourses(course);
        dataSet2.setNerves(nerves1);
        dataSet2.setOrigins(origin1);
        dataset.put("Biceps", dataSet2);
        return dataset;
    }


}
