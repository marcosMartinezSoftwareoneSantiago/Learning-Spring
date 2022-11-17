# Learning-Spring
Some folders with exercises to practice


## 1.- Crea un proyecto Spring Boot con dos controladores "PrimerController" y "SegundoController". Crea una ruta para cada uno de los controladores "/primer-controller" y "/segundo-controller" respectivamente. Dentro de "PrimerController" crear dos métodos" llamados "primerMeotodo()" y "segundoMetodo()".

    Estos métodos deben tener las rutas "/primer-metodo" y "/segundometodo" respectivamente para cada uno de los métodos (las peticiones serán GET). Los métodos llamaran a vistas "firstView" y "secondView" respectivamente para cada uno de los métodos.
    Dentro del "SegundoController" crea los mismos métodos que en "PrimerController" con las mismas rutas url y mismo tipo de petición (GET). Utilizarán las mismas vistas que el primer controlador.
    En las vistas simplemente un 'h1' con un texto "Primera vista" y "SegundaVista" respectivamente.Verifica el correcto funcionamiento de las peticiones al servidor. Envía el .zip con el proyecto

## 2. Crea un proyecto Spring Boot con el nombre ejerciciodos. Este proyecto tendrá una clase llamada Numero dentro de un paquete llamado "service" que tenga un método llamado envioNumero() que retorne un número aleatorio entre el 1 y el 10. Crea un controlador llamado NumeroController que tenga un método que, a través de una instancia de Numero envíe un número aleatorio a una vista llamada “randomView” que renderizará dicho número en el html a través de una etiqueta h2. El número debe mostrarse alineado al centro y con un margen superior de 40px

## 3. Crea un proyecto Spring Boot con el nombre ejerciciotres. Crea una clase alumno con 5 atributos privados: id,nombre, apellido1, apellido2 y nota.Este proyecto tendrá un controlador llamado "AlumnoController" al que se podrá acceder a través de diferente paths alternativos "/alumnos" o "/alumnado" o "/" . Dentro de este controlador construye un método que agregue tres alumnos a un List a través de su constructor parametrizado con los atributos de la clase. El método de controlador deberá enviar a una vista "alumnosView" la lista de alumnos que se recorrerá con en un bucle usando thymeleaf los alumnos y los renderizará en una tabla de html. Debajo de la tabla renderiza el promedio de las notas en un h3 pero, en este caso, la lógica para hallar el promedio será creada en un método de otra clase llamada "Promedio".

## 4.- Crea una aplicación con Spring Boot llamada ejerciciocuatro con dos controladores “FirstController” y “SecondController” . “FirstController” tendrá un método que despliegue una vista llamada “enlaces” con dos enlaces que al hacer click en ellos enviarán un parámetro get “id” con valores 1 y 2 respectivamente para cada uno de los enlaces. Este parámetro id será capturado por otro método del controlador y lo renderizará en una vista html. Para el “SecondController”, crea un método que sirva para desplegar la vista de un formulario que envíe por post dos parámetros: username y email que serán capturados por otro método del controlador que los renderizará en un avista html

## 5.- Crea un proyecto con spring boot de nombre ejerciciocinco con un formulario de Log In y dos campos “username” y “password” . Si el usuario es “Pepe” y la contraseña es “12345” deberás redireccionar al usuario a una vista “home” que pertenezca a otro controlador con un mensaje de bienvenida al usuario. Si las credenciales no son la correctas enviar al usuario a una página “unauthorized” dentro de una carpeta errors . Si el username es el incorrecto, enviar un mensaje mensaje de “usuario” concatenando el username que puso en el formulario “no autorizado”.

    Las vistas para los mensajes de error deben de ser gestionadas por un tercer controlador llamado “ErrorController”


## 6.- Crea una aplicación con Spring Boot que conecta con una base de datos "concesionario". Desde Java crearás la tabla "coches" con los campos:
    id(PK, Autoincremental), marca, modelo y precio.
    Crea la funcionalidad que permita guardar coches en la base de datos y recuperar todos los coches de la base de dataos en una tabla html


## 7.- Crea una aplicación con Spring Boot que se conecta a una base de datos "nba_database". Los campos en la tabla serán :id(PK, AUTOINCREMENTAL), nombre, apellido_uno, apellido_dos, estatura, posiciony equipo.

    * La tabla se llamará "jugadores"

    * Insertar tres registros en la base  de datos a través del gestor de base de datos phpmyadmin y crea la funcionalidad en Spring Boot para poder listar e formato JSON los tres registros de la base de datos a través de la url:

    http://localhost:8080/lista-jugadores
    La posición es en la que juega el jugador (alero, base, pivot,..)


## 8.- Crea una aplicación con Spring Boot que se conecte a un base de datos llamada "inmobiliaria". Crea una tabla llamada "inmuebles" con los siguientes campos:

    - id(PK, AUTOINCREMENTAL)
    - metros_cuadrados
    - precio

Construye la funcionalidad para poder guardar inmuebles a en la base de datos través de un formulario.

## 9.- Crea una aplicación con Spring Boot que conecte con una base de datos llamada zapateria. Crea una tabla "zapatos" con los campos:

    -id(PK,AUTOINCREMENTAL)
    -marca
    -numero
    -precio

Crea tres registros en la base de datos y la funcionalidad para poder introducir una url con una variable en la ruta "id" y que pueda ver en el navegador un JSON con el registro coincidente con el id pasado por la url


## 10.- Siguiendo el ejercicio anterior en vez de devolver un JSON, renderiza la información del zapato con id ( el que le pases por la url) en una lista desordenada de html.


## 11.- Usando el mismo proyecto que en los ejercicios anteriores, crea una tabla html para renderizar todos los zapatos de la base de datos donde tendrás un botón a la derecha de cada registro "Eliminar" que permita eliminar el zapato de la base de datos.


## 12.- Crea un api rest que genere un endpoint que sirva  para eliminar registros de la base de datos.

## 13.- Con la base del ejercicio anterior genera un endpoint que sirva para hacer búsquedas por algún atributo de la entidad que no sea el id.