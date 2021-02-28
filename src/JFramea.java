import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFramea extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JCheckBox chckbxNewCheckBox_3;
	private JCheckBox chckbxNewCheckBox_4;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JLabel lblNewLabel_1;
	private JButton btnA;
	private JButton btnB;
	private JButton btnC;
	private JButton btnA_1;
	private JButton btnA_2;
	private JButton btnA_4;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxaukera;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFramea frame = new JFramea();
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
	public JFramea() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getChckbxNewCheckBox_3());
		contentPane.add(getChckbxNewCheckBox_4());
		contentPane.add(getRdbtnNewRadioButton());
		contentPane.add(getRdbtnNewRadioButton_1());
		contentPane.add(getRdbtnNewRadioButton_2());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getBtnA());
		contentPane.add(getBtnB());
		contentPane.add(getBtnC());
		contentPane.add(getBtnA_1());
		contentPane.add(getBtnA_2());
		contentPane.add(getBtnA_4());
		contentPane.add(getChckbxNewCheckBox());
		contentPane.add(getChckbxaukera());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Gustuko duzu?");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel.setBounds(54, 230, 111, 33);
		}
		return lblNewLabel;
	}
	private JCheckBox getChckbxNewCheckBox_3() {
		if (chckbxNewCheckBox_3 == null) {
			chckbxNewCheckBox_3 = new JCheckBox("Bai");
			buttonGroup_1.add(chckbxNewCheckBox_3);
			chckbxNewCheckBox_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
			chckbxNewCheckBox_3.setBounds(171, 232, 53, 29);
		}
		return chckbxNewCheckBox_3;
	}
	private JCheckBox getChckbxNewCheckBox_4() {
		if (chckbxNewCheckBox_4 == null) {
			chckbxNewCheckBox_4 = new JCheckBox("Ez");
			buttonGroup_1.add(chckbxNewCheckBox_4);
			chckbxNewCheckBox_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
			chckbxNewCheckBox_4.setBounds(226, 232, 53, 29);
		}
		return chckbxNewCheckBox_4;
	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("A");
			buttonGroup_2.add(rdbtnNewRadioButton);
			rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
			rdbtnNewRadioButton.setBounds(6, 39, 103, 21);
		}
		return rdbtnNewRadioButton;
	}
	private JRadioButton getRdbtnNewRadioButton_1() {
		if (rdbtnNewRadioButton_1 == null) {
			rdbtnNewRadioButton_1 = new JRadioButton("B");
			buttonGroup_2.add(rdbtnNewRadioButton_1);
			rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			rdbtnNewRadioButton_1.setBounds(6, 88, 103, 21);
		}
		return rdbtnNewRadioButton_1;
	}
	private JRadioButton getRdbtnNewRadioButton_2() {
		if (rdbtnNewRadioButton_2 == null) {
			rdbtnNewRadioButton_2 = new JRadioButton("C");
			buttonGroup_2.add(rdbtnNewRadioButton_2);
			rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			rdbtnNewRadioButton_2.setBounds(6, 137, 103, 21);
		}
		return rdbtnNewRadioButton_2;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Botoi bat sakatu");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel_1.setBounds(119, 10, 132, 21);
		}
		return lblNewLabel_1;
	}
	private JButton getBtnA() {
		if (btnA == null) {
			btnA = new JButton("A1");
			btnA.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnA.setBounds(143, 49, 136, 42);
		}
		return btnA;
	}
	private JButton getBtnB() {
		if (btnB == null) {
			btnB = new JButton("B1");
			btnB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnB.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnB.setBounds(143, 101, 136, 42);
		}
		return btnB;
	}
	private JButton getBtnC() {
		if (btnC == null) {
			btnC = new JButton("C1");
			btnC.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnC.setBounds(143, 153, 136, 42);
		}
		return btnC;
	}
	private JButton getBtnA_1() {
		if (btnA_1 == null) {
			btnA_1 = new JButton("B2");
			btnA_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnA_1.setBounds(289, 101, 136, 42);
		}
		return btnA_1;
	}
	private JButton getBtnA_2() {
		if (btnA_2 == null) {
			btnA_2 = new JButton("C2");
			btnA_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnA_2.setBounds(289, 153, 136, 42);
		}
		return btnA_2;
	}
	private JButton getBtnA_4() {
		if (btnA_4 == null) {
			btnA_4 = new JButton("A2");
			btnA_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnA_4.setBounds(289, 49, 136, 42);
		}
		return btnA_4;
	}
	private JCheckBox getChckbxNewCheckBox() {
		if (chckbxNewCheckBox == null) {
			chckbxNewCheckBox = new JCheckBox("1.Aukera");
			chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
			chckbxNewCheckBox.setBounds(171, 201, 93, 21);
		}
		return chckbxNewCheckBox;
	}
	private JCheckBox getChckbxaukera() {
		if (chckbxaukera == null) {
			chckbxaukera = new JCheckBox("2.Aukera");
			chckbxaukera.setFont(new Font("Tahoma", Font.PLAIN, 15));
			chckbxaukera.setBounds(299, 201, 93, 21);
		}
		return chckbxaukera;
	}
}
