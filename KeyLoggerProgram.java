import javax.swing.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

public class KeyLoggerProgram extends JFrame implements KeyListener {

    JTextArea textArea;

    public KeyLoggerProgram() {
        setTitle("Key Logger Demo");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        add(textArea);

        textArea.addKeyListener(this);
        setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        try {
            FileWriter fw = new FileWriter("keystrokes.txt", true);
            fw.write(c);
            fw.close();
        } catch(IOException ex) {
            System.out.println(ex);
        }
    }

    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new KeyLoggerProgram();
    }
}
