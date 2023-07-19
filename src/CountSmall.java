import java.util.Scanner;

public class CountSmall {
    static void findCount(int[] array) {
        int size = array.length;
        int count;

        for (int i = 0; i < size; i++){
            count = 0;
            for (int j = i+1; j < size; j++){
                if (array[i] > array[j]){
                    count++;
                }
            }

            System.out.print(count+" ");
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        findCount(array);

    }


}
