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
class FoldablePhone(isFolded: Boolean) : Phone(isScreenLightOn = isFolded) {

    var isFolded = true

    override fun switchOn() {
        if (isFolded == false) {
            switchOff()
        } else {
            switchOn()
        }
    }

    fun fold() {

    }

    fun close() {
        
    }
}