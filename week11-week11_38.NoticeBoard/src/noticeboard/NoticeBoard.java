package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NoticeBoard implements Runnable{

    private JFrame frame;
    //private JTextField origin = new JTextField();
    //private JLabel destination = new JLabel();
   // private JButton copyButton;
    private JLabel textAreaBottom;
    
    

    public NoticeBoard() {
        
       

    }

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);

    }

    private void createComponents(Container container) {

        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextField textAreaTop = new JTextField();
        JButton copyButton = new JButton("Copy!");
        textAreaBottom = new JLabel();


        container.add(textAreaTop);
        container.add(copyButton);
        container.add(textAreaBottom);
        
        ActionEventListener copier = new ActionEventListener(textAreaTop, textAreaBottom);
        copyButton.addActionListener(copier);

    }

    
}
