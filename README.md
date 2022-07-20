<div align="center">
    <img src="https://www.armadilloamarillo.com/wp-content/uploads/spring-boot-ok.png" width=400px"> </img> 
    
<!-- Encabezado -->
## Prueba técnica | Productos por departamento
## Junio 2022
### Autores

| Nombre | Identidad | Correo |
|:-------------:| :-----:|:-----:|
| Edgar Josué Benedetto Godoy | `0801-1997-23600` | [Gmail](mailto:ejbg597@gmail.com) |
| Giovany David Luque Andino  | `0801-1998-05428` | [Gmail](mailto:luque.cadeca@gmail.com) |

<!-- ## Resultado final
[Probar aplicación](https://productsbydepartment.herokuapp.com/) -->

</div>

_____

## Proyecto de Sitio Web para una tienda de muebles 
### Repositorio Github | Ramas
Para el repositorio de fuentes debe crear un proyecto público en GitHub, donde deberán de quedar las diferentes etapas de la evolución del proyecto identificadas por branch. 
<div align="center">
    <img src="https://1v5ymx3zt3y73fq5gy23rtnc-wpengine.netdna-ssl.com/wp-content/uploads/2021/03/git-flow-4.svg" width=400px"> </img> 
</div>

* **Main Branch** 
  * El propósito de la rama principal en el flujo de trabajo de Git es contener código listo para producción que se pueda publicar. 
  * En el flujo de Git, la rama principal se crea al comienzo de un proyecto y se mantiene durante todo el proceso de desarrollo. La rama se puede etiquetar en varias confirmaciones para indicar diferentes versiones o versiones del código, y otras ramas se fusionarán con la rama principal después de que hayan sido suficientemente examinadas y probadas.
* **Develop Branch**
  * La rama de desarrollo se crea al comienzo de un proyecto y se mantiene durante todo el proceso de desarrollo, y contiene código de preproducción con funciones recientemente desarrolladas que están en proceso de prueba. Las funciones recién creadas deben basarse en la rama de desarrollo y luego volver a fusionarse cuando estén listas para la prueba.
* **Hotfix Branch**
  * En el flujo de Git, la rama de revisión se usa para abordar rápidamente los cambios necesarios en su rama principal. 
  * La base de la rama de revisión debe ser su rama principal y debe fusionarse con las ramas principal y de desarrollo. 
  * La fusión de los cambios de la rama de revisión en la rama de desarrollo es fundamental para garantizar que la corrección persista la próxima vez que se publique la rama principal.

______
## Desarrollo
### Configuracion de desarrollo 
1. Editor de Texto 
   1. Visual Studio Code
2. Extensiones
   1. Java Managment Projects
   2. Spring Book
   3. Lombok Anotations
   
### DataBase
Nomenclatura para la estructuración de la base de datos
1. **Campos** --> Minuscula 
2. **Tablas** --> Mayuscula
3. **Base de datos** --> Letra capital en mayuscula

Configuración de PostgreSQL local
1. **Host** --> localhost
2. **User Name** --> postgres
3. **Password** --> admin
4. **Port** --> 5432 
### Backend

### Frontend
## Deploy en Heroku
1. Crear un backup de la base de datos
2. Instalar clearDB Mysql
  ```
  heroku addons:create cleardb:ignite
  ```
2. Imprimir las variables de entorno 
  ```
  heroku run -a productsbydepartment printenv

  PORT=14953
  SPRING_DATASOURCE_USERNAME=b4bf7af203d414
  SPRING_DATASOURCE_URL=jdbc:mysql://us-cdbr-east-05.cleardb.net/heroku_935f7825dc6b73b?password=e6b9865c&reconnect=true&user=b4bf7af203d414
  CLEARDB_DATABASE_URL=mysql://b4bf7af203d414:e6b9865c@us-cdbr-east-05.cleardb.net/heroku_935f7825dc6b73b?reconnect=true
  TERM=xterm
  JDBC_DATABASE_PASSWORD=e6b9865c
  JDBC_DATABASE_USERNAME=b4bf7af203d414
  SHLVL=0
  LD_LIBRARY_PATH=/app/.jdk/jre/lib/amd64/server:
  PS1=\[\033[01;34m\]\w\[\033[00m\] \[\033[01;32m\]$ \[\033[00m\]
  SPRING_DATASOURCE_PASSWORD=e6b9865c
  PATH=/app/.heroku/bin:/app/.jdk/bin:/usr/local/bin:/usr/bin:/bin
  DYNO=run.5617
  _=/usr/bin/printenv
  ```
3. Conectarse a la base de datos MySQL remota de Heroku
  ```
  mysql -u b4bf7af203d414 -pe6b9865c -h us-cdbr-east-05.cleardb.net

  pass: e6b9865c

  connect heroku_935f7825dc6b73b;
  ```
