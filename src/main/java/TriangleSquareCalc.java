import java.util.Scanner;

public class TriangleSquareCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите величину стороны а: ");
        int a = scanner.nextInt();

        System.out.println("Укажите величину стороны b: ");
        int b = scanner.nextInt();

        System.out.println("Укажите величину стороны с: ");
        int c = scanner.nextInt();

        int p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Площадь треугольника равна = " + s);

    }

    public static double calculateTriangleSquare(int a, int b, int c) throws Exception {
        if (a <= 0 || b <= 0 | c <= 0)
            throw new Exception();
        // Сторона не может быть меньше или равна нулю
        if (a + b <= c || a + c <= b || b + c <= a)
            throw new Exception();
        // Треугольник существует тогда и только тогда, когда сумма любых двух его сторон больше третьей стороны
        double halfPerimeter = (a + b + c) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }
}
