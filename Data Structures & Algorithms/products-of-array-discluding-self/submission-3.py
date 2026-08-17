class Solution:

    def productExceptSelf(self, nums: List[int]) -> List[int]:

        Output=[]
        Prefix=[]
        Suffix=[]
        Prefix.append(1)
        Suffix.append(1)

        for i in range(1,len(nums)):
            Prefix.append(Prefix[i-1]*nums[i-1])
        
        for i in range(len(nums)-2,-1,-1):
            Suffix.append(Suffix[len(nums)-i-2]*nums[i+1])

        for i in range(len(nums)):
            Output.append(Prefix[i]*Suffix[len(nums)-1-i])

        return Output
        

        