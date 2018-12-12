package homework1.figures_task.figures;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormFigure {
    public static void main(String[] args) {
        JFrame win = new JFrame();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(400,500);
        JPanel panel = new JPanel();
        JButton button = new JButton("OK");
//        public void actionPerformed(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Graphics gr = panel.getGraphics();
//
//                for (int i = 0; i < poly.size(); i++) {
//
//                }
//            }
//
//        });
        panel.add(button);

        win.setContentPane(panel);
        win.setVisible(true);
    }
    }

