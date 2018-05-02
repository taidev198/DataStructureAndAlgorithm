package com.taidev198.game.Backtracking;

import com.sun.istack.internal.NotNull;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Backtracking {

    private static int[][] board;
    private static int[][] mazeArr;
    private static int N = 4;

    public static void main(String... args) {

        board = new int[N][N];
        mazeArr = new int[N][N];
//        if (N_Queens(board,4)){
//            for (int i = 0; i < board.length; i++) {
//                for (int j = 0; j < board[i].length; j++) {
//                    System.out.print(board[i][j]);
//                }
//                System.out.println();
//            }
//        }


      //  System.out.println(groupSum(0, new int[]{2, 4, 8}, 10));

        List<Integer> chosen = new ArrayList<>();

        String t = "tai";
        t = "xx";
        //System.out.print(t);

        //duplicate

//        int[] arr = new int[]{};
//        int n = arr.length;
//        int[] ints;
//        int[] temp1 = new int[n];
//         Arrays.fill(temp1,-1);
//        List<Integer> min  = new ArrayList<>();
//        int minIndex = n -1;
//        int idx = 0;
//        for (int i = 0; i <= n/2; i++) {
//            int value = arr[i];
//
//            ints = Arrays.copyOfRange(arr, i+1,n );
//            if (findIndex(ints, value) != -1){
//                min.add(findIndex(arr,value));
//                if (findIndex(ints,value) < minIndex){
//                    minIndex = findIndex(ints,value);
//                    idx = i;
//                }
//
//            }
////            System.out.println("index:" + findIndex(ints,value));
////            System.out.println("subArray:" + Arrays.stream(ints).boxed().collect(Collectors.toList()));
//        }
//
//        if (min.size() == 0)
//            System.out.println("no duplicate");
//       else {
////           int minIndex1 = (min.indexOf(-1));
////           System.out.println("minIndex:" + minIndex1 +",value:" + arr[minIndex1 ] );
//            System.out.println(arr[idx]);
//        }
//       // groupSum(chosen,5, 0);
         int[] nums = new int[]{1,2,3};
         //PermutationNum(chosen,nums,3);
      //  BinaryNum(chosen,nums,3);
//        if (MazeBacktracking(mazeArr))
//            printSolution(mazeArr);

//        binaryNumberBacktracking(3);
       // permuteString("tai");





        List<String> temp = new ArrayList<>();
        temp.add("thanh");
        temp.add("tai");
        temp.add("nguyen");
     //   sublist(temp);
        int[] ints = new int[] {1,2,3,4,5};
        //groupSumArr(0,ints,5);
//        List<Integer> list11 = Arrays.stream(ints).boxed().collect(Collectors.toList());
//        System.out.println(list11.get(0));

        //subList(7,3);

        int[][] arr2d = null;


      //  System.out.println(groupSumArr(0,new int[]{1, 6, 2, 6, 4},9));
//        int n =10;
//        for(int i=1;i < n - 1;i++)
//        {
//            for(int j=i+1;j<n;j++){ //vi j>i
//                float z= (float) Math.sqrt(i*i+j*j);
//                if((int)z==z)
//                    System.out.println((int) z +","+j+"," +i);
//            }
//        }

       // convertArr1dToArr2d("");
        binaryNumberBacktracking(3);

    }

    static int findIndex(int[] arr, int value){

        return Arrays.stream(arr).boxed().collect(Collectors.toList()).indexOf(value) ;
    }

    /**
    The Backtracking Algorithm for n-Queens Problem
    Problem: Position n queens on a chessboard so that no two
    are the same row, column, or diagonal.
     */

//    void queens(int index, int[][] board){
//        int j;
//        if (promising(index, board))
//    }
//
//    private boolean promising(int index, int[][] board) {
//        boolean promise = true;
//        int k = 0;
//
//        while (k < index && promise){
//            for (int i = 0; i < 8; i++) {
//                if (board[k][i] == board[index][i] || (Math.abs(i - k) == i - k))
//                    promise = false;
//            }
//            k++;
//        }
//        return promise;
//    }


    static boolean isAttacked(int x, int y ,int[][] board, int N){

        //checking for row and column
        for (int i = 0; i < 4; i++) {
            if (board[x][i] == 1)
                return true;
        }

        for (int i = 0; i < 4; i++) {
            if (board[i][y] == 1)
                return true;
        }

        //checking for  diagonals
        //diagonals
        for(int i=0;i<4;i++)
            for(int j=0; j<4;j++)
                if(board[i][j] == 1 && (i+j == x + y || i-j == x - y )) return true;
        return false;
    }

    static boolean N_Queens(int[][] board, int N){
        if (N == 0)
            return true;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 ; j++) {
                if (isAttacked(i,j,board,N))
                    continue;
                board[i][j] = 1;
                if (N_Queens(board,N-1))
                    return true;
                board[i][j] = 0;
            }
        }
        return false;
    }

    static boolean groupSum(int start, int[] nums, int target) {

//        if (target < 0 )
//            return false;
//        else {
            if (target == 0)
                return true;
            if (target - nums[start] >0 ){
                System.out.println("start:" + start);
                target -= nums[start];
                 groupSum(start +1,nums,target);
                 target += nums[start];
                start--;
                System.out.println("target:" + target);
            }
       // }
        return false;
    }

    private static void groupSum(List<Integer> chosen, int target, int sum){

        if (sum == target)
            System.out.println(chosen); // base case
        else {
            for (int i = 1; i < 3; i++){
                if (target - sum >= i){
                    chosen.add(i);
                    sum += i;
                    groupSum(chosen, target, sum);
                    chosen.remove(chosen.size()-1);
                    sum -= i;
                }
            }
        }

    }

    private static void diceRolls(int dice,List<Integer> chosen) {
        System.out.println("Entering diceRolls with dice="+dice);
        if (dice == 0) {
            System.out.println(chosen); // base case
        } else {
            for (int i = 1; i <= 6; i++) {
                System.out.println("Starting for loop. i="+i+", dice="+dice);
                chosen.add(i); // choose
                diceRolls(dice - 1, chosen); // explore
                System.out.println("un-choose");
                chosen.remove(chosen.size() - 1); // un-choose
                System.out.println("Ending for loop. i="+i+", dice="+dice);
            }
            System.out.println("Exiting diceRolls with dice="+dice);
        }
    }


    private static void PermutationNum(List<Integer> chosen, int[] nums, int value){

        if (chosen.size() == value )
            System.out.println(chosen);

        for (int i = 1; i <= value; i++) {
            if (nums[i -1] == 0){
                nums[i -1] = 1;
                chosen.add(i);
                System.out.println(chosen.size());
                PermutationNum(chosen,nums,value);
                chosen.remove(chosen.size() -1);
                nums[i-1] = 0;
            }
        }
    }


    private static void BinaryNum(List<Integer> chosen, int[] nums, int value){

//        if (0 == value )
//            System.out.println(chosen);

        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i <= 1; i++) {
                if (nums[j ] == 0){
                    nums[j ] = i;
                    //chosen.add(i);
                    if (j == value -1)
                        printSolution(nums);
                    BinaryNum(chosen,nums,value);
                    //chosen.remove(chosen.size() -1);
                    nums[j] = i;
                }
            }
        }


    }

