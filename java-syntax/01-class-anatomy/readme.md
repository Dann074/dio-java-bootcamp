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
