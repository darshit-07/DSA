// move all zeroes to end

// ///////////// 1st approach ////////////////////

// import java.util.*;

// public class p9 {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);

//         // taking input

//         System.out.println("Enter size of the array ");

//         int n=sc.nextInt();
//         int a[]=new int[n];

//         for (int i = 0; i <= n - 1; i++) {
//             System.out.println("enter element" + (i + 1));   
//             a[i] = sc.nextInt();
//         }

//         // main content

//         ArrayList<Integer>temp=new ArrayList<>();

//         for(int i=0;i<n;i++){
//             if(a[i]!=0){
//                 temp.add(a[i]);
//             } 
//         }

//         int c=temp.size();

//         for(int i=0;i<c;i++){
//             a[i]=temp.get(i);
//         }
//         for(int i=c;i<n;i++){
//             a[i]=0;
//         }

//         // print ans

//         for (int i = 0; i <= n - 1; i++) {
//             System.out.print(a[i]+" ");  
//         }
//     }
// }


//////////   2nd approch //////////////////////

import java.util.*;

public class p9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        // taking input

        System.out.println("Enter size of the array ");

        int n=sc.nextInt();
        int a[]=new int[n];

        for (int i = 0; i <= n - 1; i++) {
            System.out.println("enter element" + (i + 1));   
            a[i] = sc.nextInt();
        }

        // main content

        int j=-1;

        for(int i=0;i<n;i++){
            if (a[i]==0){
                j=i;
                break;
            }
        }

        for(int i=j+1;i<n;i++){
            if(a[i]!=0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }

        // print ans

        for (int i = 0; i <= n - 1; i++) {
            System.out.print(a[i]+" ");  
        }
    }
}
