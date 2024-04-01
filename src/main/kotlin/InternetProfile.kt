fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}


class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        // Fill in code

        var hasReferrer: String

        val checkReferrer =
            if (referrer == null)
                hasReferrer = "Doesn't have a referrer"
            else hasReferrer = "Has a referrer named ${referrer.name.replaceFirstChar { it.uppercase() } } who likes to $hobby"

        println("Name: $name\nAge: $age\nLikes to $hobby. $hasReferrer.\n")
    }
}