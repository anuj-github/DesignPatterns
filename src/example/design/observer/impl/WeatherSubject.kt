package example.design.observer.impl

import example.design.observer.IObserver
import example.design.observer.ISubject

class WeatherSubject : ISubject<WeatherData> {
    private var observerList = arrayListOf<IObserver<WeatherData>>()
    private val weatherData = WeatherData(0.0F, 0.0F)

    fun getSize() = observerList.size
    override fun registerObserver(observer: IObserver<WeatherData>) {
         observerList.add(observer)
    }

    override fun unregisterObserver(observer: IObserver<WeatherData>) {
        observerList.remove(observer)
    }

    override fun notifyObservers() {
        observerList.forEach {
            it.updateData(weatherData)
        }
    }

    fun onDataChanged(temp:Float, humidity: Float) {
        weatherData.temp = temp
        weatherData.humidity = humidity
        notifyObservers()
    }
}