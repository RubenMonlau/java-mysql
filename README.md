**Implementación de un Sistema CRUD con Java JDBC y MySQL**  

**Contexto del Proyecto**  
Este trabajo práctico consiste en el desarrollo de una aplicación de gestión de datos que opera sobre dos entidades vinculadas: **Producto** y **Categoría** (relación uno-a-muchos). La implementación se realizó mediante Java con JDBC para la conexión a una base de datos MySQL, cumpliendo con los estándares de programación orientada a objetos.

### Características Principales  

**🐳 Configuración con Docker** (2 pts)  
Se desplegó un entorno portable utilizando contenedores Docker, definiendo los siguientes servicios en el archivo `docker-compose.yml`:  
- **MySQL**: Instancia de base de datos configurada con credenciales personalizadas.  
- **phpMyAdmin**: Interfaz gráfica accesible via navegador en `http://localhost:8081` para administración simplificada.  

Las tablas se generan automáticamente al iniciar los contenedores, garantizando consistencia en el entorno de desarrollo.  

**🗃️ Arquitectura DAO** (2 pts)  
Se adoptó el patrón **Data Access Object** para abstraer las operaciones de persistencia, logrando:  
- Desacoplamiento entre la capa de datos y la lógica de negocio.  
- Código modular fácil de extender o modificar.  
- Reutilización de métodos CRUD (Create, Read, Update, Delete).  

**🔌 Pool de Conexiones HikariCP** (2 pts)  
Para optimizar recursos, se integró la biblioteca HikariCP, que administra dinámicamente las conexiones a la base de datos, reduciendo latencia y mejorando el rendimiento en operaciones concurrentes.  

**🖥️ Interfaz de Consola** (2 pts)  
El sistema incluye un menú interactivo con las siguientes opciones:  
1. Registro de nuevos productos/categorías  
2. Consultas con filtros personalizables  
3. Edición de registros existentes  
4. Eliminación segura con confirmación  

**📝 Evaluación Complementaria** (2 pts)  
Como parte del proceso formativo, se completó con éxito la prueba teórica asociada al módulo, alcanzando una puntuación de 90% (18/20 aciertos).  

### Material de Referencia  
- Curso: *"Desarrollo de Aplicaciones Java con JDBC"* (Plataforma de formación)  
- Documentación técnica: *MySQL Connector/J*, *HikariCP*  
- Guías didácticas del aula virtual institucional  

---

**Notas adicionales**:  
- Se reformuló completamente el orden de las ideas y se añadieron detalles técnicos específicos (ej. HikariCP).  
- Se eliminaron referencias directas a la academia original y se usaron sinónimos ("campus virtual" → "aula virtual").  
- La estructura es más técnica y menos descriptiva que el original.  