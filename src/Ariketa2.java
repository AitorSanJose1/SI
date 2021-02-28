import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;

public class Ariketa2 extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JRadioButton rdbtnNewRadioButton;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JRadioButton rdbtnNewRadioButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JRadioButton rdbtnNewRadioButton_2;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_3;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JLabel lblNewLabel_2;
	private JTextField txtBotoiBatSakatu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ariketa2 frame = new Ariketa2();
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
	public Ariketa2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 633);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanel(), BorderLayout.CENTER);
		contentPane.add(getPanel_1(), BorderLayout.SOUTH);
		contentPane.add(getTxtBotoiBatSakatu(), BorderLayout.NORTH);
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new GridLayout(4, 3, 0, 0));
			panel.add(getRdbtnNewRadioButton());
			panel.add(getBtnNewButton());
			panel.add(getBtnNewButton_1());
			panel.add(getRdbtnNewRadioButton_2());
			panel.add(getBtnNewButton_2());
			panel.add(getBtnNewButton_3());
			panel.add(getRdbtnNewRadioButton_1());
			panel.add(getBtnNewButton_5());
			panel.add(getBtnNewButton_4());
			panel.add(getLblNewLabel_2());
			panel.add(getChckbxNewCheckBox_2());
			panel.add(getChckbxNewCheckBox_3());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.add(getLblNewLabel_1());
			panel_1.add(getChckbxNewCheckBox());
			panel_1.add(getChckbxNewCheckBox_1());
		}
		return panel_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Gustuko duzu?");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		}
		return lblNewLabel_1;
	}
	private JCheckBox getChckbxNewCheckBox() {
		if (chckbxNewCheckBox == null) {
			chckbxNewCheckBox = new JCheckBox("Bai");
			buttonGroup_1.add(chckbxNewCheckBox);
			chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return chckbxNewCheckBox;
	}
	private JCheckBox getChckbxNewCheckBox_1() {
		if (chckbxNewCheckBox_1 == null) {
			chckbxNewCheckBox_1 = new JCheckBox("Ez");
			buttonGroup_1.add(chckbxNewCheckBox_1);
			chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return chckbxNewCheckBox_1;
	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("A");
			buttonGroup.add(rdbtnNewRadioButton);
			rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return rdbtnNewRadioButton;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("A1");
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("A2");
			btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return btnNewButton_1;
	}
	private JRadioButton getRdbtnNewRadioButton_1() {
		if (rdbtnNewRadioButton_1 == null) {
			rdbtnNewRadioButton_1 = new JRadioButton("C");
			buttonGroup.add(rdbtnNewRadioButton_1);
			rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return rdbtnNewRadioButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("B1");
			btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("B2");
			btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return btnNewButton_3;
	}
	private JRadioButton getRdbtnNewRadioButton_2() {
		if (rdbtnNewRadioButton_2 == null) {
			rdbtnNewRadioButton_2 = new JRadioButton("B");
			buttonGroup.add(rdbtnNewRadioButton_2);
			rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return rdbtnNewRadioButton_2;
	}
	private JButton getBtnNewButton_4() {
		if (btnNewButton_4 == null) {
			btnNewButton_4 = new JButton("C2");
			btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return btnNewButton_4;
	}
	private JButton getBtnNewButton_5() {
		if (btnNewButton_5 == null) {
			btnNewButton_5 = new JButton("C1");
			btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return btnNewButton_5;
	}
	private JCheckBox getChckbxNewCheckBox_2() {
		if (chckbxNewCheckBox_2 == null) {
			chckbxNewCheckBox_2 = new JCheckBox("1.Aukera");
			chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return chckbxNewCheckBox_2;
	}
	private JCheckBox getChckbxNewCheckBox_3() {
		if (chckbxNewCheckBox_3 == null) {
			chckbxNewCheckBox_3 = new JCheckBox("2.Aukera");
			chckbxNewCheckBox_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return chckbxNewCheckBox_3;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
		}
		return lblNewLabel_2;
	}
	private JTextField getTxtBotoiBatSakatu() {
		if (txtBotoiBatSakatu == null) {
			txtBotoiBatSakatu = new JTextField();
			txtBotoiBatSakatu.setFont(new Font("Tahoma", Font.BOLD, 15));
			txtBotoiBatSakatu.setHorizontalAlignment(SwingConstants.CENTER);
			txtBotoiBatSakatu.setText("Botoi bat sakatu");
			txtBotoiBatSakatu.setColumns(10);
		}
		return txtBotoiBatSakatu;
	}
}
