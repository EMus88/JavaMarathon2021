package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> Artist = new ArrayList<>();

    public void addArtist(MusicArtist artist) {
        Artist.add(artist);
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public List<MusicArtist> getMembers() {
        return Artist;
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        musicBand2.Artist.addAll(musicBand1.Artist);
        musicBand1.Artist.clear();
    }

    public static void printMembers(MusicBand musicBand) {
        System.out.println("Список артистов группы " + musicBand.getName());
        for (int i = 0; i < musicBand.Artist.size(); i++) {
            System.out.println(musicBand.Artist.get(i).getName());
        }
    }
}
