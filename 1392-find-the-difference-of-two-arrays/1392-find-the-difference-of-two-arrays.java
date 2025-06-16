class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;

    List<List<Integer>> result = new LinkedList<>();


        HashMap <Integer,Integer> map1=new HashMap<>();
        HashMap <Integer,Integer> map2=new HashMap<>();
        
      

        for(int num : nums1){

            if(!map1.containsKey(num)){
                map1.put(num,0) ;
            }
            else{
                continue;
            }
         
        }

        
       
        for(int num : nums2){

            if(!map2.containsKey(num)){
                map2.put(num,0) ;
            }
            else{
                continue;
            }
         
        }

       

        
            List<Integer> inner1 = new ArrayList<>();
            List<Integer> inner2 = new ArrayList<>();
            int i=0;
           for (int key : map1.keySet()) {
           if(!map2.containsKey(key)){
              inner1.add(key);
           }
            
        }

              for (int key : map2.keySet()) {
           if(!map1.containsKey(key)){
              inner2.add(key);
           }
            
        }


               result.add(inner1);
                result.add(inner2);

        return result;
        
    }
}