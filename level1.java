import java.util.Scanner;
public class level1 {
    public static void main(String[] args){
        int[] arr1={15,25,10,30,40,20,50};
        for (int i = 0; i < arr1.length-1; i++) {//冒泡排序
            for (int j = 0; j < arr1.length-1-i; j++) {
                if (arr1[j]>arr1[j+1]){
                    int x=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=x;
                }
            }
        }
        System.out.println("冒泡排序后的结果：");
        for (int k = 0; k < arr1.length; k++) {//冒泡打印
            System.out.print(arr1[k]+"\t");
        }
        System.out.print("\n");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个待插入的数：");
        int x=sc.nextInt();
        int index=0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]<x && arr1[i+1]>x){//插入位查询
                index=i+1;
                break;
            }
        }
        int[] arr=new int[arr1.length+1];
        for (int i = 0; i < index; i++) {//插入后输出
            arr[i]=arr1[i];
        }
        arr[index]=x;
        for (int i = index+1; i < arr.length; i++) {
            arr[i]=arr1[i-1];
        }
        System.out.printf("插入数字(%d)之后的数组为：\n",x);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
