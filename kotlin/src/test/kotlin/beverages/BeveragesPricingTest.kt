package beverages

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.data.Offset.offset
import org.junit.jupiter.api.Test


class BeveragesPricingTest {
    @Test
    fun computes_coffee_price() {
        val coffee = Coffee()
        assertThat(coffee.price()).isCloseTo(1.20, offset(0.001))
    }

    @Test
    fun computes_tea_price() {
        val tea = Tea()
        assertThat(tea.price()).isCloseTo(1.50, offset(0.001))
    }

    @Test
    fun computes_hot_chocolate_price() {
        val hotChocolate = HotChocolate()
        assertThat(hotChocolate.price()).isCloseTo(1.45, offset(0.001))
    }

    @Test
    fun computes_tea_with_milk_price() {
        val teaWithMilk = TeaWithMilk()
        assertThat(teaWithMilk.price()).isCloseTo(1.60, offset(0.001))
    }

    @Test
    fun computes_coffee_with_milk_price() {
        val coffeeWithMilk = CoffeeWithMilk()
        assertThat(coffeeWithMilk.price()).isCloseTo(1.30, offset(0.001))
    }

    @Test
    fun computes_coffee_with_milk_and_cream_price() {
        val coffeeWithMilkAndCream = CoffeeWithMilkAndCream()
        assertThat(coffeeWithMilkAndCream.price()).isCloseTo(1.45, offset(0.001))
    }

    @Test
    fun computes_hot_chocolate_with_cream_price() {
        val hotChocolateWithCream = HotChocolateWithCream()
        assertThat(hotChocolateWithCream.price()).isCloseTo(1.60, offset(0.001))
    }
}
