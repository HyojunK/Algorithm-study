class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        
        String[] arr = rsp.split("");
        for(String s : arr){
            switch(s){
                case "0" : sb.append("5");
                    break;
                case "2" : sb.append("0");
                    break;
                case "5" : sb.append("2");
                    break;
            }
        }
        
        return sb.toString();
    }
}