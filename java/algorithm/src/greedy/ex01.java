package algorithm;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] row = {sc.next().charAt(0),sc.nextInt()};
        int result = 0;
        int [][] step = {{-2,-1},{-2,1},{2,-1},{2,1},{1,2},{-1,2},{1,-2},{-1,-2}};
        for(int i=0;i<step.length;i++){

            if(row[0]+step[i][0] > 'a' && row[0]+step[i][0] < 'i' && row[1]+step[i][1] > 0 && row[1]+step[i][1] < 9){
              result++;
            }

        }
        System.out.println(result);


    }
}
