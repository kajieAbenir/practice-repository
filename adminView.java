package medicalRecords;

import java.awt.*;
import javax.swing.*;



public class adminView{

	public static void addButton(JFrame frame, JButton button, int x, int y, int width, int height, String fontStyle, int fontSize,){
		button.setBounds(x,y,width,height);
		button.setFont(new Font(fontStyle, Font.BOLD, fontSize));
		
	}
}


