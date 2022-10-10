package com.proyectointegrador.backend.serviceImpl;

import com.proyectointegrador.backend.domain.Skills;
import com.proyectointegrador.backend.repository.SkillsRepository;
import com.proyectointegrador.backend.service.SkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SkillsService")
public class SkillsServiceImpl implements SkillsService {
    @Autowired
    private SkillsRepository skillsRepository;

    /**
     * Method to return the list of all the skills in the system.This is a simple
     * @return list of skills
     */
    @Override
    public List<Skills> findAll() {
        List <Skills> skills = skillsRepository.findAll();

        return skills;
    }
}
