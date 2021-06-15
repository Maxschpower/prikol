interface StorageListener {
    fun notifyStorageChange(newStorage: String)
}

interface ZalupaListener {
    fun listen()
}