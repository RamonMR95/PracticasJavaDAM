package pruebasSwing;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PruebaSwing extends JFrame {
	public PruebaSwing() {
		super("Titulo de ventana");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		GridLayout gl = new GridLayout(4, 3);
		gl.setHgap(5);
		gl.setVgap(5);
		cp.setLayout(gl);
		for (int i = 1; i <= 9; i++) {
			cp.add(new JButton(String.valueOf(i)));
		}
		cp.add(new JButton("*"));
		cp.add(new JButton("0"));
		cp.add(new JButton("#"));

	}

	public static void main(String[] args) {
		PruebaSwing prueba = new PruebaSwing();
		prueba.setVisible(true);
	}
}
