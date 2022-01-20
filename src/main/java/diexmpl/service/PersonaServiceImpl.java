package main.java.diexmpl.service;

import com.diexmpl.repository.IPersonaRepo;

// Implementación de la interfaz IPersonaService
// Se sobreescriben sus métodos pero se instancian los de IPersonaRepo
// Se usa el estereotipo "@Component" indicando que habrá una lógica de negocio
@Component
public class PersonaServiceImpl implements IPersonaService {

    // Al usar el esterotipo @Autowired spring buscará una instancia
    // ya definida por un estereotipo, en este caso el @Repository de IPersonaRepo
    @Autowired
    private IPersonaRepo repo;

    // Se sobreescriben sus métodos
    @Override
    public void registar(String nombre) {

        repo.registrar(nombre);
    }

}
