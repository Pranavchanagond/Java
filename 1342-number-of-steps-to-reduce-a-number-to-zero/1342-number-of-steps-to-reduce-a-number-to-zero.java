class Solution {
    public int numberOfSteps(int num) {
        return numberofsteps(num,0);              
    }
    private static int numberofsteps(int num,int count) {
        if(num==0){
            return count;
        }
        if(num%2==0){
//            count++;
            return numberofsteps(num/2,count+1);
        }
        else
//            count++;
        return numberofsteps(num-1,count+1);


    }
}