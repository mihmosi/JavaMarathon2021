package day7;
/** Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
 В классе Самолет реализовать статический метод compareAirplanes,
 который в качестве аргументов принимает два объекта класса Airplane (два самолета)
 и выводит сообщение в консоль о том, какой из самолетов длиннее.
 */
public class Task1 {
    public static void main(String[] args) {
        Airplane a1 = new Airplane("boing",2005, 200, 30000);
        Airplane a2 = new Airplane("airbus",2008, 100, 50000);
        Airplane.compareAirplanes(a1, a2);
    }
}