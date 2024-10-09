# API REST Básica con Spring Boot y Frontend en JavaScript

Bienvenido a mi proyecto básico de API REST con **Spring Boot** y un frontend en **JavaScript**. Este proyecto tiene como objetivo demostrar mis habilidades en el desarrollo de una API REST usando Java y JavaScript, mostrando una arquitectura simple, manejo de excepciones y una interfaz funcional para interactuar con la API.

## Descripción del Proyecto

Esta aplicación está diseñada usando una **arquitectura en capas**, enfocada en separar responsabilidades y mantener un código modular. Aunque la estructura podría mejorarse añadiendo controladores para adherirse completamente al patrón de capas, este proyecto demuestra los conceptos principales detrás del desarrollo de API, manejo de excepciones y creación de una interfaz que interactúa con la API.

> [!TIP] 
> Este proyecto es ideal para quienes están comenzando a explorar la arquitectura en capas y el desarrollo de APIs REST._  

## Tecnologías Utilizadas

- **Java Spring Boot** para el backend (API REST).
- **JavaScript** para el frontend.
- **HTML/CSS** para la interfaz gráfica.

## Funcionalidades

- **API REST**: Implementa operaciones CRUD básicas con listas estáticas para la persistencia de datos.
- **Arquitectura en Capas**: Separación en capas de DAO (Data Access Object), Servicio y UI.
- **Manejo de Excepciones Personalizadas**: El repositorio lanza excepciones que se gestionan en el nivel de la API REST con Exception Handlers.
- **Frontend con Fetch API**: La interfaz gráfica en JavaScript se comunica con la API mediante `fetch`, gestionando códigos HTTP para proporcionar retroalimentación al usuario.

> [!NOTE]
> El uso de listas estáticas para la persistencia hace que el proyecto sea simple, pero puede mejorarse usando una base de datos en futuras versiones._  

## Estructura de Carpetas

- **dao**: Contiene los modelos y repositorios. Los DAOs estáticos manejan los datos con listas en memoria.
- **domain**: Clases de dominio y excepciones personalizadas como `BadRequestException`, `ConflictException`, `NotFoundException`, entre otras.
- **service**: La lógica de negocio de cada entidad está manejada en el nivel de servicio.
- **ui**: Los controladores REST (Spring Boot) que manejan las solicitudes API.

## Mejoras Futuras

- **Capa de Controladores**: Para una mejor adherencia a la arquitectura de capas, sería recomendable añadir clases de controladores para separar adecuadamente los servicios de la capa de presentación.
- **Persistencia de Datos**: Actualmente, los datos se almacenan en listas estáticas. Un próximo paso sería incorporar una base de datos para gestionar de forma adecuada la persistencia de los datos.

> [!IMPORTANT]
> La ausencia de controladores implica duplicación de código en las clases REST, lo cual puede mejorarse en próximas iteraciones._  

## Instrucciones para Ejecutar el Proyecto

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/yourusername/yourproject.git
   ```
2. Navegar al directorio del proyecto y ejecutar la aplicación Spring Boot:
  ```bash
  ./mvnw spring-boot:run
  ```
3. Abrir el archivo index.html ubicado en la carpeta frontend para acceder a la interfaz gráfica de JavaScript.
4. Usar la interfaz para interactuar con la API, realizando operaciones CRUD básicas.

## Descripción del Frontend
El frontend en JavaScript es una interfaz sencilla que interactúa con la API usando llamadas fetch. Cada operación (GET, POST, PUT, DELETE) está asociada a un botón o formulario en la UI. Los resultados de las operaciones y los códigos HTTP se muestran en la interfaz para informar al usuario sobre el éxito o fallo de cada acción.

> [!WARNING]
> Es fundamental implementar un manejo de errores adecuado en el frontend para asegurar una buena experiencia de usuario. 
## Conclusión
Este proyecto sirve como una demostración de mis habilidades en la creación de APIs REST con Java Spring Boot y en el desarrollo de interfaces de usuario funcionales con JavaScript. Si bien se pueden hacer muchas mejoras, como la adición de una capa de controladores y persistencia de datos con una base de datos, este proyecto muestra conceptos clave como manejo de excepciones, arquitectura en capas e interacción con APIs desde el frontend.
