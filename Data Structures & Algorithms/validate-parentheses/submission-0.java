class Solution {
    public boolean isValid(String str) {
        int n=str.length();
        if(n%2!=0)return false;
        Stack<Character> s=new Stack<>();
        for(char ch:str.toCharArray()){
           if(!s.isEmpty() && ((s.peek()=='(' && ch==')') || (s.peek()=='{' && ch=='}') || (s.peek()=='[' && ch==']')  )){
            s.pop();
           }
           else s.push(ch);
        }
        return s.isEmpty();    
    }
}