//    private static boolean isValid(int[] nums, int index){
//
//    }

    private static boolean MazeBacktracking(int[][] arr){

        int[][] sol = new int[][]{ {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
        };

        if(!solveMazeUtil(arr, 0, 0, sol))
        {
            //printf("Solution doesn't exist");
            return false;

        }
        printSolution(sol);
        return true;
    }

    private static boolean solveMazeUtil(int[][] arr, int x, int y, int[][] sol) {
        if (x == N -1 && y == N -1){
            sol[x][y] = 1;
            return true;
        }

        if (isSafe(arr,x,y)){
            sol[x][y] = 1;
            if (solveMazeUtil(arr,x+1,y,sol))
                return true;
            if (solveMazeUtil(arr,x,y+1,sol))
                return true;

            sol[x][y] = 0;
            return false;

        }
        return false;
    }

    static boolean isSafe(int[][] maze, int x, int y)
    {
        // if (x,y outside maze) return false
        if(x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1)
            return true;

        return false;
    }

    private static void printSolution(int[][] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    /*
    backtracking for binary number
     */
    private static void printSolution(int[] arr){
        for (int anArr : arr) System.out.print(anArr);
        System.out.println();
    }

    private static boolean isValid(int[] arr, int x){
        if (x < arr.length && arr[x] == 0)
            return true;
        return false;
    }


    private static void binaryNumberBacktracking(int n){
        int[] arr = new int[n];
        List<Integer> sol = new ArrayList<>();
        //init array
        for (int elem: arr) {
            elem = 0;
        }
        BinaryNumberUtil(sol,arr,n);
        printSolution(arr);

    }

    private static void BinaryNumberUtil(List<Integer> sol, int[] arr, int n) {

            if (n == 0)
                System.out.println(sol);
            for (int i = 0; i <= 1 ; i++) {
                    sol.add(i);
                    BinaryNumberUtil(sol,arr,n -1);

                    sol.remove(sol.size() - 1);
                    BinaryNumberUtil(sol,arr,n +1);
        }
    }


    private static void permuteHelper(String s, String chosen){
        if (s.length() == 0)
            System.out.println(chosen);
        else {
            for (int i = 0; i < s.length() ; i++) {
                char c = s.charAt(i);
                chosen += c;
                System.out.println("char:" + c);
                s = s.substring(i,s.length());
                System.out.println("s:" + s);
                permuteHelper(s,chosen);
                chosen = chosen.substring(0,chosen.length()-1);
                String temp = String.valueOf(c);
                System.out.println("temp1:"+temp);
                temp = temp.concat(s);
                System.out.println("temp:"+temp);
                s = temp;
                System.out.println("s1:" + s);
            }
        }


    }

    private static void permuteString(String s){
        permuteHelper(s,"");
    }

    private static void sublistHelper(List<String> arr, List<String> sol){
        if (arr.size() == 0)
            System.out.println(sol);

        else  {
            String first = arr.get(0);
            sol.add(first);
            arr.remove(0);
            sublistHelper(arr, sol );

            sol.remove(sol.size() - 1);
            sublistHelper(arr,sol);
            System.out.println("unchoose:");
            arr.add(0,first);
        }

    }

    private static void sublist(@NotNull List<String> arr){
        List<String> sol = new ArrayList<>();
        sublistHelper(arr, sol);
    }

    static void groupSumArrHelper(List<Integer> list, List<Integer> listSum, List<Integer> listSubElem, int sum){
        if (list.size() == 0){
            int[] temp = new int[listSubElem.size()];
            Arrays.fill(temp,6);
            List<Integer> listChecker =Arrays.stream(temp).boxed().collect(Collectors.toList());
            if (listChecker.contains(listSubElem))
                listSum.add(sum);
            System.out.println("list:"+listSubElem);
            System.out.println("temp:" + listChecker);
            System.out.println("result:" + listChecker.containsAll(listSubElem));
        }
        else {
            int first = list.get(0);
            sum += first;
            listSubElem.add(first);
            list.remove(0);
            groupSumArrHelper(list,listSum,listSubElem,sum);

            sum -= first;
            listSubElem.remove(listSubElem.size() - 1);
            groupSumArrHelper(list,listSum,listSubElem,sum);
            list.add(0,first);
        }

    }

    static boolean groupSumArr(int start, int[] nums, int target) {

        nums = Arrays.copyOfRange(nums,start,nums.length);
        List<Integer> list =Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<Integer> listSum = new ArrayList<>();
        List<Integer> listSubElem = new ArrayList<>();
        if (nums.length == 0)
            return true;
        if (nums.length == 1){
            return nums[0] == target;
        }
          groupSumArrHelper(list, listSum, listSubElem,0);

          System.out.println(listSum);
          if (listSum.contains(target))
              return true;
          return false;
    }

    static int[][] subList(int n, int k){
        List<Integer> chosen = new ArrayList<>();
        int[][] arr2d = null;
        StringBuilder temp =new StringBuilder();
        temp = subListHelper(chosen, n, k, temp);
        System.out.println(temp);
        return arr2d;
    }

    static StringBuilder subListHelper(List<Integer> chosen, int target, int k, StringBuilder temp){
        if (target == 0){
            temp.append(chosen.toString());
        }
        else {
            for (int i = 1; i <= k ; i++) {
                if (target - i >= 0){
                    chosen.add(i);
                    subListHelper(chosen, target - i, k, temp);

                    chosen.remove(chosen.size() - 1);
                }
            }
        }
        return temp;
    }

    static void convertArr1dToArr2d(String temp){
        // and array which contains N elements of M size
        String input = "[[1][2,3][4,5,6,7][8,9,10,11,12,13]]";

// Declare your dynamic array
        List<String[]> multiDimArray = new ArrayList<>();

// split where ],[ is found, just ignore the leading [[ and the trailing ]]
        String [] parts = input.replaceAll("\\[\\[|\\]\\]","")
                .split("\\],\\[");

// now split by comma and add it to the list
        for( String s : parts ){
            multiDimArray.add( (s.split(","))) ;
            System.out.println();
        }

        String[][] result = multiDimArray.toArray( new String[multiDimArray.size()][]);
        int[][] arr2d = new int[multiDimArray.size()][];
        for (int i = 0; i < multiDimArray.size(); i++) {
            arr2d[i] = new int[result[i].length];

            for (int j = 0; j < result[i].length; j++) {
                arr2d[i][j] = Integer.valueOf(result[i][j]);
            }
        }

        for (int i = 0; i < multiDimArray.size(); i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.print(arr2d[i][j]);
            }
            System.out.println();
        }
    }

}
