package day12.task4;

public class Task4 {
    public static void main(String[] args) {
        MusicBand A = new MusicBand("Группа А", 1987);
        MusicBand B = new MusicBand("Группа Б", 1874);
        A.addArtist("Шевчук");
        A.addArtist("Кипелов");
        A.addArtist("Кирковров");
        B.addArtist("Шнуров");
        B.addArtist("Лагутенко");
        B.addArtist("Лещенко");

        MusicBand.printMembers(A);
        MusicBand.printMembers(B);
        MusicBand.transferMembers(A,B);
        MusicBand.printMembers(A);
        MusicBand.printMembers(B);

    }
}
