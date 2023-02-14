class Solution {
    public boolean checkIfPangram(String sentence) {
            int count=0;
           for (int i = 0; i < sentence.length() ; i++) {
            if(sentence.charAt(i) > 90 && sentence.charAt(i)<123){
                char r=sentence.charAt(i);
                sentence=sentence.replace(r,'*');
                count++;
            }
             
            
        }
          if(count==26){
                   return true;
               }
               else
                   return false;

        
    }
}
