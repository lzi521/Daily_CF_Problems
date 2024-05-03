import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        int ans=1;
        int a[]=new int[100010];
        int b[]=new int[100010];
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            a[x]++;
            b[a[x]]++;
            if(a[x]*b[a[x]]==i&&i!=n){
                ans=i+1;
            }
            if(a[x]*b[a[x]]==i-1){
                ans=i;
            }
        }
        System.out.println(ans);
    }
}
