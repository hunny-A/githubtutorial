public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num1 = 150000;
        System.out.println(sol.solution(num1));
    }
}

class Solution {
    public int solution(int price) {
        int answer = 0;
        float tmp = 0.0f;

        if(price>=100000&&price<300000){
            tmp = price - (price*5)/100;
        } else if(price>=300000&&price<500000){
            tmp = price - (price*10)/100;
        } else if(price>=500000){
            tmp = price - (price*20)/100;
        } else if(price>=10&&price<100000){
            tmp = price;
        }

        if(tmp%10 != 0){
            answer = ((int)tmp/10)*10;
        } else {
            answer = (int)tmp;
        }

        return answer;
    }
}