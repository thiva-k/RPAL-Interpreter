# RPAL-Interpreter
This was a final group project for the ***CS3513-Programming Languages*** module offered by the _Department of Computer Science & Engineering, University of Moratuwa_ in the _4<sup>th</sup> semester of Batch 20._

## Problem Description
Implement a lexical analyzer and a parser for the <a href="docs/About RPAL.pdf">RPAL (Right-reference Pedagogic Algorithmic Language)</a>. 
Refer <a href="docs/RPAL_Lex.pdf">RPAL_Lex.pdf</a> for the lexical rules and <a href="docs/RPAL_Grammer.pdf">RPAL_Grammar.pdf</a> for the grammar details.

Output of the parser should be the Abstract Syntax Tree (AST) for the given input program. Then implement an algorithm to convert the Abstract Syntax Tree (AST) in to Standardize Tree (ST) and implement CSE machine.

Program should be able to read an input file which contains a RPAL program and return Output which should match the output of “rpal.exe“ for the relevant program.

For more details refer the <a href="docs/ProgrammingProject.pdf">ProgrammingProject.pdf</a> document.

## Our Solution 
>__Programming Language :__ Java
<br>__Developer Tool :__ Eclipse, Visual Studio Code, Command line

We used java programming knowleage to build the compiler and interpreter for RPAL programs. 

## Instructions for running our project
1. Clone the repository
2. Run `make` in the root directory
3. Put your RPAL programs in the root directory
4. Run `java rpal20 <file>` for running the file which contains any RPAL programs and print only the Output.
5. Run `java rpal20 -ast <file>` for running the file and print AST(Abstract Syntax Tree) along with the Output
6. Run `java rpal20 -st <file>` for running the file and print ST(Standardized Tree) along with the Output.
7. Run `java rpal20 -ast -st <file>` for running the file and print AST(Abstract Syntax Tree), ST(Standard Tree), and the Output respectively.
8. Run `java rpal20`for running the `t1.txt` which contains the sample input program of the Project Requirement document and print AST(Abstract Syntax Tree), ST(Standard Tree), and the Output respectively.
9. You can call the `-ast` or `-st` in any order as in 7<sup>th</sub> instruction and for calling `-ast` and `-st`, They are case insensitive.


## Group Members
<ul>
  <li><a href="https://github.com/sthanikan2000">Thanikan S.</a></li>
  <li><a href="">Sabthana J.</a></li>
  <li><a href="https://github.com/thiva-k">Thivaharan K.</a></li>
</ul>



