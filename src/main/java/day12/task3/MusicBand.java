package day12.task3;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать класс Музыкальная Группа (англ. MusicBand) с полями name и
 * year (название музыкальной группы и год основания). Создать 10 или
 * более экземпляров класса MusicBand , добавить их в список (выбирайте
 * такие музыкальные группы, которые были созданы как до 2000 года, так
 * и после, жанр не важен). Перемешать список. Создать статический метод в классе Task3:
 * public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
 * Этот метод принимает список групп в качестве аргумента и возвращает новый список,
 * состоящий из групп, основанных после 2000 года. Вызвать метод groupsAfter2000(List<MusicBand> bands)
 * в методе main() на вашем списке из 10 групп. Вывести в консоль оба списка
 * (оригинальный и с группами, основанными после 2000 года).
 */
public class MusicBand {
    String name;
    int year;
    MusicBand band1 = new MusicBand("Abba", 1969);
    MusicBand band2 = new MusicBand("BonyM", 1975);
    MusicBand band3 = new MusicBand("Arabesky", 1980);
    MusicBand band4 = new MusicBand("Tony", 1969);
    MusicBand band5 = new MusicBand("Quin", 2001);
    MusicBand band6 = new MusicBand("Pupo", 2005);
    MusicBand band7 = new MusicBand("Toto", 2015);
    MusicBand band8 = new MusicBand("Sara", 2003);
    MusicBand band9 = new MusicBand("Karo", 1990);
    MusicBand band10 = new MusicBand("Zola", 2003);


    List<MusicBand> musicBands = new ArrayList<>(band1, band2, band3, band4, band5, band6, band7, band8, band9, band10);



    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }
}
