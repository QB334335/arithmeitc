/**
 * @author XiaoQin
 */
public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {-98,-34,2,34,54,66,79,105,210,333};
        int number = 54;
        int head = 0;
        int end = arr.length -1;
        boolean isFlag = true;
        while (head <= end){
            int middle = (head+end)/2;
            if (number == arr[middle]){
                System.out.println("位置："+middle);
                isFlag = false;
                break;
            }else if (arr[middle] > number){
                end = middle - 1;
            }else {
                head = middle + 1;
            }
        }
        if (isFlag){
            System.out.println("不存在");
        }
    }
}
