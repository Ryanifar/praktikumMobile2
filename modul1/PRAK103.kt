package modul1

import java.util.Scanner

fun main(){
    val input=Scanner(System.`in`)
    println("Input Bilangan = ")
    val bil = input.nextInt()
    var i:Int=bil
    for (i in 1..8) {
        var hasil = bil * i
        if(hasil%2 == 0 || hasil%3 == 0) {
            print("$hasil ")
        }
    }
}