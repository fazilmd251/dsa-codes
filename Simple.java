import java.util.Arrays;

class Problems{
    void evenOrOdd(int n){
        //without modulus % operator
        if((n&1)==1){
            System.out.println(n+" is a odd number");
        }else{
            System.out.println(n+" is a even number");
        }
    }
    void swapTwoNumbers(){
        int num1=10;
        int num2=40;

        num1=num1+num2; //becomes 50
        num2=num1-num2;//becomes 10
        num1=num1-num2;//becomes 40
        System.out.println(num1);
        System.out.println(num2);
    }
    void findTheLargestNumber(int[] nums){
        int greatestNumber=nums[0];
        for(int i:nums){
            if(i>greatestNumber){
                greatestNumber=i;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("Greatest number in the array is "+greatestNumber);
    }
    void palindromeNumber(int num1,int num2){
        if(String.valueOf(num1).length()!=String.valueOf(num2).length()){
             System.out.println("Not a palindrome");
            return;
        }
        int reversedNumber=0;//reversed  num2

        while(num2>0){
            reversedNumber=reversedNumber*10+(num2%10);
            num2=num2/10;
        }

        //compare the reversed number with num1
        if(reversedNumber==num1){
            System.out.println(reversedNumber+" and "+num1+" is a palindrome");
        }else{
            System.out.println(reversedNumber+" and "+num1+" is not a palindrome");
        }
    }
    void reversedStringMethod1(String str){
        String revStr="";
        for(int i=str.length()-1;i>=0;i--){
            revStr+=str.charAt(i);
        }
        System.out.println(revStr);
    }
    void reversedStringMethod2(String str){
        char[] arr=str.toCharArray();
        int left=0,right=arr.length-1;

        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println(new String(arr));
    }
    void isLeapYear(int year){
        if((year%4==0&&year%100!=0)||year%400==0){
            System.out.println(year+" is a leap year");
        }else{
            System.out.println(year+" is not a leap year");
        }
    }
    void primeNumber(int till){
        for(int i=1;i<till+1;i++){
            int primeNum=0;
            for(int j=1;j<till+1;j++){
                if(j==1||j==i||i%j==0) {
                    continue;
                }else {
                    primeNum=i;
                }
            }
            System.out.println(primeNum);
        }
    }
    void findMaximumProfit(int arr){
        int[] a={2,4,6,7,3,5};
        int minPrice=a[0];
        int maxProfit=0;
        for(int i=1;i<a.length-1;i++){
           // int profit=
            //if()
        }
    }
}

public class Simple {
    public static void main(String[] args) {
        Problems problem=new Problems();
       // problem.evenOrOdd(4); //problem.swapTwoNumbers();
       // problem.findTheLargestNumber(new int[] {1,4,15,5,10});
       // problem.palindromeNumber(1234,433451);// problem.reversedStringMethod2("hashim");
        // problem.isLeapYear(2027);
       // problem.primeNumber(10);

    }
}
