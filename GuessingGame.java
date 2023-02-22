
import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class GuessingGame
{
    public static void main(String ...args)
    {
        System.out.println("<<choose 1 for START GAME");
        System.out.println("<<choose 2 for QUIT GAME");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        if (a==1){
            System.out.println("**********************************************");
            System.out.println("              GAME BEGIN'S                    ");
            System.out.println("**********************************************");
            Random g = new Random();
            int b = g.nextInt(100);
            System.out.println("enter your first choice b/w 1 to 100");
            int c = sc.nextInt();
            if(c==b){
                System.out.println("*******************************************");
                System.out.println("               WINNER                      ");
                System.out.println("         TOTAL SCORE: 100                  ");
                System.out.println("*******************************************");
            }
            else {
                System.out.println("*******************************************");
                System.out.println("               wrong choice                ");
                if (b>c) System.out.println(      "no. is bigger       ");
                else System.out.println(          "no. is smaller           ");
                System.out.println("*******************************************");
            }
            System.out.println("enter your second choice b/w 1 to 100");
            int d= sc.nextInt();

            if(b==d){
                System.out.println("*******************************************");
                System.out.println("               WINNER                      ");
                System.out.println("         TOTAL SCORE: 50                  ");
                System.out.println("*******************************************");
            }
            else {
                System.out.println("*******************************************");
                System.out.println("               wrong choice                ");
                if (b>d) System.out.println(       "no. is bigger       ");
                else System.out.println(           "no. is smaller           ");
                System.out.println("*******************************************");
            }
            System.out.println("last try left");
            System.out.println("enter your first choice b/w 1 to 100");
            int e = sc.nextInt();
            if(b==e){
                System.out.println("*******************************************");
                System.out.println("               WINNER                      ");
                System.out.println("         TOTAL SCORE: 20                  ");
                System.out.println("*******************************************");
            }
            else {
                System.out.println("*******************************************");
                System.out.println("               wrong choice                ");
                System.out.println("**********CORRECT NO. WAS "+ b + "*********");
                System.out.println("*******************************************");
            }

        }
        if(a==2){
            System.out.println("♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");
            System.out.println("           ♦♦   BE BACK SOON  ♦♦        ");
            System.out.println("♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");

        }
        else {
            System.out.println("wrong input");
        }

        }
    }


