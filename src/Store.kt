class Store(val listener: StorageListener) {
    var storage = ""

    fun changeStorage(newStorage: String) {
        storage = newStorage
        listener.notifyStorageChange(newStorage)
    }
}

class Ozaluplivatel(val listener: ZalupaListener) {

    fun giveZalupa() {
        listener.listen()
    }
}

fun main() {
    val buyer = Buyer()
    val storage = Store(buyer)
    val oz = Ozaluplivatel(buyer)

    oz.giveZalupa()
    storage.changeStorage("123123")
}