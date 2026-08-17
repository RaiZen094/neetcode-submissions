class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:

        res = []


        nums.sort()

        for i in range(len(nums)-3):

            if i>=1 and nums[i] == nums[i-1]:
                 continue

            for j in range(i+1,len(nums)-2):
                
                if j>i+1 and nums[j] == nums[j-1]:
                    continue
                
                sum = nums[i]+nums[j]

                k = j+1
                l = len(nums)-1

                while(k<l):
                    if nums[k]+nums[l]< target-sum :
                        k+=1
                    elif (nums[k]+nums[l] > target-sum):
                        l-=1
                    else:
                        res.append([nums[i],nums[j],nums[k],nums[l]])
                        k+=1
                        l-=1

                        while k<l and nums[k] == nums[k-1]:
                           k+=1
                        while k<l and nums[l] == nums[l+1]:
                           l-=1

                    
                    
        return res
        