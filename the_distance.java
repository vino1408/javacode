import java.util.Scanner;

public class the_distance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str="abc10";
        int d1=0;
        int d2=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++) {
                if (str.charAt(i) != str.charAt(j)) {
                    d1 = j - i;
                    if (d1 > d2) {
                        d2 = d1;
                    }
                }
            }
        }
        System.out.print(d2);
    }
}
