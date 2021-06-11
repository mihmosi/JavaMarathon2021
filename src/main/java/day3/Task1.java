package day3;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String town = scanner.nextLine();
            if (town.equals("Стоп"))
                break;

                switch (town) {
                    case "Рим":
                    case "Милан":
                    case "Турин":
                        System.out.println("Италия");
                        break;

                    case "Ливерпуль":
                    case "Манчестер":
                    case "Лондон":
                        System.out.println("Англия");
                        break;

                    case "Берлин":
                    case "Мюнхен":
                    case "Кёлн":
                        System.out.println("Германия");
                        break;

                    default:
                        System.out.println("Неизвестная страна");
                        break;
                }
            }
        System.out.println("Программа завершена");
        }
    }
