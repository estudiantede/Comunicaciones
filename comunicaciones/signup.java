package comunicaciones;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Dimension;

//Importaciones


//Clase
class signup
{
	JFrame frame;
	JLabel labelTitulo;
	JPanel panelInput;

	JTextField input[] = new JTextField[6];
	JPasswordField password[] = new JPasswordField[2];

	String usos[] = {"Nombre", "Apellido", "User", "Curso", "Division", "Year"};
	public signup()
	{
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 300);
		frame.setLayout(new BorderLayout());
		frame.setMinimumSize(new Dimension(500, 400));

		//Se crea el titulo y se agrega
		labelTitulo = new JLabel("Sign up");
		frame.add(labelTitulo, BorderLayout.NORTH);

		//Se crea el panel del input
		panelInput = new JPanel();
		panelInput.setLayout(new GridLayout(8, 1));

		//Se agregan las instrucciones 
		for(int i = 0; i < input.length; i++)
		{
			input[i] = new JTextField();
			panelInput.add(input[i]);
		}

		//Se agrega la contrasena
		for(int i = 0; i < password.length; i++)
		{
			password[i] = new JPasswordField();
			panelInput.add(password[i]);
		}


		//Se agrega el panel al frame
		frame.add(panelInput, BorderLayout.CENTER);
		frame.setVisible(true);
	}
}