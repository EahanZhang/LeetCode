public class Solution {
    public String convert(String s, int numRows) {
        //String数组用于存储处理的字符串
		if (numRows == 1) {
			String resultString = s;
			return resultString;
		} else {
			String[] zigzagString = new String[numRows];
			for (int i = 0; i < numRows; i++) {
				zigzagString[i] = "";
			}
			
			char c;													//c用于读取s中的字符
			int row;												//row用于确定应该将当前字符添加到哪一行
			int dividend = 2 * numRows - 2;							//dividend是进行模运算的模值
			for (int i = 0; i < s.length(); i++) {
				c = s.charAt(i);
				row = i % dividend;
				
				if (row < numRows) {
					zigzagString[row] += c;
				} else {
					zigzagString[dividend - row] += c;
				}
			}
			
			String resultString = "";
			for (int i = 0; i < numRows; i++) {
				resultString += zigzagString[i];
			}
			
			return resultString;
		}
    }
}