/**
 * @author XiaoQin
 */
public class LinearSearch {
    public static void main(String[] args) {
        String [] str = {"A","B","C","D","E"};
        String value = "D";
        boolean isFlag = true;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(value)){
                System.out.println("位置："+ i);
                isFlag = false;
                break;
            }
        }
        if (isFlag){
            System.out.println("该值不存在");
        }

    }
}
