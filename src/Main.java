
public class Main {
    public static void main(String[] args) {
        Krug k = new Krug(5); // радиус = 5
        System.out.println("Площадь: " + k.ploshchad());
        System.out.println("Окружность: " + k.okruzhnost());

        // Вызов статических методов
        System.out.println("Площадь (статический метод): " + Krug.ploshchadStatic(5));
        System.out.println("Окружность (статический метод): " + Krug.okruzhnostStatic(5));
    }
}






















