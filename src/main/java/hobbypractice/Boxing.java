package hobbypractice;

import org.apache.log4j.Logger;

public class Boxing extends Hobby {

    final static Logger logger1 = Logger.getLogger(Boxing.class.getName());
    private int numberOfMatches;

    public Boxing(String nameHobby, int period, int numberOfMatches)  {
        super(nameHobby, period);
        if (period <= 0 || numberOfMatches <= 0) {
            logger1.error("You entered incorrect data, check this please");
        }
        this.numberOfMatches = numberOfMatches;
    }

    @Override
    void tellAboutHobby() throws HobbyException {
        if (numberOfMatches == 0) {
            throw new HobbyException("numberOfMatches must not be zero!");
        }
        System.out.println("My second hobby is " + getNameHobby() + ", i have been "
                + "keen on boxing for " + getPeriod() + " years , "
                + "i have " + numberOfMatches + " matches");
    }

    @Override
    public String toString() {
        return "Boxing{" + super.toString()+ "numberOfMatches=" + numberOfMatches + '}';
    }
}
