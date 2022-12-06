public class Main {
    public static void main(String[] args) {
        // Задача №6
        System.out.println("Задача №6");

        var weightBoxerOne = 78.2;
        var weightBoxerTwo = 82.7;

        System.out.println("Общий вес двух боксеров: " + (weightBoxerOne + weightBoxerTwo));
        System.out.println("Разность весов двух боксеров: " + (weightBoxerTwo - weightBoxerOne));

        // Задача №7
        System.out.println("Задача №7");
        System.out.println("Разность весов двух боксеров (Способ №1): " + (weightBoxerTwo - weightBoxerOne));
        System.out.println("Разность весов двух боксеров (Способ №2): " + (weightBoxerTwo % weightBoxerOne));

        // Задача №8
        System.out.println("Задача №8");

        var totalNumberOfHours = 640;
        var numberOfEmployeeHours = 8;
        var totalEmployees = totalNumberOfHours/numberOfEmployeeHours;

        System.out.println("Всего сотрудников в организации: " + totalEmployees + " человек");

        totalEmployees += 94;
        totalNumberOfHours = totalEmployees * numberOfEmployeeHours;

        System.out.println("Если в организации работает: " + totalEmployees + " человека, то всего " +
                totalNumberOfHours + " часа работы может быть поделено между сотрудниками" );








    }
}