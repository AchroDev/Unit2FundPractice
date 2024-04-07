open class Phone(var isScreenLightOn: Boolean = false){
    
    open fun switchOn() {
        isScreenLightOn = true
    }

    open fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

// FoldablePhone class that inherits from the "Phone" class.
class FoldablePhone(var isFolded: Boolean = true) : Phone() {

    // Overrided switchOn() function behavior to only turn on the screen if it isn't folded
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }

    // Method to change the folding state to "folded"
    fun fold() {
        isFolded = true
    }

    // Method to change the folding state to "unfolded"
    fun unFold() {
        isFolded = false
    }
}

// Entry point
fun main() {
    val newFoldablePhone = FoldablePhone()

    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
    newFoldablePhone.unFold()
    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
}