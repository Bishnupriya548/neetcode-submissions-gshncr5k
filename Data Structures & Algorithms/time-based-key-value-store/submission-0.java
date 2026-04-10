class pair{
    int time;
    String val;
    pair(int t,String v){
        time=t;
        val=v;
    }
}
class TimeMap {
        HashMap<String,List<pair>> map;
    public TimeMap() {
        map=new HashMap<>();

    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(new pair(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
          if(!map.containsKey(key))return "";
          List<pair> list=map.get(key);
          String res="";
          for(pair p:list){
            if(p.time<=timestamp)res=p.val;
            else break;
          }
          return res;
        
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
