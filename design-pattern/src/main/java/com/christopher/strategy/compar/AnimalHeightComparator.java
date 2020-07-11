package com.christopher.strategy.compar;

import com.christopher.strategy.pojo.Animal;

/**
 * 策略1:按照-Animal.height排序
 */
public class AnimalHeightComparator implements Comparator<Animal>{
    public int compare(Animal o1, Animal o2) {
        if (o1.getHeight() > o2.getHeight()) return -1;
        else if (o1.getHeight() < o2.getHeight()) return 1;
        else return 0;
    }
}
