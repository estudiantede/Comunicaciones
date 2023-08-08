package comunicaciones;

//Se agregan las importanciones
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Cursor;
//Clase
class frame
{
	//Atributos
	JFrame fram;
	JLabel labelTitulo;
	JPanel panelBottom;
	JPanel panelBottomDivide;
	JPanel panelCenter;
	JPanel panelcentroIzquierda;
	JPanel panelcentroDerecha;

	JLabel labelTrucha;
	//Notas
	JLabel labelNotasTitulo;
	JTextArea labelNotas;
	JScrollPane scrollPanel;

	//Calificaciones


	//Salidas

	//Botones abajo
	JButton botonesAbajo[] = new JButton[4];
	JButton botonesMedio[] = new JButton[3];
	//Miscelanio
	Font fuentes[] = {new Font("Sylfaen",Font.BOLD, 40), new Font("Corbel", Font.PLAIN, 20)};
	Color colores[] = {new Color(51, 29, 44), new Color(137, 96, 163), new Color(63, 46, 62), new Color(192, 90, 147), new Color(57, 54, 70), new Color(253, 157, 218), new Color(64, 66, 88), new Color(173, 181, 218)};
	//Constructor
	public frame()
	{
		//Se crea el frame
		fram = new JFrame();
		fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fram.setSize(600, 300);
		fram.setLayout(new BorderLayout());
		fram.setMinimumSize(new Dimension(500, 400));

		//Se crea el titulo
		
		labelTitulo = new JLabel("Cuaderno");
		labelTitulo.setFont(fuentes[0]);
		labelTitulo.setHorizontalAlignment(JLabel.CENTER);
		labelTitulo.setVerticalAlignment(JLabel.BOTTOM);
		labelTitulo.setPreferredSize(new Dimension(0, 80));
		labelTitulo.setBackground(colores[0]);
		labelTitulo.setForeground(colores[1]);
		labelTitulo.setOpaque(true);
		//Agrega la linea de abajo del label
		labelTitulo.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
		//Se crean los panales del medio y abajo
		panelBottom = new JPanel();
		panelCenter = new JPanel();
		panelBottomDivide = new JPanel();
		panelBottomDivide.setLayout(new BorderLayout());

		JPanel labelAdd = new JPanel();
		panelBottomDivide = new JPanel();
		panelBottomDivide.setLayout(new BorderLayout());
		labelAdd.setPreferredSize(new Dimension(100, 0));
		labelAdd.setBackground(colores[0]);
		panelBottomDivide.add(labelAdd, BorderLayout.WEST);
		panelBottomDivide.add(panelBottom, BorderLayout.CENTER);
		panelBottom.setLayout(new GridLayout(1, 7));
		panelCenter.setLayout(new BorderLayout());
		
		panelBottom.setBackground(colores[0]);
		panelBottom.setBorder(new MatteBorder(1, 0, 0, 0, Color.BLACK));
		//Se crean los paneles del medi
		panelcentroDerecha = new JPanel();
		panelcentroDerecha.setLayout(new BorderLayout());

		panelcentroIzquierda = new JPanel();
		panelcentroIzquierda.setPreferredSize(new Dimension(100, 0));
		panelcentroIzquierda.setLayout(new GridLayout(7, 1, 10, 10));
		panelcentroIzquierda.setBackground(colores[0]);
		panelcentroIzquierda.setBorder(new MatteBorder(0, 0, 0, 1, Color.BLACK));
		//Se agregan los paneles del medio
		panelCenter.add(panelcentroIzquierda, BorderLayout.WEST);
		panelCenter.add(panelcentroDerecha, BorderLayout.CENTER);

		//Se agregan los botones del panel de abajo
		for(int i = 0, k = 0; i < botonesAbajo.length*2; i++)
		{
			if(i % 2 == 0)
			{
				botonesAbajo[k] = new JButton("Click");
				botonesAbajo[k].setFocusPainted(false);
				botonesAbajo[k].setBorder(null);
				botonesAbajo[k].setBackground(colores[2]);
				botonesAbajo[k].setForeground(colores[3]);
				botonesAbajo[k].setPreferredSize(new Dimension(80, 40));
				panelBottom.add(botonesAbajo[k]);
				k++;
			}
			else{
				panelBottom.add(new JLabel());
			}
			
			
			//Agregarle cambio de color al ser presionado a todos los botones

		}

		//Se agregan los botones del panel del medio izquierda
		for(int i = 0, k = 0; i < botonesMedio.length* 2; i++)
		{
			if(i %2 == 1)
			{
				botonesMedio[k] = new JButton("Click");
				botonesMedio[k].setFocusPainted(false);
				botonesMedio[k].setBorder(null);
				botonesMedio[k].setBackground(colores[2]);
				botonesMedio[k].setForeground(colores[3]);
				panelcentroIzquierda.add(botonesMedio[k]);
				k++;
			}else
			{
				panelcentroIzquierda.add(new JLabel());
			}
			
		}
		panelNota();
		/*/
		//Se agrega el titulo a la parte del titulo
		labelNotasTitulo = new JLabel("Notas");
		panelcentroDerecha.add(labelNotasTitulo, BorderLayout.NORTH);

		//Se agrega el scroll pane al panel del medio derecha
		labelNotas = new JLabel("Hola ");
		scrollPanel = new JScrollPane(labelNotas);
		scrollPanel.setBorder(null);
		panelcentroDerecha.add(scrollPanel, BorderLayout.CENTER);
		*/
		//Se agregan los paneles
		fram.add(labelTitulo, BorderLayout.NORTH);
		fram.add(panelBottomDivide, BorderLayout.SOUTH);
		fram.add(panelCenter, BorderLayout.CENTER);
		
		//Se muestra el frame
		fram.setVisible(true);
	}

	public void panelNota()
	{
		labelNotasTitulo = new JLabel();
		labelNotas = new JTextArea();

		labelNotasTitulo.setText("Notas");
		labelNotasTitulo.setFont(fuentes[1]);
		labelNotasTitulo.setBackground(colores[4]);
		labelNotasTitulo.setForeground(colores[5]);
		labelNotasTitulo.setOpaque(true);
		labelNotasTitulo.setHorizontalAlignment(JLabel.CENTER);
		labelNotasTitulo.setVerticalAlignment(JLabel.CENTER);

		panelcentroDerecha.add(labelNotasTitulo, BorderLayout.NORTH);

		labelNotas.setText("jkfadkjadsf \n Hola mundo");
		labelNotas.setForeground(Color.BLACK);
		labelNotas.setRequestFocusEnabled(false);
		labelNotas.setLineWrap(true);
		labelNotas.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		labelNotas.setBackground(colores[6]);
		labelNotas.setForeground(colores[7]);
		scrollPanel = new JScrollPane(labelNotas);
		scrollPanel.setBorder(null);
		panelcentroDerecha.add(scrollPanel, BorderLayout.CENTER);
	}

	public void panelCalif()
	{
		
	}

	public void panelSalidas()
	{
		
	}
}