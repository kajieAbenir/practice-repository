class RegisterView{
    static JFrame mainFrame = new JFrame();
  RegisterView(){
    
  }

  static void addFrame(){
      mainFrame.setSize(400, 500);
      mainFrame.setLocationRelativeTo(null);
      mainFrame.setDefaultCloseOperation(mainFrame_EXIT_ON_CLOSE);
      mainFrame.setLayout(null);
      mainFrame.setVisible(true);
  }

  static void addPanel(JFrame frame, JPanel panel, int xAxis, int yAxis, int width, int height){
      panel.setBounds(xAxis, yAxis, width, height);
  }

  //static void addLabel(
}
