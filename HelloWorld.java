
import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        System.out.println("����������(300����500)");
        Scanner sc = new Scanner(System.in);  //����¼��
        int zhishuming = sc.nextInt();
        switch (zhishuming) {
            case 300:
                System.out.println("300��֮ǰ��Ϊ11.99%");
                System.out.println("���뵱ǰ300���ʣ�����Ҫ����ٷֺţ�");
                float lv = sc.nextFloat();
                double pow = 800*Math.pow((lv / 11.99), 2)*((double)7/31);
                System.out.println("300������"+pow);
                break;
            case 500:
                System.out.println("500��֮ǰ����Ϊ24.33");
                System.out.println("���뵱ǰ500�ı���");
                float beishu = sc.nextFloat();
                double pow_300 = Math.pow(( 24.33/ beishu), 2)*800*((double) 7/31);
                System.out.println("500������"+pow_300);
                break;
        }
    }
}