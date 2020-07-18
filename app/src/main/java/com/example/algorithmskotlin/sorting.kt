package com.example.algorithmskotlin

import java.util.*

fun main(args:Array<String>){
    var numToSort= listOf<Int>(10,2,1,20,9,22)

    for (i in numToSort.indices-1)
        for(j in numToSort.indices-2){
            if(numToSort[j]>numToSort[j+1]){
                Collections.swap(numToSort,j,j+1)
            }
        }
    print(numToSort)

}
