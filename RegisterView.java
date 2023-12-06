package oop.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegisterView implements ActionListener{

  Components addComponents = new Components();
  
  RegisterView(){

    static JPanel registerPanel = new JPanel();
    addComponents.addPanel(mainFrame, registerPanel, 0, 0, 400, 1200);
    mainFrame.add(registerPanel);

    JLabel firstTimeLabel = new JLabel("FIRST TIME?");
    addComponents.addLabel(registerPanel, firstTimeLabel, 185, 50, 150, 60);
    registerPanel.add(firstTimeLabel);

    JLabel fullNameLabel = new JLabel("FULL NAME");
    addComponents.addLabel(registerPanel, fullNameLabel, 40, 130, 100, 30);
    registerPanel.add(fullNameLabel);
    
    JTextField fullNameTextField = new JTextField();
    addComponents.addTextField(registerPanel, fullNameTextField, 40,  180, 300, 40);
    registerPanel.add(fullNameTextField);

    JLabel emailAddressLabel = new JLabel("E-MAIL ADDRESS");
    addComponents.addLabel(registerPanel, emailAddressLabel, 40, 250, 200, 30);
    registerPanel.add(emailAddressLabel);

    JTextField emailAddressTextField = new JLabel();
    addComponents.addTextField(registerPanel, emailAddressTextField, 40, 300, 300, 40);
    registerPanel.add(emailAddressTextField);

    JLabel passwordLabel = new JLabel("PASSWORD");
    addComponents.addLabel(registerPanel, passwordLabel, 40, 370, 200, 30);
    registerPanel.add(passwordLabel);

    JTextField passwordTextField = new JLabel();
    addComponents.addTextField(registerPanel, passwordTextField, 40, 420, 300, 40);
    registerPanel.add(passwordTextField);

    JButton registerButton - new JButton();
    addComponents.addButton(registerPanel, registerButton, 40, 490, 300, 40);
    registerButton.addActionListener(this);
    registerPanel.add(registerButton);
  
    
  }

}
