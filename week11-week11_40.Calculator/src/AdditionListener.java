
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dev
 */
public class AdditionListener implements ActionListener {
    
   private JTextField input;
   private JTextField output;
   private JButton reset;

    
    public AdditionListener(JTextField input, JTextField output, JButton reset) {
        this.input = input;
        this.output = output;
        this.reset = reset;

    }
    
    
  

    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
            int inputNum = Integer.parseInt(input.getText());
            int outputNum = Integer.parseInt(output.getText()) + inputNum;
            output.setText("" + outputNum);
            input.setText("");
            outputNum = Integer.parseInt(output.getText());
            if(outputNum == 0){
                reset.setEnabled(false);
                
            }else{
                reset.setEnabled(true);
            }
        }catch(Exception e){
            input.setText("");
        }

    }

}
