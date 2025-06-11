public class plus_one {

    public static void main(String[] args){
        int sum=0;
        int[] arr=new int[]{1,2,3};
        for(int i=0;i<arr.length;i++){
            sum=sum*10+arr[i];
        }

        sum=sum+1;

        String str=String.valueOf(sum);
        int[] result=new int[str.length()];
        for(int i=0;i<result.length;i++){

            result[i]=str.charAt(i)-'0';
        }

  for(int i=0;i<result.length;i++){
    System.out.print(result[i]);
  }
         
    }
    
}
