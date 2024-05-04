import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int T=sc.nextInt();
        while (T-->0){
            solve();
        }
    }
    public static void solve(){
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n+1];
        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }
        int ans= (int) 1e9;
        int x=0;
        for(int i=1;i<=n-k;i++){
            if(a[i+k]-a[i]<ans){
                ans=a[i+k]-a[i];
                x=(a[i+k]-a[i])/2+a[i];
            }
        }
        System.out.println(x);
    }
}
