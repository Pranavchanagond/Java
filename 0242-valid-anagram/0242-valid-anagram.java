class Solution {
    public boolean isAnagram(String s, String t) {
     
        String[] a = s.split("");
		String[] b = t.split("");
		Arrays.sort(a);
		Arrays.sort(b);
		String ans1="";
		String ans2="";
		
		for (String string : b) {
			ans1+=string;
		}
		System.out.println();
		
		for (String string : a) {
			ans2+=string;
		}
		
		
		if(ans1.equals(ans2)) {
			return true;
		}
		else 
			return false;
	}
}