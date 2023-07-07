fun main() {
    val tv = SmartDevice(
        "Samsung OLED Smart TV",
        1000.00 )
//    tv.brand = "Samsung OLED Smart TV"
//    tv.price = 1000.00

    val tv2 = SmartDevice(
        "Samsung OLED Smart TV",
        1000.00 )

    val phone = SmartDevice(
        "Apple iPhone 14",
        1600.00 )
//    phone.brand = "Apple iPhone 14"
//    phone.price = 1600.00

    println("${tv.brand} ${tv.price}")
    println("${phone.brand} ${phone.price}")
    phone.turnOff()
    phone.turnOn()
//    tv.turnOff()
//    tv.turnOn()
    phone.getDeviceState()
    tv.getDeviceState()
    println(tv.toString())
    println("== ${tv == tv2}")
    println("=== (memory location) ${tv === tv2}")
}

// blueprint
class SmartDevice (
    // properties. variables. val or var
    var brand: String ,
    var price: Double,
    var isSwitchedOn: Boolean = false
) {
    constructor() : this("", 0.0)


    // behaviours. functions
        fun turnOn() {
            isSwitchedOn = true
            println("$brand is switching on")
        }
         fun turnOff() {
             isSwitchedOn = false
            println("$brand is switching off")
        }
        fun getDeviceState() {
             println("$brand is on: $isSwitchedOn")
        }

    override fun toString(): String {
        return "SmartDevice(brand='$brand', price=$price, isSwitchedOn=$isSwitchedOn)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SmartDevice

        if (brand != other.brand) return false
        if (price != other.price) return false
        return isSwitchedOn == other.isSwitchedOn
    }

    override fun hashCode(): Int {
        var result = brand.hashCode()
        result = 31 * result + price.hashCode()
        result = 31 * result + isSwitchedOn.hashCode()
        return result
    }


}