public class ScaryException extends Exception {

    static void doRisky(String test) throws ScaryException{
        System.out.println("stat risky");
        if ("yes".equals(test)) {
            throw new ScaryException();

        }
        System.out.println("end risky ");
        return;

    }
}
