package com.spring.project.demo.spring.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
public class QuickSort implements SortAlgorithm {

    public int [] sort(int [] nums){
        //sort
        System.out.println(1);
        return nums;
    }
}
