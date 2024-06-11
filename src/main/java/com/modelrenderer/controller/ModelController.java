package com.modelrenderer.controller;

import com.modelrenderer.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ModelController {

    @Autowired
    private ModelService modelService;

    @GetMapping("/getRelatedComponent")
    public Object getComponent(@RequestParam String query)
    {
        return modelService.getElement(query);
    }
}
