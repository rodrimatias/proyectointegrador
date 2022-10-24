package com.proyectointegrador.backend.repository;

import com.proyectointegrador.backend.domain.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface skillsRepository extends JpaRepository<Skills, Integer> {}
