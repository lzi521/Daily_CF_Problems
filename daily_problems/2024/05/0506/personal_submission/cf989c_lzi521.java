import java.util.Scanner;

public class t11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        char str[]=new char[]{'A','B','C','D'};
        char ans[][]=new char[50][50];
        for(int i=0;i<25;i++) {
            for (int j = 0; j < 25; j++) {
                ans[i][j] = 'A';
            }
            for (int j = 25; j < 50; j++) {
                ans[i][j] = 'B';
            }
        }
        for(int i=25;i<50;i++){
            for(int j=0;j<25;j++){
                ans[i][j]='C';
            }
            for(int j=25;j<50;j++){
                ans[i][j]='D';
            }
        }


        for(int i=1;i<24;i+=2){
            for(int j=1;j<24;j+=2){
                if(b>1){
                    ans[i][j]='B';
                    b--;
                }
            }
        }
        for(int i=1;i<24;i+=2){
            for(int j=26;j<50;j+=2){
                if(c>1){
                    ans[i][j]='C';
                    c--;
                }
            }
        }
        for(int i=26;i<50;i+=2){
            for(int j=1;j<24;j+=2){
                if(d>1){
                    ans[i][j]='D';
                    d--;
                }
            }
        }
        for(int i=26;i<50;i+=2){
            for(int j=26;j<50;j+=2){
                if(a>1){
                    ans[i][j]='A';
                    a--;
                }
            }
        }
        System.out.println(50+" "+50);
        for(int i=0;i<50;i++){
            for(int j=0;j<50;j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
