package com.proyectointegrador.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository<com.proyectointegrador.backend.domain.Skills,Long> {
}
