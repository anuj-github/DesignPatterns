package example.design.observer.impl

import example.design.observer.IData

/**
 *
 */
data class WeatherData(
    var temp: Float,
    var humidity: Float
) : IData {
    override fun getData() = this
}