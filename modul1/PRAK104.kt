package modul1

class Mobil(merek:String, cc:String, tipe:String){
    var merek : String = merek
    var cc : String = cc
    var tipe : String = tipe
}

fun main(){
    println("OTOMOTIF")
    print("Merek : ")
    val merek = readLine() ?:"Toyota Avanza"
    print("CC : ")
    val cc = readLine() ?:"1.239"
    print("Tipe Mobil : ")
    val tipe = readLine() ?:"SUV"
    val call = Mobil(merek,cc,tipe)
    val hasil = """
        =============
        Hasil
        Merek : ${call.merek}
        CC : ${call.cc}
        Tipe : ${call.tipe}
    """.trimIndent()
    print(hasil)
}