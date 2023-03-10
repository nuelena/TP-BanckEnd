/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.nerg.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.Setter;

@Getter  @Setter
        
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    
    private Long id;
    
    @NotNull
    @Size (min = 1, max = 50, message = "no cumple con la logitud")
    private String nombre;
    @NotNull
    @Size (min = 1, max = 50, message = "no cumple con la logitud")
    private String apellido;
    
    
    private String img;
    }

    