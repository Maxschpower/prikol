class User (var name:String? = null, var cash:Int? = null)

open class Coffee(var size:String, var price:Int){
    init {
        if (size == "большой"){
            price += 20
        }
    }
}

class Capuccino:Coffee("lol",100)
