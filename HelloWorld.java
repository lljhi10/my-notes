
import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        System.out.println("请输入类型(300或者500)");
        Scanner sc = new Scanner(System.in);  //键盘录入
        int zhishuming = sc.nextInt();
        switch (zhishuming) {
            case 300:
                System.out.println("300的之前率为11.99%");
                System.out.println("输入当前300的率（不需要输入百分号）");
                float lv = sc.nextFloat();
                double pow = 800*Math.pow((lv / 11.99), 2)*((double)7/31);
                System.out.println("300：放入"+pow);
                break;
            case 500:
                System.out.println("500的之前倍数为24.33");
                System.out.println("输入当前500的倍数");
                float beishu = sc.nextFloat();
                double pow_300 = Math.pow(( 24.33/ beishu), 2)*800*((double) 7/31);
                System.out.println("500：放入"+pow_300);
                break;
        }
    }
}