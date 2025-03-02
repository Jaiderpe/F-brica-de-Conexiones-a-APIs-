# Fabrica-de-Conexiones-a-APIs-
# 🌐 Fábrica de Conexiones a APIs - Abstract Factory Pattern

Este proyecto implementa el **patrón Abstract Factory** en Java para gestionar conexiones a diferentes tipos de APIs (**REST, GraphQL y SOAP**) de manera modular y flexible.

## 📌 Características
- 🔄 **Soporte para múltiples APIs**: REST, GraphQL y SOAP.
- 🏭 **Uso de Abstract Factory** para desacoplar la creación de conexiones.
- 🚀 **Facilidad de expansión**: Se pueden agregar más tipos de API sin afectar el código existente.

## 🚀 Instalación y Ejecución
### 1️⃣ Clonar el repositorio
```sh
git clone https://github.com/tu-usuario/api-factory.git
cd api-factory
```

### 2️⃣ Compilar el código
```sh
javac -d out src/api/*.java src/factory/*.java src/Main.java
```

### 3️⃣ Ejecutar el programa
```sh
java -cp out Main
```

## 🏗️ Estructura del Proyecto
```
/api-factory-project
│── src/
│   ├── api/
│   │   ├── APIConnection.java
│   │   ├── RestAPIConnection.java
│   │   ├── GraphQLAPIConnection.java
│   │   ├── SoapAPIConnection.java
│   ├── factory/
│   │   ├── APIFactory.java
│   │   ├── RestAPIFactory.java
│   │   ├── GraphQLAPIFactory.java
│   │   ├── SoapAPIFactory.java
│── Main.java
│── README.md
│── .gitignore
```

## 📜 Uso
Dentro de `Main.java`, puedes cambiar la fábrica utilizada para seleccionar un tipo de API:
```java
APIFactory factory = new RestAPIFactory(); // Para REST API
// APIFactory factory = new GraphQLAPIFactory(); // Para GraphQL API
// APIFactory factory = new SoapAPIFactory(); // Para SOAP API
```

**Ejemplo de salida (REST API seleccionada):**
```
Conectando a REST API en: https://api.example.com/data
Datos obtenidos: {"message": "Datos de REST API"}
```

## 📌 Tecnologías Usadas
- ☕ **Java 8+**
- 🏗 **Patrón de Diseño Abstract Factory**

 🚀

