package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class ex02 {

    static int direction = 0;
    static int turnTime = 0;
    public static void main(String[] args) {


        int result = 0;

        Scanner sc = new Scanner(System.in);
        int [] dx = {-1,0,1,0};
        int [] dy = {0,1,0,1};

        int nx = sc.nextInt();
        int ny = sc.nextInt();

        int nm [][] = new int[nx][ny];
        int d [][] = new int[nx][ny];


        int x = sc.nextInt();
        int y = sc.nextInt();
        direction = sc.nextInt();

        d[x][y] = 1;


        for(int i=0;i<nx;i++){

            for(int j=0;j<ny;j++){

                nm[i][j] = sc.nextInt();
            }
        }
        while(true){

            turn();

            nx = x+dx[direction];
            ny = y+dy[direction];

            if(nm[nx][ny]==0 && d[nx][ny]==0){
                d[nx][ny] = 1;

                x = nx;
                y = ny;

                result++;
                continue;
            }else{
                turnTime++;
            }
            if(turnTime==4){

            }


        }

    }
    public static void turn(){

        direction -= -1;

        if(direction == -1){

            direction = 3;
        }
    }
}
