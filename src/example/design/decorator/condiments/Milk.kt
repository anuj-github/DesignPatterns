package example.design.decorator.condiments

import example.design.decorator.Beverage
import example.design.decorator.Condiments

class Milk(private val beverage: Beverage) : Condiments() {
    override fun getDescription(): String {
        return beverage.getDescription() + ", Milk"
    }

    override fun cost(): Double {
        return beverage.cost() + 8.0
    }
}