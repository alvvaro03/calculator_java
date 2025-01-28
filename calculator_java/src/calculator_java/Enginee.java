package calculator_java;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

	public class Enginee implements ActionListener {
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
	    /**
	     * Tipos de botones.
	     */
	    private enum ButtonType {
	        NUMEROS, SIGNOS
	    }
	    
	    /**
	     * Configura las características visuales de un botón.
	     *
	     * _button El botón a configurar.
	     * _type   El tipo del botón (NUMERO O SIGNO).
	     */
	    private void setFeaturesButton(JButton _button, ButtonType _type) {
	        _button.setFont(new Font("Arial", Font.BOLD, 18));
	        if (_type == ButtonType.NUMEROS) {
	            _button.setBackground(Color.CYAN);
	        } else {
	            _button.setBackground(Color.PINK);
	        }
	        _button.setFocusPainted(false);
	    }

		private void setSettings() {
			display.setFont(new Font("Arial", Font.BOLD, 24));
	        display.setHorizontalAlignment(JTextField.RIGHT);
	        display.setEditable(false);
	        displayPanel.setLayout(new BorderLayout());
	        displayPanel.add(display, BorderLayout.CENTER);
	        
	        setFeaturesButton(n0, ButtonType.NUMEROS);
	        setFeaturesButton(n1, ButtonType.NUMEROS);
	        setFeaturesButton(n2, ButtonType.NUMEROS);
	        setFeaturesButton(n3, ButtonType.NUMEROS);
	        setFeaturesButton(n4, ButtonType.NUMEROS);
	        setFeaturesButton(n5, ButtonType.NUMEROS);
	        setFeaturesButton(n6, ButtonType.NUMEROS);
	        setFeaturesButton(n7, ButtonType.NUMEROS);
	        setFeaturesButton(n8, ButtonType.NUMEROS);
	        setFeaturesButton(n9, ButtonType.NUMEROS);
	        setFeaturesButton(division, ButtonType.SIGNOS);
	        setFeaturesButton(multi, ButtonType.SIGNOS);
	        setFeaturesButton(resta, ButtonType.SIGNOS);
	        setFeaturesButton(suma, ButtonType.SIGNOS);
	        setFeaturesButton(igual, ButtonType.SIGNOS);
	        setFeaturesButton(reset, ButtonType.SIGNOS);
	        
	        buttonPanel.add(n7);
	        buttonPanel.add(n8);
	        buttonPanel.add(n9);
	        buttonPanel.add(division);
	        buttonPanel.add(n4);
	        buttonPanel.add(n5);
	        buttonPanel.add(n6);
	        buttonPanel.add(multi);
	        buttonPanel.add(n1);
	        buttonPanel.add(n2);
	        buttonPanel.add(n3);
	        buttonPanel.add(resta);
	        buttonPanel.add(n0);
	        buttonPanel.add(reset);
	        buttonPanel.add(igual);
	        buttonPanel.add(suma);
		}
	}
