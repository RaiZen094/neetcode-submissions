class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
       
        people.sort()
        l = 0
        r = len(people)-1
        count = 0

        


        while l<=r:
            
            rem = limit - people[r]
            r-=1
            count+=1
           

            if l<=r and rem >= people[l]:
                l+=1

        return count

        

        