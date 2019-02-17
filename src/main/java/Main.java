public class Main {



    public static void main(String[] args) {

        int [] numbers = { 1,50,20,3,6,80,77,9,5,6,60,7  };
        QuickSort qs = new QuickSort();

        qs.quickSortMetodh( numbers,0, numbers.length-1);

        for (int i = 0; i <numbers.length ; i++) {
            System.out.print(numbers[i]+" ");
        }

    }

}
