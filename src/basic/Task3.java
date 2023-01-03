package basic;

public class Task3 {
    public static void main(String[] args) {

        //Курица
        boolean chicken = false;
        //Овощи
        boolean vegetables = true;
        //Сщус
        boolean sour = false;
        //Хлеб
        boolean toast = true;
        //Колбаса
        boolean sausage = true;
        //Яйца
        boolean eggs = true;

        boolean isCaesarSalad = chicken && vegetables && sour && toast;
        boolean isOlivierSalad = vegetables && (sausage || chicken) && eggs && sour;
        boolean isVegetableSalad = vegetables && sour;

        if (isCaesarSalad) {
            System.out.println("Лутьше сделать салат Цезарь.");
        } else if (isOlivierSalad) {
            System.out.println("Если для Цезаря ингридиентов не нашлось, то сделать салат Оливье.");
        } else if (isVegetableSalad) {
            System.out.println("Если и для салата Оливье не нашлось ингридиентов, то нужно сделать Овощной салат.");
        } else {
            System.out.println("У меня нет ингридиентов! :(");
        }
    }
}
