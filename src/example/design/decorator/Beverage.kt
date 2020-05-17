package example.design.decorator

abstract class Beverage {

    open fun getDescription():String{
       return "Unknown"
    }

    abstract fun cost():Double
}