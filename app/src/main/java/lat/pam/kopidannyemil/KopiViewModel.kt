package lat.pam.kopidannyemil

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class KopiViewModel : ViewModel() {

    // LiveData for Food Catalog List
    private val _foodList = MutableLiveData<List<FoodItem>>().apply {
        value = listOf(
            FoodItem("Kopi Susu Gula Aren", "Espresso, susu, gula aren", "Rp 22.000"),
            FoodItem("Donat Cokelat", "Donat empuk, glaze cokelat", "Rp 12.000"),
            FoodItem("Sourdough Loaf", "Roti fermentasi alami", "Rp 35.000"),
            FoodItem("Cappuccino", "Espresso, foam susu lembut", "Rp 25.000"),
            FoodItem("Matcha Latte", "Matcha jepang, susu segar", "Rp 27.000")
        )
    }
    val foodList: LiveData<List<FoodItem>> get() = _foodList

    // LiveData for Current User Name
    private val _userName = MutableLiveData<String>().apply {
        value = UserSession.nama
    }
    val userName: LiveData<String> get() = _userName

    fun updateUserName(newName: String) {
        UserSession.nama = newName
        _userName.value = newName
    }
}
