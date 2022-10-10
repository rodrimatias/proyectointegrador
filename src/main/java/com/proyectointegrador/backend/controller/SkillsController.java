package com.proyectointegrador.backend.controller;

import com.proyectointegrador.backend.domain.Skills;
import com.proyectointegrador.backend.service.SkillsService;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillsController {
    @Resource(name = "skillsService")
    private SkillsService skillsService;

    /**
     * <p>Get all skills data in the system.
     * @return List<Skills>
     */
    @GetMapping
    public List<Skills> getSkills() {
        return skillsService.findAll();
    }
}
