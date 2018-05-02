package com.taidev198.game.Recursive;

public class Recursive {

    public static void main(String[] args) {
	// write your code here
        String a= "tai" + "nguyen";
        StringBuilder temp = new StringBuilder(a);
        temp.deleteCharAt(0);
        temp.insert(0,'x');

        System.out.println(a.replace('n','a'));
        int[] arr = new int[]{1,2,3,4,5};
        long current = System.currentTimeMillis();
        System.out.println(array220(new int[]{1,2,20},0));
        long last = System.currentTimeMillis();

        System.out.println("time:" + (last - current));

    }

    static int print(int[] arr, int low, int high){
        if ( high == low)
            return arr[low];
        else System.out.println(arr[low]);
        return print(arr, low+ 1, high);
    }
    static int sum(int a, int b){
        if (a == b)
            return a;
         return b + sum(a, b - 1);
    }
    static int fibo( int num){
        if (num == 0 || num == 1)
            return 1;
        return fibo(num -1) + fibo(num -2);
    }

    static int digitOfNum(long num, int sum){
        if (num == 0)
            return 0;
        return sum + digitOfNum(num / 10,sum) ;
    }

    static int factorial(int n) {
        if(n ==1 || n == 0)
            return 1;
        return n * factorial(n - 1);

    }

    static int fibonacci(int n) {
        if(n == 0)
            return 0;
        if( n == 1 || n == 2)
            return 1;
        return fibonacci( n -1) + fibonacci(n -2);
    }

    static int sumDigits(int n) {
        if ( n== 0)
            return 0;
        return n %10 + sumDigits( n /10);
    }

    static int count7(int n) {
        if(n == 0 )
            return 0;
        if ( n % 10 ==7)
            return 1 +count7(n /10 );
        return count7(n /10);
    }

    static int countHi(String str) {
        if( str.length() == 1 || str.length() == 0)
            return 0;
        String temp = str.substring(str.length() -2,str.length() );
        if(temp.equals("hi") )
            return 1 + countHi(str.substring(0,str.length() -1));
        return countHi(str.substring(0, str.length() - 1));
    }

    static String changeXY(String str){

        int n = str.length();
        char temp = str.charAt(n -1);
        if (n == 1){
            if (temp == 'x')
                return "y";
            return String.valueOf(temp);
        }else {
            if (temp == 'x')
                return  changeXY(str.substring(0,n-1)) + "y";
            return  changeXY(str.substring(0,n-1)) + String.valueOf(temp);
        }
    }

    static String reverse(String str){
        int n = str.length();
        char temp = str.charAt(n-1);
        if (n == 1)
            return String.valueOf(temp);
        return String.valueOf(temp)+ reverse(str.substring(0,n-1));
    }

    static String changePI(String str){
        int n = str.length();
        if (n == 0)
            return "";
        if (n == 1)
            return String.valueOf(1);
        String temp = str.substring(n -2,n);
        System.out.println(temp);
        String subStr = str.substring(0,n-1);
        if (temp.equals("pi"))
            return changePI(subStr) + "3.14";
        return changePI(subStr) + String.valueOf(temp);
    }

    static String noX(String str){
        int n = str.length();
        if (n == 0)
            return "";
        String subStr = str.substring(0,n-1);
        char temp = str.charAt(n -1);
        if (temp == 'x')
            return noX(subStr);
        return noX(subStr) + String.valueOf(temp);
    }

    static boolean array6(int[] nums, int index) {
            if (index == nums.length)
                return false;
            if (nums[index] == 6)
            return true;
        return array6(nums, index + 1);
    }

    public int array11(int[] nums, int index) {
        if (nums.length == index)
            return 0;
        if (nums[index] == 11)
            return 1 + array11(nums, index +1);
        return array11(nums,index + 1);
    }

    static boolean array220(int[] nums, int index){
        if (nums.length  == index)
            return false;
        if (nums.length == 1)
            return false;
        if (nums[nums.length - 1] > nums[nums.length - 2]){
            if (nums[index] == 0)
                return true;
            if ((float)nums[nums.length - 1 ] / nums[index] == 10)
                return true;
        }else {
            if ((float)nums[nums.length - 2 ] / nums[index] == 10)
                return true;
        }
        return array220(nums,index + 1);
    }

    static String allStar(String str) {
        int n = str.length();
        if (n == 0)
            return "";
        String temp = String.valueOf(str.charAt(n -1));
        if (n == 1)
            return temp;
        String subStr = str.substring(0,n -1);
        if (n % 2 == 1 )
            return  allStar(subStr) + "*" + temp ;
        return  allStar(subStr)+"*" + temp;
    }

