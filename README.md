# DEPENDENCY INYECTION | SPRING BOOT EJEMPLO

_Documentación de estudio para inyección de dependencias, cómo funciona y cómo se distrubuye a través de sus capas._
- Package: com.diexmpl

## Construcción 🛠️

- Se inicia con la clase DemoApplicattion y su método main como raíz del flujo.

- Se crea una interfaz dentro del paquete _[com.diexmpl.repository]:_  **_IPersonaRepo.java_** tendrá el método **_registrar_**

- _Es recomendable programar orientado a interfaces porque así el código se encuenta más desacoplado y permite un mejor mantenimiento del mismo_

- Se crea la implementación de esta interfaz llamándola **_PersonaRepoImpl.java_** en la cual se usan los estereotipos de SPRING para hacerle saber que éste es un acceso a datos/acceso de información, por lo cual la clase deberá comenza con **_@Repository_**. De esta manera Spring se encargará de inyectar las dependencias.
Esta implementación sobrescribirá el método **_registrar_** y debería "registrar" al usuario en un ambiente real.

- Se crea una nueva interfaz dentro del paquete _[com.diexmpl.service]:_  **_IPersonaService.java_** que igual tendrá el **_registrar_**

- _El paquete **service** no está haciendo referencia a que aquí existirá un servicio web, sino que aquí es donde se alojará la lógica de negocio de la aplicación_

- En la interfaz **_IPersonaService.java_** se incluiría también el método de registrar, por el momento se usa solamente para ejemplificar y entender el flujo de las inyecciones, pero en la practica es recomendable aquí usar **_JAVA GENERICS_** y abstraer y desacoplar más el código.

- Se crea la implementación de esta interfaz llamándola **_PersonaServiceImpl.java_** y como en la otra implementación se sobreescribiría los métodos de la interfaz. En ésta se usará el estereotipo **_@Component_** para indicar que aquí existirá una regla de negocio. Usualmente se llega a indicar con el estereotipo **_@Service_** que es la nomenclatura correcta para esta capa, pero para tener una mejor comprensión incial y saber qué hace cada capa sin confundirse, se usa **_@Component_** y se reserva el uso de **_@Service_** para los servicios.

- En esta implementación se instanciará a la _capa Repository_ y usará el estereotipo **_@Autowired_** para que así Spring busque una instancia ya definida por otro estereotipo, en este caso el **@Repository**  de _IPersonaRepo_ y se finalizaría con las clases y paquetes involucrados.

## Flujo :loop:

1.- El flujo iniciría en `service.registrar("MIKE MAMD");`. del método _run_ de la clase _DemoApplication_

2.- El **nombre** viajaría hasta la capa de **_service_**

3.- La capa service hace un "puente" y la direccione a la capa **_repo_**

4.- La capa repo hace la implementación con la lógica que se ha indicado ahí

<br/><br/>
<br/><br/>
### Colaboradores 🚀

- Miguel Martínez
:octocat:
