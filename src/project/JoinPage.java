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
     
     //배경
     Container joinpanel = getContentPane();
     joinpanel.setLayout(new FlowLayout()); // 배치 유형 
  
     JPanel panel = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
           g.drawImage(joinbackground, -10, 0, 1000, 750,null);
        }
     };   
     
     panel.setLayout(null);
     
     //요소생성
     JLabel title = new JLabel("< 회원가입 >");
     title.setBounds(400, 100, 400, 150);
     joinpanel.add(title);
     title.setFont(new Font("맑은고딕", Font.PLAIN, 40));
     
     JLabel IDtext = new JLabel("ID");
    
     IDtext.setFont(new Font("맑은고딕", Font.PLAIN, 30));
     panel.add(IDtext);
     IDtext.setBounds(300, 300, 100, 50);
     joinpanel.add(IDtext);
     
     JLabel PWtext = new JLabel("PW");
     PWtext.setFont(new Font("맑은고딕", Font.PLAIN, 30));
     PWtext.setBounds(300, 400, 100, 50);
     joinpanel.add(PWtext);
     
     JTextField IDfield = new JTextField(" ", 20);
     panel.add(IDfield);
     JTextField PWfield = new JTextField(" ", 20);
     panel.add(PWfield);
     
     JButton JOIN = new JButton("가입하기");
     JButton previous = new JButton("이전");
     
     IDfield.setFont(new Font("맑은고딕", Font.PLAIN, 50));
     PWfield.setFont(new Font("맑은고딕", Font.PLAIN, 50));
     JOIN.setFont(new Font("맑은고딕", Font.PLAIN, 25));
     previous.setFont(new Font("맑은고딕", Font.PLAIN, 25));
     
     IDfield.setBounds(400, 300,350,50);
     PWfield.setBounds(400, 400,350,50);
     JOIN.setBounds(330, 500, 400, 50); // 배치위치
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
     
     
//     기본 설정
     setTitle("5조 프로젝트"); // 창의 title
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료기능 추가
     setSize(1000, 800); // 창의 (x,y) 사이즈
     setLayout(null); // 레이아웃을 내맘대로 설정 할수있게 해줌
     setResizable(false); // 창의 크기를 바꾸지 못하게 함
     setVisible(true); // 눈에 보일것인지 아닌지 true는 보인다.
     
     JOIN.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               new StandbyScreen();
               setVisible(false); // 창 안보이게 하기 
           }
       });
     previous.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               new StandbyScreen();
               setVisible(false); // 창 안보이게 하기 
           }
       });
     
  }
  
 
  public static void main(String[] args) {
     JoinPage frame = new JoinPage();
  }
}
