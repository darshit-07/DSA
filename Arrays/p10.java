// Union of two sorted arrays

import java.util.*;

public class p10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        Set<Integer>s=new HashSet<>();
        int a1[]={1,1,2,3,4,5};
        int a2[]={2,3,4,4,5};

        int n=a1.length;
        int m=a2.length;
        for(int i=0;i<n;i++){
            s.add(a1[i]);
        }
        for(int i=0;i<m;i++){
            s.add(a2[i]);
        }


        // print ans

        System.out.println(s);
    }
}
