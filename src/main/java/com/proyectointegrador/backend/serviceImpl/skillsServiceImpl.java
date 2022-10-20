package com.proyectointegrador.backend.serviceImpl;

import com.proyectointegrador.backend.domain.SoftSkills;
import com.proyectointegrador.backend.repository.skillsRepository;
import com.proyectointegrador.backend.service.skillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("skillsService")
public class skillsServiceImpl implements skillsService {
    @Autowired
    private skillsRepository skillsRepository;

    /**
     * Method to return the list of all the skills in the system.This is a simple
     * @return list of skills
     */
    @Override
    public List<SoftSkills> findAll() {
        List<SoftSkills> iterable = skillsRepository.findAll();
        return iterable;
    }
}
