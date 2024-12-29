/**
 * Quiz application with FX
 */

package appdata;






import javafx.application.Application;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;







/**
 *
 */
public class App extends Application {


    /**
     * ------------------------------- @params ----------------------------------
     */

    /**
     * Main stage
     */
    private Stage arg1 = new Stage();


    /**
     * Anchor pase as root component
     */
    private AnchorPane _root_ = new AnchorPane();


    /**
     * Scene with the root
     */
    private Scene arg0 = new Scene(_root_,800,700);










    /**
     *
      * @param args
     */
    public static void main(String[] args) { launch(args); }




    /**
     * @param stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception { build(); }






    /**
     * Build the application
     */
    private void build(){



        /**
         * Setting up the window
         */
        arg1.setTitle("Quiz game");
        arg1.setResizable(false);
        arg1.setScene(arg0);

        //show the game on the screen
        arg1.show();

    }


}



















