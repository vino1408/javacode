public class cryptography {
    public static void main(String[] args){
        String str="acd";
        String s1="";
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            if(a=='a'){
                s1=s1+'z';
            }
            else{
            int b=(int)a-1;
            char c=(char)b;
            s1=s1+c;
        }
        System.out.println(s1);
    }
}}
