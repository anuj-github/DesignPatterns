package test.decorator

import example.design.decorator.Beverage
import example.design.decorator.condiments.Milk
import example.design.decorator.condiments.Soya
import example.design.decorator.impl.BlackCoffee
import example.design.decorator.impl.Espresso


fun main() {
    val beverage = Espresso()
    println("${beverage.getDescription()} cost $${beverage.cost()}" )
    val bev = BlackCoffee()
    val condiment = Milk(Soya(bev))
    println("${condiment.getDescription()} cost $${condiment.cost()}" )

}
