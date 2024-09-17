package JAVA2018E7120;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;

public class JAVA2018E7120_Search extends JFrame { //������ �˻��ϰų� ����, �����Ѵ�

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private ArrayList<JAVA2018E7120_Info> AL1 = JAVA2018E7120_Info.AL1;
	private ArrayList<JAVA2018E7120_Info1> AL2 = JAVA2018E7120_Info1.AL2;
	private Font f1 = new Font("�������", Font.PLAIN, 12);
	public static String temp[];
	private String buttons1[] = { "���� ����", "����" };
	private String buttons2[] = { "1", "2" };
	private String buttons3[] = { "Ȯ��", "���" };
	JAVA2018E7120_Info grade1;
	JAVA2018E7120_Info1 grade2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAVA2018E7120_Search frame = new JAVA2018E7120_Search();
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
	public JAVA2018E7120_Search() {
		UIManager.put("OptionPane.messageFont", f1);
		UIManager.put("OptionPane.buttonFont", f1);
		setFont(new Font("���� ���", Font.PLAIN, 12));
		setResizable(false);
		setTitle("\uC131\uC801 \uAC80\uC0C9/\uC218\uC815/\uC0AD\uC81C");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 595, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("���� ���", Font.PLAIN, 12));
		textArea.setEditable(false);
		textArea.setBounds(0, 0, 400, 200);
		contentPane.add(textArea);

