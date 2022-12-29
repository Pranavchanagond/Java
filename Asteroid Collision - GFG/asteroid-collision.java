//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int N;
            N = sc.nextInt();

            int[] asteroids = new int[N];
            for (int i = 0; i < N; i++) asteroids[i] = sc.nextInt();

            Solution obj = new Solution();
            int[] res = obj.asteroidCollision(N, asteroids);

            for (int e : res) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int[] asteroidCollision(int n, int[] asteroids) {
        // code here
        Stack<Integer> s = new Stack<>();


        for (int num : asteroids) {
            if (num < 0){
                while (!s.isEmpty() && s.peek()>0 && s.peek()<Math.abs(num)){
                    s.pop();
                }
                if(!s.isEmpty()){
                    if(s.peek()==Math.abs(num)){
                        s.pop();
                    } else if (s.peek()<0) {
                        s.push(num);
                    }
                } else if (s.isEmpty()) {
                    s.push(num);
                }
            }else{
                s.push(num);
            }

        }
        int[] ans = new int[s.size()];
        int i=s.size()-1;

        while(s.size()>0){
            ans[i--]=s.pop();
        }
        return ans;
    }
}
