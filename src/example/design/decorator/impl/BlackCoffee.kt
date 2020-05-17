package example.design.decorator.impl

import example.design.decorator.Beverage

class BlackCoffee:Beverage() {

    override fun cost()= 89.00

    override fun getDescription() = "Black Coffe"
}