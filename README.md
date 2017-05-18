# SplitSort
### Introduction
This program sorts arrays of any type in ascending order. Enclosed are the sorting method and class (named HoldSort), a class of excel objects for sorting two-number index-value pairs. Finally, enclosed in the main class is a method for populating an array to demonstrate the sorting process. Because the program will not work with both enabled, at all times one of the array populators must be commented out. Comments are used to make clear what section achieve what purpose

### Sorting Method
This sort uses an individual analysis bubble sort that creates a subarray of sorting elements. It iterates through the array in ascending index order and puts the value from the original array at the index in its sorted position in the subarray. After iterating through all positions of the original array, it returns the sorted subarray.

### ExcelSort Objects
This class allows for the creation of index-value pair objects that can be used to find the indexes of values in ascending order. That is-the list sorts the ExcelSort objects according to their values (val) but returns the *indexes* of the sorted list. This is useful for sorting excel-type data or finding the maximum quickly.