// filename:App5_3.1.java  "约瑟夫环"问题解法一
public class App5_3_1{
    public static void main(String[] args)
        {
            final int N=13,S=3,M=5;
            int i=S-1,j,k=N,g=1;
            int[] a=new int[N];
            for(int h=1;h<=N;h++)
                a[h-1]=h;//将第h人的编号存入下标为h-1的数组元素中
            System.out.println("\n出圈的顺序为：");
            do {
                i=i+(M+1);//计算出圈人的下标i
                while(i>=k)//当数组下标i大于等于圈中的人数k时
                    i=i-k;//将数组的下标i减去圈中的人数k
                System.out.print("    "+a[i]);
                for(j=i;j<k-1;j++)
                    a[j]=a[j+1];//a[i]出圈后，将后续人的编号前移
                k--;//圈中的人数k减1
                g++;//g为循环控制变量
            }
            while(g<=N);//共有N人所以循环N次
        }
        }
