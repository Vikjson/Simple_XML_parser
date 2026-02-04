# Simple XML Parser

A simple Java program that reads a `users.xml` file and prints each user's **name**, **email**, and **username** to the console.

---

## Features

- Parses an XML file using Java's built-in DOM parser (`DocumentBuilderFactory` and `DocumentBuilder`).
- Handles errors gracefully if the file cannot be read or parsed.
- Prints all user information in a readable format.

---

## Requirements

- Java 8 or higher
- IDE (IntelliJ IDEA, Eclipse, or VS Code recommended)
- XML file named `users.xml` in the project root

---

## How to Run

1. Make sure `users.xml` is in the project root folder.
2. Compile the program:

```bash
javac -d out src/XMLParser.java
java -cp out XMLParser
