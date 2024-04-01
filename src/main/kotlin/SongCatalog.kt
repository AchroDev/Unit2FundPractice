class SongCatalog() {
    val title: String = "Blind"
    val artist: String = "REDZED"
    val yearPublished: Int = 2019
    val playCount: Int = 2800000

    val message = songDescription()

    val isPopular =
        if (playCount >1000)
            println("This song is popular!")
        else println("This song is not popular, yet!")

    fun songDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}

fun main() {
    SongCatalog()
}