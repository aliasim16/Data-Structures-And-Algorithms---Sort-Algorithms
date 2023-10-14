public class InsertionSort {
    public static void main(String[] args) {
        /*
        Insertion Sort
        • In-place algorithm
        • O(n²) time complexity - quadratic
        • It will take 100 steps to sort 10 items, 10,000 steps to sort 100 items, 1,000,000 steps to sort 1000 items
        • Stable algorithm
        */
        int[] array = {20,35,-15,7,55,1,-22};

        // Sorting

        for (int firstUnsortedIndex = 1; firstUnsortedIndex<array.length;firstUnsortedIndex++){

            int newElement = array[firstUnsortedIndex];

            int i;
            //comparison with the previous index
            for (i= firstUnsortedIndex; i>0 && array[i-1]>newElement; i-- ){
              array[i] = array[i-1];
            }
            // shift
            array[i] = newElement;
        }
        //// Display Sorted array
        for (int j :array){
            System.out.println(j);
        }
    }
}
