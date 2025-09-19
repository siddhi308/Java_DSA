class Solution {
    public int romanToInt(String s) {
        HashMap < Character, Integer> hash = new HashMap<>();
        hash.put('I', 1);
        hash.put('V', 5);
        hash.put('X', 10);
        hash.put('L', 50);
        hash.put('C', 100);
        hash.put('D', 500);
        hash.put('M', 1000);
        int sum = 0 ;
        for(int i = 0 ; i < s.length();i++){
          int value = hash.get(s.charAt(i));
        
        if( i + 1 < s.length()  && value < hash.get(s.charAt(i+1)) ){
            sum -= value;
        } else{
            sum += value;
        }
        }
        return sum ;

    }
}