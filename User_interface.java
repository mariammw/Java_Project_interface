import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class User_interface extends JFrame implements ActionListener{
	Container c;
	private JPanel panel;
	private JTextField txtName;
	private JPasswordField passwordField;
	private JButton btnLogin = new JButton("LOGIN");
	private JLabel lblWelcome = new JLabel("Welcome");
	private JLabel lblPassword = new JLabel("Password:");
	private JLabel lblNewLabel_1 = new JLabel("User Name:");
	String avName[] = {"Mary","Mosa","Ali","Saher","Soha","ansam"};
	String avPass[] = {"waer123","werg432","fgd213","$@#$GD","1313","93424SR@#$"};
	HashMap<String, String>Pass;
	
	public User_interface(){
		super("User_Interface");
		Pass = new HashMap<String,String>();
		for(int i = 0 ; i < avName.length ; i++){
			Pass.put(avName[i], avPass[i]);
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 834, 490);
		c = getContentPane();
		c.setBackground(new Color(255, 228, 225));
		setLayout(null);
		panel = new JPanel();
		panel.setBounds(395, 0, 430, 477);
		panel.setBackground(new Color(255, 204, 204));
		// 
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblNewLabel.setBounds(0, 0, 405, 477);
		lblNewLabel.setIcon(new ImageIcon(User_interface.class.getResource("sky.png")));
		c.add(lblNewLabel);
		
		
		panel.setBounds(399, 0, 419, 461);
		panel.setBackground(new Color(51, 51, 51));
		c.add(panel);
		panel.setLayout(null);
		
		
		lblNewLabel_1.setForeground(new Color(0, 153, 153));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 115, 122, 64);
		panel.add(lblNewLabel_1);
		
		
		lblPassword.setForeground(new Color(0, 153, 153));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBackground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblPassword.setBounds(10, 190, 122, 64);
		panel.add(lblPassword);
		
		txtName = new JTextField();
		txtName.setForeground(new Color(0, 51, 102));
		txtName.setText("name");
		txtName.setBounds(138, 120, 271, 47);
		txtName.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		panel.add(txtName);
		txtName.setColumns(10);
		
		passwordField = new JPasswordField("enter here");
		passwordField.setBounds(138, 199, 271, 47);
		passwordField.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		panel.add(passwordField);
		
		
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(102, 102, 153));
		btnLogin.setFont(new Font("Sylfaen", Font.PLAIN, 24));
		btnLogin.setBounds(93, 296, 263, 71);
		btnLogin.addActionListener(this);
		panel.add(btnLogin);
		
		
		lblWelcome.setForeground(new Color(0, 153, 153));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Sylfaen", Font.BOLD, 24));
		lblWelcome.setBounds(81, 38, 251, 47);
		panel.add(lblWelcome);
		c.add(panel);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == btnLogin){
			String str = txtName.getText();
			String str2 =String.valueOf( passwordField.getPassword());
			if(!Pass.containsKey(str)){
				JOptionPane.showMessageDialog(null, "There is no User name","Error", JOptionPane.WARNING_MESSAGE);
			}
			else if(!Pass.get(str).equals(str2)){
				JOptionPane.showMessageDialog(null, "Password wrong try again ","Password Error", JOptionPane.WARNING_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(null, "Welcome  "+str,"welcome ", JOptionPane.PLAIN_MESSAGE);
				c.setVisible(false);
				this.setVisible(false);
			}
			
		}
	}
	public static void main(String arg[]){
		new User_interface();
	}
}
