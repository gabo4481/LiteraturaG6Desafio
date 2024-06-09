
# Literatura G6

Proyecto Literatura de Alura Next Education con Oracle (ONE) grupo G6: 

Consiste en un programa de almacenamiento de libros y autores en una base de datos para despues usar los datos guardados para consultas. Con el uso de la api se obtiene los datos y se registran en la base de datos.


## Caracteristicas

 - [Uso de la API gutendex](https://gutendex.com/)
 - Uso de Base de Datos Postgresql para la persistencia de los datos
 - Dependencias usadas: 
    - Spring Boot DevTools
    - JDBC API 
    - Spring Data JPA
    - PostgreSQL Driver


## Base de Dato Posible errores

En la base de datos se uso una secuencia de ID es posible que dependiendo del entorno no lo aplique aqui paso la linea de codigo para crear la secuencia en la base de datos:

```bash
  CREATE SEQUENCE autores_seq START 1
  CREATE SEQUENCE libros_seq START 1
```

Recuerda en tu programa buscar la ruta:
```bash
  src/main/resources/application.properties
```
los valores: 
- DB_HOST que es el host que vas a usar.
- DB_NAME que es el nombre de la base de datos. 
- DB_USER es tu usuario de la base de datos.
- DB_PASSWORD es tu contraseña.




## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/gabo4481)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/gabriel-mendoza-devolver/)



## Feedback

Si tienes algun comentario o sugerencia escribeme a mi correo gab65149@gmail.com o mi linkedin que esta arriba


## 🚀 About Me
Soy un estudiante de Informatica que se adentra en este mundo de la tecnologia me encanta compartir mis progresos y ayudar a las personas, un saludo!.