		textField = new JTextField();
		textField.setBounds(30, 30, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(30, 80, 116, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JButton button = new JButton("\uAC80\uC0C9");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				int i;
				int chk = 0; // ��ġ�ϴ� ������ �ֳ� Ȯ��
				if (!textField.getText().equals("") && !textField_1.getText().equals("")) {
					for (i = 0; i < AL1.size(); i++) {
						grade1 = AL1.get(i);
						if (grade1.getstdnum().equals(textField_1.getText())
								&& grade1.getname().equals(textField.getText())) { // �̸��� �й��� ��� ��ġ�ϴ��� Ȯ��
							chk++;
							textArea.append(grade1.AL1.get(i).toString() + "\n");
						}
					}
					for (i = 0; i < AL2.size(); i++) {
						grade2 = AL2.get(i);
						if (grade2.getstdnum().equals(textField_1.getText())
								&& grade2.getname().equals(textField.getText())) { // �̸��� �й��� ��� ��ġ�ϴ��� Ȯ��
							chk++;
							textArea.append(grade2.AL2.get(i).toString() + "\n");
						}
					}
				} else if (!textField.getText().equals("") || !textField_1.getText().equals("")) {
					for (i = 0; i < AL1.size(); i++) {
						grade1 = AL1.get(i);
						if (grade1.getstdnum().equals(textField_1.getText())
								|| grade1.getname().equals(textField.getText())) { // �̸��̳� �й� �� �� �ϳ��� ��ġ�ϴ��� Ȯ��
							chk++;
							textArea.append(grade1.AL1.get(i).toString() + "\n");
						}
					}
					for (i = 0; i < AL2.size(); i++) {
						grade2 = AL2.get(i);
						if (grade2.getstdnum().equals(textField_1.getText())
								|| grade2.getname().equals(textField.getText())) { // �̸��̳� �й� �� �� �ϳ��� ��ġ�ϴ��� Ȯ��
							chk++;
							textArea.append(grade2.AL2.get(i).toString() + "\n");
						}
					}
				}
				if (chk == 0) {
					JOptionPane.showMessageDialog(null, "�ش� �л��� ������ �������� �ʽ��ϴ�.", "����", JOptionPane.ERROR_MESSAGE);
					textArea.setText("��ġ�ϴ� ������ �����ϴ�. *�˻� ����*");
				} else {
					textArea.append("\n" + "�� " + chk + "���� �˻������ �����մϴ�.");
				}
			}
		});
		button.setFont(new Font("���� ���", Font.PLAIN, 12));
		button.setBounds(30, 160, 97, 23);
		contentPane.add(button);

		JButton btnNewButton_1 = new JButton("\uB2EB\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("���� ���", Font.PLAIN, 12));
		btnNewButton_1.setBounds(30, 220, 97, 23);
		contentPane.add(btnNewButton_1);

		JLabel label = new JLabel("\uC774\uB984");
		label.setFont(new Font("���� ���", Font.PLAIN, 12));
		label.setBounds(30, 10, 57, 15);
		contentPane.add(label);

		JLabel label_1 = new JLabel("\uD559\uBC88");
		label_1.setFont(new Font("���� ���", Font.PLAIN, 12));
		label_1.setBounds(30, 61, 57, 15);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel(
				"<html>\uC774\uB984\uC774\uB098 \uD559\uBC88\uC744 \uC785\uB825\uD558\uC2DC\uACE0 \uC6D0\uD558\uB294 \uBC84\uD2BC\uC744 \uD074\uB9AD\uD574\uC8FC\uC138\uC694.</html>");
		label_2.setFont(new Font("���� ���", Font.PLAIN, 12));
		label_2.setBounds(10, 103, 160, 55);
		contentPane.add(label_2);

		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(167, 10, 400, 236);
		contentPane.add(scrollPane);

		JTextField textField_2 = new JTextField(1);
		JLabel lbl = new JLabel("�ش� �л��� �� �б��� ������ �����Ͻñ� ���Ͻʴϱ�?(1,2)");
		lbl.setFont(new Font("���� ���", Font.PLAIN, 12));
		JPanel select = new JPanel();
		textField_2.setBounds(10, 10, 160, 55);
		select.add(lbl);
		select.add(textField_2);

		JButton btnNewButton = new JButton("\uC218\uC815/\uC0AD\uC81C"); // ����, ������ư
		btnNewButton.setFont(new Font("���� ���", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("") || textField_1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�ش� ����� �̸��� �й� ��θ� �Է��ϼž� �մϴ�.", "����",
							JOptionPane.ERROR_MESSAGE);
				} else {
					int result = JOptionPane.showOptionDialog(null, " � ����� ����ϱ� ���Ͻʴϱ�?", "����",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, buttons1, "����");
					if (result == JOptionPane.YES_OPTION) { // ���� ���ý� ����â�� ����
						textField_2.setText("");
						int hakgi = JOptionPane.showOptionDialog(null, select, "�б� ����", JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE, null, buttons3, buttons3[0]);
						if (hakgi == JOptionPane.YES_OPTION) {
							if (textField_2.getText().equals("1")) {
								int i;
								int chk = 0;
								for (i = 0; i < AL1.size(); i++) {
									grade1 = AL1.get(i);
									if (grade1.getstdnum().equals(textField_1.getText())
											&& grade1.getname().equals(textField.getText())) { // �̸��� �й��� ��� ��ġ�ϴ��� Ȯ��
										chk++;
										temp = new String[3]; //temp�� �Է¹��� �̸�, �й�, �б⸦ �����Ѵ�
										temp[0] = grade1.getname();
										temp[1] = grade1.getstdnum();
										temp[2] = "1";
									}
								}
								if (chk == 0) {
									JOptionPane.showMessageDialog(null, "1�б⿡ �ش� �л��� ������ �������� �ʽ��ϴ�.", "����",
											JOptionPane.ERROR_MESSAGE);
									textArea.setText("��ġ�ϴ� ������ �����ϴ�. *���� ����*");
								} else {
									JAVA2018E7120_Edit frame1 = new JAVA2018E7120_Edit();
									frame1.setVisible(true);
								}
							} else if (textField_2.getText().equals("2")) {
								int i;
								int chk = 0;
								for (i = 0; i < AL2.size(); i++) {
									grade2 = AL2.get(i);
									if (grade2.getstdnum().equals(textField_1.getText())
											&& grade2.getname().equals(textField.getText())) { // �̸��� �й��� ��� ��ġ�ϴ��� Ȯ��
										chk++;
										temp = new String[3];
										temp[0] = grade2.getname();
										temp[1] = grade2.getstdnum();
										temp[2] = "2";
									}
								}
								if (chk == 0) {
									JOptionPane.showMessageDialog(null, "2�б⿡ �ش� �л��� ������ �������� �ʽ��ϴ�.", "����",
											JOptionPane.ERROR_MESSAGE);
									textArea.setText("��ġ�ϴ� ������ �����ϴ�. *���� ����*");
								} else {
									JAVA2018E7120_Edit frame1 = new JAVA2018E7120_Edit();
									frame1.setVisible(true);
								}
							} else {
								JOptionPane.showMessageDialog(null, "�߸��� �б⸦ �Է��߽��ϴ�.", "����", JOptionPane.ERROR_MESSAGE);
								textArea.setText("��ġ�ϴ� ������ �����ϴ�. *���� ����*");
							}
						}

					} else if (result == JOptionPane.NO_OPTION) { // ���� ���ý� �ش� ������ ������ Ȯ���ϰ� �����Ѵ�
						textArea.setText("");
						int i;
						int chk = 0; // ��ġ�ϴ� ������ �ֳ� Ȯ��
						if (!textField.getText().equals("") && !textField_1.getText().equals("")) {
							for (i = 0; i < AL1.size(); i++) {
								grade1 = AL1.get(i);
								if (grade1.getstdnum().equals(textField_1.getText())
										&& grade1.getname().equals(textField.getText())) { // �̸��� �й��� ��� ��ġ�ϴ��� Ȯ��
									chk++;
									AL1.remove(grade1);
								}
							}
							for (i = 0; i < AL2.size(); i++) {
								grade2 = AL2.get(i);
								if (grade2.getstdnum().equals(textField_1.getText())
										&& grade2.getname().equals(textField.getText())) { // �̸��� �й��� ��� ��ġ�ϴ��� Ȯ��
									chk++;
									AL2.remove(grade2);
								}
							}
						}
						if (chk == 0) {
							JOptionPane.showMessageDialog(null, "�ش� �л��� ������ �������� �ʽ��ϴ�.", "����",
									JOptionPane.ERROR_MESSAGE);
							textArea.setText("��ġ�ϴ� ������ �����ϴ�. *���� ����*");
						} else {
							JOptionPane.showMessageDialog(null, "������ �Ϸ�Ǿ����ϴ�.", "�Ϸ�", JOptionPane.INFORMATION_MESSAGE);
							textArea.append("�ش� �л��� " + chk + "���� ������ �����Ǿ����ϴ�.");
						}
					}
				}
			}
		});
		btnNewButton.setBounds(30, 190, 97, 23);
		contentPane.add(btnNewButton);

	}
}
