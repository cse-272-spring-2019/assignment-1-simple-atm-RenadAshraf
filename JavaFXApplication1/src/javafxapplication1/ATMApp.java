
package javafxapplication1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ATMApp extends Application{
    
    
    
    public static void main(String args[]) {
        launch(args);
}

    @Override
    public void start(Stage primaryStage) throws Exception {
        
         primaryStage.setTitle("My ATM");
         cardNumber cn = new cardNumber(primaryStage);
         choice choice = new choice(primaryStage);
         enterAmount ea = new enterAmount(primaryStage);
          
       cn.cardCheck(primaryStage);
       choice.choose();
       cn.setChoice(choice);
       
       choice.setAmount(ea);
       ea.setChoice(choice);
       
       

      primaryStage.setScene(cn.getScene());
      primaryStage.show();   
    }
    
    
}
