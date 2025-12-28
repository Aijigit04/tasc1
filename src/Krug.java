public class Krug {
    double radius;
    static final double PI = 3.14159265359;

    public Krug(double radius) {
        this.radius = radius;
    }
    
    public double ploshchad() {
        return PI * radius * radius;
    }

    public double okruzhnost() {
        return 2 * PI * radius;
    }

    public static double ploshchadStatic(double r) {
        return PI * r * r;
    }

    public static double okruzhnostStatic(double r) {
        return 2 * PI * r;
    }
}
