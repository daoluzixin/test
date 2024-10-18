 public class Song{
        private String title;
        private String artist;
        private String genre;
        private int year;
        private int timesPlayed;
        //	利用注解或者自己创建构造器和get方法


     public Song() {
     }

     public Song(String title, String artist, String genre, int year, int timesPlayed) {
         this.title = title;
         this.artist = artist;
         this.genre = genre;
         this.year = year;
         this.timesPlayed = timesPlayed;
     }

     public String getTitle() {
         return title;
     }

     public void setTitle(String title) {
         this.title = title;
     }

     public String getArtist() {
         return artist;
     }

     public void setArtist(String artist) {
         this.artist = artist;
     }

     public String getGenre() {
         return genre;
     }

     public void setGenre(String genre) {
         this.genre = genre;
     }

     public int getYear() {
         return year;
     }

     public void setYear(int year) {
         this.year = year;
     }

     public int getTimesPlayed() {
         return timesPlayed;
     }

     public void setTimesPlayed(int timesPlayed) {
         this.timesPlayed = timesPlayed;
     }

     @Override
     public String toString() {
         return "Song{" +
                 "title='" + title + '\'' +
                 ", artist='" + artist + '\'' +
                 ", genre='" + genre + '\'' +
                 ", year=" + year +
                 ", timesPlayed=" + timesPlayed +
                 '}';
     }
 }

