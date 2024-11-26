package main.usc.musicCollection.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    JButton addArtistsButton, addSongsButton, newListButton;

    public MyPanel() {
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(123, 50, 250));

        newListButton = new JButton("Nueva playlist");
        newListButton.setFocusable(false);
        newListButton.addActionListener(this);

        addArtistsButton = new JButton("Añadir artista");
        addArtistsButton.setFocusable(false);
        addArtistsButton.addActionListener(this);

        addSongsButton = new JButton("Añadir cancion");
        addSongsButton.setFocusable(false);
        addSongsButton.addActionListener(this);


        JPanel listsPanel = new JPanel();
        listsPanel.setPreferredSize(new Dimension(345, 100));
        listsPanel.add(new Labels("Playlists"));
        listsPanel.add(newListButton);
        this.add(listsPanel, BorderLayout.WEST);

        JPanel eastPanel = new JPanel();
        eastPanel.setLayout(new GridLayout(2, 1, 5, 5));
        eastPanel.setBackground(new Color(123, 50, 250));
        eastPanel.setPreferredSize(new Dimension(535, 100));

        JPanel artistsPanel = new JPanel();
        artistsPanel.add(new Labels("Artistas"));
        artistsPanel.add(addArtistsButton);

        JPanel songsPanel = new JPanel();
        songsPanel.add(new Labels("Canciones"));
        songsPanel.add(addSongsButton);

        eastPanel.add(artistsPanel);
        eastPanel.add(songsPanel);
        this.add(eastPanel, BorderLayout.EAST);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == newListButton) {
            JOptionPane.showMessageDialog(this, "Una nueva lista ha sido creada");
        }

        else if(e.getSource() == addArtistsButton) {
            JOptionPane.showMessageDialog(this, "Se ha añadido un nuevo artista");
        }

        else if(e.getSource() == addSongsButton) {
            JOptionPane.showMessageDialog(this, "Se ha añadido una nueva cancion");
        }
    }
}
