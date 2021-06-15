class User(var name: String? = null, var cash: Int? = null)

enum class Size {
    SMALL,
    MEDIUM,
    SEMI_MEDIUM,
    SEMI_LARGE,
    LARGE;
}

open class Coffee(size: Size, open var price: Int) {
    init {
        price = when (size) {
            Size.SMALL -> price
            Size.MEDIUM, Size.SEMI_MEDIUM, Size.SEMI_LARGE -> price + 20
            Size.LARGE -> price + 40
        }
    }
}

class Capuccino(var size: Size, override var price: Int) : Coffee(size, price)

val cap = Capuccino(Size.SMALL, 100)
