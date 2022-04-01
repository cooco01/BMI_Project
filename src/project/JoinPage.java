package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JoinPage extends JFrame {

	 String id, password;
	 
//  background
  private Image joinbackground = new ImageIcon
        (BMICalculator.class.getResource("../img/sub_img.jpg")).getImage();
  
  JButton previous = new JButton(new ImageIcon("../img/previous_icon.png"));


  public JoinPage() {
     
     //���
     Container joinpanel = getContentPane();
     joinpanel.setLayout(new FlowLayout()); // ��ġ ���� 
  
     JPanel panel = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
           g.drawImage(joinbackground, -10, 0, 1000, 750,null);
        }
     };   
     
     panel.setLayout(null);
     
     //��һ���
     JLabel title = new JLabel("< ȸ������ >");
     title.setBounds(400, 100, 400, 150);
     joinpanel.add(title);
     title.setFont(new Font("�������", Font.PLAIN, 40));
     
     JLabel IDtext = new JLabel("ID");
    
     IDtext.setFont(new Font("�������", Font.PLAIN, 30));
     panel.add(IDtext);
     IDtext.setBounds(300, 300, 100, 50);
     joinpanel.add(IDtext);
     
     JLabel PWtext = new JLabel("PW");
     PWtext.setFont(new Font("�������", Font.PLAIN, 30));
     PWtext.setBounds(300, 400, 100, 50);
     joinpanel.add(PWtext);
     
     JTextField IDfield = new JTextField(" ", 20);
     panel.add(IDfield);
     JTextField PWfield = new JTextField(" ", 20);
     panel.add(PWfield);
     
     JButton JOIN = new JButton("�����ϱ�");
     JButton previous = new JButton("����");
     
     IDfield.setFont(new Font("�������", Font.PLAIN, 50));
     PWfield.setFont(new Font("�������", Font.PLAIN, 50));
     JOIN.setFont(new Font("�������", Font.PLAIN, 25));
     previous.setFont(new Font("�������", Font.PLAIN, 25));
     
     IDfield.setBounds(400, 300,350,50);
     PWfield.setBounds(400, 400,350,50);
     JOIN.setBounds(330, 500, 400, 50); // ��ġ��ġ
     previous.setBounds(100, 550, 100, 100);
     
     JOIN.setBackground(Color.yellow);
     
     
     joinpanel.add(IDfield);
     joinpanel.add(PWfield);
     joinpanel.add(JOIN);
     joinpanel.add(previous);
     
     panel.setBounds(0, 0, 1000, 800);
     joinpanel.add(panel);
     
     
     previous.setBorderPainted(false);
     JOIN.setBorderPainted(false);
//     previous.setContentAreaFilled(false);
     previous.setFocusPainted(false);
     JOIN.setFocusPainted(false);
     
     
//     �⺻ ����
     setTitle("5�� ������Ʈ"); // â�� title
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �߰�
     setSize(1000, 800); // â�� (x,y) ������
     setLayout(null); // ���̾ƿ��� ������� ���� �Ҽ��ְ� ����
     setResizable(false); // â�� ũ�⸦ �ٲ��� ���ϰ� ��
     setVisible(true); // ���� ���ϰ����� �ƴ��� true�� ���δ�.
     
     JOIN.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               new StandbyScreen();
               setVisible(false); // â �Ⱥ��̰� �ϱ� 
           }
       });
     previous.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               new StandbyScreen();
               setVisible(false); // â �Ⱥ��̰� �ϱ� 
           }
       });
     
  }
  
 
  public static void main(String[] args) {
     JoinPage frame = new JoinPage();
  }
}
