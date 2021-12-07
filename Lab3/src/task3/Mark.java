package task3;

public class Mark {
    public int mark;

    public Mark() {}

    public Mark(final int mark) {
        this.mark = mark;
    }

    public void setMark(final int mark) {
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return " " + mark + ' ';
    }
}

