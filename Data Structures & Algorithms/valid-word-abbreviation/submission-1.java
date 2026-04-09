class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i=0;
        int j=0;
        while(i<word.length() && j<abbr.length())
        {
            char c_word= word.charAt(i);
            char a_word= abbr.charAt(j);
            if(Character.isDigit(a_word))
            {
                if(a_word == '0')
                    return false;
                int curr=0;
                while(j<abbr.length() && Character.isDigit(abbr.charAt(j)))
                {               
                   curr = curr *10+ abbr.charAt(j)-'0';
                    System.out.println(curr);
                    j++;
                }
                i = i + curr;
            }else
            {
                if(c_word!=a_word)
                    return false;
                i++;
                j++;
            }
        }
        return (i==word.length() && j==abbr.length());
    }
}