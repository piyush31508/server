package com.panthera.server.controller;

import com.panthera.server.model.DataEntity;
import com.panthera.server.repo.DataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/data")
@CrossOrigin(
        origins = "*",
        allowedHeaders = "*",
        methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS}
)
public class DataController {

    @Autowired
    private DataRepo repo;

    @GetMapping
    public List<DataEntity> getAllProperties() {
        return repo.findAll();
    }
}