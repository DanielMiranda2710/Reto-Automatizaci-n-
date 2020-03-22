# Introducción
Dicho proyecto se realizó mediante el framework de SerenityBDD, además con el gestor de dependencias Gradle y bajo el patrón de automatización Screenplay.  

# CONTENIDO
##	Adecuacion del proyecto: 
Para configurar el proyecto en la maquina para su modificación se recomienda seguir los siguientes pasos:
- Ingresar a la url donde se encuentra almacenado el proyecto en git, https://flujodetrabajot.visualstudio.com/Tuya%20Scrum/_git/AUT_PortalEmpresasBonos.Zambrano
y clonar el repositorio.
- Importar el proyecto clonado en su IDE de preferencia, se recomienda trabajar con IntelliJ IDEA o Eclipe.
- Instalar dependencias y plugins requeridos para su correcto funcionamiento. 
- No requiere instalación de drivers de los navegadores ya que estos están guardados en la carpeta src/main/resources/drivers.

## Explicacion del proyecto
- El proyecto cuenta con una carpeta llamada features, el cual se encuentra en el folder src/test/resources. En esta carpeta features estan todos los archivos .feature donde se muestran los escenarios que se están validando en la automatizacion. 
Si se desea agregar nuevos escenarios de prueba se deben agregar en el archivo .feature que mas se relacione con lo que se desee probar, en estos archivos .feature es donde se dejan consignados los datos de prueba, por lo que si se requiere cambiar los datos de prueba se debe recurrir a los archivos feature y hacer sus respectivas modificaciones de datos.
- Se cuenta con un archivo serenity.properties que se encuentra en la raíz del proyecto, en el cual se encuentra el nombre del navegador web con el cual se hará la prueba, por el momento se encuentra parametrizado para Chrome ya que este se recomienda por ser el más estable a la hora de hacer pruebas mediante controlador webdriver.
- Si se desean agregar nuevos escenarios de prueba, como se mencionó anteriormente el primer paso es crear su respectivo escenario en el archivo .feature, si el archivo .feature es nuevo se debe crear su respectiva clase runner, la cual se encargara de correr la prueba además de implementar su respectivo step definitions.

## Alcance
El proyecto cuenta con la automatización de los siguientes flujos:
• Dar de alta un usuario. 
• Iniciar sesión en el sitio con el usuario creado. 
• Adicionar un elemento al carrito de compras.

## Criterios de Aceptación
• Puede hacer uso de cualquier metodología o arquitectura a nivel de pruebas automatizadas (POM- SerenityBDD, screenplay). 
• Redactar los escenarios en lenguaje Gherkin (Es un plus).
• Hacer uso de alguna librería de assertions. 
• Crear un repositorio público en github y compartir el enlace para la verificación, asegúrese que todos test generados se ejecuten correctamente.

## Ejecución
Para ejecutar el proyecto se puede usar JUnit o desde gradle, se recomienda ejecutar mediante gradle en la línea de comandos o desde la consola propia del IDE para que quede la evidencia que el framework de serenity brinda tras la ejecución de una prueba.

Los datos de los diferentes campos podrían enviarse como parámetros del sistema pero esto se recomienda es para el uso de los Pipelines, para practicidad en este proyecto los datos son quemados en el paquete tasks para así dejar los archivos .feature en lenguaje Gherkin tradicional para ser interpretado más sencillamente.

Para ejecutar con JUnit basta con dar click al compilador y seleccionar la opción ejecutar con JUnit.
Para ejecutar con Gradle y generar el reporte, basta con correr el comando Gradle clean test aggregate.

## Funcionamiento
El proyecto cuenta con dos escenarios.
Escenario 1: registro.
	El usuario se registra correctamente llenando todos los campos del formulario al final se hace la validación en la barra de navegación que el nombre de usuario haya quedado sido creado.
Escenario 2: Adicionar un elemento al carrito de compras.
	•El primer paso es que el usuario inicia sesión en el portal con las respectivas credenciales creadas en el escenario 1.
	•Luego procede a buscar una Laptop y se selecciona una aleatoriamente ya que se creó    una función para escoger un producto aleatoriamente, esta función puede ser vista en el paquete de utils, el nombre de la clase es Utilities y el método se llama listProducts.
	•Por último se agrega el archivo al carrito de compras y la respectiva validación es que al momento de entrar al botón del carrito se vea algún número dentro de un paréntesis indicando que se adicionó alguna compra al carrito.

## Comentarios
•Se cumplen todos los flujos estipulados en los criterios de aceptación.
•Para las validaciones se utiliza el seeThat
