import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestQuickSort {


    public String toString(int [] numbers){
        String temp = "";
        for(int number :numbers ){
            temp = temp + String.valueOf(number) + " ";
        }
        return temp;
    }

    @Test
    public void testIfSortet(){
        QuickSort quickSort = new QuickSort();
        int [] numbers = { 10,8,9 };
        quickSort.quickSortMetodh(numbers,0,numbers.length-1);
        assertEquals( "8 9 10 " , toString(numbers) );
    }


}
