/*
 * Tetris.java
 *
 * @author : Jan Bodnar
 * http://zetcode.com/gfx/java2d/tetris/
 *
 * Changelog :
 * - ditambahin speed tiap skor yang didapat 
 * - diberi border dan dipercantik labelnya
 * - 
 */

package tetris;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;


public class Tetris extends JFrame {

    JLabel statusbar, dlabel;


    public Tetris() { 
        Border loweredbevel = BorderFactory.createLoweredBevelBorder();
        statusbar = new JLabel(" 0",SwingConstants.CENTER);
        statusbar.setBorder(loweredbevel);
        
        add(statusbar, BorderLayout.SOUTH);
        Board board = new Board(this);
        
        add(board);
        board.start();

        setSize(300, 600);
        setTitle("Tetris");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

   public JLabel getStatusBar() {
       return statusbar;
   }

    public static void main(String[] args) {

        Tetris game = new Tetris();
        game.setLocationRelativeTo(null);
        game.setVisible(true);

    } 
}