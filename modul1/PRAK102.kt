package modul1
import java.util.Scanner;

fun matematika(x: Int): Int { var fx =
    2*(Math.pow(x.toDouble(),2.0).toInt())+(5*x) - 8
    return fx
}

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)
    print("Nilai x = ")
    var x: Int = input.nextInt()
    println(matematika(x))
}