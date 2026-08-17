/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        intervals.sort((a,b)->Integer.compare(a.start,b.start));
        int[] start= new int[intervals.size()];
        int[] end= new int[intervals.size()];
        int s=0,e=0,count=0,res=0,n=intervals.size();
        
        for(int i=0;i<intervals.size();i++){
  
             start[i]=intervals.get(i).start;
             end[i]=intervals.get(i).end;

        }

        Arrays.sort(start);
        Arrays.sort(end);


        while(s<n){

         if(start[s]<end[e]){

            s++;
            count++;
         }
         else{
            e++;
            count--;
         }
        res=Math.max(res,count);

        }

        return res;
    }
}
