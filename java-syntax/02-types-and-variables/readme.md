# Types and Vriables

## Course Objectives

Explore the data types of integers, decimal numbers, logical numbers, characters and their applicability.
Explain the difference between defining variables and constants.

## Prerequisites

* JDK Installed
* IDE chosen
* Defined project directory
* Github integration

## Topics

* Integer and decimal numbers
* Logical types
* Characters
* Objects
* Diference betwween variables and constants

For the examples, please check in the [Basic Java Course](https://github.com/danilocostabento/dio-basic-java-course.git)

## Data Types

In Java, there are some words reserved for representing the basic data types that need to be manipulated to build programs. These data types are known as primitive types.

> ℹ The eight primitive types in Java are:
>  int, byte, long, float, double, boolean e char - these types are not considered objects, and therefore represent raw values. They are stored directly in the memory stack.


Table of primitive types and their values:

| Type  | Memory  | Minimal Value               | Maximum Value             |
|-------|---------|-----------------------------|---------------------------|
| byte  | 1 byte  | -128                        | 127                       |
| short | 2 byte  | -32.768                     | 32.767                    |
| int   | 4 bytes | -2.147.483.648              | 2.147.483.647             |
| long  | 8 bytes | - 9.223.372.036.854.775.808 | 9.223.372.036.854.775.807 |

Primitive types that can contain fractional parts can be represented by two types:

| Type   | Memory  | Minmal Value   | Maximum Value |
|--------|---------|----------------|---------------|
| float  | 4 bytes | -3,4028E + 38  | 3,4028E + 38  |
| double | 8 bytes | -1,7976E + 308 | 1,7976E + 208 |

Although the **float** type takes up half the memory consumed than a double type. It suffers from a limitation that compromises its use in certain situations: it only maintains decimal precision between 6 and 7 digits.

Currently, with modern computers, it has become unnecessary to use the short and byte types, as we do not need to worry so much about the reduced memory space.

Likewise, we will hardly use the long type, as it is not so common to work with large values.


Therefore, to represent numbers, most of the time we will use the type int to represent integers or double to represent fractional numbers.

> ℹ The most relevant point in understanding the definition of data types is when defining the type of a variable. **What type of data would I use to determine a person's age or an employee's salary?**

## Variables Declaration

Variable is an identification of a memory space used by our program. Following programming language conventions, every variable is composed of? data type + identification + assigned value.

The standard structure for declaring a variable is always:

`<Type> <variableName> <optionalValueAssignment>`

Examples:

```java
    int age; // Type "int", name "age", without a value assigned
    int fabricationYear = 2021; // Type "int", name "fabricationYear", with a value assigned
    double minimalSalary = 2.500; // Type "double", name "minimalSalary", with a value assigned, the period shows that the value is in decimal
```

⚠ Attention: there are some peculiarities when working with some specific types. Observe the example below:

```java
    public class DataTypes {
        public static void main(String[] args) {
            byte age = 123;
            short ano = 2021;
            int cep = 21070333; // if it starts with zero, maybe it has to be another type
            long cpf = 98765432109L; // if it starts with zero, maybe it has to be another type 
            float pi = 3.14F;
            double salary = 1275.33;
        }
    }
```

> ℹ Note that the long type must end with L, the float type must end with F, and some day-to-day scenarios may encourage a conventional data type change.

Many times we create a variable, define a corresponding value, manipulate this variable and are aware of its value in the application. But be careful!!

> ⚠ Java is strongly "typed"

See the scenario below?

```java
    ///TypesAndVAriables.java

    short shortNumber = 1;
    int normalNumber = shortNumber;
    short shortNumber2 = normalNumber; // It`s gonna shows an error because the int number cannot be converted to a short number

    // terminal: Type mismatch: cannot convert from int to short
```

