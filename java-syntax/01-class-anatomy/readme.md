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

> ![inforamtion](h<svg xmlns="http://www.w3.org/2000/svg" x="0px" y="0px" width="100" height="100" viewBox="0 0 48 48">
<path fill="#2196f3" d="M44,24c0,11.045-8.955,20-20,20S4,35.045,4,24S12.955,4,24,4S44,12.955,44,24z"></path><path fill="#fff" d="M22 22h4v11h-4V22zM26.5 16.5c0 1.379-1.121 2.5-2.5 2.5s-2.5-1.121-2.5-2.5S22.621 14 24 14 26.5 15.121 26.5 16.5z"></path>
</svg>) Existe uma regra adicional para variáveis quando na mesma queremos identificar que ela não sofrerá alteração de valor, por exemplo: queremos determinar que uma variável de nome **br** sempre representará "**Brasil**" e nunca mudará seu valor, logo, determinamos como escrita do código abaixo:

```Java
final String BR = "Brazil" // The final determines that the variable doesn't change
final double PI = 3.14
final int BRAZILIAN_STATES = 27
final int YEAR=2000 = 2000