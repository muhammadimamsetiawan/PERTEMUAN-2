//Kita tidak dapat bekerja dengan variabel maybeNumber dan s2 seperti biasanya karena kedua
//variabel tersebut mungkin saja memiliki nilai null. Untuk memanggil dan menggunakannya
//dengan aman, maka tambahkan operator !! yang fungsinya melewatkan pemeriksaan nilai null.
fun main(args: Array<String>) {
    //Null safety
    //The !! operator
    var maybeNumber: Int? = 15
    println(maybeNumber!! * 2)
    maybeNumber = null
    println(maybeNumber!! * 2)
}