package javafx;

import javafx.scene.text.Text;

import javafx.scene.control.TextField;

public class DemoController {
    public Text errmsg;
    public Text result;
    public TextField fullName;
    public TextField unit;
    public TextField price;
    public TextField amount;

    public void submit(){
//        String s = "\n---------";
//        s+= "\n"+ fullName.getText();
//        s+= "\n"+email.getText();
//        s+= "\n"+age.getText();
    try{
        Product p = new Product(fullName.getText(), unit.getText(),Integer.parseInt(price.getText()), Integer.parseInt(amount.getText()));
        result.setText(result.getText()+ p.toString());
        fullName.setText("");
        unit.setText("");
        price.setText("");
        amount.setText("");
        errmsg.setVisible(false);
    }catch (Exception e){
        errmsg.setText(e.getMessage());
        errmsg.setVisible(true);
        }
    }
}
