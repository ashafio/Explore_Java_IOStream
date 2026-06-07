# Explore Java I/O Streams

A focused collection of Java programs exploring the `java.io` and `java.nio` packages — covering byte streams, character streams, buffering, serialisation, file handling, and NIO channels.

---

## Overview

This repository contains hands-on examples written while studying Java's I/O model in depth. Programs progress from low-level byte/character stream fundamentals through to object serialisation, file system operations, and the modern NIO API. Every file is self-contained and runnable with no external dependencies.

---

## Topics Covered

| Topic | Key Classes / APIs |
|---|---|
| **Byte streams** | `InputStream`, `OutputStream`, `FileInputStream`, `FileOutputStream` |
| **Character streams** | `Reader`, `Writer`, `FileReader`, `FileWriter` |
| **Buffered I/O** | `BufferedReader`, `BufferedWriter`, `BufferedInputStream`, `BufferedOutputStream` |
| **Standard streams** | `System.in`, `System.out`, `System.err`, `Scanner` |
| **Print streams** | `PrintStream`, `PrintWriter` |
| **Data streams** | `DataInputStream`, `DataOutputStream` — reading/writing primitives |
| **Object serialisation** | `ObjectInputStream`, `ObjectOutputStream`, `Serializable`, `transient` |
| **File operations** | `File`, `Files`, `Paths` — create, delete, rename, list directories |
| **Random access** | `RandomAccessFile` — seek, read, write at arbitrary positions |
| **NIO basics** | `FileChannel`, `ByteBuffer`, `Path`, `Files.copy()`, `Files.readAllLines()` |
| **try-with-resources** | Automatic stream closing with `AutoCloseable` |
| **Exception handling** | `IOException`, checked vs unchecked patterns in I/O code |

---

## Project Structure

```
Explore_Java_IOStream/
├── src/
│   └── com/
│       └── iostream/           # All Java source files, one per concept
│           ├── ByteStreamDemo.java
│           ├── CharStreamDemo.java
│           ├── BufferedIODemo.java
│           ├── SerializationDemo.java
│           ├── FileOperations.java
│           ├── NIODemo.java
│           └── ...
├── sample_files/               # Sample text/binary files used in examples
├── .idea/
├── *.iml
└── .gitignore
```

---

## Getting Started

### Prerequisites

- JDK 8 or later
- IntelliJ IDEA (recommended)

### Run in IntelliJ IDEA

1. Clone the repository:

```bash
   git clone https://github.com/ashafio/Explore_Java_IOStream.git
```

2. Open in IntelliJ via `File → Open`.

3. Run any class with a `main()` method — each is self-contained.

### Run from terminal

```bash
javac -d out src/com/iostream/*.java
java -cp out com.iostream.BufferedIODemo
```

---

## Key Patterns

**Read a text file line by line:**
```java
try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
    String line;
    while ((line = br.readLine()) != null) System.out.println(line);
}
```

**Serialise and deserialise an object:**
```java
// Serialise
try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.ser"))) {
    oos.writeObject(myObject);
}

// Deserialise
try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"))) {
    MyClass obj = (MyClass) ois.readObject();
}
```

**Copy a file with NIO:**
```java
Path src  = Paths.get("source.txt");
Path dest = Paths.get("destination.txt");
Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
```

---

## Author

**Shafi (Abid Rahman Shafi)** — GitHub: [@ashafio](https://github.com/ashafio)
