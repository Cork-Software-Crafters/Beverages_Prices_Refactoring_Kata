package beverages

class CoffeeWithMilkAndCream : Coffee() {
    override fun price(): Double {
        return super.price() + 0.25
    }
}
