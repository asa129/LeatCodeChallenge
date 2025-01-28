package answer;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String answer = "";
        for(int i = 0; i < strs[0].length(); i ++){
            for(int j = 0; j < strs[1].length(); j++){
                if(strs[0].charAt(i) == strs[1].charAt(j)){
                    for(int k = 0; k < strs[2].length(); k++){
                        if(strs[1].charAt(j) == strs[2].charAt(k)){
                            answer += strs[2].charAt(k);
                        }
                    }
                }
            }
        }
        return answer;
    }
}
