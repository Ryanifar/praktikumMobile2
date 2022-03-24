package modul1
import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    print("Input Bilangan = ")
    var bilangan = input.nextInt()
    var loop: Int = 1
    var hasil: Int = 0

    while(loop < 6 ) {
        hasil = hasil + bilangan
        if (hasil % 2 == 0 || hasil % 3 == 0) { print("$hasil ")
            loop+=1
        }
    }
}