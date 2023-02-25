class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        int  temp = x;
        while(temp!=0){
            arr.add(temp%10);
            temp = temp/10;
        }
        int arrSize = arr.size();
        for(int i = 0, j = arrSize-1; i < arrSize; i++, j--){
            if(arr.get(i)!=arr.get(j)){
                return false;
            }
        }
        return true;
    }
}