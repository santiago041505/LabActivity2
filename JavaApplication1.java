/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
import static java.lang.Math.*;
/**
 *
 * @author easterPC
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //problem 1
        Scanner input = new Scanner(System.in);
        System.out.println("Input an Angle in Degrees");
        int degrees = input.nextInt();
        double radians = Math.toRadians(degrees);

        System.out.println("Choose a Function");
        System.out.println("1:Sine               5:Inverse Sine");          
        System.out.println("2:Cosine             6:Inverse Cosine");       
        System.out.println("3:Tangent            7:Inverse Tangent");      
        System.out.println("4:All function       8:All inverse function");
        int A = input.nextInt();
        
        if (A == 1) {
            System.out.println(Math.sin(radians));
        } else if (A == 2) {
            System.out.println(Math.cos(radians));
        } else if (A == 3) {

            System.out.println(Math.tan(radians));
            if (degrees >= 90 && degrees <= 270) {
                System.out.println("Waring: Tangent may be undefined near 90 or 270.");
            }

        } else if (A == 4) {
            System.out.println(Math.sin(radians));
            System.out.println(Math.cos(radians));
            System.out.println(Math.tan(radians));
            if (degrees >= 90 && degrees <= 270) {
                System.out.println("Waring: Tangent may be undefined near 90 or 270.");
        } 
            }
        else if(A==5){
            System.out.println(Math.asin(degrees));
        }
        else if (A == 6) {
                System.out.println(Math.acos(degrees));
        } else if (A == 7) {
                System.out.println(Math.atan(degrees));
        } else if (A == 8) {
                System.out.println(Math.asin(degrees));
                System.out.println(Math.acos(degrees));
                System.out.println(Math.atan(degrees));
        } else {
            System.out.println("Invalid Selection. Please choose 1, 2, 3, 4, 5, 6, 7, and 8");
        }

         //1. In Java (and most programming languages), the Math class trigonometric methods 
           //like Math.sin(), Math.cos(), and Math.tan(). Expect angles in radians, not degrees.
         //2. cos(θ) = 0, because division by zero is undefined.
         // 3. You can modify the program by adding options to calculate the reciprocal functions, 
          //cosecant (1/sin), secant (1/cos), and cotangent (1/tan)—and include checks to avoid division by zero
          //where the original function is undefined. This enhances functionality and ensures mathematical accuracy.
        
 //problem 2 
        System.out.println("Input an Angle in Degrees");
        int angle=input.nextInt();
        System.out.println(angle);
        String y="sine";
        String x="cosine";
        String z="tangent";
        
        angle%=360;
        if (angle<0){
           angle+=360;
        }
        if (angle == 0 || angle == 360) {
            System.out.println("Positive axis");
        } else if (angle == 90) {
            System.out.println("On the positive y-axis (90°), +, 0, undefined");
        } else if (angle == 180) {
            System.out.println("On the negative x-axis (180°), 0, -, 0");
        } else if (angle == 270) {
            System.out.println("On the negative y-axis (270°), -, 0, undefined");
        }
        
        else if (angle>0 && angle<90){
            System.out.println("location: Quadrant 1");
              System.out.println(x +":+");
              System.out.println(y +":+");
              System.out.println(z +":+");
        }
        else if (angle>90 && angle<180){
            System.out.println("Location: Quadrant 2");
            System.out.println(x +":-");
            System.out.println(y +":+");
            System.out.println(z +":-");
        }
        else if (angle>180 && angle<270){
        System.out.println("Location: Quadrant 3");
        System.out.println(x +":-");
        System.out.println(y +":-");
        System.out.println(z +":-");
    }
        else if (angle>270 && angle<360){
            System.out.println("Location: Quadrant 4");
            System.out.println(x +":+");
            System.out.println(y +":-");
            System.out.println(z +":-");
        }
        //1. Normalizing angles ensures they are within a standard range (e.g., 0° to 360°), making it easier to 
        //determine the correct quadrant without confusion.
        //2. In the 1st quadrant, all functions are positive; in the 2nd, 
        //sine is positive; in the 3rd, tangent is positive; in the 4th, cosine is positive.
        //3. At 0∘, 180∘, 360∘, 0∘, 180∘, 360∘, cosine is ±1, sine is 0, 
        //and tangent is 0; at 90∘ ,270∘, 90∘, 270∘ , sine is ±1, cosine is 0, and tangent is undefined.
    
        //problem 3   
        System.out.println("Which element do you know?");
        System.out.println("1:two sides");
        System.out.println("2:one side and one angle");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("what are the sides?");
            System.out.println("side a:");
            double a = input.nextDouble();
            System.out.println("side b:");
            double b = input.nextDouble();
            if (a <= 0 || b <= 0) {
                System.out.println("Error: Side lengths must be positive!");
                return;
            }
            double c = Math.sqrt(a * a + b * b);
            double angleA = Math.toDegrees(Math.atan(a / b));
            double angleB = Math.toDegrees(Math.atan(b / a));
            double area = 0.5 * a * b;

            System.out.println("triangle information");
            System.out.println("side a:" + a);
            System.out.println("side b:" + b);
            System.out.println("side c:" + c);
            System.out.println("Angle A:" + angleA);
            System.out.println("Angle B:" + angleB);
            System.out.println("area:" + area);

        } else if (choice == 2) {
            System.out.println("Enter the known side:");
            double a = input.nextDouble();
            if (a <= 0) {
                System.out.println("Error: Side must be positive!");
                return;
            }

            System.out.println("Enter known angle:");
            double angleA = input.nextDouble();
            if (angleA <= 0 || angleA >= 90) {
                System.out.println("Error: Angle must be between 0 and 90 degrees.");
                return;
            }
            double B = 90 - angleA;
            double C = 90;
            double c = a / Math.sin(Math.toRadians(angleA));
            double b = c / Math.sin(Math.toRadians(B));
            double area = 0.5 * a * b;

            System.out.println("triangle information");
            System.out.println("side a:" + a);
            System.out.println("side b:" + b);
            System.out.println("side c:" + c);
            System.out.println("Angle A:" + angleA);
            System.out.println("Angle B:" + B);
            System.out.println("Angle C:" + C);
            System.out.println("area:" + area);

        } else {
            System.out.println("Invalid choice. Please restart.");
            return;
        }
     //1. We validate that angles are less than 90° because a right triangle can only have one 90° angle, and the other two must be acute (<90°)
     //to form a valid triangle.
     //2. The program uses if-else statements to check which values are known and then applies the correct formulas (Pythagorean theorem or
     //trigonometric functions) to calculate the missing sides and angles.
     //3. If the user enters invalid values, the program prints an error message and stops before doing any calculations to avoid producing 
     //impossible results.
     
        //Problem 4
        System.out.println("Enter an angle in degree");
        double angleDeg = input.nextDouble();
        double angleRad = Math.toRadians(angleDeg);

        double sin = Math.sin(angleRad);
        double cos = Math.cos(angleRad);
        double tan = Math.tan(angleRad);
        double sec = 1 / cos;
        double sin2 = Math.sin(2 * angleRad);
        double tolerance = 1e-6;
        //Identity 1
        double lhs = Math.pow(sin, 2) + Math.pow(cos, 2);
        double rhs = 1.0;
        //Identity 2
        double lhs2 = 1 + Math.pow(tan, 2);
        double rhs2 = Math.pow(sec, 2);
        //Identity 3
        double lhs3 = sin2;
        double rhs3 = 2 * sin * cos;

        if (Math.abs(lhs - rhs) < tolerance) {
            System.out.println("The identity sin²θ + cos²θ = 1 holds true.");
        } else {
            System.out.println("The identity sin²θ + cos²θ = 1 does not hold true");
            System.out.println("Difference:" + Math.abs(lhs - rhs));
        }
        System.out.println("lhs=" + lhs + "rhs=" + rhs);

        if (Math.abs(lhs2 - rhs2) < tolerance) {
            System.out.println("The identity 1 + tan²θ = sec²θ holds true.");
        } else {
            System.out.println("The identity 1 + tan²θ = sec²θ does not hold true");
            System.out.println("Difference:" + Math.abs(lhs2 - rhs2));
        }
        System.out.println("lhs=" + lhs2 + "rhs=" + rhs2);

        if (Math.abs(lhs3 - rhs3) < tolerance) {
            System.out.println("The identity sin(2θ) = 2sinθcosθ holds true.");
        } else {
            System.out.println("The identity sin(2θ) = 2sinθcosθ does not hold true");
            System.out.println("Difference:" + Math.abs(lhs3 - rhs3));
        }
        System.out.println("lhs=" + lhs3 + "rhs=" + rhs3);
     //1. We need a tolerance because floating-point numbers are approximations, and tiny rounding errors can make two values that should be equal
     //appear slightly different.
     //2. The identity sin²θ + cos²θ = 1 is most susceptible because squaring and adding floating-point approximations can accumulate small errors, 
     //making the result slightly less than or greater than 1.
     //3. You could extend the program by adding more identities (e.g., cos(2θ) = cos²θ - sin²θ) and using the same comparison logic, or by allowing users
     //to enter custom expressions to verify dynamically.
     
        //Problem 5
        System.out.println("Enter amplitude:");
        double amp = input.nextDouble();
        System.out.println("Enter frequency(Hz):");
        double Hz = input.nextDouble();
        System.out.println("Enter phase shift(degree):");
        double psD = input.nextDouble();
        System.out.println("Enter time(seconds):");
        double time = input.nextDouble();

        double psR = Math.toRadians(psD);
        double omega = 2 * Math.PI * Hz;
        double Y = amp * Math.sin(omega * time + psR);

        System.out.printf("%nInstantaneous value at t=%.4fs: %.4f%n", time, Y);
        double Angle = (omega * time + psR) % (2 * Math.PI);
        if (Angle < 0) {
            Angle += 2 * Math.PI;
        }

        if (Math.abs(Math.sin(Angle) - 1.0) < tolerance) {
            System.out.println("The wave is at a PEAK.");
        } else if (Math.abs(Math.sin(Angle) + 1.0) < tolerance) {
            System.out.println("The wave is at a TROUGH.");
        } else if (Math.abs(Math.sin(Angle)) < tolerance) {
            System.out.println("The wave is at a ZERO-CROSSING.");
        } else {
            System.out.println("The wave is at a general position (not exactly peak/trough/zero).");
        }
        double currentPhase = Angle;
        double nextPeakPhase = Math.PI / 2;
        if (currentPhase >= nextPeakPhase) {
            nextPeakPhase += 2 * Math.PI;
        }
        double deltaPhase = nextPeakPhase - currentPhase;
        double deltaTime = deltaPhase / omega;
        double nextPeakTime = time + deltaTime;

        System.out.printf("Next peak occurs at t=%.4fs%n", nextPeakTime);
     
    //1. I check the value of `sin(ωt + φ)` and compare it (within a small tolerance) to `1`, `-1`, or `0` to determine if the wave is at a peak, 
    //trough, or zero-crossing.
    //2. I solve for the next time `t` such that `ωt + φ = π/2 + 2nπ`, then calculate the smallest `t` greater than the current time using
    //`nextPeakTime = time + (nextPeakPhase - currentPhase)/ω`.
    //3. I could replace the `Math.sin()` function with other wave equations (like square, triangular, or sawtooth waves) and adjust the conditions
    //for peaks, troughs, and zero-crossings accordingly.

    
    
    
    }
}

