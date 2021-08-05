
import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame{
	
	public MainWindow() {
		
		Dimension size=Toolkit.getDefaultToolkit().getScreenSize();
		int h=size.height;
		int w=size.width;
		
		setBounds((w/2)-(720/2), (h/2)-(480/2), 720, 480);
		setTitle("Math Equations");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
	}

}
