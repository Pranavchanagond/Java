class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        ans=[]
        a=nums[:n:1]
        b=nums[n::1]
        j=i=0
        while(i<n):
            ans.append(a[i])
            ans.append(b[j])
            i+=1
            j+=1
        return ans