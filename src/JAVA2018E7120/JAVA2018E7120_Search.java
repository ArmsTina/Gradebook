package JAVA2018E7120;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;

public class JAVA2018E7120_Search extends JFrame { //점수를 검색하거나 수정, 삭제한다

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private ArrayList<JAVA2018E7120_Info> AL1 = JAVA2018E7120_Info.AL1;
	private ArrayList<JAVA2018E7120_Info1> AL2 = JAVA2018E7120_Info1.AL2;
	private Font f1 = new Font("맑은고딕", Font.PLAIN, 12);
	public static String temp[];
	private String buttons1[] = { "점수 수정", "삭제" };
	private String buttons2[] = { "1", "2" };
	private String buttons3[] = { "확인", "취소" };
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
		setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		setResizable(false);
		setTitle("\uC131\uC801 \uAC80\uC0C9/\uC218\uC815/\uC0AD\uC81C");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 595, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
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
				int chk = 0; // 일치하는 정보가 있나 확인
				if (!textField.getText().equals("") && !textField_1.getText().equals("")) {
					for (i = 0; i < AL1.size(); i++) {
						grade1 = AL1.get(i);
						if (grade1.getstdnum().equals(textField_1.getText())
								&& grade1.getname().equals(textField.getText())) { // 이름과 학번이 모두 일치하는지 확인
							chk++;
							textArea.append(grade1.AL1.get(i).toString() + "\n");
						}
					}
					for (i = 0; i < AL2.size(); i++) {
						grade2 = AL2.get(i);
						if (grade2.getstdnum().equals(textField_1.getText())
								&& grade2.getname().equals(textField.getText())) { // 이름과 학번이 모두 일치하는지 확인
							chk++;
							textArea.append(grade2.AL2.get(i).toString() + "\n");
						}
					}
				} else if (!textField.getText().equals("") || !textField_1.getText().equals("")) {
					for (i = 0; i < AL1.size(); i++) {
						grade1 = AL1.get(i);
						if (grade1.getstdnum().equals(textField_1.getText())
								|| grade1.getname().equals(textField.getText())) { // 이름이나 학번 둘 중 하나라도 일치하는지 확인
							chk++;
							textArea.append(grade1.AL1.get(i).toString() + "\n");
						}
					}
					for (i = 0; i < AL2.size(); i++) {
						grade2 = AL2.get(i);
						if (grade2.getstdnum().equals(textField_1.getText())
								|| grade2.getname().equals(textField.getText())) { // 이름이나 학번 둘 중 하나라도 일치하는지 확인
							chk++;
							textArea.append(grade2.AL2.get(i).toString() + "\n");
						}
					}
				}
				if (chk == 0) {
					JOptionPane.showMessageDialog(null, "해당 학생의 정보가 존재하지 않습니다.", "오류", JOptionPane.ERROR_MESSAGE);
					textArea.setText("일치하는 정보가 없습니다. *검색 실패*");
				} else {
					textArea.append("\n" + "총 " + chk + "개의 검색결과가 존재합니다.");
				}
			}
		});
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		button.setBounds(30, 160, 97, 23);
		contentPane.add(button);

		JButton btnNewButton_1 = new JButton("\uB2EB\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnNewButton_1.setBounds(30, 220, 97, 23);
		contentPane.add(btnNewButton_1);

		JLabel label = new JLabel("\uC774\uB984");
		label.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		label.setBounds(30, 10, 57, 15);
		contentPane.add(label);

		JLabel label_1 = new JLabel("\uD559\uBC88");
		label_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		label_1.setBounds(30, 61, 57, 15);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel(
				"<html>\uC774\uB984\uC774\uB098 \uD559\uBC88\uC744 \uC785\uB825\uD558\uC2DC\uACE0 \uC6D0\uD558\uB294 \uBC84\uD2BC\uC744 \uD074\uB9AD\uD574\uC8FC\uC138\uC694.</html>");
		label_2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		label_2.setBounds(10, 103, 160, 55);
		contentPane.add(label_2);

		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(167, 10, 400, 236);
		contentPane.add(scrollPane);

		JTextField textField_2 = new JTextField(1);
		JLabel lbl = new JLabel("해당 학생의 몇 학기의 점수를 수정하시길 원하십니까?(1,2)");
		lbl.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		JPanel select = new JPanel();
		textField_2.setBounds(10, 10, 160, 55);
		select.add(lbl);
		select.add(textField_2);

		JButton btnNewButton = new JButton("\uC218\uC815/\uC0AD\uC81C"); // 수정, 삭제버튼
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("") || textField_1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "해당 기능은 이름과 학번 모두를 입력하셔야 합니다.", "오류",
							JOptionPane.ERROR_MESSAGE);
				} else {
					int result = JOptionPane.showOptionDialog(null, " 어떤 기능을 사용하길 원하십니까?", "선택",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, buttons1, "수정");
					if (result == JOptionPane.YES_OPTION) { // 수정 선택시 수정창을 띄운다
						textField_2.setText("");
						int hakgi = JOptionPane.showOptionDialog(null, select, "학기 선택", JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE, null, buttons3, buttons3[0]);
						if (hakgi == JOptionPane.YES_OPTION) {
							if (textField_2.getText().equals("1")) {
								int i;
								int chk = 0;
								for (i = 0; i < AL1.size(); i++) {
									grade1 = AL1.get(i);
									if (grade1.getstdnum().equals(textField_1.getText())
											&& grade1.getname().equals(textField.getText())) { // 이름과 학번이 모두 일치하는지 확인
										chk++;
										temp = new String[3]; //temp에 입력받은 이름, 학번, 학기를 저장한다
										temp[0] = grade1.getname();
										temp[1] = grade1.getstdnum();
										temp[2] = "1";
									}
								}
								if (chk == 0) {
									JOptionPane.showMessageDialog(null, "1학기에 해당 학생의 정보가 존재하지 않습니다.", "오류",
											JOptionPane.ERROR_MESSAGE);
									textArea.setText("일치하는 정보가 없습니다. *수정 실패*");
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
											&& grade2.getname().equals(textField.getText())) { // 이름과 학번이 모두 일치하는지 확인
										chk++;
										temp = new String[3];
										temp[0] = grade2.getname();
										temp[1] = grade2.getstdnum();
										temp[2] = "2";
									}
								}
								if (chk == 0) {
									JOptionPane.showMessageDialog(null, "2학기에 해당 학생의 정보가 존재하지 않습니다.", "오류",
											JOptionPane.ERROR_MESSAGE);
									textArea.setText("일치하는 정보가 없습니다. *수정 실패*");
								} else {
									JAVA2018E7120_Edit frame1 = new JAVA2018E7120_Edit();
									frame1.setVisible(true);
								}
							} else {
								JOptionPane.showMessageDialog(null, "잘못된 학기를 입력했습니다.", "오류", JOptionPane.ERROR_MESSAGE);
								textArea.setText("일치하는 정보가 없습니다. *수정 실패*");
							}
						}

					} else if (result == JOptionPane.NO_OPTION) { // 삭제 선택시 해당 정보의 유무를 확인하고 삭제한다
						textArea.setText("");
						int i;
						int chk = 0; // 일치하는 정보가 있나 확인
						if (!textField.getText().equals("") && !textField_1.getText().equals("")) {
							for (i = 0; i < AL1.size(); i++) {
								grade1 = AL1.get(i);
								if (grade1.getstdnum().equals(textField_1.getText())
										&& grade1.getname().equals(textField.getText())) { // 이름과 학번이 모두 일치하는지 확인
									chk++;
									AL1.remove(grade1);
								}
							}
							for (i = 0; i < AL2.size(); i++) {
								grade2 = AL2.get(i);
								if (grade2.getstdnum().equals(textField_1.getText())
										&& grade2.getname().equals(textField.getText())) { // 이름과 학번이 모두 일치하는지 확인
									chk++;
									AL2.remove(grade2);
								}
							}
						}
						if (chk == 0) {
							JOptionPane.showMessageDialog(null, "해당 학생의 정보가 존재하지 않습니다.", "오류",
									JOptionPane.ERROR_MESSAGE);
							textArea.setText("일치하는 정보가 없습니다. *삭제 실패*");
						} else {
							JOptionPane.showMessageDialog(null, "삭제가 완료되었습니다.", "완료", JOptionPane.INFORMATION_MESSAGE);
							textArea.append("해당 학생의 " + chk + "개의 정보가 삭제되었습니다.");
						}
					}
				}
			}
		});
		btnNewButton.setBounds(30, 190, 97, 23);
		contentPane.add(btnNewButton);

	}
}
