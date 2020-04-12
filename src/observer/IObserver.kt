package observer

/**
 * Interface for class which would like to act as observer for some data
 * Observer should call [ISubject.registerObserver] to register itself as observer
 * and [ISubject.unregisterObserver] to deregister itself from listener list.
 *
 * Observer will be notified when subject call [updateData] method.
 */
interface IObserver<T> {
    fun updateData(data: T)
}