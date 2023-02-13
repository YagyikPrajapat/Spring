package com.spring.project.demo.spring.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BinarySearch {
    @Autowired
    @Qualifier("quick")
    private SortAlgorithm sortAlgorithm; //no need for constructor or setter autowire automatically makes it;
    public int binarySearch(int [] nums,int num){
        //sort
        int [] sortedNums=sortAlgorithm.sort(nums);
        return 3;
    }
}
