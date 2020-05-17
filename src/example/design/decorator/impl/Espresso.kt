package example.design.decorator.impl

import example.design.decorator.Beverage

class Espresso:Beverage() {

    override fun cost()= 100.00

    override fun getDescription() = "Espresso"
}