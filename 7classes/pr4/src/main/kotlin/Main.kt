package org.example

fun main() {
//    val man1 = DataProviderManager()
//    man1.registerDataProvider(DataProvider())
//    val man2 = DataProviderManager()
//    man2.registerDataProvider(DataProvider())
//    val man3 = DataProviderManager()
//    man3.registerDataProvider(DataProvider())

//    val man = DataProviderManager()
//    man.registerDataProvider(DataProvider())
//    man.registerDataProvider(DataProvider())
//    man.registerDataProvider(DataProvider())

    DataProviderManager.registerDataProvider(DataProvider())
    DataProviderManager.registerDataProvider(DataProvider())
    DataProviderManager.registerDataProvider(DataProvider())
}

class DataProvider {}

//class DataProviderManager {
//    fun registerDataProvider(provider: DataProvider) {}
//}

object DataProviderManager {
    fun registerDataProvider(provider: DataProvider) {}
}
