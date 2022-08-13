package com.quiz5.Algorithm;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int numbers[] = {60, 33, 12, 64, 17, 105, -53};
        String sub[]= {"I'm","Making", "the", "Mother", "of", "All", "Omelettes", "Jack", "Can't", "Fret"
        , "Over", "Every", "Egg"};



        System.out.println("Print out your selection: ");

        Arrays.stream(sub).forEach(System.out::println);

        System.out.println(linearSearch(sub, "Egg"));

        // Scanner sc= new Scanner(System.in);
        // String input = sc.nextLine();
        // System.out.println(Arrays.toString(sub));



        //if (String sub != input)
    }



    public static int linearSearch(String[] input, String sub) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == sub) {
                System.out.println("Selection is at position " + i);
            }
        }
        return -1;
    }
    }



  //  public static int binarySearch(String[]input, String sub, int x)
  //{
  //     int start = 0;
    //     int end = input.length - 1;

    //  while(start <= end)
    //  {
    //      int middle = (start + end ) /2;
//
    //          if (input[middle] == sub)
    //      {
    //          return middle;
    //      }
    //      else if( x < input[middle])
    //      {
    //          end = middle -1;
    //      }
    //      else if (x > input[middle])
    //      {
    //          start = middle + 1;
    //      }
    //  }
//
    //      return -1;
    //  }

    //public String getSub() {
    //    return sub;
   // }
//}


