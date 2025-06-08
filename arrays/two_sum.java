import java.util.HashMap;

class two_sum{
public static void main(String[] args){

    int[] nums={2,7,11,15};
    int target=9;

    HashMap<Integer,Integer> map=new HashMap<>();

    for(int i=0;i<nums.length;i++){
        int need=target-nums[i];
        if(map.containsKey(need)){
            map.get(need);
            System.out.println("Indices: " + map.get(need) + ", " + i);
            return;
        }
       

        else{
             map.put(nums[i], i);
            System.out.println("No two sum solution found.");
            
        }

    }

            
            return;

}

}