package com.christopher.strategy;


import com.christopher.strategy.compar.AnimalWeightComparator;
import com.christopher.strategy.pojo.Animal;
import com.christopher.strategy.sort.SortName;
import com.christopher.strategy.sort.Sorter;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException {

        //初始需要排序的数组
        Animal[] animals = {new Animal().setHeight(3).setWeight(10)
                , new Animal().setHeight(2).setWeight(10)
                , new Animal().setHeight(5).setWeight(10)};

        //比较器实例化
        Sorter<Animal> sorter = new Sorter<Animal>();
        sorter.sort(animals, new AnimalWeightComparator(), SortName.SELECTION);
        System.out.println(Arrays.toString(animals));
    }
}
