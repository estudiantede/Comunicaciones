package comunicaciones;

//Se agregan las importanciones
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.BorderLayout;

//Clase
class login
{
	//Atributos
	JFrame frame;
	JLabel labelTitulo;
	JPanel panelInput;
	JTextArea textUser;
	JPasswordField textPassword;
	JButton botonSubmit;
	//Constructor
	public login()
	{
		//Se crea el frame
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setLayout(new BorderLayout());
		
		//Se crea el titulo y se lo agrega a la parte de arriba del frame
		labelTitulo = new JLabel("Sing in");
		frame.add(labelTitulo, BorderLayout.NORTH);
		
		//Se agregan los campos a introducir
		panelInput = new JPanel();
		
		textUser = new JTextArea(1, 10);
		textPassword = new JPasswordField(10);
		botonSubmit = new JButton("Ingresar");

		panelInput.add(textUser);
		panelInput.add(textPassword);
		panelInput.add(botonSubmit);
		
		frame.add(panelInput, BorderLayout.CENTER);
		frame.setVisible(true);
		
		//HACER QUE ESTA PAGINA USA GRID BAG LAYOUT
	}
}