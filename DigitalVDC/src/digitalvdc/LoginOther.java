
package digvdc;

import javax.swing.*;
import java.awt.event.*;

public class LoginOther extends JFrame
{
	JLabel lbluser,lblpass;
	JTextField txtuser;
	JPasswordField txtpass;
	JButton btnlogin;
	
	public LoginOther()
	{
		setLayout(null);
		lbluser = new JLabel("Username");
		lblpass = new JLabel("Password");
		txtuser = new JTextField();
		txtpass = new JPasswordField();
		btnlogin = new JButton("Login");
		
		add(lbluser); lbluser.setBounds(10,20,70,25);
		add(lblpass); lblpass.setBounds(10,50,70,25);
		add(txtuser); txtuser.setBounds(90,20,100,25);
		add(txtpass); txtpass.setBounds(90,50,100,25);
		
		add(btnlogin); btnlogin.setBounds(135,80,70,25);
		//btnlogin.addActionListener(this);
                setLocation(780,200);
                
		setResizable(false);
		setVisible(true);
		setSize(400,200);
		setTitle("अन्य कर्मचारीका लागी लगिन फारम");
		
	}
	/*
	public void actionPerformed(ActionEvent ae)
	{
		String uname = "alex";
		String pwd = "alex123";
		
		String uname1 = txtuser.getText();
		String pwd1 = txtpass.getText();
		
		if(uname.equals(uname1) && pwd.equals(pwd1))
		{
			new MainMenu();
			this.setVisible(false);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Fail");
		}
		
	}
	*/
}