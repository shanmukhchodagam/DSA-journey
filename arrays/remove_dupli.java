
import java.awt.desktop.SystemSleepListener;

public class remove_dupli {
    public static void main(String[] args) {

        int[] arr={1,1,2,2,2,3,4,5,5};
       System.out.println(Dupli(arr));

    }

    public static int Dupli(int[] arr) {

            int count = 0;
    int i;
    for(i=0;i<arr.length;i++){
            if(i<arr.length-1 && arr[i]==arr[i+1]) {
                arr[i]=0;
                continue;

    }
    else{
            arr[count]=arr[i];
            count++;



    }

    
}
    System.out.println(arr);
return count;
}

}