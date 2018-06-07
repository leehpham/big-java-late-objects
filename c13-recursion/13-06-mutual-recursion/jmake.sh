#! /bin/bash

javac ExpressionTokenizer.java
javac Evaluator.java
javac ExpressionCalculator.java

java ExpressionCalculator

rm *.class