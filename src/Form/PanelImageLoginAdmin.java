/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Andrew
 */
public class PanelImageLoginAdmin extends JPanel {
    Image gambar;
    public PanelImageLoginAdmin(){
        gambar = new ImageIcon(getClass().getResource("/Gambar/CS-logo3.png/")).getImage();
    }
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D gd=(Graphics2D)g.create();
        gd.drawImage(gambar,0,0,getWidth(),getHeight(),null);
        gd.dispose();
    }
}
