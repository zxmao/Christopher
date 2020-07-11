package com.christopher.strategy.compar;

import com.christopher.strategy.pojo.Animal;

/**
 * 策略2:按照-Animal.weight排序
 */
public class AnimalWeightComparator implements Comparator<Animal>{
    public int compare(Animal o1, Animal o2) {
        if (o1.getWeight() > o2.getWeight()) return -1;
        else if (o1.getWeight() < o2.getWeight()) return 1;
        else return 0;
    }
}
