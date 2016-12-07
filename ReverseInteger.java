public class Solution {
    public int reverse(int x) {
        final int MAX_INT = 2147483647;
		int judge;
		int num;
		if (x > 0) {
			judge = 1;
			num = x;
		} else if (x == 0) {
			return x;
		} else {
			judge = -1;
			num = x * (-1);
		}
		
		int result = 0;	//结果
		int i;
		while (num > 0) {
			i = num % 10;
			if (result > MAX_INT / 10) {
				return 0;
			} else {
				result *= 10;
				result += i;
				num /= 10;
			}
			
		}
		
		if (judge == -1) {
			result *= -1;
		}
		return result;
    }
}