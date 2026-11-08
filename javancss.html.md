---
date_published: 2026-11-08
date_modified: 2026-11-08
canonical_url: http://cardatechnologies.com/javancss.html
---

# JavaNCSS Metric Results

[ [package](#package) ] [ [object](#object) ] [ [method](#method) ] [ [explanation](#explanation) ]

The following document contains the results of a JavaNCSS metric analysis, using JavaNCSS version 33.54.  
[JavaNCSS web site.](http://javancss.codehaus.org/)

# Packages

Packages 

[ [package](#package) ] [ [object](#object) ] [ [method](#method) ] [ [explanation](#explanation) ]

**Packages sorted by NCSS.**

Package Classes Methods NCSS Javadocs Javadoc lines Single lines comment Multi lines comment com.cardatechnologies.utils.validators.abaroutevalidator 2 9 55 6 79 8 109 com.cardatechnologies.utils.validators.abaroutevalidator.exceptions 1 3 15 4 35 0 27 Classes total Methods total NCSS total Javadocs Javadoc lines Single lines comment Multi lines comment 3 12 70 10 114 8 136 

# Objects

Objects 

[ [package](#package) ] [ [object](#object) ] [ [method](#method) ] [ [explanation](#explanation) ]

**TOP 30 classes containing the most NCSS.**

Object NCSS Methods Classes Javadocs [com.cardatechnologies.utils.validators.abaroutevalidator.AbaRouteValidator](./xref/com/cardatechnologies/utils/validators/abaroutevalidator/AbaRouteValidator.html) 39 5 0 5 [com.cardatechnologies.utils.validators.abaroutevalidator.ErrorCodes](./xref/com/cardatechnologies/utils/validators/abaroutevalidator/ErrorCodes.html) 13 4 0 1 [com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException](./xref/com/cardatechnologies/utils/validators/abaroutevalidator/exceptions/AbaRouteValidationException.html) 11 3 0 4 

**TOP 30 classes containing the most methods.**

Object NCSS Methods Classes Javadocs [com.cardatechnologies.utils.validators.abaroutevalidator.AbaRouteValidator](./xref/com/cardatechnologies/utils/validators/abaroutevalidator/AbaRouteValidator.html) 39 5 0 5 [com.cardatechnologies.utils.validators.abaroutevalidator.ErrorCodes](./xref/com/cardatechnologies/utils/validators/abaroutevalidator/ErrorCodes.html) 13 4 0 1 [com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException](./xref/com/cardatechnologies/utils/validators/abaroutevalidator/exceptions/AbaRouteValidationException.html) 11 3 0 4 

**Averages.**

NCSS average Program NCSS Classes average Methods average Javadocs average 21.00 70.00 0.00 4.00 3.33 

# Methods

Methods 

[ [package](#package) ] [ [object](#object) ] [ [method](#method) ] [ [explanation](#explanation) ]

**TOP 30 Methods containing the most NCSS.**

Methods NCSS CCN Javadocs [com.cardatechnologies.utils.validators.abaroutevalidator.AbaRouteValidator.validate(String)](./xref/com/cardatechnologies/utils/validators/abaroutevalidator/AbaRouteValidator.html) 13 11 1 [com.cardatechnologies.utils.validators.abaroutevalidator.AbaRouteValidator.isAsciiDigits(String)](./xref/com/cardatechnologies/utils/validators/abaroutevalidator/AbaRouteValidator.html) 6 5 1 [com.cardatechnologies.utils.validators.abaroutevalidator.AbaRouteValidator.validateAbaNumberChecksum(String)](./xref/com/cardatechnologies/utils/validators/abaroutevalidator/AbaRouteValidator.html) 5 2 1 [com.cardatechnologies.utils.validators.abaroutevalidator.ErrorCodes.fromErrorCode(int)](./xref/com/cardatechnologies/utils/validators/abaroutevalidator/ErrorCodes.html) 5 5 0 [com.cardatechnologies.utils.validators.abaroutevalidator.AbaRouteValidator.validateFedNumber(String)](./xref/com/cardatechnologies/utils/validators/abaroutevalidator/AbaRouteValidator.html) 4 9 1 [com.cardatechnologies.utils.validators.abaroutevalidator.ErrorCodes.ErrorCodes(int,String)](./xref/com/cardatechnologies/utils/validators/abaroutevalidator/ErrorCodes.html) 3 1 1 [com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException.AbaRouteValidationException(ErrorCodes)](./xref/com/cardatechnologies/utils/validators/abaroutevalidator/exceptions/AbaRouteValidationException.html) 3 1 1 [com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException.AbaRouteValidationException(ErrorCodes,Throwable)](./xref/com/cardatechnologies/utils/validators/abaroutevalidator/exceptions/AbaRouteValidationException.html) 3 1 1 [com.cardatechnologies.utils.validators.abaroutevalidator.ErrorCodes.getErrorCode()](./xref/com/cardatechnologies/utils/validators/abaroutevalidator/ErrorCodes.html) 2 1 0 [com.cardatechnologies.utils.validators.abaroutevalidator.ErrorCodes.getErrorMnemonic()](./xref/com/cardatechnologies/utils/validators/abaroutevalidator/ErrorCodes.html) 2 1 0 [com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException.getErrorCode()](./xref/com/cardatechnologies/utils/validators/abaroutevalidator/exceptions/AbaRouteValidationException.html) 2 1 1 [com.cardatechnologies.utils.validators.abaroutevalidator.AbaRouteValidator.AbaRouteValidator()](./xref/com/cardatechnologies/utils/validators/abaroutevalidator/AbaRouteValidator.html) 1 1 0 

**Averages.**

Program NCSS NCSS average CCN average Javadocs average 70.00 4.08 3.25 0.67 

# Explanations

Explanations 

[ [package](#package) ] [ [object](#object) ] [ [method](#method) ] [ [explanation](#explanation) ]

**Non Commenting Source Statements (NCSS)**

Statements for JavaNCSS are not statements as specified in the Java Language Specification but include all kinds of declarations too. Roughly spoken, NCSS is approximately equivalent to counting ';' and '{' characters in Java source files.

Not counted are empty statements, empty blocks or semicolons after closing brackets. Of course, comments don't get counted too. Closing brackets also never get counted, the same applies to blocks in general.

Examples Package declaration `package java.lang;` Import declaration `import java.awt.*;` Class declaration 

- `public class Foo {`
- `public class Foo extends Bla {`

Interface declaration `public interface Able ; {` Field declaration 

- `int a; `
- `int a, b, c = 5, d = 6;`

Method declaration 

- `public void cry();`
- `public void gib() throws DeadException {`

Constructor declaration `public Foo() {` Constructor invocation 

- `this();`
- `super();`

Statement declaration 

- `i = 0;`
- `if (ok)`
- `if (exit) {`
- `if (3 == 4);`
- `if (4 == 4) { ;`
- `} else {`

Label declaration `fine :` 

In some cases consecutive semicolons are illegal according to the JLS but JavaNCSS still tolerates them (thought JavaNCSS is still more strict as 'javac'). Nevertheless they are never counted as two statements.

**Cyclomatic Complexity Number (CCN)**

CCN is also know as McCabe Metric. There exists a much hyped theory behind it based on graph theory, but it all comes down to simply counting 'if', 'for', 'while' statements etc. in a method. Whenever the control flow of a method splits, the "CCN counter" gets incremented by one.

Each method has a minimum value of 1 per default. For each of the following Java keywords/statements this value gets incremented by one:

- `if`
- `for`
- `while`
- `case`
- `catch`

Also if the control flow of a method returns abortively the CCNvalue will be incremented by one:

- `if`
- `for`

An ordinary return at the end of method will not be counted.

Note that 'else', 'default', and 'finally' don't increment the CCN value any further. On the other hand, a simple method with a 'switch' statement and a huge block of 'case' statements can have a surprisingly high CCN value (still it has the same value when converting a 'switch' block to an equivalent sequence of 'if' statements).
