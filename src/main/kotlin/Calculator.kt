object Calculator  {
    // Add method
    fun add(number1: Double, number2: Double): Double {
        return number1 + number2
    }

    // isPrime method
    fun isPrime(num: Int): Boolean {
        for (i in 2..num / 2) {
            if (num % i == 0) {
                return false
            }
        }
        return true
    }

    // Sqrt method
    fun sqrt(number: Double): Double {
        return Math.sqrt(number)
    }

    // Factorial method
    fun fact(n: Long): Long {
        var constant: Long = 1
        for (i in 2..n) {
            constant *= i
        }
        return constant
    }
}