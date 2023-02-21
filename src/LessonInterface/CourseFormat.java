package LessonInterface;

public class CourseFormat {
    private long id;
    private String format;
    private int durationInWeek;
    private boolean isOnline;
    private int lessonDuration;
    private int lessonCountPerWeek;

    public long getId() {
        return id;
    }

    public void setId( long id) {
        this.id = id;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getDurationInWeek() {
        return durationInWeek;
    }

    public void setDurationInWeek(int durationInWeek) {
        this.durationInWeek = durationInWeek;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public int getLessonDuration() {
        return lessonDuration;
    }

    public void setLessonDuration(int lessonDuration) {
        this.lessonDuration = lessonDuration;
    }

    public int getLessonCountPerWeek() {
        return lessonCountPerWeek;
    }

    public void setLessonCountPerWeek(int lessonCountPerWeek) {
        this.lessonCountPerWeek = lessonCountPerWeek;
    }


}
