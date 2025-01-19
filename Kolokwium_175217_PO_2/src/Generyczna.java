//zad 6
import java.util.Arrays;
import java.util.Collections;
public class Generyczna {
    public static <T extends  Comparable<T>> void  sortDescending(T[] array){
        Arrays.sort(array, Collections.reverseOrder());
    }
    public static void main(String[] args){
        Integer[] numbers = {5,2,4,6,9};
        sortDescending(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}
