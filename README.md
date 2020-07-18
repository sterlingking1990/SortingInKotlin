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
###### line 2 when re-written using the value of numToSort.indices is as:
`for(i in [0..5])`
###### this is good when traversing elements of the list
###### suppose we want to loop through the element uptil the 4th index, you might suppose we do
<pre>
for(i in numToSort.indices-1){
   println(numToSort[i])
}
</pre
###### This gives a surprising result, it loops through the items exempting the item on index 1. 
`10 1 20 9 22`
