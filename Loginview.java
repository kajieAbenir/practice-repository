import javax.swing.*;
import java.awt.*;

class Loginview{
 	JFrame frame = new JFrame();
  	frame.setSize(500,500);
 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	frame.setLocationRelativeTo(null)
  	frame.setLayout(null);
  	frame.setVisible(true);

  	JPanel loginPanel = new JPanel();
  	loginPanel.setBackground(Color.gray);
	loginPanel.setOpaque(false);
	loginPanel.setBounds(0, 0, 500, 500);
	frame.add(loginPanel);


}

  	JLabel wellabel = new JLabel("WELCOME");
	wellabel.setBound(320, 50, 200, 50);
	loginPanel.add(wellabel);

	JLabel emaillabel = new JLabel("E-mail Address");
	emaillabel.setBounds(260, 130, 80, 20);
	loginPanel.add(emaillabel);

	JTextField emailfield = new JTextField();
	emailfield.setBounds(260, 160, 150, 40);
	loginPanel.add(emailfield);

	JLabel passlabel = new JLabel("Password");
	passlabel.setBounds(260, 210, 80, 20);
	loginPanel.add(passlabel);

	JTextField passfield = new JTextField();
	passfield.setBounds(260, 240, 150, 40);
	loginPanel.add(passfield);

	JButton logbut = new JButton("LOGIN");
	logbut.setBounds(260, 360, 150, 40);
	loginPanel.add(logbut);

	JButton regbut = new JButton("REGISTER");
	regbut.setBounds(260, 410, 150, 40);
	loginPanel.add(regbut);
	
  

}
