package cz.bakterio.sudoku;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Box extends JButton {
    private static int row = 1;
    private static int column = 1;
    private int size = 50;
    public Box() {
        if (row == 10) {
            row = 1;
            column++;
        }

        this.setBounds(this.size * row, column * this.size, this.size, this.size);
        this.setBackground(Color.BLUE);
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                if (mouseEvent.getButton() == 1) {
                    mouseEvent.getComponent().setBackground(Color.YELLOW);
                } else {
                    mouseEvent.getComponent().setBackground(Color.BLUE);
                }
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });
        row++;
    }

    public void setValue(int value) {
        this.setText(String.valueOf(value));
    }
}
