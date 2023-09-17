# RPAL-Interpreter
This was a final group project for the ***CS3513-Programming Languages*** module offered by the _Department of Computer Science & Engineering, University of Moratuwa_ in the _4<sup>th</sup> semester of Batch 20._

## Problem Requirements
- Implement a lexical analyzer and a parser for the <a href="docs/About RPAL.pdf">RPAL</a> (Right-reference Pedagogic Algorithmic Language). Refer the <a href="docs/RPAL_Lex.pdf">RPAL_Lex</a> for the lexical rules and <a href="docs/RPAL_Grammer.pdf">RPAL_Grammar</a> for the grammar details.
- Output of the parser should be the Abstract Syntax Tree (AST) for the given input program.
- Implement an algorithm to convert the Abstract Syntax Tree (AST) in to Standardize Tree (ST) and implement CSE machine.
- Program should be able to read an input file which contains a RPAL program and return Output which should match the output of `rpal.exe` for the relevant program.

> For more details refer the <a href="docs/ProgrammingProject.pdf">Project_Requirements</a> document.

## About our solution
### Language & Tools
>__Programming Language  :__ Java (Version: java 18.0.1.1 2022-04-22)
<br>__Development & Testing :__ Eclipse, Visual Studio Code, Command line

### How to run
The following are the Instructions to run the project in a **command line:**
- Your local machine must be able to run `make` command in command line, and have java installed.
- Clone the repository to your local machine or download the project source code as a ZIP file.
- Run `make` in the root directory
- Put your RPAL test programs in the root directory. We had added the <a href="t1.txt">t1.txt</a> to the root directory, which contains the sample input program of the <a href="docs/ProgrammingProject.pdf">Project_Requirements</a> document.
- For more test programs look at the <a href="test-programs">test-programs</a> directory.
- The following are the available commands that can be used for running different RPAL programs:
  - Run `<path>\RPAL-Interpreter>java rpal20 <file>` for running the file which contains any RPAL programs and ***print only the Output***.
  - Run `<path>\RPAL-Interpreter>java rpal20 -ast <file>` for running the file and ***print AST(Abstract Syntax Tree) along with the Output***.
  - Run `<path>\RPAL-Interpreter>java rpal20 -st <file>` for running the file and ***print ST(Standardized Tree) along with the Output***.
  - Run `<path>\RPAL-Interpreter>java rpal20 -ast -st <file>` for running the file and ***print AST(Abstract Syntax Tree), ST(Standard Tree), and the Output*** respectively.
  - Run `<path>\RPAL-Interpreter>java rpal20` for running the `t1.txt` and ***print AST(Abstract Syntax Tree), ST(Standard Tree), and the Output*** respectively.
  - `-ast` and `-st` are case insetive when calling them.
- You can run it with argument pasing in any other suitable environments too.


## Group Members
<ul>
  <li><a href="https://github.com/sthanikan2000">Thanikan S.</a></li>
  <li>Sabthana J.</li>
  <li><a href="https://github.com/thiva-k">Thivaharan K.</a></li>
</ul>



