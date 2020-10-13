package algorithm;

import java.util.Random;
import java.util.Scanner;

public class ex04 {

    static int n = 0;
    static int m = 0;
    static int [][] ice;

    public static void main(String[] args) {

        int result = 0;

        Scanner sc = new Scanner(System.in);
        
         n = sc.nextInt();
         m = sc.nextInt();
        
        ice = new int[n][m];

        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){

                ice[i][j] = (int) ((Math.random()*10)+1)%2;
                System.out.print(ice[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(dfs(i,j)){
                    result++;
                }
                System.out.print(ice[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("result : " + result);
    }


    public static boolean dfs(int x,int y){

        if( x <= -1 || x >= n || y <=-1 || y >=m){
            return false;
        }

        if(ice[x][y] == 0){
            ice[x][y] = 1;

            dfs(x-1,y);
            dfs(x+1,y);
            dfs(x,y-1);
            dfs(x,y+1);
            return true;
        }
        return false;
    }
}
