package observer

/**
 * Subject interface. This needs to be implemented by class which want to
 * act as publisher/subject for the data. A subscriber can register/unregister
 * by calling respective methods
 */
interface ISubject<T> {

    fun registerObserver(observer: IObserver<T>)
    fun unregisterObserver(observer: IObserver<T>)
    fun notifyObservers()
}