class Solution {
    public String reverseVowels(String s) {
        String t = "";
        String e = "";
        for(int i=0;i<s.length();i++){
         char ch = s.charAt(i);
        if(ch =='a'||ch == 'e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
              e = ch+e;
        }
        int j=0;
        for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch =='a'||ch == 'e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
               t+=e.charAt(j);
               j++;
            }
            else
            t+=ch;
        }
        return t;
    }
}
