package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand[] musicBands = new MusicBand[10];
        musicBands[0] = new MusicBand("Radiohead", 1985);
        musicBands[1] = new MusicBand("The Killers", 2002);
        musicBands[2] = new MusicBand("Red Hot Chili Peppers", 1983);
        musicBands[3] = new MusicBand("U2", 1976);
        musicBands[4] = new MusicBand("Gorillaz", 1999);
        musicBands[5] = new MusicBand("Band Of Skulls", 2004);
        musicBands[6] = new MusicBand("Fit For Rivals", 2009);
        musicBands[7] = new MusicBand("White Lies", 2006);
        musicBands[8] = new MusicBand("Scorpions", 1965);
        musicBands[9] = new MusicBand("Queen", 1970);

        List<MusicBand> musicBand = new ArrayList<>(); //дабавление в динамический массив
        for (MusicBand Mband : musicBands) {
            musicBand.add(Mband);
        }
        Collections.shuffle(musicBand);//перемешивание списка

        for (MusicBand Mband : musicBand) { // вывод в консоль скаска групп
            System.out.println(Mband.getName());
        }
        System.out.println("-Группы созданные после 2000 года-");

        for (MusicBand Mband : groupsAfter2000(musicBand)) { // вывод списка группб созданных после 2000-го
            System.out.println(Mband.getName());
        }

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        for (int i = 0; i < bands.size(); i++) {
            if ((bands.get(i).getYear()) < 2000) {
                bands.remove(i);
                i-=1;
            }
        }
        return bands;
    }
}