    static String pairStar(String str) {

        int n = str.length();
        if (n == 0)
            return "";
        if (n == 1)
            return String.valueOf(str.charAt(0));
        char temp = str.charAt(n -2);
        char current =str.charAt(n -1);
        String subStr = str.substring(0,n-1);

        if (temp == current)
            return pairStar(subStr) + "*" + current;
        return pairStar(subStr) + current;
    }

    static String endX(String str) {
        int n = str.length();
        if (n == 0)
            return "";
        if (n == 1)
            return String.valueOf(str.charAt(0));
        char temp = str.charAt(0);
        char temp2 = str.charAt(n-2);
        String temp1 = String.valueOf(temp);
        String subStr = str.substring(1,n);
        String subStr1 = str.substring(0,n-1);
        if (temp == 'x')
            return  endX(subStr)  + "x";
        return    temp +endX(subStr)  ;
    }

    static int countAbc(String str) {
        int n = str.length();
        if (n < 3 )
            return 0;
        String temp = str.substring(n-3,n);
        String subStr = str.substring(0,n-1);
        if (temp.equals("abc") || temp.equals("aba"))
            return 1 + countAbc(subStr);
        return countAbc(subStr);
    }

    static int countPairs(String str) {

        int n = str.length();
        if (n < 3)
        return 0;
        char ch1st = str.charAt(n-3);
        char ch3rd = str.charAt(n -1);

        String subStr = str.substring(0,n -1);
        if ( ch1st ==  ch3rd )
            return 1 + countPairs(subStr);
        return countPairs(subStr);
    }

    static int count11(String str) {
        int n = str.length();

        if (n < 2)
            return 0;
        String subStr1 = str.substring(0,n-2);
        String subStr = str.substring(0, n - 1);
        String cmp = str.substring(n-2,n);
        if (cmp.equals("11"))
            return 1 + count11(subStr1);
        return count11(subStr);

    }

    static String stringClean(String str) {
        int n = str.length();

        if (n == 1)
            return String.valueOf(str.charAt(0));
        String subStr = str.substring(0,n - 1);

        char temp =  str.charAt(n-1);
        char temp1 = str.charAt(n-2);

        if (temp == temp1)
            return stringClean(subStr);
        return  stringClean(subStr)+ String.valueOf(temp);

    }

    static int countHi2(String str) {

        int n = str.length();
        if (n < 2)
            return 0;
        String cmp = str.substring(n-2,n);
        if (n == 2)
            if (cmp.equals("hi"))
                return 1;

        String subStr = str.substring(0,n-1);
        if (cmp.equals("hi")){
            if (str.charAt(n-3) == 'x')
                return countHi2(subStr);
            return 1 + countHi2(subStr);
        }

        return countHi2(subStr);
    }

    static String parenBit(String str) {

        int n = str.length();
        char temp = str.charAt(n - 1);
        char first = str.charAt(0);
        String subStr = str.substring(0,n-1);
        String subStr1 = str.substring(1,n);

        if (first != '(' )
            return parenBit(subStr1);
        if ( temp != ')')
            return parenBit(subStr);
        return str;

    }


    static boolean nestParen(String str) {
        int n = str.length();
        if (n == 0)
            return true;
        if (n == 1)
            return false;
        char tempLeft = str.charAt(0);
        char tempRight = str.charAt(n-1);
        String subStr = str.substring(1,n-1);
        if ( tempRight == ')' && tempLeft == '(')
            return  nestParen(subStr);
        return false;

    }

    static int strCount(String str, String sub) {
        int n = str.length();
        int m = sub.length();

        if (n < m)
            return 0;
        String cmp = str.substring(n-m,n);
        String subStrHasCmp = str.substring(0,n-m);
        String subStrWithoutCmp = str.substring(0,n-1);

        if (cmp.equals(sub))
            return 1 + strCount(subStrHasCmp,sub);
        return strCount(subStrWithoutCmp,sub);
    }


    static boolean strCopies(String str, String sub, int n) {
        int length = str.length();
        int m = sub.length();

        if (length < m){
            if (n == 0)
                return true;
            return false;
        }
        String cmp = str.substring(length-m,length);
        String subStrWithoutCmp = str.substring(0,length-1);

        if (cmp.equals(sub))
            return strCopies(subStrWithoutCmp,sub,n -1);
        return strCopies(subStrWithoutCmp,sub,n);
    }

    static int strDist(String str, String sub) {

        int n = str.length();
        int m = sub.length();

        if (n < m)
            return 0;
        String cmpLeft = str.substring(0, m);
        String cmpRight = str.substring(n - m, n);
       // String subStrHasCmp = str.substring(0,n - m);
        String subLeft = str.substring(1,n);
        String subStrWithoutCmp = str.substring(0,n - 1);
        if (cmpLeft.equals(sub) && cmpRight.equals(sub))
            return str.length();
        if (cmpRight.equals(sub))
            return strDist(subLeft, sub);
        return strDist(subStrWithoutCmp,sub);
    }



}
