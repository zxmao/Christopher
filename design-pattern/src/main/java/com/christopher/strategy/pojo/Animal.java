package com.christopher.strategy.pojo;

import com.christopher.strategy.compar.Comparable;
import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class Animal implements Comparable<Animal> {

    private int weight,height;

    public int compareTo(Animal a) {
        if (this.weight<a.weight) return -1;
        if (this.weight>a.weight) return 1;
        return 0;
    }
}
