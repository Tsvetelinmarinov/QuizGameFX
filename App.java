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
     * Question number label
     */
    private Label questnm = new Label("Въпрос №");
    
    
    /**
     * Scores 
     */
    private Label scores = new Label("Точки");
    
    
    /**
     * Question box
     */
    private Label quest_lbl = new Label();
    
    
    /**
     * First option
     */
    private CheckBox opt1 = new CheckBox();
    
    
    /**
     * Second option option
     */
    private CheckBox opt2 = new CheckBox();
    
    
    /**
     * Third option
     */
    private CheckBox opt3 = new CheckBox();
    
    
    /**
     * Fourth option
     */
    private CheckBox opt4 = new CheckBox();

    
    /**
     * Output label
     */
    private Label _output_ = new Label("");
    
    
    /**
     * Hold the responses
     */
    private String[] responses = { "Верен отговор!","Грешен отговор" };
    
    
    /**
     * Holds all the questions
     */
	private String[] quests = {
		"Кой е Андре Мороа?","Какво е светлината?",
		"Кой е Стендал?","Какво е звукът?",
		"Какво е отоногенезата?","Кой е написал теорията за гравитацията?",
		"Чия столица е Сараево?","Коя е правилната формула на водата",
		"Кой е най-говореният език в света?","Коя е правилната формула на амоняка?"
	};
	
	
	/**
	 * Holds all the answers
	 */
	private String[][] answers = {
		{"Френски писател","Английски пиянист","Италиянски компоситор","Румънски писател"},
		{"Частица","Вълна","Не се знае","Държи се и като частица и като вълна"},
		{"Италиянски писател","Френски писател","Шотландски художник","Полски артист"},
		{"Частица","Вълна","Държи се и като частица и като вълна","Не се знае"},
		{"Повторение на филогенезата","Прераждане","Раждане","Смърт"},
		{"Томас Едисон","Алберт Айнщайн","Хенри Форд","Сър Иссак Нютон"},
		{"Черна Гора","Босна и Херцеговина","Косово","Словакия"},
		{"N5H1","H2O","H4O12","NH3CO2"},
		{"Испански","Английски","Френски","Китайски"},
	    {"HO2","NH3","CO2","H2ON3"}
	};
	
	
	   /**
	    * Question 1 button
	    */
	   private Button quest1 = new Button("1");
	   
	   
	   /**
	    * Question 2 button
	    */
	   private Button quest2 = new Button("2");
	   
	   
	   /**
	    * Question 3 button
	    */
	   private Button quest3 = new Button("3");
	   
	   
	   /**
	    * Question 4 button
	    */
	   private Button quest4 = new Button("4");
	   
	   
	   /**
	    * Question 5 button
	    */
	   private Button quest5 = new Button("5");
	   
	   
	   /**
	    * Question 6 button
	    */
	   private Button quest6 = new Button("6");
	   
	   
	   /**
	    * Question 7 button
	    */
	   private Button quest7 = new Button("7");
	   
	   
	   /**
	    * Question 8 button
	    */
	   private Button quest8 = new Button("8");
	   
	   
	   /**
	    * Question 9 button
	    */
	   private Button quest9 = new Button("9");
	   
	   
	   /**
	    * Question 10 button
	    */
	   private Button quest10 = new Button("10");
	   
	   
	   /**
	    * Scores label
	    */
	   private Label current_scores = new Label("Събрани точки : ");
	   
	   
	   /**
	    * Scores label
	    */
	   private Label all_scores = new Label("Максимален брой точки : 10");
	   

    




    





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


        //Question number label
        questnm.setFont(new Font("Consolas",14));
        questnm.setLayoutX(10);
        questnm.setLayoutY(68);
        _root_.getChildren().add(questnm);
        
        
        //Spacer
       Separator vertical_sp0 = new Separator(Orientation.VERTICAL); 
       vertical_sp0.setPrefSize(0, 15);
       vertical_sp0.setLayoutX(100);
       vertical_sp0.setLayoutY(70);
       _root_.getChildren().add(vertical_sp0);
        
        
        //Scores
        scores.setFont((Font)questnm.getFont());
        scores.setLayoutX(130);
        scores.setLayoutY(68);
        _root_.getChildren().add(scores);



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


         //Question label
        quest_lbl.setFont(Font.font("Arial",FontWeight.NORMAL,FontPosture.ITALIC,21));
        quest_lbl.setStyle("-fx-text-fill:rgb(100,100,100);");
        quest_lbl.setPrefSize(600, 22);
        quest_lbl.setLayoutX(100);
        quest_lbl.setLayoutY(125);
        quest_lbl.setText("");
        _root_.getChildren().add(quest_lbl);
        
        
        
        //New quiz icon
        ImageView quiz_i = new ImageView(new Image("/new.png"));
        quiz_i.setFitWidth(35);
        quiz_i.setFitHeight(35);
       
        
        //New quiz button
        Button new_quiz = new Button();
        new_quiz.setGraphic(quiz_i);
        new_quiz.setPrefSize(40, 40);
        new_quiz.setLayoutX(707);
        new_quiz.setLayoutY(117);
        new_quiz.setStyle("-fx-background-color:WHITE;");
        new_quiz.setOnMouseEntered(commands -> {
        	quiz_i.setFitWidth(40);
        	quiz_i.setFitHeight(40);
        	quiz_i.setLayoutX(733);
        	quiz_i.setLayoutY(113);
        });
        new_quiz.setOnMouseExited(commands -> {
        	quiz_i.setFitWidth(35);
        	quiz_i.setFitHeight(35);
        	quiz_i.setLayoutX(737);
        	quiz_i.setLayoutY(117);
        });
        //new_quiz.setDefaultButton(true);
        new_quiz.setOnAction(command -> new _system_().start_quiz());
        _root_.getChildren().add(new_quiz);
        

        //Spacer
        Separator sp04 = new Separator();
        sp04.setPrefSize(150, 5);
        sp04.setLayoutX(0);
        sp04.setLayoutY(200);
        _root_.getChildren().add(sp04);
        
        
        //Questions label
        Label answers = new Label("Отговори");
        answers.setFont((Font)logo.getFont());
        answers.setStyle("-fx-text-fill:rgb(100,100,100);");
        answers.setLayoutX(160);
        answers.setLayoutY(192);
        _root_.getChildren().add(answers);
        
        
        //Spacer
        Separator sp05 = new Separator();
        sp05.setPrefSize(550, 5);
        sp05.setLayoutX(250);
        sp05.setLayoutY(201);
        _root_.getChildren().add(sp05);
        
        
        //Information icon
        ImageView info1 = new ImageView(new Image("/info.png"));
        info1.setFitWidth(18);
        info1.setFitHeight(18);
        info1.setLayoutX(15);
        info1.setLayoutY(240);
        _root_.getChildren().add(info1);
        
        
        //Information label
        Label quest_warning = new Label("Моля, изберете една от следните опции");
        quest_warning.setFont(Font.font((String)logo.getFont().getFamily(),FontWeight.LIGHT,FontPosture.ITALIC,15));
        quest_warning.setLayoutX(40);
        quest_warning.setLayoutY(240);
        quest_warning.setStyle("-fx-text-fill:rgb(40,150,240);");
        _root_.getChildren().add(quest_warning);
        
        
        //First option
        opt1.setPrefSize(400, 20);
        opt1.setLayoutX(60);
        opt1.setLayoutY(300);
        opt1.setFont(Font.font("Times New Roman",FontWeight.LIGHT,FontPosture.ITALIC,19));
        //first_opt.setText("Френски писател");
        opt1.setSelected(false);
        _root_.getChildren().add(opt1);
        
        
        //Second options
        opt2.setPrefSize(400,20);
        opt2.setFont((Font)opt1.getFont());
        opt2.setLayoutX(60);
        opt2.setLayoutY(360);
        _root_.getChildren().add(opt2);
        
        
        //Third option
        opt3.setPrefSize(400, 20);
        opt3.setFont((Font)opt2.getFont());
        opt3.setLayoutX(60);
        opt3.setLayoutY(420);
        _root_.getChildren().add( opt3);
        
        
        //Fourth option
        opt4.setPrefSize(400, 20);
        opt4.setFont((Font) opt3.getFont());
        opt4.setLayoutX(60);
        opt4.setLayoutY(480);
        _root_.getChildren().add(opt4);
        
        
        //Group the checkbox
        CheckBox[] opts = { opt1,opt2,opt3,opt4 };
        
        //Make only one option selectable
        for(CheckBox opt : opts) {             	
        	opt.setOnAction(command -> {      		
        		//check if the current option is selected
        		if(opt.isSelected()) {            			
        			for(CheckBox current : opts) {       				
        				if(current != opt) current.setSelected(false);            				
        			}      			
        		}        		
        	});           	        	
        }
        
        
        //Check icon
        ImageView chck = new ImageView(new Image("/check.png"));
        chck.setFitWidth(28);
        chck.setFitHeight(28);
        
        
        //Check answer button
        Button check_ans = new Button("Провери");
        check_ans.setPrefSize(100, 40);
        check_ans.setLayoutX(100);
        check_ans.setLayoutY(570);
        check_ans.setGraphic(chck);
        //check_ans.setDefaultButton(true);
        //check_ans.setStyle("-fx-background-color:rgb(150,220,150);");
        check_ans.setOnAction(commdan -> new _system_().check_rslt());
        _root_.getChildren().add(check_ans);
        
        
        //Reslt label
        _output_.setFont(Font.font("Arial",FontWeight.BOLD,FontPosture.ITALIC,16));
        _output_.setStyle("-fx-text-fill:rgb(100,100,100);");
        _output_.setLayoutX(240);
        _output_.setLayoutY(580);
        _root_.getChildren().add(_output_);
        
        
        //Spacer
        Separator sp06 = new Separator();
        sp06.setPrefSize(800, 5);
        sp06.setLayoutX(0);
        sp06.setLayoutY(640);
        _root_.getChildren().add(sp06);
        
       
        
        //First question button
        // No functionality 
        quest1.setFont(new Font("Arial",14));
        quest1.setPrefSize(15, 15);
        quest1.setLayoutX(30);
        quest1.setLayoutY(655);
        //quest1.setDisable(true);
        _root_.getChildren().add(quest1);
        
        
        //Question 2 button
        quest2.setFont((Font)quest1.getFont());
        quest2.setPrefSize(15, 15);
        quest2.setLayoutX(65);
        quest2.setLayoutY(655);
        _root_.getChildren().add(quest2);
        
        
        //Question 3 button
        quest3.setFont((Font)quest1.getFont());
        quest3.setPrefSize(15, 15);
        quest3.setLayoutX(100);
        quest3.setLayoutY(655);
        _root_.getChildren().add(quest3);
        
        
        //Question 4 button
        quest4.setFont((Font)quest1.getFont());
        quest4.setPrefSize(15, 15);
        quest4.setLayoutX(135);
        quest4.setLayoutY(655);
        _root_.getChildren().add(quest4);
        
        
        //Question 5 button
        quest5.setFont((Font)quest1.getFont());
        quest5.setPrefSize(15, 15);
        quest5.setLayoutX(170);
        quest5.setLayoutY(655);
        _root_.getChildren().add(quest5);
        
        
        //Question 6 button
        quest6.setFont((Font)quest1.getFont());
        quest6.setPrefSize(15, 15);
        quest6.setLayoutX(205);
        quest6.setLayoutY(655);
        _root_.getChildren().add(quest6);
        
        
        //Question 7 button
        quest7.setFont((Font)quest1.getFont());
        quest7.setPrefSize(15, 15);
        quest7.setLayoutX(240);
        quest7.setLayoutY(655);
        _root_.getChildren().add(quest7);
        
        
        //Question 8 button
        quest8.setFont((Font)quest1.getFont());
        quest8.setPrefSize(15, 15);
        quest8.setLayoutX(275);
        quest8.setLayoutY(655);
        _root_.getChildren().add(quest8);
        
        
        //Question 9 button
        quest9.setFont((Font)quest1.getFont());
        quest9.setPrefSize(15, 15);
        quest9.setLayoutX(310);
        quest9.setLayoutY(655);
        _root_.getChildren().add(quest9);
        
        
        //Question 10 button
        quest10.setFont((Font)quest1.getFont());
        quest10.setPrefSize(35, 15);
        quest10.setLayoutX(345);
        quest10.setLayoutY(655);
        _root_.getChildren().add(quest10);
        
        
        //Spacer
        Separator sp07 = new Separator(Orientation.VERTICAL);
        sp07.setPrefSize(0,25);
        sp07.setLayoutX(430);
        sp07.setLayoutY(655);
        _root_.getChildren().add(sp07);
        
        
        //Scores label
        current_scores.setFont((Font)quest_warning.getFont());
        current_scores.setLayoutX(440);
        current_scores.setLayoutY(659);
        current_scores.setStyle("-fx-text-fill:rgb(100,100,100);");
        _root_.getChildren().add(current_scores);
        
        
        //Separator
        Separator sp08 = new Separator(Orientation.VERTICAL);
        sp08.setPrefSize(0, 25);
        sp08.setLayoutX(585);
        sp08.setLayoutY(655);
        _root_.getChildren().add(sp08);
        
        
        //All scores label
        all_scores.setFont((Font)quest_warning.getFont());
        all_scores.setLayoutX(595);
        all_scores.setLayoutY(659);
        all_scores.setStyle("-fx-text-fill:rgb(100,100,100);");
        _root_.getChildren().add(all_scores);


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
            _QUEST_ROOT_.setStyle("-fx-background-color:WHITE;");

            //Scene
            Scene scn = new Scene(_QUEST_ROOT_,570,160);


            //Notation
            ImageView notice = new ImageView(new Image("/notation.png"));
            notice.setFitWidth(25);
            notice.setFitHeight(25);
            notice.setLayoutX(15);
            notice.setLayoutY(37);
            _QUEST_ROOT_.getChildren().add(notice);


            //Label with information
            Label arg00 = new Label("За да стартирате нов тест, натиснете");
            arg00.setLayoutX(50);
            arg00.setLayoutY(40);
            arg00.setFont(new Font("System",14));
            _QUEST_ROOT_.getChildren().add(arg00);
            
            
            //new quiz icon
            ImageView new_quiz_icon = new ImageView(new Image("/new.png"));
            new_quiz_icon.setFitWidth(20);
            new_quiz_icon.setFitHeight(20);
            new_quiz_icon.setLayoutX(290);
            new_quiz_icon.setLayoutY(40);
            _QUEST_ROOT_.getChildren().add(new_quiz_icon);
   
            
            //Information icon
            ImageView notice2 = new ImageView(new Image("/notation.png"));
            notice2.setFitWidth(25);
            notice2.setFitHeight(25);
            notice2.setLayoutX(15);
            notice2.setLayoutY(90);
            _QUEST_ROOT_.getChildren().add(notice2);
            
            
            //Label with information
            Label arg01 = new Label("За да преминете към следващия въпрос, натиснете бутонa 'Провери', след");
            arg01.setFont((Font)arg00.getFont());
            arg01.setLayoutX(50);
            arg01.setLayoutY(93);
            _QUEST_ROOT_.getChildren().add(arg01);
            
            
            //Label with information
            Label arg02 = new Label("което натиснете следващия под ред бутон от бутоните за въпросите");
            arg02.setFont((Font)arg00.getFont());
            arg02.setLayoutX(50);
            arg02.setLayoutY(107);
            _QUEST_ROOT_.getChildren().add(arg02);
 
            
            //set the window
            stg.setTitle("Информация");
            stg.setResizable(false);
            stg.setScene(scn);
            stg.getIcons().add(new Image("/quest.png"));

            //show the hint
            stg.show();

        }


        
        
        /**
         * Create new test
         */
        private void start_quiz() {
        	
        	//Set the question number
        	questnm.setText("Въпрос №1");
        	
        	//update the scores
        	scores.setText("Точки 2");
        	
        	//show first question
        	quest_lbl.setText((String)quests[0]);
        	
        	//Update options
        	opt1.setText((String)answers[0][0]);
        	opt2.setText((String)answers[0][1]);
        	opt3.setText((String)answers[0][2]);
        	opt4.setText((String)answers[0][3]);
        	
        	opt1.setSelected(false);
        	opt2.setSelected(false);
        	opt3.setSelected(false);
        	opt4.setSelected(false);
        	
        	//Reset the result
        	_output_.setText("");
        	
        	//Disable question 1 button
        	quest1.setDisable(true);
        	
        	//Show tip
        	JOptionPane.showInternalMessageDialog(null,
        			"Всеки въпрос съдържа само един верен отговор и носи 2 точки.",
        			       "Съобщение",JOptionPane.INFORMATION_MESSAGE);
        
        }
        
        
        
        
        
        
        /**
         * Check the question and the answer
         */
        private void check_rslt() {
        	
           @SuppressWarnings("unused")
		   String[] options = { (String)opt1.getText(),(String)opt2.getText(),(String)opt3.getText(),(String)opt4.getText() };
           
           String quest = (String)quest_lbl.getText();
           
           switch(quest) {
           case "Кой е Андре Мороа?":
        	   if(opt1.isSelected()) {
        		   _output_.setText(responses[0]);
        		   _output_.setTextFill(Color.LIGHTGREEN);
        	   }
        	   else {
        		   _output_.setText(responses[1]);
        		   _output_.setTextFill(Color.INDIANRED);
        	   }
        	   break;
           case "Какво е светлината?":
        	   if(opt4.isSelected()) {
        		   _output_.setText(responses[0]);
        		   _output_.setTextFill(Color.LIGHTGREEN);
        	   }
        	   else {
        		   _output_.setText(responses[1]);
        		   _output_.setTextFill(Color.INDIANRED);
        	   }
        	   break;
           case "Кой е Стендал?":
        	   if(opt2.isSelected()) {
        		   _output_.setText(responses[0]);
        		   _output_.setTextFill(Color.LIGHTGREEN);
        	   }else {
        		   _output_.setText(responses[1]);
        		   _output_.setTextFill(Color.INDIANRED);
        	   }          
           case "Какво е звукът?":
        	   if(opt2.isSelected()) {
        		   _output_.setText(responses[0]);
        		   _output_.setTextFill(Color.LIGHTGREEN);
        	   }else {
        		   _output_.setText(responses[1]);
        		   _output_.setTextFill(Color.INDIANRED);
        	   }
           case "Какво е отоногенезата?":
        	   if(opt1.isSelected()) {
        		   _output_.setText(responses[0]);
        		   _output_.setTextFill(Color.LIGHTGREEN);
        	   }else {
        		   _output_.setText(responses[1]);
        		   _output_.setTextFill(Color.INDIANRED);
        	   }
           case "Кой е написал теорията за гравитацията?":
        	   if(opt4.isSelected()) {
        		   _output_.setText(responses[0]);
        		   _output_.setTextFill(Color.LIGHTGREEN);
        	   }else {
        		   _output_.setText(responses[1]);
        		   _output_.setTextFill(Color.INDIANRED);
        	   }
           case "Чия столица е Сараево?":
        	   if(opt2.isSelected()) {
        		   _output_.setText(responses[0]);
        		   _output_.setTextFill(Color.LIGHTGREEN);
        	   }else {
        		   _output_.setText(responses[1]);
        		   _output_.setTextFill(Color.INDIANRED);
        	   }
           case "Коя е правилната формула на водата?":
        	   if(opt2.isSelected()) {
        		   _output_.setText(responses[0]);
        		   _output_.setTextFill(Color.LIGHTGREEN);
        	   }else {
        		   _output_.setText(responses[1]);
        		   _output_.setTextFill(Color.INDIANRED);
        	   }
           case "Кой е най-говореният език в света?":
        	   if(opt2.isSelected()) {
        		   _output_.setText(responses[0]);
        		   _output_.setTextFill(Color.LIGHTGREEN);
        	   }else {
        		   _output_.setText(responses[1]);
        		   _output_.setTextFill(Color.INDIANRED);
        	   }
           case "Коя е правилната формула на амоняка?":
        	   if(opt2.isSelected()) {
        		   _output_.setText(responses[0]);
        		   _output_.setTextFill(Color.LIGHTGREEN);
        	   }else {
        		   _output_.setText(responses[1]);
        		   _output_.setTextFill(Color.INDIANRED);
        	   }
        	   default:
           }
                  
            
        	if(!opt1.isSelected() && !opt2.isSelected() && !opt3.isSelected() && !opt4.isSelected()) {
        		 JOptionPane.showInternalMessageDialog(null,"Моля, изберете една от опциите преди да натиснете бутона за проверка!",
  		    		   "Внимание",JOptionPane.WARNING_MESSAGE);
        		 
        		 _output_.setText("");
        	}
        		     
           
        	                  	
        }
        
        
        
        
        /**
         * Show second question
         */
        private void show_sec_quest() {
        	
        	
        	
        }


    }




     /**
     * Get color from style
     */
    @SuppressWarnings("unused")
	private final Color getBackgroundColor(String style_property) {
    	
    	//Defaul color string
    	String clr = "#000000";
    	
    	//Split the style propertys in the style string
    	String[] propertys = style_property.split(";");
    	
    	//Loop over the propertys
    	for(String property : propertys) {
    		
    		//check if the property starts with needed fx propery
    		if(property.startsWith("-fx-background-color:")) {
    			
    			clr = property.split(":")[1].trim();
    			
    		}
    		
    	}
    	
    	return Color.web(clr);
    	
    }


}
