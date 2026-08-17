class trienode{

 HashMap<Character,trienode> children = new HashMap<>();
 boolean eow=false;

}

class PrefixTree {

    trienode root;

    public PrefixTree() {

      root = new trienode();
         
    }

    public void insert(String word) {

        trienode cur= root;

        for(int i=0; i< word.length();i++){


           char c = word.charAt(i);
           cur.children.putIfAbsent(c,new trienode());
           cur=cur.children.get(c);

        }

        cur.eow=true;

    }

    public boolean search(String word) {
        trienode cur=root;
        for(int i=0;i<word.length();i++){

             char c=word.charAt(i);

             if(cur.children.containsKey(c)){
               cur=cur.children.get(c);
              }

             else 
                return false;


        }

          return cur.eow;

    }

    public boolean startsWith(String prefix) {

        trienode cur=root;
        for(int i=0;i<prefix.length();i++){

             char c=prefix.charAt(i);

             if(cur.children.containsKey(c)){
               cur=cur.children.get(c);
              }

             else 
                return false;


        }

          return true;

    }

    }

