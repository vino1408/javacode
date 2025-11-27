public class prime_numbers{
    public static void main(String[] args){
        int a=2;
        int k=4;
        int arr[]={10,2};
        int x=0,c=0,sum=0;
        int count=1;
        for(int i=0;i<arr.length;i++){
            c=0;
            x=i+1;
          for(int j=1;j<x;j++){
              if(x%j==0){
                  c++;
              }
          }
          if(c==1){
              if(arr[i]>=4){
                  sum+=k;
              }else {
                  sum=sum+arr[i];
              }
          }
        }
        System.out.print(sum);
    }
}