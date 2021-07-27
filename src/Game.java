import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    //Instantiating UI class
    UI ui = new UI();

    //Instantiate choice handler
    ChoiceHandler cHandler = new ChoiceHandler();

    //Instantiating display controller
    DisplayController dc = new DisplayController(ui);

    public static void main(String[] args){

        new Game();

    }

    public Game(){

        //Calling Create UI From UI.java
        ui.createUI(cHandler);
        dc.showTitleScreen();

    }

    //Handler Class for Start and choices buttons
    public class ChoiceHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {

            String yourChoice = event.getActionCommand();

            switch (yourChoice){

                case "Start": dc.startTheGame();break;
                case "c1" : break;
                case "c2" : break;
                case "c3" : break;
                case "c4" : break;
            }

        }
    }

}
