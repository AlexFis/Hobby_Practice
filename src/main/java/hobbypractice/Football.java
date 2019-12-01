package hobbypractice;

import org.apache.log4j.Logger;

public class Football extends Hobby {
    final static Logger logger2 = Logger.getLogger(Football.class.getName());
    private int numberOfPlayers;

    public Football(String nameHobby, int period, int numberOfPlayers) {
        super(nameHobby, period);
        if (period <= 0 || numberOfPlayers <= 0) {
            logger2.error("You entered incorrect data, check this please");
        }
        this.numberOfPlayers = numberOfPlayers;
    }

    @Override
    void tellAboutHobby() throws HobbyException {
        if (numberOfPlayers == 0) throw new HobbyException("numberOfPlayers must not be zero");
        System.out.println("My first hobby is " + getNameHobby()
                + ", i have been keen on football for " + getPeriod() + " years , our team have "
                + numberOfPlayers + " players");
    }

    @Override
    public String toString() {
        return "Football{" + super.toString() + "numberOfPlayers=" + numberOfPlayers + '}';
    }
}
