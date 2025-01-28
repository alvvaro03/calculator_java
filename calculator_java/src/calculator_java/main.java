package calculator_java;

import javax.swing.SwingUtilities;

public class main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
		    try {
		        new Enginee();
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		});

	}

}
