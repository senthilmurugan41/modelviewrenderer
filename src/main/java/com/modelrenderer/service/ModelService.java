package com.modelrenderer.service;

import com.modelrenderer.dao.ModelDAO;
import com.modelrenderer.model.DataSet;
import com.modelrenderer.model.ObjectModelResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.HashMap;

@Service
@CrossOrigin
public class ModelService {
    @Autowired
    private ModelDAO modelDAO;

    public ObjectModelResponse getElement(String query)
    {
        ObjectModelResponse objectModelResponse = new ObjectModelResponse();
        HashMap<String, DataSet> dataset = modelDAO.constructModel();
        String tempQuery = query.toLowerCase();
        for(String key: dataset.keySet())
        {
            if(tempQuery.contains(key.toLowerCase()))
            {
                objectModelResponse.getMuscles().add(key);
                DataSet value = dataset.get(key);
                objectModelResponse.getCourses().addAll(value.getCourses());
                objectModelResponse.getIntersections().addAll(value.getIntersections());
                objectModelResponse.getOrigins().addAll(value.getOrigins());
                objectModelResponse.getNerves().addAll(value.getNerves());
            }
        }
        return objectModelResponse;
    }
}
