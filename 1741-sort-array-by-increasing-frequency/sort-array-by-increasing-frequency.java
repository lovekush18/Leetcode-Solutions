class Solution {
    public int[] frequencySort(int[] arr) {
        int n = arr.length;
        int[] arr1 = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                int freq = map.get(arr[i]);
                map.put(arr[i],freq+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        int u = list.size();
        list.sort((a,b)->{
            if(map.get(a)!=map.get(b)){
                return map.get(a)-map.get(b);
            }
            else if(map.get(a)==map.get(b)){
                return b-a;
            }
            return 0;
        });
       int idx = 0;
       for(int i=0;i<u;i++){
        int el = list.get(i);
        int fr = map.get(el);
            for(int j=0;j<fr;j++){
             arr1[idx] = el;
             idx++;
            }
        }  
        return arr1; 
    }
}