package Code;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Aplication extends JFrame implements ActionListener
{	
	private JTextField texto = new JTextField();
	private JTextField texto2 = new JTextField();
	private JButton boton = new JButton("Ingresar");
	private JButton boton2 = new JButton("UwU");
	private JButton botonBorrar = new JButton("Borrar");
	private JLabel label = new JLabel("Ingrese su binario: ");
	private JLabel label2 = new JLabel("Su decimal es: ");
	
	public Aplication() 
	{	
		setTitle("Binarios a Decimales");
		setSize(400, 200);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);

		add(label);
		label.setBounds(10, 0, 200, 50);
		add(texto);
		texto.setBounds(130, 17, 150, 20);
		add(boton);
		boton.setBounds(290, 13, 90, 30);
		boton.addActionListener(this);

		add(label2);
		label2.setBounds(10, 73, 150, 50);
		add(texto2);
		texto2.setBounds(130, 90, 150, 20);
		add(boton2);
		boton2.setBounds(290, 84, 90, 30);
		boton2.addActionListener(this);
		
		add(botonBorrar);
		botonBorrar.setBounds(297, 52, 75, 25);
		botonBorrar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent accion) 
	{
		if(accion.getSource() == boton)
		{
			String cadenaBinaria = texto.getText();
			
			double decimal = Integer.parseInt(cadenaBinaria,2);
			
			texto2.setText(Double.toString(decimal));
		}

		if(accion.getSource() == boton2)
		{
			JOptionPane.showMessageDialog(null, " ===[Que guanabana]=== ");
		}
		
		if(accion.getSource() == botonBorrar)
		{
			texto.setText("");
			texto2.setText("");
		}
	}
	
	public static void main(String[] args) 
	{
		Aplication window = new Aplication();
		window.setVisible(true);
	}
}