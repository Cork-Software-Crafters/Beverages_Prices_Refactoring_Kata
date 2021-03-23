package beverages

class TeaWithMilk : Tea() {
    override fun price(): Double {
        return super.price() + 0.10
    }
}
