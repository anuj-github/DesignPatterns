package example.observer

import observer.IData

/**
 *
 */
data class WeatherData(
    var temp: Float,
    var humidity: Float
) : IData {
    override fun getData() = this
}