
package javafxapplication1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class enterAmount {
    
          Stage stage;
          GridPane grid = new GridPane();
    Scene scene= new Scene(grid,600,400); 
    Balance ATM = new Balance();
    double amountindouble;
    choice choice;    
    String s;
    

    public enterAmount(Stage primaryStage) {
        this.stage = primaryStage;
       
    }
    
    public void enter(char check){
        
        TextField amount=new TextField();
        grid.add(amount,15,15);
        
        Button one = new Button("1");
        one.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
            s=amount.getText();
            amount.setText(s+"1");

            }});
       grid.add(one,10,10);
       
       Button two = new Button("2");
       two.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                s=amount.getText();
            amount.setText(s+"2");
           
            }});
       grid.add(two,11,10);
       
       Button three = new Button("3");
       three.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
           s=amount.getText();
            amount.setText(s+"3");

            }});
       grid.add(three,12,10);
       
       Button four = new Button("4");
       four.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                s=amount.getText();
                
            amount.setText(s+"4");
            

            }});
       grid.add(four,10,11);
       
       Button five = new Button("5");
       five.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
            s=amount.getText();
            amount.setText(s+"5");

            }});
       grid.add(five,11,11);
       
       Button six = new Button("6");
       six.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
            s=amount.getText();
            amount.setText(s+"6");

            }});
       grid.add(six,12,11);
       
       Button seven = new Button("7");
       seven.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
                s=amount.getText();
            amount.setText(s+"7");
            

            }});
       
       grid.add(seven,10,12);
       
       
       Button eight = new Button("8");
       eight.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
            s=amount.getText();
            amount.setText(s+"8");
            
            }});
       grid.add(eight,11,12);
       
       Button nine = new Button("9");
       nine.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
            s=amount.getText();
            amount.setText(s+"9");

            }});
       grid.add(nine,12,12);
       
       Button zero = new Button("0");
       zero.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
            
            s=amount.getText();
            amount.setText(s+"0");

            }});
       grid.add(zero,11,13);
        
     Button dot = new Button(".");
       dot.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
            s=amount.getText();
            amount.setText(s+".");

            }});
       grid.add(dot,12,13);
       
       
       Button submit = new Button("Enter");
       grid.add(submit,15,16);
       
     submit.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            
            String samount=amount.getText();
            Double amountindouble = Double.parseDouble(samount);
           if (check=='d')
           {choice.ATM.Deposit(amountindouble);}
           if (check=='w')
           {
              choice.ATM.Withdraw(amountindouble);
               
               
           }
           stage.setScene(choice.getScene());
       
            }});
    }
    
    
    
     public Scene getScene(){
        return (this.scene);
    }

     public void setChoice(choice choice){
        this.choice=choice;
    }
         
         
}
