package basic;

public class Task2 {
    public static void main(String[] args) {

        int ageChildren = 16;

        if (ageChildren <= 6) {
            System.out.println("Ребенок идет в детский сад.");
        } else if (ageChildren <= 10) {
            System.out.println("Ребенок идет в начальные классы.");
        } else if (ageChildren <= 17) {
            System.out.println("Ребенок идет в старшие классы.");
        } else {
            System.out.println("Ребенок идет в университет.");
        }
    }
}
