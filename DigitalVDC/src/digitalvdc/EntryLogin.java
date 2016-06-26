package digitalvdc;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;
import java.awt.event.*;

public class EntryLogin extends JFrame implements ActionListener{
    JLabel vdcName,vdcAddress;
    JButton btnSec,btnStaff;
    
    public EntryLogin(){
        setLayout(null);
        vdcName = new JLabel("la/]Gb|gu/ uf¤p lasf; ;ldtL");
        vdcAddress = new JLabel("la/]Gb|gu/, lrtjg");
        
        btnSec = new JButton("सचिबको लागि लग इन ");
        btnStaff = new JButton("अन्य कर्मचारीको लागि लग इन ");
        
        add(vdcName);vdcName.setBounds(350,40,600,50);
        vdcName.setForeground(Color.red);
        vdcName.setFont(new Font("HIMALAYA TT FONT", Font.BOLD, 30));
        
        add(vdcAddress);vdcAddress.setBounds(490,95,570,30);
        vdcAddress.setFont(new Font("HIMALAYA TT FONT", Font.BOLD, 20));
        
        add(btnSec);btnSec.setBounds(280,180,400,200);
        btnSec.addActionListener(this);
        add(btnStaff);btnStaff.setBounds(780,180,400,200);
        btnStaff.addActionListener(this);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setSize(1360,730);
        setTitle("Main Login Page");
    }
    
    public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnSec){
                    new LoginSec();
                }
                else if(ae.getSource()==btnStaff){
                    new LoginOther();
                }
                
	}
    
    
}
