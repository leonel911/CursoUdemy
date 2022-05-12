package com.springboot.cursoudemy.repositories;

import com.springboot.cursoudemy.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {





}
