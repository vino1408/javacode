public class sort_string {
    public static void main(String[] args){
        String str="h";//adfs
        int d=0,k=0;

        char a[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            d=0;
            char c=str.charAt(i);
            for(int j=0;j<str.length();j++){
                char c1=str.charAt(j);
                if(c<c1){
                    d=1;
                    char t=c;
                    c=c1;
                    c1=t;
                }
            }
            if(d==1){
                k++;
            }
        }
        System.out.println(k);
    }
}
