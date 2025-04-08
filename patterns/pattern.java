import java.util.Scanner;
public class pattern {
    public static void main(String[] args){
        // This is a simple program to print patterns using stars.
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();


         
/*<<--------------------------pattern1-------------------------------------->>
                * * *
                * * *
                * * *    */
            /* for(int i=0;i<n;i++){
                for(int j=0;j<i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            } */


/*<<----------------------------pattern2--------------------------------------->>
               *
               * *
               * * *       */
            /*  for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            } */


/* <<------------------------------pattern3-------------------------------------->>
                1
                1 2
                1 2 3   */
            /* for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            } */


/*<<---------------------------------pattern4-------------------------------------->>
                1
                2 2
                3 3 3  */
            /* for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }
                System.out.println();
            } */


/*<<---------------------------------pattern5----------------------------------->>
                * * *
                * *
                *          */
            /*for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i+1;j++){
                   System.out.print("*"+" ");
                }
                System.out.println();
            } */
         
            
/*<<----------------------------------pattern6----------------------------------->>
                1 2 3
                1 2
                1
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i+1;j++){
                   System.out.print(j+" ");
                }
                System.out.println();
            } */

              
/*<<------------------------------------pattern7--------------------------------->>
                          *  
                         *** 
                        *****
                       *******
                      *********
                note :for 0 based indexing:
                            [space, star, space]
                            [4,1,4]
                            [3,3,3]
                            [2,5,2]
                            [1,7,1]
                            [0,9,0]
                            space --> n-i-1
                            star  --> 2*i+1
                            runtime: 783ms(when executed in code ninjas)
                      for 1 based indexing :
                            [space, star, space]
                            [5,1,5]
                            [4,3,4]
                            [3,5,3]
                            [2,7,2]
                            [1,9,1]
                            space --> n-i
                            star  --> 2*i-1
                            runtime : 949ms(when executed in code ninjas) */
                /*   for(int i=0;i<n;i++){
                //spaces
                    for(int j=0;j<n-i-1;j++){
                       System.out.print(" ");
                      }
                //stars
                    for(int j=0;j<2*i+1;j++){
                       System.out.print("*");
                      }
                //spaces
                    for(int j=0;j<n-i-1;j++){
                        System.out.print(" ");
                      }
                   System.out.println();
            } */

         
/* <<---------------------------pattern8-------------------------------------------->>
                * * * * *
                 * * * *
                  * * *
                   * *
                    *       */
            /*for(int i=0;i<n;i++){
                for(int j=0;j<i;j++){
                    System .out.print(" ");
                }
                for(int j=0;j<2*n-(2*i+1);j++){
                    System .out.print("*");
                }
                for(int j=0;j<i;j++){
                    System .out.print(" ");
                }
                System.out.println();
            } */


//  <<-------------------------------pattern9------------------------------------------->>
                // stardiamond pattern  
            /* for(int i=0;i<n;i++){
                //spaces
                    for(int j=0;j<n-i-1;j++){
                       System.out.print(" ");
                      }
                //stars
                    for(int j=0;j<2*i+1;j++){
                       System.out.print("*");
                      }
                //spaces
                    for(int j=0;j<n-i-1;j++){
                        System.out.print(" ");
                      }
                   System.out.println();
            }
            for(int i=0;i<n;i++){
                //spaces
                for(int j=0;j<i;j++){
                    System .out.print(" ");
                }
                //stars
                for(int j=0;j<2*n-(2*i+1);j++){
                    System .out.print("*");
                }
                //spaces
                for(int j=0;j<i;j++){
                    System .out.print(" ");
                }
                System.out.println();
            } */
            

/* <<-----------------------------------pattern10------------------------------------------->>

                  for(int i=1;i<=2*n-1;i++){
                  int stars=i;
                  if(i>n){
                    stars=2*n-i;
                 }
                  for(int j=1;j<=stars;j++){
                    System.out.print("*"+" ");
                  }
                 System.out.println();
                 }*/

             
 /*<<-------------------------------------pattern11----------------------------------->>
                1
                0 1
                1 0 1
                0 1 0 1    */

                /*  int pos=1;
                 for(int i=0;i<n;i++){
                     if(i%2==0){
                       pos=1;
                     }
                     else{
                    pos=0;
                      }
                 for(int j=0;j<=i;j++){
                    System.out.print(pos+" ");
                           pos=1-pos;
                     }
                    System.out.println();
                } */

//<<------------------------------------------pattern12------------------------------------->>

                /*int space=2*(n-1);
                      for(int i=1;i<=n;i++){
                          //numbers
                      for(int j=1;j<=i;j++){
                          System.out.print(j+" ");
                             }
                          //spaces
                       for(int j=1;j<space;j++){
                          System.out.print(" ");
                            }
                          //reveerse number
                       for(int j=i;j>=1;j--){
                          System.out.print(j+" ");
                            }
                          System.out.println();
                          space-=2;
                    }*/


//<<---------------------------------------pattern13----------------------------------------------->>
                /* 1
                   2 3
                   4 5 6 
                   7 8 9 10 */

                /*   int num=1;
                     for(int i=0;i<n;i++){
                     for(int j=0;j<=i;j++){
                         System.out.print(num+" ");
                        num=num+1;
                      }
                         System.out.println();
                      } */


//<<---------------------------------------pattern14----------------------------------------------->>
                /* A
                   A B
                   A B C
                   A B C D */

                 /*for(int i=0;i<n;i++){
                 for( char ch='A';ch<='A'+i;ch++){
                      System.out.print(ch+" ");
                     }
                     System.out.println();
                  }*/
                  
                  
//<<---------------------------------------pattern15----------------------------------------------->>
                /*A B C D
                  A B C
                  A B
                  A  */               

                    /*  for(int i=0;i<n;i++){
                      for(char ch='A';ch<='A'+(n-i-1);ch++){
                         System.out.print(ch+" ");
                      }
                       System.out.println();
                     } */



//<<---------------------------------------pattern16----------------------------------------------->>
                /*
                 A
                 B B
                 C C C
                 D D D D
                 */

/*for(int i=0;i<n;i++){
    char ch=(char)('A'+ i);
    for(int j=0;j<=i;j++){
        System.out.print(ch+" ");
    }
    System.out.println();
}*/


//<<---------------------------------------pattern17----------------------------------------------->>
                 
/*for(int i=0;i<n;i++){
    //spaces
        for(int j=0;j<n-i-1;j++){
           System.out.print(" ");
          }
    //CHARACTERS
        char ch='A';
        int breakpoint=(2*i+1)/2;
        for(int j=1;j<=2*i+1;j++){
           System.out.print(ch+" ");
            if(j<=breakpoint)
                ch++;
            else
                ch--;
          }
    //spaces
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
          }
       System.out.println();
}*/
                 

//<<---------------------------------------pattern18----------------------------------------------->>

/*Input: ‘N’ = 3
    for upper part use 0 based indexing (note: we can also use 1 based indexing)
    for lower part use 1 based indexing
                   [star    space     star ]
                   [ n-i    j<space   n-i  ]    ----->for upper part (note: if here too we use 1 based indexing then we have to change the star to n-i+1)
                   [ i      j<space   i    ]    ----->for lower part
Output:       
  0   * * * * * *   3,0,3      
  1   * * - - * *   2,2,2
  2   * - - - - *   1,4,1
---------------------------------       
  1   * - - - - *   1,4,1
  2   * * - - * *   2,2,2
  3   * * * * * *   3,0,3         */
   

                                                      //upper part
       /*int space=0;
        for(int i=0;i<n;i++){
                     //stars
            for(int j=0;j<n-i;j++){
                System.out.print("*"+" ");
            }
                     //spaces
            for(int j=1;j<=space;j++){
                System.out.print("  ");  //include 2 spaces if * uses space otherwise just give 1 space
            }
                      //stars
            for(int j=0;j<n-i;j++){
                System.out.print("*"+" ");
            }
            space+=2;
            System.out.println();
        }
                                                       //lower part
        int inspace=2*n-2;
        for(int i=1;i<=n;i++){
                      //stars
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
                      //spaces
            for(int j=1;j<=inspace;j++){
                System.out.print("  "); //include 2 spaces if * uses space otherwise just give 1 space
                      //stars
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            inspace-=2;
            System.out.println();
        }*/


//<<---------------------------------------pattern19----------------------------------------------->>

/* Input: ‘N’ = 3
total rows based on given n=2*n-1
Output:               star  space   star 
1  * - - - - *    -------1,4,1 
2  * * - - * *    -------2,2,2
3  * * * * * *    -------3,0,3
4  * * - - * *    -------2,2,2
5  * - - - - *    -------1,4,1       */

       /*int space=2*n-2;
        for(int i=1;i<=2*n-1;i++){
            int star=i;
            if(i>n)
            star=2*n-i;
            //star
            for(int j=1;j<=star;j++){
                System.out.print("*"+" ");
            }
            //space
            for(int j=1;j<=space;j++){
                System.out.print("  "); //include 2 spaces if * uses space otherwise just give 1 space
            }
            //star
            for(int j=1;j<=star;j++){
                System.out.print("*"+" ");
            }
            if(i<n) space-=2; //if row are less then N then decreases by 2 spaces
            else space+=2;    //if rows are greater then  N then increase by 2 spaces
            System.out.println();

        }*/


//<<---------------------------------------pattern20----------------------------------------------->>
     
/*Input: ‘N’ = 4

Output: 

****
*  *
*  *
****   */


/*for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        if(i==0||j==0||i==n-1||j==n-1)
            System.out.print("*");
            else
               System.out.print(" ");
    }
    System.out.println();
}*/


sc.close(); 
    }
}