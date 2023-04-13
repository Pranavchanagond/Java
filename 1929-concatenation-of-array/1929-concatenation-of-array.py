class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        j=0
        ans=[]
        n=len(nums)
        for i in nums:
            ans.append(i)
        while j < n:
            ans.append(nums[j])
            j+=1
        return ans
            
        