class Solution:

    def productExceptSelf(self, nums: List[int]) -> List[int]:

        Output=[]
        Prefix=[0]*len(nums)
        Suffix=[0]*len(nums)
        Prefix[0]=Suffix[len(nums)-1]=1

        for i in range(1,len(nums)):
            Prefix[i] = Prefix[i-1]*nums[i-1]
        
        for i in range(len(nums)-2,-1,-1):
            Suffix[i]=Suffix[i+1]*nums[i+1]

        for i in range(len(nums)):
            Output.append(Prefix[i]*Suffix[i])

        return Output
        

        