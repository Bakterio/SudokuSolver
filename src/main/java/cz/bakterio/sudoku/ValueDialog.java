package cz.bakterio.sudoku;

import javax.swing.*;

public class ValueDialog {
    private Box box;

    public ValueDialog(final Box box) {
        this.box = box;

        final JFrame frame = new JFrame("Change value");
        frame.setAlwaysOnTop(true);
        frame.setVisible(true);
        frame.setSize(240, 80);
    }
}
