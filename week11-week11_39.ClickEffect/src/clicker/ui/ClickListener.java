/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author dev
 */
public class ClickListener implements ActionListener {
    
    private Calculator calculator;
    private JLabel text;
    
    public ClickListener(Calculator calculator,  JLabel text){
        this.calculator = calculator;
        this.text = text;
    }
    
    
    
    @Override
    public  void actionPerformed(ActionEvent ae){
     calculator.increase();
     
     Integer value = calculator.giveValue();
     String calcValue = value.toString();
     //or int value = calculator.giveValue();
     //String calcValue = String.valueOf(value);
      
     text.setText(calcValue);
     
    
     
    
    }
    
}
