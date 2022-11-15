class Solution {
    public List<String> fizzBuzz(int n) {
         int k=1;
        int i=0;
        List<String> ans = new ArrayList<String>();
        while(k<=n){

            if(k%3==0 && k%5==0){
                ans.add(i, "FizzBuzz");
            }
            else if(k%3==0){
                ans.add(i, "Fizz");
            }
            else if(k%5==0){
                ans.add(i, "Buzz");
            }else
                ans.add(i, "" + k);
            k++;
            i++;
        }
        return ans;
    }
}