
// Class to control what to display and what to hide


public class DisplayController {

    UI ui;
    //Constructor receive UI
    public DisplayController(UI userInterface){
        ui = userInterface;
    }

    //Method That is called to show title screen For example start of game or when player dies
    public void showTitleScreen(){

        //Shows Title name and button
        ui.titleNameLabel.setVisible(true);
        ui.startButtonPanel.setVisible(true);

        //HIde all game screen stuffs
        ui.mainTextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);
    }

    public void startTheGame(){

        //show all game screen stuffs
        ui.mainTextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(true);
        ui.playerPanel.setVisible(true);

        //hides Title name and button
        ui.titleNameLabel.setVisible(false);
        ui.startButtonPanel.setVisible(false);



    }

}
