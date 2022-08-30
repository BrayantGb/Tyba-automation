# Tyba-Project
 Test Automation
 
 Proyecto: Tyba-automation El proyecto de Automatización "Tyba-automation" se elabora con la finalidad de evaluar los conocimientos en el área de Automatización de Brayant Gamboa Betancur, el cual se encuentra interesado en ser parte de la compañia Tyba.

Este proyecto cuenta con las siguientes características:

Lenguaje de programación: Java Framework de Automatización: Serenity Patrón de diseño: Screenplay Framework de soporte BDD (Behavior development driver): Cucumber Lenguaje de BDD (Behavior development driver): Gherkin Constructor de proyecto: Gradle

Nota: El proyecto esta diseñado para ser ejecutado en maquinas Windows y navegador Chrome.

El proyecto posee la siguiente estructura:

Carpeta Tyba-automation:

src/main/java/co/com/Tyba/prueba/enums: Este paquete contiene todos los enums del proyecto, por ejemplo, mensajes, rutas o palabras.

src/main/java/co/com/Tyba/prueba/execptions: Este paquete contiene todas las excepciones que fueron diseñadas en el proyecto.

src/main/java/co/com/Tyba/prueba/interactions: Este paquete maneja todas las funciones de iteraciones con elementos web, por ejemplo, realizar click en un elemento web

src/main/java/co/com/Tyba/prueba/models: Este paquete contiene las clases que orquestaran toda la data necesaria para ejecutar las pruebas automatizadas

src/main/java/co/com/Tyba/prueba/tasks: Este paquete maneja las tareas que va realizar el usuario para cumplir con lo esperado en la prueba automatizada, asi cumpliendo con el patrón de diseño Screenplay

src/main/java/co/com/Tyba/prueba/userinterface: En este paquete se referencian los elementos de las vistas con las que vamos interactuar, asi garantizando la reusabilidad de código.

src/main/java/co/com/Tyba/prueba/utils: En este paquete tenemos las clases que nos ayudaran a cumplir con el BDD ya sea seteando data, obteniendo un texto, entre otros.

src/test/java/co/com/Tyba/prueba/runner: Este paquete contiene el archivo runner el cual se encarga de ejecutar la prueba.

src/test/java/co/com/Tyba/prueba/stepDefinitios: Este paquete contiene los archivos de steps los cuales definen el paso a paso de el lado de lógica de programación.

src/test/resources/co/com/Tyba/prueba/features: Este paquete contiene los archivos feature los cuales definen el escenario a evaluar del lado del BDD.

gitignore: El archivo encargado de bloquear subir archivos no necesarios en el repositorio.

serenity.properties: Es el archivo que ayuda a setear propiedades del Framework de Serenity.

Datos adicionales del proyecto:

Se implemento la anotación "@share" de serenity para compartir data entre diferentes contextos. Se implemento tags para todos los diferentes escenarios automatizados. Se implemento tag generico llamado "@RegressionTest" para poder ejecutar toda las suites de pruebas.

Pasos para obtener el proyecto de automation:

Clonar el repositorio en la ubicación deseada, usando el comando: git clone https://github.com/BrayantGb/Tyba-automation.git

Ingresar a la carpeta Tyba-automation

Para el feature registerUser los pasos son exitosos

Para el feature shopping por falta de tiempo no me dió para verificar el por que hay veces me funciona bien toda la ejecución y hay otras veces que no me funciona bien toda la ejecución

Pasos para ejecutar el proyecto

Se debe primero realizar los pasos de la sección "Pasos para obtener el proyecto de automation" Opción 1: Abrir el proyecto en el IDE de su preferencia que soporte Java, ejecutar el archivo TestRunner, este runner por defecto esta configurado con el tag @RegressionTest para ejecutar todas las pruebas Opcion 2: Abrir desde la consola de windows la carpeta donde esta clonado el proyecto, la consola debe tener permisos de administrador, ejecutar el comando "gradle w clean test" Opcion 3: Si desea ejecutar algún tag en particular se debe ejecutar el siguiente comando desde la consola en la carpeta "Tyba-automation", comando: gradle w test -Dcucumber.options="--tags @xxxx" aggregate, donde "xxxx" es el tag deseado

Generación de reporte del framework Ejecute el proyecto como lo indica la opcion 2, diríjase a la carpeta target/site/serenity y una vez alli abra en el navegador de su preferencia el archivo index
