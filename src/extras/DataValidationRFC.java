package extras;

import javax.swing.JOptionPane;

public class DataValidationRFC {
    public String validationString(String value){
        String result;
        try{
            result = String.valueOf(value);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Error");
            result = "";
        }
        return result;
    }
}
