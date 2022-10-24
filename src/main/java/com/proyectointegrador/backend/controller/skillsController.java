package com.proyectointegrador.backend.controller;

import com.proyectointegrador.backend.domain.Skills;

import com.proyectointegrador.backend.service.skillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class skillsController {
    @Autowired
    private skillsService skillsService;

    /**
     * <p>Get all skills data in the system.
     * @return List<Skills>
     */
    @GetMapping("/skills")
    public Iterable<Skills> getSkills() {
        return skillsService.findAll();
    }
}
