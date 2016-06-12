
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
public class ResetListener implements ActionListener {

    private JTextField input;
    private JTextField output;
    private JButton reset;

    public ResetListener(JTextField input, JTextField output, JButton reset) {
        this.input = input;
        this.output = output;
        this.reset = reset;

    }

    @Override

    public void actionPerformed(ActionEvent ae) {
        input.setText("");
        output.setText("0");
        reset.setEnabled(false);

    }

}

    

