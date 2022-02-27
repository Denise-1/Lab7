// Denise Chen
// IS 147-04
// d189@umbc.edu
// 11/17/2021
// print course number name and room with 2d arrays and loops

package com.company;

public class Main {
    static String[][] stringArray = { {"IS147:", "Programming in Java I", "Room 100"},
                                      {"IS247:", "Programming Java II", "Room 200"},
                                      {"IS410:","Database Programming I", "Room 300"},
                                      {"IS420:", "Database Programming II", "Room 400"} } ;

    public static void main(String[] args) {
        System.out.println("CourseNumber | Course Name | Room");
        System.out.println("------------------------------------");
        String [][] array = coursesInfo(stringArray);
    }   // public static void main END

    public static String[][] coursesInfo(String[][] courseList) {
        for (int rowCourse = 0; rowCourse < stringArray.length; rowCourse++) {
            for (int colCourse = 0; colCourse < stringArray[rowCourse].length; colCourse++) {
                System.out.print(stringArray[rowCourse][colCourse] + " ");
            }
            System.out.println("\n------------------------------------");
        }
        return courseList;
    }   //public static int[][] END
}   // public class Main END
