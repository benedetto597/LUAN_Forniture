<div align="center">
    <img src="https://www.armadilloamarillo.com/wp-content/uploads/spring-boot-ok.png" width=400px"> </img> 
    
<!-- Encabezado -->
## Aplicacion web de venta de muebles
## Julio 2022
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
4. **Tablas principales** --> Nombres en Plural

Configuración de PostgreSQL local
1. **Host** --> localhost
2. **User Name** --> postgres
3. **Password** --> admin
4. **Port** --> 5432 
### Backend
Recomendaciones de uso segun documentacion oficial:
* Para colecciones unidireccionales, los **conjuntos o Set (HashSet<>)** son la mejor opción porque generan las **declaraciones SQL más eficientes**. Las **listas o List** unidireccionales son **menos eficientes** que una asociación @ManyToOne.
* En resumen **mappedBy** define el objeto al que pertenece la relación y es obligatorio si la relación es bidireccional.  Por lo que hace que no solo se pueda acceder a la información del usuarios desde el email, sino que también podamos hacerlo en sentido contrario. Exista o no exista la definición expresa del @JoinColumn.

1. Tipos de muebles
Alacena,Cabecera,Cama cuna,Cuna,Centro,Chifonier,Chinero,Closet,Comedor,Cómoda,Gavetero,Litera,Mueble aereo,Recamara,Ropero

### Frontend
## Deploy en Heroku
