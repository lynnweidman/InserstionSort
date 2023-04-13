package org.example;

public class InsertionSort {
            /* Starts with the outer loop. i is at index 1 (the 2nd element),j is 1 less than i (starts at index 0). Continues to loop until the end of the list.*/

    public void sort(int listOfNums[]) {
        for (int i = 1; i < listOfNums.length; ++i) {
            int key = listOfNums[i];
            int j = i - 1;



            /* This is the inner loop. It iterates for each time the outer loop iterates. It compares j to the key. If j is larger than the key, it moves to the 
               right 1 index and the smaller one moves to the left 1 index. Then begins the outer loop again. Once the list is iterated through and is sorted,      
               the list is printed with a space in between each number. */

            while (j >= 0 && listOfNums[j] > key) {
                listOfNums[j + 1] = listOfNums[j];
                j = j - 1;
            }
            listOfNums[j + 1] = key;

        }
        for (int i = 0; i < listOfNums.length; ++i) {
            System.out.print(listOfNums[i] + " ");
        }
    }

    
	      /* Creates the InsertionSort object and calls the method. */
 
        public static void main (String[]args){

            int unsortedList[] = {88, 31, 63, 55, 1};
            InsertionSort sortedList = new InsertionSort();
            sortedList.sort(unsortedList);
        }
}


