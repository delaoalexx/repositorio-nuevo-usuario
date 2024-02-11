package logIn;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class main 
{

	public static void main(String[] args) 
	{
		MyFrame frame =new MyFrame();
		frame.setVisible(true); //para que se abra la ventana
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //detener programa al cerrar la ventana
	}
	
}

class MyFrame extends JFrame
{
	public MyFrame()
	{
		Toolkit toolkit = getToolkit().getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		
		int screenWidth = screenSize.width; //variables que son el tamanio de la ventana
		int screenHeight = screenSize.height;
		int positionWidth = screenWidth/2;
		int positionHeight = screenHeight/2;
		
		
		setBounds(200, 200, 500, 580);
		setTitle("Login"); //Titulo del programa
		setResizable(true); //maximizar, minimizar
		setLocationRelativeTo(null);
		
		JLabel labelNuevoUsuario = new JLabel("NEW USER");
		labelNuevoUsuario.setFont(new Font ("Arial", Font.BOLD,25));
		labelNuevoUsuario.setBounds(180,70,150,25);
		add(labelNuevoUsuario);
		
		JLabel labelUser = new JLabel("User:");
		labelUser.setFont(new Font ("Arial", Font.BOLD,15));
		labelUser.setBounds(180,120,150,25);
		add(labelUser);
		
		JTextField textFieldUser= new JTextField();
		textFieldUser.setFont(new Font ("Arial", Font.PLAIN,15));
		textFieldUser.setBounds(180,145,150,25);
		add(textFieldUser);
		
		JLabel labelEmail = new JLabel("Email:");
		labelEmail.setFont(new Font ("Arial", Font.BOLD,15));
		labelEmail.setBounds(180,195,150,25);
		add(labelEmail);
		
		JTextField textFieldEmail= new JTextField();
		textFieldEmail.setFont(new Font ("Arial", Font.PLAIN,15));
		textFieldEmail.setBounds(180,225,150,25);
		add(textFieldEmail);
		
		JLabel labelPassword = new JLabel("Password:");
		labelPassword.setFont(new Font ("Arial", Font.BOLD,15));
		labelPassword.setBounds(180,275,150,25);
		add(labelPassword);
		
		JPasswordField password = new JPasswordField();
		password.setFont(new Font ("Arial", Font.PLAIN,15));
		password.setBounds(180,300,150,25);
		add(password);
		
		JCheckBox check = new JCheckBox("I accept terms & conditions", false);
		check.setFont(new Font ("Arial", Font.PLAIN,15));
		check.setBounds(160,350,300,25);
		add(check);
		
		setLayout(null);
		JButton buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setBounds(125,400,100,45);
		add(buttonCancelar);
		
		setLayout(null);
		JButton buttonAceptar = new JButton("Aceptar");
		buttonAceptar.setBounds(265,400,100,45);
		add(buttonAceptar);
		
	}
}
