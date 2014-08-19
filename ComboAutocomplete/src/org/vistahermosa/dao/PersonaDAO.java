package org.vistahermosa.dao;

import org.vistahermosa.bean.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thomas
 */
public class PersonaDAO {
    
    public List<Persona> getPersonas() {
        List<Persona> personas = new ArrayList<Persona>();
        personas.add(new Persona(1234, "Rodolfo", "Villarroel"));
        personas.add(new Persona(2345, "Larry", "Valderrama"));
        personas.add(new Persona(3456, "Magaly", "Acosta"));
        personas.add(new Persona(8765, "Susan", "Villalva"));
        return personas;
    }
}