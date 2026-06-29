class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<matches.length;i++){
            int winner = matches[i][0];
            int loser = matches[i][1];
        if(map.containsKey(loser)){
            int count = map.get(loser);
            map.put(loser,count+1);
        }
        else{
            map.put(loser,1);
        }
        if(!map.containsKey(winner)){
             
            map.put(winner,0);
        }
        }
        List<Integer> zeroloss = new ArrayList<>();
        List<Integer> oneloss = new ArrayList<>();
        ArrayList<Integer> tem = new ArrayList<>(map.keySet());
        for(int i=0;i<tem.size();i++){
             int temp = tem.get(i);
             if(map.get(temp)==0){
                zeroloss.add(temp);
             }
             if(map.get(temp)==1){
                oneloss.add(temp);
             }


        }
        Collections.sort(zeroloss);
        Collections.sort(oneloss);

        list.add(zeroloss);
        list.add(oneloss);

        return list;

    }
}