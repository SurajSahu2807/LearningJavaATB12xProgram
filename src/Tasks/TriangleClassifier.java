package Tasks;

public class TriangleClassifier {
    public static void main(String[] args){
        // Classification of Triangles
        // logic to solve any of the programming or coding questions.
        /*
        1) Check the inputs and outputs along with its data types required . and What type of Outputs
        interviewer is looking for.
        2) Write the rough logic --> User Brute force method --> Side by Side explain
        3) Write the entire program
        4) optimize the program
        5) Cover the edge cases
       */

        /*
        Problem Statement :-
        Write a program that classifies a triangle based on its side lengths. Given three input values
        representing the lengths of the sides, determine if the triangle is equilateral
        (all sides are equal), isosceles (exactly two sides are equal), or scalene (no sides are equal).
        Use an if-else statement to classify the triangle.
         */

        float side1 = Float.parseFloat(args[0]);
        float side2 = Float.parseFloat(args[1]);
        float side3 = Float.parseFloat(args[2]);

        // side1 == side2 ? Exp1 :: Exp2
        // Exp1 ---> ( side1 == side3 ?? "Equilateral triangle" :: "Isosceles Angle triangle" )
        // Exp2 ---> ( side 1 == side3 ?? "Isosceles Angle triangle" :: "Scalene Angle Triangle")

        System.out.println(
                side1 == side2 ?
                        (side1 == side3 ? "Equilateral triangle" : "Isosceles Angle triangle"):
                        (side1 == side3 ? "Isosceles Angle triangle" : "Scalene Triangle")
        );

    }
}
