package calculator_java;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

	public abstract class Enginee implements ActionListener {
	   /** Marco principal, paneles y botones */
		private JFrame frame;
	    private JPanel contentPanel;
	    private JPanel displayPanel;
	    private JPanel buttonPanel;
	    private JTextField display;
	   	private JButton n0, n1, n2, n3, n4, n5, n6, n7, n8, n9;
	    private JButton division, multi, resta, suma, igual, reset;
	    private int num1;
	    private int num2;
	    private int result;
	    private char operation;
	    
	    /**
	     * Constructor que inicializa los componentes de la calculadora.
	     */
	    public Enginee() {
	        frame = new JFrame("Calculadora");
	        contentPanel = new JPanel(new BorderLayout());
	        displayPanel = new JPanel();
	        buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
	        display = new JTextField();
	        n0 = new JButton("0");
	        n1 = new JButton("1");
	        n2 = new JButton("2");
	        n3 = new JButton("3");
	        n4 = new JButton("4");
	        n5 = new JButton("5");
	        n6 = new JButton("6");
	        n7 = new JButton("7");
	        n8 = new JButton("8");
	        n9 = new JButton("9");
	        division = new JButton("/");
	        multi = new JButton("*");
	        resta = new JButton("-");
	        suma = new JButton("+");
	        igual = new JButton("=");
	        reset = new JButton("R");
	    }
	}
