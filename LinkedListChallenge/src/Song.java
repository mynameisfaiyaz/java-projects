public class Song {


    private String title;
    private int durationMinute;
    private int durationSecond;

    public Song(String title, int durationMinute, int durationSecond) {
        this.title = title;
        this.durationMinute = durationMinute;
        this.durationSecond = durationSecond;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurationMinute() {
        return durationMinute;
    }

    public void setDurationMinute(int durationMinute) {
        this.durationMinute = durationMinute;
    }

    public int getDurationSecond() {
        return durationSecond;
    }

    public void setDurationSecond(int durationSecond) {
        this.durationSecond = durationSecond;
    }
}
