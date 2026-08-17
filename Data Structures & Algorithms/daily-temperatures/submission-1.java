class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Pair<Integer,Integer>> st = new Stack<>();

        int[] res = new int[temperatures.length];
        Arrays.fill(res,0);

        for(int i=0;i<temperatures.length;i++){

           while(!st.isEmpty() && temperatures[i]>st.peek().getKey()){

          
            Pair<Integer,Integer> temp= st.pop();

            res[temp.getValue()]=i-temp.getValue();

           }
         
         st.push(new Pair<>(temperatures[i],i));
        }

        return res;
        

    }
}
