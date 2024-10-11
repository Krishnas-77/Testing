@echo off
REM Compile the test class
javac -cp "libs/*;src/test" src/test/TestClass.java

REM Run the Selenium test
java -cp "libs/*;src/test" org.junit.runner.JUnitCore TestClass