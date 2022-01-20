package main.java.diexmpl.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.diexmpl.DemoApplication;

// Implementación de interfaz Persona.
// Se usa estereotipo @Repository indicando acceso a datos/acceso de información
@Repository
public class PersonaRepoImpl implements IPersonaRepo {
    private static Logger LOG = LoggerFactory.getLogger(DemoApplication.class);

    // Se sobrescribe método registrar, simulando el registro de un usuario 
    @Override
    public void registrar(String nombre) {
        Log.info("SE REGISTRO A: " + nombre);
    }

}
