
package com.portfolio.nerg.servicio;

import com.portfolio.nerg.entidad.Persona;
import com.portfolio.nerg.interfaz.IPersonaService;
import javax.validation.constraints.NegativeOrZero.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    
    @Autowired IpersonaRepository ipersonaRepository;

    @Override
    public list<Persona> getPersona() {
        return ipersonaRepository.findAll();
    }

    @Override
    public void savePersona(Persona persona) {
    ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(long id) {
     ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }

    
}
