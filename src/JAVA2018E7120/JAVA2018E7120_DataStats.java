package JAVA2018E7120;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import org.osgi.framework.ServiceFactory;

import JAVA2018E7120.JAVA2018E7120_Info.Subject;

import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.table.DefaultTableModel;

public class JAVA2018E7120_DataStats extends JFrame {
	Container contentPane;
	int[] data = {0,0,0,0};
	int[] Angle = new int[4]; 
	private ArrayList<JAVA2018E7120_Info> AL1 = JAVA2018E7120_Info.AL1;
	private ArrayList<JAVA2018E7120_Info1> AL2 = JAVA2018E7120_Info1.AL2;
 
	Color[] color = {Color.RED, Color.BLUE,
			  Color.ORANGE, Color.BLACK};
 
	String[] itemName = {"A 이상", "B 이상", 
			                  "C 이상", "그 외"};
 
	JTextField[] tf  = new JTextField[4];
	ChartPanel chartPanel = new ChartPanel();
 
	public JAVA2018E7120_DataStats(){
		setTitle("통계 자료");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.add(chartPanel, BorderLayout.CENTER);
		setSize(500,350);
		setVisible(true);
		Chart();
	}
 
	void Chart(){ // 차트를 만든다
		int sum=0;
		int j;
		for(int i=0;i<data.length;i++){ 
			j=0;
			for (JAVA2018E7120_Info grade1 : AL1) {
				grade1 = AL1.get(j);
				if(grade1.getrank().equals("A+")||grade1.getrank().equals("A")) {
					data[0]++;
					j++;
				}
				else if(grade1.getrank().equals("B+")||grade1.getrank().equals("B")) {
					data[1]++;
					j++;
				}
				else if(grade1.getrank().equals("C+")||grade1.getrank().equals("C")) {
					data[2]++;
					j++;
				}else if(grade1.getrank().equals("D")||grade1.getrank().equals("F")){
					data[3]++;
					j++;
				}
				sum++;
			}
			j=0;
			for (JAVA2018E7120_Info1 grade2 : AL2) {
				if(grade2.getrank().equals("A+")||grade2.getrank().equals("A")) {
					data[0]++;
					j++;
				}
				else if(grade2.getrank().equals("B+")||grade2.getrank().equals("B")) {
					data[1]++;
					j++;
				}
				else if(grade2.getrank().equals("C+")||grade2.getrank().equals("C")) {
					data[2]++;
					j++;
				}else if(grade2.getrank().equals("D")||grade2.getrank().equals("F")){
					data[3]++;
					j++;
				}
				sum++;
			}
		}
		if(sum == 0) 
			return;
 
		for(int i=0;i<data.length;i++){ 
			Angle[i] = (int)Math.round((double)data[i]/(double)sum*360);
			chartPanel.repaint();
		}
		
	}
 
	class ChartPanel extends JPanel{
 
		public void paint(Graphics g){
 
			super.paint(g);
 
			int sAngle = 0;
			
			for(int i=0;i<data.length;i++){
				g.setColor(color[i]);
				g.drawString(itemName[i]+" "+Math.round
			   (Angle[i]*100/360)+" %", 50+i*100,20);
			}
 
			for(int i=0;i<data.length;i++){
				g.setColor(color[i]);
				g.fillArc(150,50,200,200,sAngle,Angle[i]);
				sAngle = sAngle + Angle[i];
			}
		}
		
	}
 
	public static void main(String[] args) {
		new JAVA2018E7120_DataStats();
	}
}