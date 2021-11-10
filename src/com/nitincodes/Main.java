package com.nitincodes;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* If Give an integer N . Write a program to obtain the sum of the first and last digits of this number.
       Input
       The first line contains an integer T, the total number of test cases. Then follow T lines, each line contains an integer N.

       Output
       For each test case, display the sum of first and last digits of N in a new line.

       Constraints
       1 ≤ T ≤ 1000
       1 ≤ N ≤ 1000000
       Example
       Input
       3
       1234
       124894
       242323

       Output
       5
       5
       5
       */

        Scanner sc = new Scanner(System.in);
int t,n,rem = 0,ld,sum = 0;
t = sc.nextInt();
for(int i=0;i<t;i++){
    n = sc.nextInt();
    ld = n%10;
    while(n>0){
      rem = n%10;
      n = n/10;
    }
    sum = ld + rem;
    System.out.println(sum);
}
    }
}
/*in this first we had found the last digit and then in a while loop, we had found the first digit then in last
,i have added both of them. because of that we have already taken last digit before loop and the first digit
in a loop
 */ 