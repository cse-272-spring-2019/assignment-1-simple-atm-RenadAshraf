package javafxapplication1;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

//ATM
public class cardNumber{
    
    GridPane grid = new GridPane();
    Scene scene= new Scene(grid,600,400); 
    Balance ATM = new Balance();
    double amount;
    String num;
    Stage stage;
    choice choice;
    


    public cardNumber(Stage primaryStage) {
        this.stage=primaryStage;
    }
    
     public void cardCheck(Stage s){
        Label card = new Label ("Card Number: ");
        Label checkn = new Label();
        Button submit = new Button("Enter");
        TextField txt=new TextField();
        grid.add(card,1, 1);
        grid.add(txt,1,2);
        grid.add(checkn,1,3);
        grid.add(submit, 1, 4);
        submit.setOnAction(new EventHandler<ActionEvent>(){  
            @Override
            public void handle(ActionEvent event) {
             num = txt.getText();
              boolean p=ATM.checkNumber(num);
        if (p){
            checkn.setText("Correct Password, Welcome!"); 
            stage.setScene(choice.getScene());
            
        }
        else {checkn.setText("Incorrect Password, Enter Again!");
            }
        }
        });
        
        
      
    }
    public Scene getScene(){
        return (this.scene);
        
    }

    
     public void setChoice(choice choice){
        this.choice=choice;
    }

}
