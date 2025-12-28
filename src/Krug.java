public class Krug {
    // Поля (свойства)
    double radius;
    static final double PI = 3.14159265359;

    // Конструктор
    public Krug(double radius) {
        this.radius = radius;
    }

    // Метод для вычисления площади круга
    public double ploshchad() {
        return PI * radius * radius;
    }

    // Метод для вычисления длины окружности
    public double okruzhnost() {
        return 2 * PI * radius;
    }

    // Статический метод (можно вызвать без объекта)
    public static double ploshchadStatic(double r) {
        return PI * r * r;
    }

    public static double okruzhnostStatic(double r) {
        return 2 * PI * r;
    }
}