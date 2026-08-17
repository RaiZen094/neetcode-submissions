class dicTrie{

       HashMap<Character,dicTrie> children= new HashMap<>();
       boolean word=false;

}

class WordDictionary {

    dicTrie root;

    public WordDictionary() {

        root = new dicTrie();

    }

    public void addWord(String word) {
        dicTrie cur = root;

        for(int i=0; i< word.length();i++){

             char c= word.charAt(i);

             cur.children.putIfAbsent(c,new dicTrie());

             
             cur=cur.children.get(c);
        }

        cur.word=true;

    }

    public boolean search(String word) {

        return dfs(root,word,0);
        

    }


    public boolean dfs(dicTrie root, String word, int j){


               dicTrie cur=root;

               for(int i=j;i<word.length();i++){

                char c = word.charAt(i);

                if(c=='.'){
                       
                        for(dicTrie child : cur.children.values()){

                             if(dfs(child,word,i+1))
                                    return true;

                        }
                           return false;

                        }
                else{
            
                    if(!cur.children.containsKey(c))
                        return false;
                    

                    cur=cur.children.get(c);
       
                     
                     }

               }

           return cur.word;
    }
}