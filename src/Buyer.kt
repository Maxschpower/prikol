class Buyer : StorageListener, ZalupaListener {

    val a = 2
    val ya = "debil"

    override fun listen() {
        println("khochu ischo")
    }

    override fun notifyStorageChange(newStorage: String) {
        println(newStorage)
    }
}