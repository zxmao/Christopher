package com.christopher.strategy.compar;

/**
 *  the class's {@link java.lang.Comparable#compareTo(T)
 *  This interface imposes a total ordering on the objects of each class that implements it.
 */
public interface Comparable<T> {

    /**
     * Compares this object with the specified object for order.
     */
    int	compareTo(T o);
}
