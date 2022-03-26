import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

	int countClick = 0;

	JFrame frame;
	JButton button;
	JLabel label;
	JPanel panel;

	public GUI() {
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton();
		label = new JLabel();

		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		panel.setSize(800, 600);

		button.setText("Click to get your OS name.");
		button.addActionListener(this);

		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("¡Example GUI!");
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) { new GUI(); }

	@Override
	public void actionPerformed(ActionEvent e) {
		countClick++;

		label.setText(System.getProperty("os.name") + " - " + System.getProperty("os.version") + " ; " + countClick);
	}
}
