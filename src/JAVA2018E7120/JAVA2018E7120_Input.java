package JAVA2018E7120;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;

public class JAVA2018E7120_Input extends JFrame { // ������ �Է¹޴� â

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private Font f1 = new Font("�������", Font.PLAIN, 12);
	private ArrayList<JAVA2018E7120_Info> AL1 = JAVA2018E7120_Info.AL1;
	private ArrayList<JAVA2018E7120_Info1> AL2 = JAVA2018E7120_Info1.AL2;

	/**
	 * Create the frame.
	 */
	public JAVA2018E7120_Input() {
		UIManager.put("OptionPane.messageFont", f1);
		UIManager.put("OptionPane.buttonFont", f1);

		setResizable(false);
		setTitle("\uC131\uC801 \uC785\uB825");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 245, 240);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("\uD559\uBC88");
		label.setBounds(15, 32, 57, 15);
		contentPane.add(label);
		label.setFont(new Font("���� ���", Font.PLAIN, 12));

		JLabel lblNewLabel = new JLabel("\uD559\uAE30");
		lblNewLabel.setBounds(15, 60, 57, 15);
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("���� ���", Font.PLAIN, 12));

		JLabel lblNewLabel_1 = new JLabel("\uC804\uACF5");
		lblNewLabel_1.setBounds(15, 85, 57, 15);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("���� ���", Font.PLAIN, 12));

		JLabel lblNewLabel_2 = new JLabel("\uC774\uB984");
		lblNewLabel_2.setBounds(15, 7, 57, 15);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("���� ���", Font.PLAIN, 12));

		JLabel lblNewLabel_3 = new JLabel("\uAD50\uC591");
		lblNewLabel_3.setBounds(15, 110, 57, 15);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("���� ���", Font.PLAIN, 12));

		JLabel lblNewLabel_4 = new JLabel("\uC2DC\uC0AC");
		lblNewLabel_4.setBounds(15, 135, 57, 15);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("���� ���", Font.PLAIN, 12));

		textField = new JTextField();
		textField.setBounds(50, 7, 165, 21);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(50, 32, 165, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(50, 60, 165, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(50, 85, 165, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(50, 110, 165, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(50, 135, 165, 21);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		JButton btnNewButton = new JButton("\uC785\uB825");
		btnNewButton.setFont(new Font("���� ���", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JAVA2018E7120_Info grade1 = new JAVA2018E7120_Info();
				JAVA2018E7120_Info grade1_1 = new JAVA2018E7120_Info();
				JAVA2018E7120_Info1 grade2 = new JAVA2018E7120_Info1();
				JAVA2018E7120_Info1 grade2_1 = new JAVA2018E7120_Info1();
				int i;
				int chk = 0; // �ߺ��Ǵ� �����Ͱ� �ִ��� Ȯ���ϱ� ���� ����
				// �ߺ� �Է��� �����ϱ� ���� ������ Ȯ��
				// �ߺ��Ǵ� �л��� ���ٸ� �����͸� �Է����ش�
				if (textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�̸��� �Է��ϼ���.", "����", JOptionPane.ERROR_MESSAGE);
				} else if (textField_1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�й��� �Է��ϼ���.", "����", JOptionPane.ERROR_MESSAGE);
				} else if (textField_2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�б⸦ �Է��ϼ���.", "����", JOptionPane.ERROR_MESSAGE);
				} else if (textField_3.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "���� ������ �Է��ϼ���.", "����", JOptionPane.ERROR_MESSAGE);
				} else if (textField_4.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "���� ������ �Է��ϼ���.", "����", JOptionPane.ERROR_MESSAGE);
				} else if (textField_5.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�û� ������ �Է��ϼ���.", "����", JOptionPane.ERROR_MESSAGE);
				} else if (Integer.parseInt(textField_3.getText()) > 100
						|| Integer.parseInt(textField_4.getText()) > 100
						|| Integer.parseInt(textField_5.getText()) > 100) {
					JOptionPane.showMessageDialog(null, "100 ������ ������ �Է��ϼ���.", "����", JOptionPane.ERROR_MESSAGE);
				} else {
					if ((Integer.parseInt(textField_2.getText()) == 1)) { // 1�б� Ȯ��
						for (i = 0; i < AL1.size(); i++) {
							grade1_1 = AL1.get(i);
							if (grade1_1.getstdnum().equals(textField_1.getText())
									&& grade1_1.getname().equals(textField.getText())) { // �̸��� �й��� ��ġ�ϴ� �л��� �̹� �����ϴ���
																							// Ȯ��
								chk++; // �ߺ��Ǵ� �׸��� �����Ѵٸ� chk�� 0�� �ƴ� �ٸ� ���� ������ش�
								textField.setText("");
								textField_1.setText("");
								textField_2.setText("");
								textField_3.setText("");
								textField_4.setText("");
								textField_5.setText("");
								JOptionPane.showMessageDialog(null, "�ش� �б⿡ �̹� ���� �л�(�̸��� ����, �й��� ���� �л�)�� ������ �����մϴ�.",
										"����", JOptionPane.ERROR_MESSAGE);
							}
						}
					} else if ((Integer.parseInt(textField_2.getText()) == 2)) { // 2�б� Ȯ��
						for (i = 0; i < AL2.size(); i++) {
							grade2_1 = AL2.get(i);
							if (grade2_1.getstdnum().equals(textField_1.getText())
									&& grade2_1.getname().equals(textField.getText())) {
								chk++;
								textField.setText("");
								textField_1.setText("");
								textField_2.setText("");
								textField_3.setText("");
								textField_4.setText("");
								textField_5.setText("");
								JOptionPane.showMessageDialog(null, "�ش� �б⿡ �̹� ���� �л�(�̸��� ����, �й��� ���� �л�)�� ������ �����մϴ�.",
										"����", JOptionPane.ERROR_MESSAGE);
							}
						}
					}
					if (chk == 0) {

						if ((Integer.parseInt(textField_2.getText()) == 1)) {
							grade1.setname(textField.getText());
							grade1.setstdnum(textField_1.getText());
							grade1.setsem(1);
							grade1.setmajor(Integer.parseInt(textField_3.getText()));
							grade1.setlib(Integer.parseInt(textField_4.getText()));
							grade1.setcurevt(Integer.parseInt(textField_5.getText()));
							grade1.gettotal();
							grade1.getavg();
							AL1.add(grade1);

							textField.setText("");
							textField_1.setText("");
							textField_2.setText("");
							textField_3.setText("");
							textField_4.setText("");
							textField_5.setText("");
							JOptionPane.showMessageDialog(null, "�Է��� �Ϸ� �Ǿ����ϴ�.", "�Ϸ�", JOptionPane.INFORMATION_MESSAGE);
						} else if ((Integer.parseInt(textField_2.getText()) == 2)) {
							grade2.setname(textField.getText());
							grade2.setstdnum(textField_1.getText());
							grade2.setsem(2);
							grade2.setmajor(Integer.parseInt(textField_3.getText()));
							grade2.setlib(Integer.parseInt(textField_4.getText()));
							grade2.setcurevt(Integer.parseInt(textField_5.getText()));
							grade2.gettotal();
							grade2.getavg();
							AL2.add(grade2);

							textField.setText("");
							textField_1.setText("");
							textField_2.setText("");
							textField_3.setText("");
							textField_4.setText("");
							textField_5.setText("");
							JOptionPane.showMessageDialog(null, "�Է��� �Ϸ� �Ǿ����ϴ�.", "�Ϸ�", JOptionPane.INFORMATION_MESSAGE);
						} else { // �бⰡ 1�̳� 2�� �ƴҽ�
							JOptionPane.showMessageDialog(null, "�Է��� �� �ִ� �б�� �ִ� 2�б� �Դϴ�.", "����",
									JOptionPane.ERROR_MESSAGE);
						}

					}
				}

			}
		});
		btnNewButton.setBounds(15, 166, 90, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\uB2EB\uAE30");
		btnNewButton_1.setFont(new Font("���� ���", Font.PLAIN, 12));
		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(125, 166, 90, 23);
		contentPane.add(btnNewButton_1);
	}

}
