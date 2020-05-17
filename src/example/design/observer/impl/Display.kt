package example.design.observer.impl

import example.design.observer.IObserver

class Display: IObserver<WeatherData> {

    lateinit var data : WeatherData
    override fun updateData(data: WeatherData) {
        println("Temp is $data")
        this.data = data
    }
}