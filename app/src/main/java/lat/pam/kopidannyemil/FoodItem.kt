package lat.pam.kopidannyemil

data class FoodItem(
    val name: String,
    val description: String,
    val price: String,
    val imageResId: Int = R.drawable.ic_launcher_foreground
)

object DummyData {
    val foodList = listOf(
        FoodItem("Kopi Susu Gula Aren", "Espresso, susu, gula aren", "Rp 22.000"),
        FoodItem("Donat Cokelat", "Donat empuk, glaze cokelat", "Rp 12.000"),
        FoodItem("Sourdough Loaf", "Roti fermentasi alami", "Rp 35.000"),
        FoodItem("Cappuccino", "Espresso, foam susu lembut", "Rp 25.000"),
        FoodItem("Matcha Latte", "Matcha jepang, susu segar", "Rp 27.000")
    )
}
