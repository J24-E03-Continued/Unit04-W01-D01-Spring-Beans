# 🧪 Spring Boot Lab: Working with Spring Beans and REST Controllers

## 🎯 Objectives

By the end of this lab, you will be able to:

- Create beans using `@Component` and `@Bean`
- Understand and demonstrate the difference between `singleton` and `prototype` scope
- Use `@Primary` and `@Qualifier` to resolve conflicts between multiple beans
- Use `@ComponentScan` to load components from different packages
- Create a simple `@RestController` that returns an HTML `<h1>` element

---

## Step 1: Project Setup

1. Create a new **Spring Boot** project using Spring Initializr or your IDE.
2. Add the **Spring Web** dependency.
3. Use Java 17 or later if available.

---

## Step 2: Create an Interface and Two Implementations

1. Create an interface named `MessageService`.
2. Create two different implementations of this interface.
3. Annotate both classes with `@Component`.
4. Mark one of them with `@Primary`.
5. Use `@Qualifier` in a controller or service to specify which one to use explicitly.

---

## Step 3: Define Beans Using `@Bean`

1. Create a configuration class and annotate it with `@Configuration`.
2. Inside this class, define two beans:
   - One with **singleton** scope (default).
   - One with **prototype** scope (use `@Scope("prototype")`).
3. Log or print a message in the constructor of each bean so you can tell when each one is instantiated.

---

## Step 4: Use `@ComponentScan`

1. Create a new package (e.g., `com.example.customscan`).
2. Add a class to this package and annotate it with `@Component`.
3. Update your main application class to scan both the default package and the new one.

---

## Step 5: Create a Simple REST Controller

1. Create a class annotated with `@RestController`.
2. Inject your `MessageService` using `@Qualifier`.
3. Create a `GET` endpoint at `/message`.
4. Have the endpoint return a string that contains a simple HTML `<h1>` element (e.g., `<h1>Hello from Spring!</h1>`).

---

## Step 6: Test Bean Scopes

1. Autowire both the singleton and prototype beans into a controller or service.
2. Inside an endpoint method (e.g., `/test-scope`), call both beans multiple times.
3. Observe the console output to determine how often each type of bean is instantiated.
