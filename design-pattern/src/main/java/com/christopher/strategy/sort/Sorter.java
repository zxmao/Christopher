package com.christopher.strategy.sort;

import com.christopher.strategy.compar.Comparator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 排序对象
 */
public class Sorter<T> extends AbstractSorter<T> {

    public void sort(T[] t, Comparator<T> c, SortName s) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        if (s==null) {
            defaultSort(t,c);
        } else {
            for (Method method : super.getClass().getMethods()) {
                if (method.getName().toUpperCase().equals(s.name())) {
                    method.invoke(this.getClass().newInstance(),t,c);
                }
            }
        }

    }

    public void defaultSort(T[] t,Comparator<T> c){
        super.selection(t,c);//默认使用选择排序
    }

}
