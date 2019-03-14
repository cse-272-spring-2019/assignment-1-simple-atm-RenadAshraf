package javafxapplication1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

//homepage
public class choice {
    
    
    char check;
     GridPane grid = new GridPane();
    Scene scene= new Scene(grid,600,400); 
    Balance ATM = new Balance();
      Stage stage;
      enterAmount enterAmount;
      double amount;
String history;

    public choice(Stage primaryStage) {
        this.stage = primaryStage;
    }

    
    public void choose(){
        
                 Label balance = new Label();
                 Label result = new Label();
                 Label his = new Label();


    
    Button balanceb = new Button("Balance Inquiry");
       balanceb.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                double b = ATM.getCurrentBalance();
               balance.setText("Current Balance is "+b);

            }
       });
       
        Label welcomel = new Label("Welcome, Choose what you want to do!");
        Button depositb = new Button ("Make a Deposit");
        depositb.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                check='d';
                enterAmount.enter(check);
                stage.setScene(enterAmount.getScene());
                ATM.Deposit(amount);
                result.setText("Deposit Success");
            
            }});
        
        
        Label result2=new Label();
        Button withdrawb = new Button ("Withdraw");
        withdrawb.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                check='w';
                enterAmount.enter(check);
                stage.setScene(enterAmount.getScene());
               
                boolean r=ATM.Withdraw(amount);
                if (r)
                {result.setText("Withdraw Succeful");}
                else
                {result2.setText("Withdraw Failed, not enough Balance");}
            
            }});
        
        
        
        Button prevb = new Button ("Previous");
        
            prevb.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                his.setText(ATM.prev());
            
            }});
        
        
        Button nextb = new Button ("Next");
          nextb.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                his.setText(ATM.next());
            
            }});
        
        
        
        grid.add(welcomel,0,0);
        grid.add(balanceb,5,5);
        grid.add(balance, 0, 6);
        grid.add(withdrawb,0,7);
        grid.add(depositb,0,9);
        grid.add(prevb,0,15);
        grid.add(nextb,0,16);
        grid.add(result,0,17);
        grid.add(result2,0,18);
        grid.add(his,0,19);
             
}
    
    public Scene getScene(){
        return (this.scene);
    }
    
    
    public void setAmount(enterAmount enterAmount){
        this.enterAmount=enterAmount;
    }
    
    
}
