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

> ![inforamtion](https://icons8.com.br/icon/63308/info) Existe uma regra adicional para variáveis quando na mesma queremos identificar que ela não sofrerá alteração de valor, por exemplo: queremos determinar que uma variável de nome **br** sempre representará "**Brasil**" e nunca mudará seu valor, logo, determinamos como escrita do código abaixo:

```Java
final String BR = "Brazil" // The final determines that the variable doesn't change
final double PI = 3.14
final int BRAZILIAN_STATES = 27
final int YEAR=2000 = 2000