package example.design.decorator.condiments

import example.design.decorator.Beverage
import example.design.decorator.Condiments

class Soya(private val beverage: Beverage): Condiments() {

    override fun getDescription(): String {
      return  beverage.getDescription()+", Soya"
    }

    override fun cost(): Double {
       return  beverage.cost()+ 12.0
    }
}