

package com.portfolio.nerg.controlador;

import com.portfolio.nerg.entidad.Persona;
import com.portfolio.nerg.interfaz.IPersonaService;
import javax.validation.constraints.NegativeOrZero.List;
import static jdk.nashorn.internal.runtime.Debug.id;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class personacontroler {
    @Autovired IPersonaService ipersonaService;
    private long id;
    private String nuevoNombre;
    private String nuevoApellido;

    @GetMapping("persona/traer")
    public List <Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "la persona fue creada correctamente";
    }
    @DeleteMapping("/persona/borrar/{id}")
    public String deletePersona(@PathVariable long id){
        ipersonaService.deletePersona(id);
        return "la persona fue eliminada correctamente";
    }
    @PutMapping("/persona/editar/{id}")
    public Persona editPersona (@PathVariable long id,
                               @RequestParam("nombre") String nuevoNombre
                               @RequestParam("apellido") String nuevoApellido
                               @RequestParam("img") String nuevoImg){
    Persona persona = ipersonaService.findPersona(id);
    persona.setNombre (nuevoNombre);
    persona.setApellido(nuevoApellido);
    persona.setImg(nuevoImg);
     
    ipersonaService.savePersona(persona);
    return persona;
}
}
