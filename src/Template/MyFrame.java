package Template;

import javax.swing.*;
import java.awt.*;

/**
 * @author Shumao
 * @date 2019/3/2 14:42
 */
public class MyFrame extends JFrame {
    public MyFrame(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String msg = "I rule!";
        g.drawString(msg, 100, 100);
    }
}
