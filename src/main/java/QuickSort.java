public class QuickSort {



    public void quickSortMetodh(int [] numbers, int start , int end ) {

        int i = start;
        int j = end;
        int midle = numbers[ i+(j-i)/2 ];

        while(i<=j){
            while( numbers[i] < midle  ){
                i++;
            }
            while(numbers[j] > midle){
                j--;
            }
            if( i <= j  ){
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] =temp;
                i++;
                j--;
            }
        }
        if( j > start){
            quickSortMetodh(numbers, start, j );
        }
        if( i < end  ){
            quickSortMetodh(numbers, i, end );
        }
    }



}
