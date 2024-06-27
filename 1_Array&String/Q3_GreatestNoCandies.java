import java.util.*;

public class Q3_GreatestNoCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        //candies = [4,2,1,1,2], extraCandies = 1
        System.out.println(kidsWithCandies(candies,extraCandies));
        
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies)  {
    ArrayList<Boolean> list = new ArrayList<>();
    int max = 0;
    for(int i = 0; i< candies.length; i++){
        max = Math.max(candies[i],max);
    }   
     for(int i = 0; i< candies.length; i++){
        if((candies[i] + extraCandies) >= max ){
            list.add(true);
        }
        else{
            list.add(false);
        }
    }
    return list;  
    }
}