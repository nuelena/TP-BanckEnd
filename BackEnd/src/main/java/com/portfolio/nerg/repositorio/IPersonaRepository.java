/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.nerg.repositorio;

import com.portfolio.nerg.entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nubia Elena Ramos
 */
@Repository

public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
