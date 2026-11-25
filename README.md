# Ubunifu Library: Foundations

An introductory Java console library application using classes, encapsulation, fixed-size arrays, conditionals and console input.

**Author:** Luca Brandao  
**Coursework:** OOP152 SS2 · Bachelor of Business Information Systems, STADIO Higher Education  
**Stack:** Java

## Features

- Represent books and members with Java classes and private fields.
- Display a catalogue of ten seeded books.
- Remove a book, add a book when capacity is available, or borrow one by ISBN.
- Track book availability and demonstrate member borrowing.
- Separate hello-world, class demonstration and interactive entry points.

## Requirements and setup

Install a JDK 17 or newer and make `java` and `javac` available on your PATH. From this folder:

```sh
mkdir out
javac -encoding UTF-8 -d out src/*.java
java -cp out LibraryManagementSystem
```

On PowerShell, if wildcard expansion is unavailable, compile with:

```powershell
javac -encoding UTF-8 -d out (Get-ChildItem src/*.java).FullName
```

Compiled classes go into `out`, which is ignored by Git. No external Java libraries or IDE are required.

## Using the project

The interactive menu has five options: add a book, remove a book, display books, borrow a book and exit. Choose `3` to view the catalogue and `5` to exit. The initial array is full, so remove one book before trying to add another. Run `java -cp out Main` for the separate book/member demonstration or `java -cp out HelloLibrary` for the introductory exercise.

## How it works

`Book` holds the title, author, ISBN and availability flag. `LibraryUser` keeps a fixed-size borrowed-book array. `LibraryManagementSystem` manages a ten-element catalogue and the interactive menu. `Main` demonstrates the book/member classes separately.

## Project files

- `src/Book.java`: book model.
- `src/LibraryUser.java`: member and borrowing model.
- `src/LibraryManagementSystem.java`: catalogue operations.
- `src/Main.java`: class demonstration.
- `src/HelloLibrary.java`: introductory console exercise.

## Portfolio preparation

Seeded member names and associated comments use fictional demo labels. The main menu handles a non-numeric selection without crashing and exits cleanly when standard input closes. Bibliographic titles and published authors are retained as reference data.

Notebook outputs, personal submissions, IDE settings, compiled classes, dependency folders and assignment/presentation files are not included. See [PROJECT.md](PROJECT.md) for the academic context.

## Limitations and troubleshooting

The catalogue has a fixed capacity of ten books. It starts full and all state is in memory. This foundations stage does not provide the extended return/search/member-management workflow; that is in the separate Ubunifu-Library-Management repository.

## Portfolio

[My GitHub profile](https://github.com/Luca-Brandao) · [LinkedIn](https://www.linkedin.com/in/luca-brandao-a90961352/)
