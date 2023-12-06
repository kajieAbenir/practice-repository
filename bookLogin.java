public class bookLogin {
	public static void frame(JFrame frame){
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void addButton(JFrame frame, JButton button, int x int y, int width, int height){
		button.setBounds(x,y,width,height);
		frame.add(button);
	}	
	
	public static void addLabel(JFrame frame, JButton button, int x int y, int width, int height){
		label.setBounds(x,y,width,height);
		frame.add(label);
	}
}
