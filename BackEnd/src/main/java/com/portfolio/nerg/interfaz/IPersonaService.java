
package com.portfolio.nerg.interfaz;

import com.portfolio.nerg.entidad.Persona;


public interface IPersonaService {
    public list<Persona> getPersona();
    
    public void savePersona (Persona persona);
    
    public void deletePersona (long id);
    
    public Persona findPersona(long id);

    public static class list<T> {

        /**
         *
         */
        public list() {
        }
    }
}
