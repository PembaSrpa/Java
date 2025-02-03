// Java program to demonstrate array usage

public class Arrays {
    public static void main(String[] args) {
        // Declare and initialize an integer array with a size of 3.
        int[] values;
        values =  new int[3]; //Hint: Array initialization
        values[0]=12;
        System.out.println(values[0]); //Prints the first element of the array

        // Iterate through the array and print each element.
        for(int i=0; i<values.length; i++){ //Hint: For loop iteration
            System.out.println(values[i]);
        }

        // Declare and initialize an integer array using array literal notation.
        int[] numbers = {4,5,6};
        // Iterate through the array and print each element.
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        // Declare and initialize a String array.
        String[] words = new String[2];
        words[0]="hello";
        words[1]="Duck";
        System.out.println(words[0] + " " + words[1]); //Concatenates and prints the first two elements

        // Declare and initialize a String array using array literal notation. Enhanced for loop iteration.
        String[] fruits = {"apple", "banana", "mango", "pineapple"};
        for(String fruit : fruits){ //Hint: Enhanced for loop
            System.out.println(fruit);
        }

        // Declare a String array without initialization. Accessing an uninitialized element will result in a null value.
        String[] texts = new String[2];
        System.out.println(texts[0]); //Prints null because texts[0] is not initialized

        // Declare and initialize a 2D integer array.
        int[][] grid = {
            {2,5,234},
            {624,34,1},
            {2,2,2,2,2,2}
        };
        System.out.println(grid[1][0]); //Prints the element at row 1, column 0

        // Declare and initialize a 2D String array.
        String[][] gtexts = new String[2][3];
        gtexts[0][2] = "Duckkkkkk";
        System.out.println(gtexts[0][2]); //Prints the element at row 0, column 2

        // Iterate through the 2D array and print each element.
        for (int i=0; i<grid.length; i++){ //Hint: Nested for loop iteration
            for (int j=0; j<grid[i].length; j++){
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
