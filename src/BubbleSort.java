public class BubbleSort {
    public static void main(String[] args) {
        /*
        Bubble Sort
        • In-place algorithm
        • O(n²) time complexity - quadratic
        • It will take 100 steps to sort 10 items, 10,000 steps to sort 100 items, 1,000,000 steps to sort 1000 items
        • Algorithm degrades quickly
        */

        int[] array = {20,35,-15,7,55,1,-22};

        // Sorting array

        for (int lastUnsortedIndex = array.length-1; lastUnsortedIndex>0;lastUnsortedIndex--){
            for (int i =0;i<lastUnsortedIndex;i++){
                if( array[i] > array[i+1] ){
                    swap(array,i,i+1);
                }
            }
        }
        // Display Sorted array

        for (int i : array) {
            System.out.println(i);
        }

    }
    public static  void swap(int[] array , int i,int j){
        if(i == j){
            return;
        }
        // Swap the two index that given

        int temp = array[i];
        array[i]=  array[j];
        array[j]= temp;
    }

}