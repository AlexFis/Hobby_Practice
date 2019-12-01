package hobbypractice;

public abstract class Hobby {
    private String nameHobby;
    private int period;

    public String getNameHobby() {
        return nameHobby;
    }

    public void setNameHobby(String nameHobby) {
        this.nameHobby = nameHobby;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public Hobby(String nameHobby, int period) {
        this.nameHobby = nameHobby;
        this.period = period;
    }

    @Override
    public String toString() {
        return "Hobby{" + "nameHobby='" + nameHobby + '\'' + ", period=" + period + '}';
    }

    abstract void tellAboutHobby() throws HobbyException;

}
