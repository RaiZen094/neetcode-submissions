class TimeMap {
    HashMap<String,List<Pair<String,Integer>>> tMap;
    public TimeMap() {

         tMap= new HashMap<>();
        
    }
    
    public void set(String key, String value, int timestamp) {
        tMap.putIfAbsent(key,new ArrayList<>());
        tMap.get(key).add(new Pair<>(value,timestamp));
    }
    
    public String get(String key, int timestamp) {

        List<Pair<String,Integer>> val = tMap.getOrDefault(key,new ArrayList<>());

        int l=0,r=val.size()-1;

        String res="";



        while(l<=r){
          int mid=(l+r)/2;

          if(timestamp>=val.get(mid).getValue()){
               l=mid+1;
               res=val.get(mid).getKey();
          }

          else{
            r=mid-1;
          }


        }
        
         return res;
        
    }
}
