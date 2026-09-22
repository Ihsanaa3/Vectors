# Vector Management & Math Library

A Java console application for creating, managing, and performing mathematical operations on 2D and 3D vectors. The project includes a custom robust user input utility (`pyin.Input`) to handle interactive terminal prompts safely.

---

## Features

* **Flexible Vector Model**: Support for both 2D ($i, j$) and 3D ($i, j, k$) mathematical vectors with named identifiers.
* **Vector Management**: Interactive prompt workflows that prevent duplicate vector names, validate vector dimensions (2D vs. 3D), and collect component coordinates.
* **Vector Mathematics**: Basic vector arithmetic operations, such as 2D vector addition.
* **Safe CLI Input Processing**: Standardized, validated console input parsing for `String`, `int`, `double`, `char`, and `boolean` types with built-in bounds checking and symbol restriction.

---

## Project Structure

```text
src/
├── Take2/
│   ├── MyVectors.java      # Data model class representing a 2D or 3D vector
│   ├── VectorManager.java  # Controller handling user interactions and list management
│   └── VectorMath.java     # Utility class containing mathematical operations on vectors
└── pyin/
    └── Input.java          # Custom input validation library wrapping Java's Scanner
