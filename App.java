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
     * Logo label
     */
    private final Label logo = new Label("Въпроси на деня");








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

        //root
        _root_.setStyle("-fx-background-color:rgb(255,255,255);");

        //Logo label
        logo.setFont(new Font("Times New Roman",21));
        logo.setStyle("-fx-font-style:ITALIC;");
        logo.setStyle("-fx-text-fill:rgb(100,100,100);");
        logo.setLayoutX(350);
        logo.setLayoutY(20);
        _root_.getChildren().add(logo);


        //Spacer
        Separator sp01 = new Separator();
        sp01.setPrefSize(340,0);
        sp01.setLayoutX(0);
        sp01.setLayoutY(33);
        //sp01.setStyle("-fx-background-color:rgb(220,220,220);");
        _root_.getChildren().add(sp01);


        //Spacer
        Separator sp02 = new Separator();
        sp02.setPrefSize(350,0);
        sp02.setLayoutX(495);
        sp02.setLayoutY(33);
        _root_.getChildren().add(sp02);


        //Spacer
        Separator sp03 = new Separator();
        sp03.setPrefSize(800,0);
        sp03.setLayoutX(0);
        sp03.setLayoutY(85);
        _root_.getChildren().add(sp03);


        //Question mark
        ImageView quest = new ImageView(new Image(
        "C:\\Users\\Cvete\\IdeaProjects\\QuizApplication\\src\\main\\java\\appdata\\quest.png"));
        quest.setFitWidth(25);
        quest.setFitHeight(25);
        quest.setLayoutX(20);
        quest.setLayoutY(100);
        _root_.getChildren().add(quest);
        quest.setOnMouseClicked(command -> new _system_().show_tip());


        /**
         * Setting up the window
         */
        arg1.setTitle("Quiz game");
        arg1.setResizable(false);
        arg1.setScene(arg0);
        arg1.getIcons().add(new Image(
        "C:\\Users\\Cvete\\IdeaProjects\\QuizApplication\\src\\main\\java\\appdata\\icon.png"));

        //show the game on the screen
        arg1.show();

    }





     /**
     * Logical class
     * Holds all the program logics
     */
    private final class _system_ {


        /**
         * Question mark functionality
         */
        private void show_tip(){

            //New stage
            Stage stg = new Stage();

            //New Anchor pane
            AnchorPane _QUEST_ROOT_ = new AnchorPane();

            //Scene
            Scene scn = new Scene(_QUEST_ROOT_,470,100);

             //Notation
            ImageView notice = new ImageView(new Image(
              "C:\\Users\\Cvete\\IdeaProjects\\QuizApplication\\src\\main\\java\\appdata\\notation.png"
            ));
            notice.setFitWidth(25);
            notice.setFitHeight(25);
            notice.setLayoutX(15);
            notice.setLayoutY(37);
            _QUEST_ROOT_.getChildren().add(notice);


            //Label with information
            Label arg00 = new Label("Всеки въпрос носи една точка и има само един верен отговор!");
            arg00.setLayoutX(50);
            arg00.setLayoutY(40);
            arg00.setFont(new Font("System",14));
            _QUEST_ROOT_.getChildren().add(arg00);


            //set the window
            stg.setTitle("Относно въпросите");
            stg.setResizable(false);
            stg.setScene(scn);

            //show the hint
            stg.show();

        }


    }


}



















