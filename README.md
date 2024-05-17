# Spring Framework XML Configuration Example

This project demonstrates how to configure a Spring application using XML configuration for IoC (Inversion of Control) and DI (Dependency Injection). The example includes a simple application that defines beans in an XML file and shows how to retrieve and use these beans in a Spring context.

## Project Structure

- **src/main/java/com/avinash/Springboot/SpringbootApplication.java**: Main application class that initializes the Spring context using XML configuration.
- **src/main/java/com/avinash/Springboot/Alien.java**: A simple class with properties and methods to demonstrate dependency injection.
- **src/main/java/com/avinash/Springboot/Laptop.java**: Another class that is injected into the Alien class.
- **src/main/resources/spring.xml**: XML file that defines the beans and their dependencies.

## Key Concepts

### Inversion of Control (IoC)

IoC is a principle where the control of object creation and management is inverted from the developer to the Spring container. This allows developers to focus on business logic rather than managing object lifecycles.

### Dependency Injection (DI)

DI is a design pattern where an object's dependencies are provided by an external source (in this case, the Spring container). This promotes loose coupling and easier testability.

## Configuration Details

### SpringbootApplication.java

This is the main class that sets up the Spring context using the `ClassPathXmlApplicationContext` and retrieves beans from the context.

### Alien.java

A simple class representing an Alien with properties like `age` and `name`. It also depends on a `Laptop` object.

### Laptop.java

A class representing a Laptop that can be injected into the Alien class.

### spring.xml

The XML configuration file located in the `resources` folder defines the beans and their dependencies.

- **Bean Definitions**: Beans are defined using the `<bean>` tag with `id` and `class` attributes.
- **Property Injection**: Properties are injected using the `<property>` tag.
- **Constructor Injection**: Constructor arguments are injected using the `<constructor-arg>` tag.
- **Autowiring**: Automatically injects dependencies by matching types or names using the `autowire` attribute.
- **Scope**: Defines the scope of beans, such as `singleton` or `prototype`.
- **Primary**: Resolves ambiguity when multiple beans match a single dependency using the `primary` attribute.
- **Lazy Initialization**: Defers bean creation until it is requested using the `lazy-init` attribute.

## Usage

1. **Clone the repository**:
   ```sh
   git clone https://github.com/your-repository/spring-xml-configuration-example.git
   cd spring-xml-configuration-example
   ```

2. **Build and run the application**:
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

3. **Observe the output**:
   The application will initialize the Spring context using the `spring.xml` file, retrieve the `Alien` bean, and call its methods to demonstrate the injected dependencies.

## Conclusion

This example provides a comprehensive understanding of how to configure a Spring application using XML. It covers essential concepts of IoC and DI, demonstrating how to manage bean lifecycles and dependencies in a Spring context. While modern Spring applications often use annotations, XML configuration remains a powerful tool for fine-grained control and understanding legacy systems.

---

For more information, refer to the [Spring Framework documentation](https://spring.io/projects/spring-framework).
