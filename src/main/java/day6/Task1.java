package day6;
/** В классах Автомобиль и Мотоцикл реализуйте два метода:
 void info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
 int yearDifference(int inputYear) - принимает в качестве аргумента целое число (год)
 и возвращает разницу между переданным годом и годом выпуска транспортного средства
 (возвращаться должно всегда положительное число).

 В методе main() класса Task1 создайте экземпляр автомобиля или мотоцикла, проверьте работу каждого метода.
 */

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2005);
        car.info();
        car.oldest = car.getOldest();
        car.yearDifference(2021);
        if(car.oldest > 0) System.out.print("и ему "+car.oldest+" лет");
    }
}
