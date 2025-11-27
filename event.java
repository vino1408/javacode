import java.util.Scanner;

public class event {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // method 1
        int a=5;
        int tot=0;
        int sum=a*(a+1) /2;
        int s=a/5;
        tot=sum+s*4;
        // method-2
        for(int i=1;i<=a;i++){
            int c=i;
            if(i%5==0){
                tot=tot+c+4;
            }
            else {
                tot = tot+c;
            }

        }
        System.out.print(tot);
    }
}
