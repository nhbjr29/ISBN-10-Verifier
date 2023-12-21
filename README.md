# ISBN-10 Verifier

## Overview

This Java Swing application is designed to validate ISBN-10 strings. The application includes a text field for input and a button to perform the validation. ISBN-10 is a specific format for representing books with a 10-digit code. The validation is based on a formula to ensure the correctness of the ISBN-10 string.

## ISBN-10 Format

The ISBN-10 string format accepted by the application is:

Where `d` is a number, and `C` is a check character (either a digit or an 'X'). If the check character is 'X', it represents the value '10'.

## Validation Formula

The validity of the ISBN-10 string is checked using the following formula:

## Application Usage

1. Enter an ISBN-10 string in the provided text field.
2. Click the validation button to check if the ISBN-10 string is valid.
3. The result of the validation will be displayed, indicating whether the entered ISBN-10 is valid or not.

## Example

For example, the ISBN-10 string `3-598-21508-8` is valid.

## Requirements

- Java Development Kit (JDK)
- Java Swing library

## How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/ISBNVerifier.git
   ```

Replace "your-username" with your actual GitHub username. This template provides a general structure with information about the application, its format, validation formula, and instructions for running it.
