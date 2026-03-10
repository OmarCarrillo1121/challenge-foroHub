

# ForoHub - API REST con Spring Boot
¡Hola! Mi nombre es Omar Carrillo, estudiante de programación en Java dentro del programa Oracle Next Education. Este ejercicio, llamado ForoHub, es parte de los desafios propuestos como parte de la formación Java Backend Developer. El desafio consiste en crear una aplicación tipo foro, con una API REST que gestiona las discusiones y los tópicos.

# Funciones principales de ForoHub
La aplicación funciona mediante endpoints que reciben y devuelven datos en formato JSON. Las funciones implementadas son:
 - Registro de tópicos: Permite crear nuevos temas de discusión, validando que el título y el mensaje sean obligatorios y únicos.
 - Listado de tópicos: Muestra todos los temas almacenados en la base de datos con soporte para paginación y ordenamiento.
 - Consulta de tópico específico: Permite visualizar los detalles de un solo tema utilizando su número de ID.
 - Actualización de datos: Los usuarios pueden modificar el título y el contenido de un tópico existente.
 - Eliminación de tópicos: Permite borrar registros de la base de datos de forma permanente.

# Tecnologías utilizadas
Para este proyecto consolidamos el uso de herramientas de nivel profesional para el desarrollo Back End:
 - Java 25: Versión más reciente utilizada para el desarrollo del núcleo de la aplicación.
 - Spring Boot: Framework base para construir la API REST de forma ágil y eficiente.
 - Spring Data JPA: Para manejar la persistencia de datos y la comunicación con la base de datos relacional.
 - MySQL 8: Motor de base de datos donde se almacenan todos los tópicos del foro.
 - Flyway: Herramienta de migración para el control de versiones y creación automática de las tablas en la base de datos.
 - Bean Validation: Para asegurar que los datos ingresados por el usuario cumplan con las reglas de negocio.
 - Lombok: Para mantener un código limpio, eliminando la necesidad de escribir getters, setters y constructores manualmente.

# Descargar y ejecutar
Para probar esta API en tu computadora, sigue estos pasos:
 - Clonar el código: Descarga este repositorio en tu equipo.
 - Configura tu Base de Datos: Asegúrate de tener instalado MySQL 8 y crea una base de datos llamada forohub_db.
 - Ajusta las credenciales: Entra al archivo src/main/resources/application.properties y coloca tu usuario y contraseña de MySQL.
 - Ejecuta el proyecto: Ejecuta la clase ForoHubApplication.java desde tu IDE.
 - Prueba los Endpoints: Como no tiene interfaz visual, te recomiendo usar herramientas como Insomnia o Postman para enviar peticiones a   http://localhost:8080/topicos.

#Lo que aprendí
En este reto aprendí a manejar los diferentes métodos HTTP (GET, POST, PUT, DELETE) y a devolver los códigos de respuesta correctos según cada situación. El principal desafío fue estructurar la arquitectura del proyecto siguiendo las buenas prácticas y configurar las migraciones, lo cual me ayudó a entender cómo se gestionan los cambios en las bases de datos en entornos de desarrollo real, además comprendí el manejo Spring Boot para la creación de servicios web escalables.
-------
Si tienes algún consejo que me ayude a seguir mejorando como programador Back End, ¡será muy bien recibido! ¡Gracias por visitar mi proyecto!
