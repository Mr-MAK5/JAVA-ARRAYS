import java.util.*;
public class array2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        //input
        for(int i=0; i<size; i++) {
        numbers[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for(int i=0; i<numbers.length-1; i++) { // NOTICE numbers.length-1 astermination condition
            if(numbers[i] > numbers[i+1]) { // This is the condition fordescending order
            isAscending = false;
            }
            }
            if(isAscending) {
            System.out.println("The array is sorted in ascending order");
            } else {
            System.out.println("The array is not sorted in ascending order");
            }
            }
}
