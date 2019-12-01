package hobbypractice;

import org.apache.log4j.Logger;

public class TestHobby {
    public static void main(String[] args) throws HobbyException {

        final Logger logger = Logger.getLogger(TestHobby.class.getName());

        Football football = new Football("Football",5,11);
        Boxing boxing = new Boxing("Boxing", 0, 12);

        logger.info("Objects were created here");

        System.out.println(football);
        System.out.println(boxing);


        Hobby[] hobbies = {football, boxing};

        logger.info("Massive of objects were created here");

        for (Hobby hh:hobbies) {
            hh.tellAboutHobby();
        }
    }
}
