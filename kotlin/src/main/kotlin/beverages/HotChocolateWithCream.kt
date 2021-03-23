package beverages

class HotChocolateWithCream : HotChocolate() {
    override fun price(): Double {
        return 1.45 + 0.15
    }
}
