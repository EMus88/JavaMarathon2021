package day12.task5;

public class Task5 {
    public static void main(String[] args) {
        day12.task5.MusicBand A = new day12.task5.MusicBand("Группа А", 1879);
        day12.task5.MusicBand B = new day12.task5.MusicBand("Группа Б", 2011);

        A.addArtist(new MusicArtist("Киркоров",56));
        A.addArtist(new MusicArtist("Кипелов",64));
        A.addArtist(new MusicArtist("Пугачева",25));
        B.addArtist(new MusicArtist("Лагутенко",56));
        B.addArtist(new MusicArtist("Бузова",30));
        B.addArtist(new MusicArtist("Шнуров",55));
        B.addArtist(new MusicArtist("Расторгуев",53));

        MusicBand.printMembers(A);
        MusicBand.printMembers(B);
        MusicBand.transferMembers(A,B);
        MusicBand.printMembers(A);
        MusicBand.printMembers(B);


    }
}
