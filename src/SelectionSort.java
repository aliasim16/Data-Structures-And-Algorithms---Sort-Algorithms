public class SelectionSort {
    public static void main(String[] args) {

        int[] array = {20,35,-15,7,55,1,-22};

        //Sorting Array

        for(int lastUnsortedIndex=array.length-1;lastUnsortedIndex>0;lastUnsortedIndex-- ){

            int largest = 0;

            for (int i =0;i<lastUnsortedIndex;i++){
                if(array[i]>largest){
                    largest=i;
                }
            }
            swap(array,largest,lastUnsortedIndex);
        }

        // Display sorted array
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void swap(int[] array ,int i, int j){

        if(i == j){
            return;
        }

        int temp = array[i];
        array[i]=array[j];
        array[j]= temp ;
    }
}
