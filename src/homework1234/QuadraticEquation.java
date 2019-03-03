package homework1234;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadraticEquation {

    public static void main(String[] args) {
        quadraticEquation(1, -8, 12);
        System.out.println("=====");
        quadraticEquation(5, 3, 7);
        System.out.println("=====");
        quadraticEquation(1, -6, 9);
        System.out.println("=====");
        quadraticEquation(1, -2, -3);
        System.out.println("=====");
        quadraticEquation(-1, -2, 15);
        System.out.println("=====");
        quadraticEquation(1, 12, 36);
        System.out.println("=====");
        quadraticEquation(1, 9, 0);
        System.out.println("=====");
        quadraticEquation(1, 0, -16);
        System.out.println("=====");
        quadraticEquation(1, -7, 0);
        System.out.println("=====");
        quadraticEquation(5, 0, 30);
        System.out.println("=====");
        quadraticEquation(4, 0, -9);

        //enterABC();
    }

    private static void quadraticEquation(float a, float b, float c) {
        String quad = "\u00B2";
        //System.out.println("Ваше уравнение: " + a + "x^2 + " + b + "x + " + c + " = 0");
        System.out.println("Ваше уравнение: " + a + "x" + quad + " + " + b + "x + " + c + " = 0");
        String result = "";
        float discriminant;
        float x1 = 0f;
        float x2 = 0f;
        if (a == 0 || b == 0 || c == 0) {
            result = ifabcZero(a, b, c);
            System.out.println(result);
            return;
        }
        discriminant = calculateDiscriminant(a, b, c);
        if (discriminant < 0) {
            result = "Уравнение корней не имеет.";
        } else if (discriminant == 0) {
            x1 = (-b) / 2 * a;
            result = "Дискриминант равен нулю. Корень уравнения: x = " + x1;
        } else if (discriminant > 0) {
            x1 = ((-b) + (float) Math.sqrt(discriminant)) / 2 * a;
            x2 = ((-b) - (float) Math.sqrt(discriminant)) / 2 * a;
            result = "Корни уравнения: x1 = " + x1 + ", x2 = " + x2;
        }
        System.out.println(result);


    }

    private static String ifabcZero(float a, float b, float c) {
        String result = "";
        float x1;
        float x2;

        if (a == 0 && b == 0 && c == 0) {
            result = "Это не квадратное уравнение.";
            return result;
        }
        if (a == 0) {
            result = "x = " + ((-c) / b);
        } else if (b == 0) {
            if (((-c) / a) > 0) {
                x1 = (float) Math.sqrt(((-c) / a));
                x2 = (float) - Math.sqrt(((-c) / a));
            } else {
                result = "Уравнение корней не имеет.";
                return result;
            }
            result = "x1 = " + x1 + ", x2 = " + x2;
        } else if (c == 0) {
            x1 = 0f;
            x2 = ((- b) / a);
            result = "x1 = " + x1 + ", x2 = " + x2;
        }

        return result;
    }

    private static float calculateDiscriminant(float a, float b, float c) {
        float discriminant = b * b - 4f * a * c;
        return discriminant;
    }

    private static void enterABC() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Введите a: ");
            float a = Float.parseFloat(reader.readLine());
            System.out.print("Введите b: ");
            float b = Float.parseFloat(reader.readLine());
            System.out.print("Введите c: ");
            float c = Float.parseFloat(reader.readLine());

            quadraticEquation(a, b, c);
        } catch (NumberFormatException | IOException e) {
            System.out.println("Попробуйте еще раз.");
        }
    }
}
