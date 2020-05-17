package example.design.observer

/**
 * Interface which should be implemented by class acting as data which will be sent when
 * [IObserver.updateData] is called by [ISubject.notifyObservers]. This class created
 * so that we can created any number of Observer with different data types.
 * IData instance should contain all the data this way any change in data field doesn't need
 * changes in any example.design.observer of subject. IF any new field is added then subject can start
 * update instance and keep notifying the example.design.observer in same way.
 * It upto example.design.observer to parse new data
 */
interface IData {

    fun getData(): IData
}