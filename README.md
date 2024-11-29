1. En primer lugar descargamos el IDE Eclipse, y añadirlo a las variables de entorno y al path.

2. En segundo lugar creamos un proyecto llamado fibonacci, seleccionando la opción crear Maven Project. Seleccionamos el workspace y el arquetipo, en este caso el maven.apache.quickstart, la versión 1.5. Una vez creado el proyecto, creamos la clase Fibonacci. Una vez terminado el código,  se abre el cmd, y se escribe en la consola mvn package junto con la ruta de la carpeta donde se encuentre el proyecto.

3. En tercer lugar, para instalar el proyecto en el repositorio local, accedemos de nuevo a la consola y se utiliza el comando mvn install. Para utilizar el artefacto que hemos creado iniciaremos un nuevo proyecto siguiendo los mismos pasos de antes. En este caso se llamará fibonacciMain y contendrá una clase principal. En el pom.xml añadimos la siguiente dependencia:

```xml
<dependencies>
    <dependency>
        <groupId>es.iessoterohernandez.daw.endes</groupId>
        <artifactId>fibonacci</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>
</dependencies>
```

Es el momento de compilar y ejecutar el proyecto,  y comprobar que funciona correctamente.

4. Creamos un nuevo proyecto "HelloWorldPdf" del grupo "es.iessoterohernandez.daw.endes" con una clase que utilice la librería pdf de iText.
Para usar iText añadimos la siguiente dependencia al pom.xml:

```xml
<dependencies>
    <dependency>
        <groupId>com.itextpdf</groupId>
        <artifactId>itextpdf</artifactId>
        <version>5.5.13.4</version>
    </dependency>
</dependencies>
```

La clase principal del proyecto crea y escribe en un archivo PDF llamado HelloWorld.pdf. Tras la compilación y ejecución, el PDF fue generado correctamente, demostrando la integración exitosa de iText.
