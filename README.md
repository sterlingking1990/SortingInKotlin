# SortingInKotlin

## Behaviour of .indices and .size When sorting a simple Integer list

###### Interestingly, I decided to observe the behaviour of using .indices and .size in a list of integers and I would like to share my observation of how the two of them are very different.

###### I hope this will help shade more light on what method of a list you should use when trying to acheive something similar to sorting or traversing a list of integers

###### This does not cover time space complexity, it just focuses on the behaviour of using .indices and .size when trying to traverse a list of integers in other to sort

## Using Indices
###### Here is our sample list 
`var numToSort= listOf<Int>(10,2,1,20,9,22)`
###### The behaviour of .indices is quite different to .size
###### .indices gets the index positions of each element in the list given you `[0..5]`
###### .size will get the number of element in the list which gives `6`
<pre>
1. var numToSort= listOf<Int>(10,2,1,20,9,22)
2. for( i in numToSort.indices){
3.   print(numToSort[i]
4. }
5. </pre>

###### this is good when traversing elements of the list

###### suppose I want to loop through the element uptil the 4th index, I might do

<pre>
for(i in numToSort.indices-1){
   println(numToSort[i])
}
</pre>

###### This gives a surprising result, it loops through the items exempting the item at index 1

<pre>
10 1 20 9 22
</pre>

###### When you do this:
<pre>
for(i in numToSort.indices-1){
   println(numToSort[i])
}
</pre>
###### This gives the below result; exempting item at index position 2
`
10 2 20 9 22
`

## Using .size

###### If I would like to loop through the items in the list I can use .size to first get the size of the list and then I can loop through.

<pre>
var sizeI=numToSort.size-1
for(i in 0..sizeI){
   println(numToSort[i])
}
</pre>
###### Notice i have to subtract 1 from the size, this is because i needed to avoid outofbound exception since .size returns the number of items in the list and looping through, we index the elements, subtracting 1 from the size of the list gives us the last item in the list.

###### Sorting the list, I decided to use the .size first to get the number of items in the list then perform the loop

<pre>
var sizeI=numToSort.size-1
var sizeJ = numToSort.size-2
for(i in 0..sizeI){
   for(j in 0..sizeJ){
      if(numToSize[j]>numToSize[j+1]){
         Collections.swap(numToSize,j,j+1)
      }
   }
}
</pre>

###### What you should not do
<pre>

for(i in numToSort.indices-1){
   for(j in numToSort.indices-2){
      if(numToSort[j]>numToSort[j+1]){
         Collections.swap(numToSort,j,j+1)
      }
   }
}
</pre>

###### This gives error of index out of bound becuase numToSort.indices-1 would remove the index 1 from [0..5] hence you have [0,2,3,4,5] and numToSort.indices-2 would remove index 2 given [0,1,3,4,5]

## Summary

###### Use .size to get the size of a list

###### Use .indices to loop through using the index positions of the items in the list

###### when using .indices, do not assume it to hold the size of the list and try to subtract a number from it, doing so would mean that you want to remove a particular index from the indices

###### You can subtract from the .size but not from .indices



