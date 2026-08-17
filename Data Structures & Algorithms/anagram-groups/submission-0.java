class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

       Map<String, List<String>> an= new HashMap<>();

       for(String s:strs){

             char[] charArray = s.toCharArray();
             Arrays.sort(charArray);
             String sortedS = new String(charArray);
             an.putIfAbsent(sortedS,new ArrayList<>());
             an.get(sortedS).add(s);

       }
       return new ArrayList<>(an.values());
        
    }
}
