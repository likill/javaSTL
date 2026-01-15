class Solution {
    public int myAtoi(String s) {
        if(s.length()==0){
            return 0;
        }
        String s1 = s.trim();
        int res = 0;
        boolean rev = false;
        int len = 0;
        int time = 0;
        while(s1.charAt(time)=='0'){
            time++;
        }
        String s2 = s1.substring(time);
        //System.out.println(s2);
        String max = String.valueOf(Integer.MAX_VALUE);
         if(Character.isDigit(s2.charAt(0))){
            res += (s2.charAt(0)-'0');
            len++;
        }
        else if(s2.charAt(0)=='-'){
            rev = true;
        }
        else if(s2.charAt(0)=='+'){
            rev = false;
        }
        else{
            return 0;
        }
        for(int i=1;i<s2.length();i++){
            //System.out.println("helllllllo");
            if(Character.isDigit(s2.charAt(i))){
                len++;
            }
            else{
                break;
            }
        }
        if(len>10){
            //System.out.println("helllllllo");
            if(rev) return Integer.MIN_VALUE;
            return Integer.MAX_VALUE;
        }
        else if(len==10){
            if(!rev){
                for(int i=0;i<len;i++){
                    if(max.charAt(i)-s2.charAt(i)<0){
                        return Integer.MAX_VALUE;
                    }
                 }
            }
            else{
                for(int i=1;i<s2.length();i++){
                if(max.charAt(i)-s2.charAt(i)<0){
                    return Integer.MIN_VALUE;
                }
            }
            }    
        }
        for(int i=1;i<s2.length();i++){
            if(Character.isDigit(s2.charAt(i))){
                res = res*10+(s2.charAt(i)-'0');
                System.out.println(res);
            }
            else{
                break;
            }
        }
        if(rev){
            
            return -res;
        }
        return res; 
    }
    public static void main(String[] args) {
        String s = "test";
        s = s.concat("123");
        System.out.print(s);
    }
}