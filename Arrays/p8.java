// left rotate an array d places

import java.util.*;

public class p8 {
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);

        System.out.println("Enter size of the array ");

        int n=sc.nextInt();
        int a[]=new int[n];

        for (int i = 0; i <= n - 1; i++) {
            System.out.println("enter element" + (i + 1));   
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the number of shifts : ");
        int d=sc.nextInt();

        d=d%n; 

        int temp[]=new int[d];

        for(int i=0;i<d;i++){
             temp[i]=a[i];
        }

        for(int i=d;i<=n-1;i++){
            a[i-d]=a[i];
        }

        for(int i=n-d;i<=n-1;i++){
            a[i]=temp[i-(n-d)];
        }

        for (int i = 0; i <= n - 1; i++) {
            System.out.print(a[i]+" ");  
        }
   } 
}
