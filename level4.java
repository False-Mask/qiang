import java.util.Scanner;
public class level4 {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        GuoMingMenu menu=new GuoMingMenu();
        GuoMingCanteen canteen=new GuoMingCanteen();
        canteen.Welcome();
        int count = 0;
        int[] choic = new int[100];
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d %s %d\n",menu.order[i],menu.menu[i],menu.price[i]);
        }
        int sum=0;
        int choice;
        for (;;) {//循环点餐
            System.out.println("请输入你要点的序列号：(0表示结束订餐)");
            choice = Sc.nextInt();
            for (;choice!=0 && choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5; choice = Sc.nextInt()) {
                System.out.println("别闹！！");
            }
            choic[count] = choice;
            count++;
            System.out.println("您已经点了：");
            if (choice==0) break;
            for (int i = 0; i < count; i++) {
                System.out.printf("%d  %s  %d\n",i+1,menu.menu[choic[i]-1],menu.price[choic[i]-1]);
                sum+=menu.price[choic[i]-1];
            }
            System.out.println("一共消费"+sum);
        }
        canteen.Pay();
    }
}
class GuoMingCanteen {//第一类实现支付
    String CanteenName="国民餐厅";
    void Pay(){
        System.out.println("请选择支付方式：");
        System.out.println("1.支付宝\n2.微信\n3.刷脸");
        Scanner sc=new Scanner(System.in);
        int choice= sc.nextInt();
        if (choice==1){
            System.out.println("支付成功");
        }
        else if (choice==2){
            System.out.println("扫码成功");
        }
        else if (choice==3){
            System.out.println("刷脸成功");
        }
    }
    void Welcome(){
        System.out.println("Welcome to"+CanteenName);
    }
}
class GuoMingMenu {//存储数据
    String []menu={"辣子鸡丁","水煮肉片","糖醋里脊","干锅牛肉","干锅排骨"};
    int []price={38,22,18,38,29};
    int []order={1,2,3,4,5};
}
