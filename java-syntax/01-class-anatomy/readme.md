# Class Anatomy

>A well-structured class does not want war with anyone


Writing a program's code is done by composing words predefined by the language with the expressions we use to determine the name of our files, classes, attributes and methods.
<br>
It is very common for us to mix expressions in the American language with our vocabulary. There are projects that recommend that all implementation of your program be written in English.

### Syntax for declaring a new class:

```java
    public class MyClass {
        // your code here
    }
```

## Nomenclature Standard

When it comes to writing code in the Java language, it is recommended to follow some writing conventions. These standards are expressed in the items below:

* **.java Archive**: Every .java file must start with an UPPERCASE letter. If the word is compound, the second word must also be capitalized, example: Calculator.java, ScientificCalculator.java

* **Class name in the archive**: The class must have the same name of the archive.java, for example: `public class ScientificCalculator { }` in the archive ScientificCalculator.java

* **Variable name**: Every variable must be written in lowercase letters, however if the word is compound, the first letter of the second word must be UPPERCASE, for example: year and fabricationYear. The name of this practice for naming variables in this way is called "camelCase"

> ℹThere is an additional rule for variables when we want to identify that it will not change its value, for example: we want to determine that a variable named **br** will always represent "**Brazil**" and will never change its value, so , we determine how to write the code below:

```Java
final String BR = "Brazil" // The final determines that the variable doesn't change
final double PI = 3.14
final int BRAZILIAN_STATES = 27
final int YEAR=2000 = 2000
```

> ⚠Recommendations: To declare a variable we can use characters, numbers and symbols, but we must follow some rules of the language.

* Must contain only letters, _ (underline), $ or numbers 0 to 9
* It must begin with a letter (preferably), _ or $, never with a number
* Must start with a lowercase letter (good practice - see below)
* Cannot contain spaces
* We cannot use language keywords
* The name must be unique within a scope

```java
// Invalid declaration of variables
int numero&um = 1; // The only symbols allowed are _ and $
int 1numero = 1; // A variable cannot start with numbers
int numero um = 1; // There cannot be space in the variable name
int long = 1; // Long is part of the language's reserved words

// Valid variable declarations
int numero$1 = 1;
int numero1 = 1;
int numeroum = 1;
int longo = 1;
```

## Declarating variables and method

How to identify between variables declarations and methods in our program? There is a common structure for both functions, for example:
* Declaring a variable in Java follows the following structure:
```java

    // Structure

    Type WeellDefinedName = Atribution (optional in some cases)

    // Example

    int age = 23;
    double height = 1.62;
    Dog spike; // Note that here the spike variable has no value

```
* Declaring a method in Java follows a very simple structure:
```java

    // Structure

    ReturnType ObjectNameInInfinitive Parameters

    // Example

    int add (int numberOne, int number2)
    String formateCep (long cep)
```


## Indentation

Basically indentation is a term used to write the program code in a hierarchical manner, thus facilitating the visualization and understanding of the program.

Below, see an example of a student approval validation algorithm. In one tab, we have a code without any indentation, and in the other tab, we have the same code following an indentation pattern. Notice how much easier it is to understand the code hierarchy in the second tab.

```java
    // archive StudentGrade.java without indentation

    public class StudentGrade {
    public static main void (String[] args) {
    int finalGrade = 6;
    if (finalGrade<6)
    System.out.printIn("disapproved");
    else if(finalGrade==6)
    System.out.printIn("Minerva Test");
    else
    System.out.printIn("Aprroved")
    }
    }
```
```java
    // archve StudentGrade.java with indentation

    public class StudentGrade {
        public static main void (String[] args) {
            int finalGrade = 6;
            if (finalGrade < 6)
                System.out.printIn("Disapproved");
            else if (finalGrade == 6) 
                System.out.printIn("Minerva Test");
            else
                System.out.printIn("Approved")
        }
    }
```

## Organazing files

As our system evolves, new files (source code) appear in our project file structure. This requires that these files be organized through packages.

For example:

Source Code Packages
    > com.pepper.template
        > Client.java
        > Employee.java
    > com.pepper.packages
        > Home.java0
    > com.pepper.util
        > ValidateCPF.java
        > ValidateEmail.java
Librarys

## Java Beans

One of the biggest difficulties in programming is writing legible algorithms at levels that will be understood by your entire team or by yourself in the future. For this purpose, the Java language suggests, through conventions, universal writing forms for our classes, attributes, methods and packages.

### Variables

Earlier we already learned some rules for declaring variables, but now we will learn about some naming suggestions:

* A variable must be clear, without abbreviations or meaningless definition;

* A variable is always singular, **except when referring to an array or collection**;

* Define a unique language for your variables. If you declare variables in English, define them all in English.

Not recomended

```java
    double averSalary = 1500.23 // Abbreviated variable
    String emails = "student@school.com" // Confusing variable beacuse has just one value
    String meuNome = "Danilo" // If the language is en-US, all variables needs to use this language
```

Recomended

```java
    double averageSalary = 1500.23
    String email = "student@school.com"
    String [] emails = {"student@school.com" , "professor@school.com" , "student1@school.com"}
    String myName = "Danilo"
```

### Methods

Methods must be named as verbs, using a mixture of lowercase and uppercase letters. In principle, all letters that make up the name must be kept in lower case, with the exception of the first letter of each word composed from the second word.


Suggested examples for method naming:

```java
    sum(int n1, int n2) {}

    openConexion() {}

    completeProcessing() {}

    finById(int id) {}

    calculatePrint() {} // it's something wrong in this method, it should have a single purpose
```
