/**
 * @author XiaoQin
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {1,4,7,8,5,2,3,6,9};
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i+"\t");
        }
    }
}
