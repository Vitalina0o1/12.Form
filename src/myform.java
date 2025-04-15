import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class myform extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField text2;
	private JTextField text5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myform frame = new myform();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public myform() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(0, 0, 29, 21);
		contentPane.add(comboBox);
		
		JLabel text1 = new JLabel("Введите имя");
		text1.setBounds(113, 12, 158, 31);
		text1.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 28));
		contentPane.add(text1);
		
		text2 = new JTextField();
		text2.setBounds(281, 10, 206, 35);
		text2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		contentPane.add(text2);
		
		JLabel text3 = new JLabel("...");
		text3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		JButton Button = new JButton();
		Button.setText("МЯУ");
		Button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String line = "Привет," + text2.getText();
				int a = Integer.parseInt(text5.getText());
				if(a < 7) line += ", тф уже пошёл в школу?";
				else if (a >= 7 && a < 14) line += ", учиться тяжело?";
				else if (a == 14) line += ", получил паспорт?";
				else if (a > 14) line += ", готовься у ЕГЭ!";
				text3.setText(line);
				
			}
		});
		Button.setBounds(257, 146, 135, 31);
		contentPane.add(Button);
		
		
		text3.setBounds(133, 198, 387, 47);
		contentPane.add(text3);
		
		JLabel text4 = new JLabel("Введите возраст");
		text4.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 28));
		text4.setBounds(85, 79, 186, 31);
		contentPane.add(text4);
		
		text5 = new JTextField();
		text5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		text5.setBounds(281, 77, 206, 35);
		contentPane.add(text5);
	}
}
