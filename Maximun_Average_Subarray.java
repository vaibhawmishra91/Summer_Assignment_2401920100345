class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double  maxAvg = -Double.MAX_VALUE;
        int currSum=nums[0];
        for (int i=0;i<=nums.length-k;i++)
{      currSum=0;
    for(int j=i;j<i+k;j++){
         currSum+=nums[j];
        
        
    }
    double avg=(double)currSum/k;
        if(avg>maxAvg){
            maxAvg=avg;
        }
}   
return maxAvg;
 }
}