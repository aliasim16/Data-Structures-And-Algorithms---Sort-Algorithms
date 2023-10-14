public class ShellSort {
    public static void main(String[] args) {

        /*
        • In-place algorithm
        • Difficult to nail down the time complexity because it will depend on the gap. Worst case: O(n²), but it can perform much better than that
        • Doesn't require as much shifting as insertion sort, so it usually performs better
        • Unstable algorithm
        */

        int[] array = {20,35,-15,7,55,1,-22};

        //Sorting

        for ( int gap = array.length/2;gap>0;gap/=2){

            for (int i = gap;i<array.length;i++){

                int newElement = array[i];

                int j = i;

                // comparison according to gap between index
                while(j>= gap && array[j-gap]>newElement){
                    //shift
                    array[j]=array[j-gap];
                    j-=gap;
                }

                array[j]=newElement;
            }
        }

        // Display Sorted array
        for(int j :array){
            System.out.println(j);
        }
    }
}
