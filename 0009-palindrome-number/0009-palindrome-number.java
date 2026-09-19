class Solution {
    public boolean isPalindrome(int x) {
        
        int p=0;
        int t=x;
        while(t>0)
        {
            p=p*10+(t%10);
            t/=10;
        }
        if(p==x)
        return true;
        return false;
    }
}