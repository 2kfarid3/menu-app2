
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    while (true) {
        println("Please select one:")
        println("1. Addition")
        println("2. Primality check")
        println("3. Square root calculation")
        println("4. Factorial calculation")
        println("5. Exit")
        print("Enter your choice: ")

        if (scanner.hasNextInt()) {
            val choice = scanner.nextInt()
            when (choice) {
                1 -> performAddition(scanner)
                2 -> performPrimalityCheck(scanner)
                3 -> performSquareRoot(scanner)
                4 -> performFactorial(scanner)
                5 -> return
                else -> println("Invalid choice! Please enter a number between 1 and 5.")
            }
        } else {
            println("Invalid input! Please input a valid number.")
            scanner.next()
        }
    }
}

fun performAddition(scanner: Scanner) {
    while (true) {
        print("Enter first number: ")
        val num1 = readDouble(scanner)
        print("Enter second number: ")
        val num2 = readDouble(scanner)
        val result = Calculator.add(num1, num2)
        println("Result: $result")
        break
    }
}

fun performPrimalityCheck(scanner: Scanner) {
    while (true) {
        print("Enter your number: ")
        val number = readPositiveInt(scanner)
        if (number == 1) {
            println("1 is not a prime number")
            break
        }
        val resultOfIsPrime = Calculator.isPrime(number)
        if (!resultOfIsPrime) {
            println("$number is not prime.")
        } else {
            println("$number is prime.")
        }
        break
    }
}

fun performSquareRoot(scanner: Scanner) {
    while (true) {
        print("Enter your number: ")
        val sqrtNumber = readDouble(scanner)
        if (sqrtNumber < 0) {
            println("Invalid input! Please input a non-negative number.")
            continue
        }
        val resultOfSqrt = Calculator.sqrt(sqrtNumber)
        println(resultOfSqrt)
        break
    }
}

fun performFactorial(scanner: Scanner) {
    while (true) {
        print("Enter your number: ")
        val factNumber = readNonNegativeInt(scanner)
        val resultOfFact = Calculator.fact(factNumber.toLong())
        println(resultOfFact)
        break
    }
}

fun readDouble(scanner: Scanner): Double {
    while (true) {
        try {
            return scanner.nextDouble()
        } catch (e: Exception) {
            println("Invalid input! Please input a valid number.")
            print("Enter valid number: ")
            scanner.nextLine()
        }
    }
}

fun readPositiveInt(scanner: Scanner): Int {
    while (true) {
        try {
            val number = scanner.nextInt()
            if (number < 1) {
                println("Please enter a number greater than or equal to 1.")
                print("Enter valid number: ")
                continue
            }
            return number
        } catch (e: Exception) {
            println("Invalid input! Please input a valid positive integer number.")
            print("Enter your number: ")
            scanner.nextLine()
        }
    }
}

fun readNonNegativeInt(scanner: Scanner): Int {
    while (true) {
        try {
            val number = scanner.nextInt()
            if (number < 0) {
                println("Invalid input! Please input a valid non-negative integer number.")
                print("Enter valid number: ")
                continue
            }
            return number
        } catch (e: Exception) {
            println("Invalid input! Please input a valid integer number.")
            print("Enter valid number: ")
            scanner.nextLine()
        }
    }
}

