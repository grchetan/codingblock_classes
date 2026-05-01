class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()){
            return false;
        }

        char[] arr = s1.toCharArray();
        Arrays.sort(arr);

        int flag = 0;
        int i = 0;
        while(i <= s2.length() - s1.length()){
            String str = s2.substring(i, s1.length() + i);
            char[] strArr = str.toCharArray();
            Arrays.sort(strArr);
            if(Arrays.equals(strArr, arr)){
                flag = 1;
            }
            i++;
        }
        
        if(flag == 1){
            return true;
        }

        return false;
    }
}