import java.lang.Exception
import java.util.InputMismatchException
import java.util.Scanner
fun main(args:Array<String>){
    try {
        var sc = Scanner(System.`in`)
        println("Enter number 1:-")
        var num1 = sc.nextInt()
        println("Enter number 2:-")
        var num2 = sc.nextInt()
        try {
            var divide = num1 / num2
            println("Result:-$divide")
        } catch (e: ArithmeticException) {
            println("Number can't be divisible by zero")
        }
    }
    catch(e:InputMismatchException){
        println("Required Number only")
    }

}
