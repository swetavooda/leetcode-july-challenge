//problem link: https://leetcode.com/problems/add-binary/
// time complexity O(n)
class Solution {
    public String addBinary(String a, String b) {
        
        if (a.length() < b.length()) return addBinary(b, a);
                
        char[] result = new char[a.length()+1];
        
        int i = a.length()-1, j = b.length()-1, k = a.length(), carry = 0;
        
        while (j >= 0) {
            
            int ai = intVal(a.charAt(i--));
            int bi = intVal(b.charAt(j--));
            
            result[k--] = charVal((ai ^ bi) ^ carry);
            carry = (ai & bi) | (ai & carry) | (bi & carry);
        }
        
        while (i >= 0) {
            
            int ai = intVal(a.charAt(i--));
            result[k--] = charVal(ai ^ carry);
            carry = (ai & carry);
        }
        
        if (carry > 0) {
            
            result[0] = '1';
        } else {
            
            return new String(Arrays.copyOfRange(result, 1, result.length));
        }
        
        return new String(result);
    }
    
    private int intVal(char c) {
        
        return c - '0';
    }
    
    private char charVal(int v) {
        
        return Character.forDigit(v, 2);
    }
}