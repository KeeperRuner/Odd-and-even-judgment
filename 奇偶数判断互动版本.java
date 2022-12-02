import java.util.Scanner;
public class 奇偶数判断互动版本 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("奇偶数判断小软件");
        while(true) {
            System.out.println("请输入您想要判断的数字：");
            int input = new Scanner(System.in).nextInt();
            if (input==0)
                break;
            if(input % 2 ==0){
                System.out.println(input + "是偶数");
                System.out.println("请输入命令1两次后[退出],2[继续]");
            }else {
                System.out.println(input + "是奇数");
                System.out.println("请输入命令1[退出],2[继续]");
                int commandNum = new Scanner(System.
                        in).nextInt();
                if (1 == commandNum) {
                    System.out.println("退出软件");
                    break;
                }
                if (2 == commandNum)
                    System.out.println("请重新输入数据...");
            }
        }

    }
}

