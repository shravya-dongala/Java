import java.util.Scanner;

public class Rotate {

    public static void main(String[] args){
        int array[]=new int[] {1,2,3,4,5,6};
        int n;
        System.out.println("enter the position");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=n;i<array.length;i++){
          System.out.print(array[i]+" ");
        }
        for(int j=0;j<n;j++){
            System.out.print(array[j]+" ");
        }

    }
}