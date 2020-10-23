import java.util.ArrayList;
import java.util.Scanner;
public class level3 {
    public static void main(String[] args){
        int count=0;
        ArrayList x=new ArrayList(4);
        Scanner Sc=new Scanner(System.in);              //找对象
        for (int i = 0; ; i++) {                        //输入数字方法
            System.out.print("请输入数字（如若小于0则表示退出）：");
            int y=Sc.nextInt();
            x.add(y);
            count++;
            if (y<0) break;
            System.out.println("您已经输入了"+ x.size()+"个元素");
        }
        level3.Print(count,x);                             //使用Print方法
        for(;;) {
            System.out.println("请选择服务项目：");
            System.out.print("0.退出该程序\n1.查询某个元素\n2.删除某个元素\n3.修改某个元素\n");
            int choice= Sc.nextInt();
            if (choice == 1) {                                  //查询
                System.out.print("请输入您要查找的数字：");
                int sear = Sc.nextInt();
                level3.Search(count, x, sear);
                continue;
            } else if (choice == 2) {                                //删除
                System.out.print("请输入您要删除的数字：");
                int Remov = Sc.nextInt();
                count = level3.Remove(count, x, Remov);
                level3.Print(count, x);
                continue;
            } else if (choice == 3) {
                level3.Print(count, x);
                System.out.println("请输入您要替换元素的位次");
                int setindex = Sc.nextInt();
                System.out.println("请输入您要替换的元素");
                int set = Sc.nextInt();
                Set(count, x, setindex, set);
                level3.Print(count, x);
                continue;
            }
            else if (choice==0){
                System.out.println("给个好评好不好");
                break;
            }
                System.out.print("别闹！好好输入\n再输入一次 乖乖的\n");
            }
        }
    public static void Print(int count,ArrayList x){//打印数组方法
        int p=0;
        System.out.println("数字如下：");
        for (int i = 0; i < count-1; i++) {
            System.out.print(x.get(i)+"\t");
            p++;
            if (p==8){
                p=0;
                System.out.print("\n");
            }
        }
        System.out.print("\n");
    }
    public static void Search(int count,ArrayList x,int sear){
        for (int i=0;i<count-1;i++){
            if (sear==(int)x.get(i)){
                System.out.println("存在该元素该元素为您第"+(i+1)+"次输入的数字");
                return;
            }
        }
        System.out.println("很抱歉没找到");
    }
    public static int Remove(int count,ArrayList x,int Remov){
        int p=1;
        for (int i=0;i<count-1;i++){
            if (Remov==(int)x.get(i)){
                x.remove(i);
                p++;
            }
        }
        if (p!=1) System.out.println("已经删除完毕！");
        else System.out.println("很抱歉该数字不存在");
        return count-1;
    }
    public static void Set(int count,ArrayList x,int setindex,int set){
        x.set(setindex-1,set);
    }
}
