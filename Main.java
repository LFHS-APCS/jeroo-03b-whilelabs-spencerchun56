/**
 *  See Readme.md for instructions.
 *  Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
        Map.getInstance().loadMap("maps/whileLabs.jev");
        new JerooGUI();
        runJerooCode();

    }

    /**
     * You can change which tests you are running here.
     */
    public static void runJerooCode() {
        TestMain test = new TestMain();
        test.setup();
        test.test1_faceNorth();
        test.test2_goToOrigin();
        test.test3_meander();
    }

}
