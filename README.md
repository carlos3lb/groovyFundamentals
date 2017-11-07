# GroovyFundamentals
Groovy fundamentals course

## what is Groovy?
Jvn language with this characteristics:
- Dynamic language
- Compile to JVM bytecode
- Functional programing
- Has mature IDE support
- Typing constraints at runtime
- Can use existing Java libraries

## Installation

### Windows
Download using this [link](http://groovy-lang.org/download.html). JAVA_HOME environment variable needed.

### Linux
Open a new terminal or type the command:
```
$ source "$HOME/.sdkman/bin/sdkman-init.sh"
```
Then install the latest stable Groovy:
```
$ sdk install groovy
```
After installation is complete and you’ve made it your default version, test it with:
```
$ groovy -version
```
That’s all there is to it!

## Groovy Shell
Start with:
```
$ groovysh
```
Examples:
```
Groovy Shell (2.4.12, JVM: 1.8.0_151)
Type ':help' or ':h' for help.
-------------------------------------------------------------------------------
groovy:000> 3+2
===> 5
groovy:000> println "carlos lopez"
carlos lopez
===> null
groovy:000> println "carlos lopez" + "bartolome".toUpperCase()
carlos lopezBARTOLOME
===> null
```

## Groovy Script
Create a *.groovy file like this one:
```
println "welcome Carlos"
println "Today date is " + new Date() 
```
Then execute it using:
```
carlos3lb@carlos3lb-Aspire-E5-573G:~/Escritorio$ groovy test.groovy
welcome Carlos
Today date is Tue Nov 07 12:11:37 GMT 2017
```




