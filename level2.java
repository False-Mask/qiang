import java.util.Scanner;
import java.util.Random;
public class level2 {
    public static void main(String[] args){
        System.out.println("请为对称矩阵输入行列数");
        Scanner sc=new Scanner(System.in);
        Random rc=new Random(); //引入java内置函数
        int n=sc.nextInt();//接受输入函数的数据
        int[][] y1=new int[n][n];
        int[][] y2=new int[n][n];
        int [][]x=new int[n][n];//定义二维数组
        for (int i = 0; i < n; i++) {//循环录入随机数
            for (int j = 0; j < n; j++) {
                y1[i][j]=rc.nextInt(9);
                y2[i][j]=rc.nextInt(9);
            }
        }
        for (int i = 0; i < n; i++) {//将x[][]赋初值
             for (int j = 0; j < n; j++) {
                x[i][j]=0;
            }
        }
        for (int i = 0; i < n; i++) {//依照矩阵相乘算x[][]
                for (int k = 0; k < n; k++) {
                    for (int j = 0; j < n; j++) {
                        x[i][k]+=y1[i][j]*y2[j][k] ;
                    }
                }
            }
            System.out.println("随机对称矩阵A：");
            Print(y1,n);
            System.out.println("随机对称矩阵B：");
            Print(y2,n);
            System.out.println("相乘后的对称矩阵：");
            Print(x,n);int a=0;
        for (int i = 0; i < n; i++) {
            a+=x[i][i];
        }
        System.out.printf("对称矩阵的对角线之和为：%d",a);
    }
    public static void Print(int x[][],int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(x[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
