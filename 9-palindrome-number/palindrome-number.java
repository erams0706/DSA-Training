class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int orig=x;
        int rev=0;
        while(x>0){
            int last_digit=x%10;
            rev=rev*10+last_digit;
            x=x/10;

        }
        if(orig==rev){
            return true;
        }
        else{
            return false;
        }
        
    }
}