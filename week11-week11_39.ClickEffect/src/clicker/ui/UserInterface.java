package clicker.ui;


import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calculator;
    
    public UserInterface(PersonalCalculator calculator){
        this.calculator = calculator;
    }


    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new BorderLayout());
        JLabel calc = new JLabel();
        calc.setText("" + calculator.giveValue());
        JButton click = new JButton(("Click!"));
        
        
       ClickListener listener = new ClickListener(calculator, calc);
       click.addActionListener(listener);
        
        container.add(calc, BorderLayout.NORTH);
        container.add(click, BorderLayout.SOUTH);
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
