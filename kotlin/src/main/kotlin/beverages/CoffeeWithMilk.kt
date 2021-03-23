package beverages

class CoffeeWithMilk : Coffee() {
    override fun price(): Double {
        return super.price() + 0.10
    }
}
