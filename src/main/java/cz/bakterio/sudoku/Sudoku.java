package cz.bakterio.sudoku;

import javax.swing.*;

public class Sudoku {
    public static final JFrame frame = new JFrame("Sudoku solver");
    public static final JWindow window = new JWindow(frame);

    public static void main(String[] args) {
        frame.setSize(720, 720);
        frame.setLayout(null);
        frame.setVisible(true);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Box box = new Box(100 * i + j);
                box.setValue(j);
                frame.add(box);
            }
        }
    }
}
