package fr.tblf.patterns.observer.bourseApiJava

import fr.tblf.patterns.observer.bourse.observers.Observer
import java.beans.PropertyChangeEvent
import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport

class DonneesBourse {
    private val propertyChangeSupport = PropertyChangeSupport(this)

    var cac40 = 0.0F
    var dawJones = 0.0F
    var nikkei = 0.0F

    fun setData(c: Float, d: Float, n: Float) {
        propertyChangeSupport.firePropertyChange(PropertyChangeEvent(this, "data", arrayOf(cac40,dawJones,nikkei), arrayOf(c,d,n)))

        cac40 = c
        dawJones = d
        nikkei = n
    }

    fun ajouterObserver(pcl: PropertyChangeListener) {
        propertyChangeSupport.addPropertyChangeListener(pcl)
    }

    fun retirerObserver(pcl: PropertyChangeListener) {
        propertyChangeSupport.removePropertyChangeListener(pcl)
    }


}