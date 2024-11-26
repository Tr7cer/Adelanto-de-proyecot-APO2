package main.usc.musicCollection.UI;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        this.setTitle("Spotifaye");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 700);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        MyPanel myPanel = new MyPanel();
        this.setContentPane(myPanel);

    }

}
