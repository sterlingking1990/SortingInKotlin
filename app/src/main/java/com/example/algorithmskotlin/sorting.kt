package com.example.algorithmskotlin

import java.util.*

fun main(args:Array<String>){
    var numToSort= listOf<Int>(10,2,1,20,9,22)

    var rangeI=numToSort.size-1
    var rangeJ=numToSort.size-2

    for (i in 0..rangeI)
        for(j in 0..rangeJ){
            if(numToSort[j]>numToSort[j+1]){
                Collections.swap(numToSort,j,j+1)
            }
        }
    print(numToSort)

}
