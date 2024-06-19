package com.leetcode;
import java.util.Arrays;
import java.util.Collections;

public class RodCutting {

    public static boolean canCutRod(int rodLength, int minLength, Integer[] pieces) {
        // Sort the pieces array in descending order
        Arrays.sort(pieces, Collections.reverseOrder());

        // Iterate over each piece
        for (int piece : pieces) {
            // Check if the current piece can be cut from the rod
            if (rodLength >= piece && piece >= minLength) {
                rodLength -= piece; // Deduct the piece length from the rod
            } else {
                return false; // If any piece can't be cut, return false
            }
        }
        
        return true; // All pieces can be cut
    }

    public static void main(String[] args) {
        int rodLength = 10;
        int minLength = 4;
        Integer[] pieces = {1, 3, 2, 1}; // Example pieces array

        boolean result = canCutRod(rodLength, minLength, pieces);
        if (result) {
            System.out.println("The rod can be cut into the specified pieces.");
        } else {
            System.out.println("The rod cannot be cut into the specified pieces.");
        }
    }
}