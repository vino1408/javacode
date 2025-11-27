public class pensum {
    public static void main(String[] args){
        int a=5;
        int count=0;
        int ar[]={1,2,1,6,8,9};
        for(int i=0;i<a-1;i++){
            if(ar[i]%2!=0 && ar[i+1]%2==0){
                count++;
            }
        }
        System.out.print(count);
    }
}
