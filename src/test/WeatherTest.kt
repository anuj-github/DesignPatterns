package test

import example.observer.Display
import example.observer.WeatherSubject
import org.junit.jupiter.api.Test

class WeatherTest {

    @Test
    fun testObserverSize(){
         val subject = WeatherSubject()
         val observer = Display()
         assert(subject.getSize()==0)
         subject.registerObserver(observer)
         assert(subject.getSize()==1)
         subject.unregisterObserver(observer)
         assert(subject.getSize()==0)
    }

    @Test
    fun testData(){
        val subject = WeatherSubject()
        val observer = Display()
        subject.registerObserver(observer)
        subject.onDataChanged(2.0F, 3.0F)
        assert(observer.data.temp == 2.0F)
        assert(observer.data.humidity == 3.0F)
        subject.unregisterObserver(observer)
        assert(subject.getSize()==0)
    }
}