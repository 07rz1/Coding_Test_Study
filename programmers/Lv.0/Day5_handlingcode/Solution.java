class Solution {
    public String solution(String code) {
        int mode = 0;
        StringBuilder ret = new StringBuilder();
        
        for (int idx = 0; idx<code.length(); idx++){
            char currentChar = code.charAt(idx);

            if(mode ==0){
                if(currentChar != '1'){
                    if (idx % 2 ==0){
                        ret.append(currentChar);
                    } 
                } else{
                        mode = 1;
                    }

            } else if (mode ==1) {
                if (currentChar != '1'){
                    if (idx % 2 ==1){
                            ret.append(currentChar);
                        }
                } else{
                    mode = 0;
                    }
            }
        }
        return ret.length() > 0 ? ret.toString() : "EMPTY" ;
    }
}