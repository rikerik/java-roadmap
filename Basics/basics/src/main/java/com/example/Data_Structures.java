package com.example;

//student class
class Student {
    public int id;
    public String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Data_Structures {
    public static void main(String[] args) {

        //ARRAYS
        // Time Complexity: O(n)
        // Auxiliary Space: O(1)
        // declaring an array of integers
        int[] intArr;

        // allocating memory for 5 integers
        intArr = new int[5];

        // initalize first elements of array
        intArr[0] = 10;

        // so on
        intArr[1] = 20;
        intArr[2] = 30;
        intArr[3] = 40;
        intArr[4] = 50;

        // accesing the elements
        for (int i = 0; i < intArr.length; i++) {
            System.out.println("elem at index " + i + ": " + intArr[i]);
        }
        Student studentArr[] = new Student[5];
        studentArr[0] = new Student(0, "Name1");
        studentArr[1] = new Student(1, "Name2");
        studentArr[2] = new Student(2, "Name3");
        studentArr[3] = new Student(3, "Name3");
        studentArr[4] = new Student(4, "Name4");

        for (Student student : studentArr) {
            System.out.println(student.id + ", " + student.name);
        }

        // cloning arrays
        int cloneArray[] = intArr.clone();

        //false because of deep copy
        System.out.println(intArr == cloneArray);

        for (int i = 0; i < cloneArray.length; i++) {
            System.out.println(cloneArray[i] + " ");
        }

        //declaring & initializing 2D array
        int twoDimArr[][]
        = {{1,3,5}, {2,4,6}, {9,8,7}};

        //print
        for (int i = 0; i< 3; i++){
            for (int j = 0; j<3; j++)
            {
                System.out.print(twoDimArr[i][j]+ " ");
                System.out.println();

            }
        }

    }
}
