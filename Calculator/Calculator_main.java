package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator_main
{

   private JFrame frame;
   private JTextField textField;

   double firstNum; 
   double secondNum;
   double result;
   String op;
   String answer;
   
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Calculator_main window = new Calculator_main();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */
   public Calculator_main() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 241, 415);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      textField = new JTextField();
      textField.setHorizontalAlignment(SwingConstants.RIGHT);
      textField.setFont(new Font("Times New Roman", Font.BOLD, 18));
      textField.setBounds(12, 13, 200, 22);
      frame.getContentPane().add(textField);
      textField.setColumns(10);
      // Row 1
      JButton btnPercent = new JButton("%");
      btnPercent.setFont(new Font("Times New Roman", Font.BOLD, 14));
      btnPercent.setBounds(12, 48, 50, 50);
      frame.getContentPane().add(btnPercent);
      
      JButton btnSqrt = new JButton("\u221A");
      btnSqrt.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            firstNum = Double.parseDouble(textField.getText());
            result = Math.sqrt(firstNum);
            if(Double.isInfinite(result)|| Double.isNaN(result))
               textField.setText("Invalid Input");
            else{
               answer = String.format("%.2f", result);
               textField.setText(answer);
            }
         }
      });
      btnSqrt.setFont(new Font("Times New Roman", Font.BOLD, 18));
      btnSqrt.setBounds(61, 48, 50, 50);
      frame.getContentPane().add(btnSqrt);
      
      JButton btnSquare = new JButton("x\u00B2");
      btnSquare.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            firstNum = Double.parseDouble(textField.getText());
            result = Math.pow(firstNum, 2);
            answer = String.format("%.2f", result);
            textField.setText(answer);
         }
      });
      btnSquare.setFont(new Font("Times New Roman", Font.BOLD, 14));
      btnSquare.setBounds(112, 48, 50, 50);
      frame.getContentPane().add(btnSquare);
      
      JButton btnOneDivide = new JButton("1/x");
      btnOneDivide.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            firstNum = Double.parseDouble(textField.getText());
            result = (1 / firstNum);
            answer = String.format("%.2f", result);
            textField.setText(answer);
         }
      });
      btnOneDivide.setFont(new Font("Times New Roman", Font.BOLD, 14));
      btnOneDivide.setBounds(162, 48, 50, 50);
      frame.getContentPane().add(btnOneDivide);
      
      // Row 2
      JButton btnCE = new JButton("CE");
      btnCE.setFont(new Font("Times New Roman", Font.BOLD, 14));
      btnCE.setBounds(12, 98, 50, 50);
      frame.getContentPane().add(btnCE);
      
      JButton btnC = new JButton("C");
      btnC.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            textField.setText(null);
         }
      });
      btnC.setFont(new Font("Times New Roman", Font.BOLD, 18));
      btnC.setBounds(61, 98, 50, 50);
      frame.getContentPane().add(btnC);
      
      JButton btnDel = new JButton("<-");
      btnDel.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String backSpace = null;
            if(textField.getText().length() > 0)
            {
               StringBuilder strB = new StringBuilder(textField.getText());
               strB.deleteCharAt(textField.getText().length() - 1);
               backSpace = strB.toString();
               textField.setText(backSpace);
            }
         }
      });
      btnDel.setFont(new Font("Times New Roman", Font.BOLD, 10));
      btnDel.setBounds(112, 98, 50, 50);
      frame.getContentPane().add(btnDel);
      
      JButton btnP = new JButton("+");
      btnP.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            firstNum = Double.parseDouble(textField.getText());
            textField.setText("");
            op = "+";
         }
      });
      btnP.setFont(new Font("Times New Roman", Font.BOLD, 18));
      btnP.setBounds(162, 98, 50, 50);
      frame.getContentPane().add(btnP);
      
      // Row 3
      JButton btn7 = new JButton("7");
      btn7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            String EnterNumber = textField.getText() + btn7.getText();
            textField.setText(EnterNumber);
         }
      });
      btn7.setFont(new Font("Times New Roman", Font.BOLD, 18));
      btn7.setBounds(12, 148, 50, 50);
      frame.getContentPane().add(btn7);
      
      JButton btn8 = new JButton("8");
      btn8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String EnterNumber = textField.getText() + btn8.getText();
            textField.setText(EnterNumber);
         }
      });
      btn8.setFont(new Font("Times New Roman", Font.BOLD, 18));
      btn8.setBounds(61, 148, 50, 50);
      frame.getContentPane().add(btn8);
      
      JButton btn9 = new JButton("9");
      btn9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String EnterNumber = textField.getText() + btn9.getText();
            textField.setText(EnterNumber);
         }
      });
      btn9.setFont(new Font("Times New Roman", Font.BOLD, 18));
      btn9.setBounds(112, 148, 50, 50);
      frame.getContentPane().add(btn9);
      
      JButton btnM = new JButton("-");
      btnM.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            firstNum = Double.parseDouble(textField.getText());
            textField.setText("");
            op = "-";
         }
      });
      btnM.setFont(new Font("Times New Roman", Font.BOLD, 18));
      btnM.setBounds(162, 148, 50, 50);
      frame.getContentPane().add(btnM);
      
      //Row 4
      JButton btn4 = new JButton("4");
      btn4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String EnterNumber = textField.getText() + btn4.getText();
            textField.setText(EnterNumber);
         }
      });
      btn4.setFont(new Font("Times New Roman", Font.BOLD, 18));
      btn4.setBounds(12, 198, 50, 50);
      frame.getContentPane().add(btn4);
      
      JButton btn5 = new JButton("5");
      btn5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String EnterNumber = textField.getText() + btn5.getText();
            textField.setText(EnterNumber);
         }
      });
      btn5.setFont(new Font("Times New Roman", Font.BOLD, 18));
      btn5.setBounds(61, 198, 50, 50);
      frame.getContentPane().add(btn5);
      
      JButton btn6 = new JButton("6");
      btn6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String EnterNumber = textField.getText() + btn6.getText();
            textField.setText(EnterNumber);
         }
      });
      btn6.setFont(new Font("Times New Roman", Font.BOLD, 18));
      btn6.setBounds(112, 198, 50, 50);
      frame.getContentPane().add(btn6);
      
      JButton btnMult = new JButton("*");
      btnMult.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            firstNum = Double.parseDouble(textField.getText());
            textField.setText("");
            op = "*";
         }
      });
      btnMult.setFont(new Font("Times New Roman", Font.BOLD, 18));
      btnMult.setBounds(162, 198, 50, 50);
      frame.getContentPane().add(btnMult);
      
      // Row 5
      JButton btn1 = new JButton("1");
      btn1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String EnterNumber = textField.getText() + btn1.getText();
            textField.setText(EnterNumber);
         }
      });
      btn1.setFont(new Font("Times New Roman", Font.BOLD, 18));
      btn1.setBounds(12, 248, 50, 50);
      frame.getContentPane().add(btn1);
      
      JButton btn2 = new JButton("2");
      btn2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String EnterNumber = textField.getText() + btn2.getText();
            textField.setText(EnterNumber);
         }
      });
      btn2.setFont(new Font("Times New Roman", Font.BOLD, 18));
      btn2.setBounds(61, 248, 50, 50);
      frame.getContentPane().add(btn2);
      
      JButton btn3 = new JButton("3");
      btn3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String EnterNumber = textField.getText() + btn3.getText();
            textField.setText(EnterNumber);
         }
      });
      btn3.setFont(new Font("Times New Roman", Font.BOLD, 18));
      btn3.setBounds(112, 248, 50, 50);
      frame.getContentPane().add(btn3);
      
      JButton btnDiv = new JButton("/");
      btnDiv.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            firstNum = Double.parseDouble(textField.getText());
            textField.setText("");
            op = "/";
         }
      });
      btnDiv.setFont(new Font("Times New Roman", Font.BOLD, 18));
      btnDiv.setBounds(162, 248, 50, 50);
      frame.getContentPane().add(btnDiv);
      
      //Row 5
      JButton btnPM = new JButton("\u00B1");
      btnPM.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            double ops = Double.parseDouble(String.valueOf(textField.getText()));
            ops = (-1)*ops;
            textField.setText(String.valueOf(ops));
         }
      });
      btnPM.setFont(new Font("Times New Roman", Font.BOLD, 18));
      btnPM.setBounds(12, 295, 50, 50);
      frame.getContentPane().add(btnPM);
      
      JButton btn0 = new JButton("0");
      btn0.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            String EnterNumber = textField.getText() + btn0.getText();
            textField.setText(EnterNumber);
         }
      });
      btn0.setFont(new Font("Times New Roman", Font.BOLD, 18));
      btn0.setBounds(61, 295, 50, 50);
      frame.getContentPane().add(btn0);
      
      JButton btnDot = new JButton(".");
      btnDot.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String EnterNumber = textField.getText() + btnDot.getText();
            textField.setText(EnterNumber);
         }
      });
      btnDot.setFont(new Font("Times New Roman", Font.BOLD, 18));
      btnDot.setBounds(112, 295, 50, 50);
      frame.getContentPane().add(btnDot);
      
      JButton btnEq = new JButton("=");
      btnEq.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String answer; 
            secondNum = Double.parseDouble(textField.getText());
            if(op == "+")
            {
               result = firstNum + secondNum;
               answer = String.format("%.2f", result);
               textField.setText(answer);
            }
            
            if(op == "-")
            {
               result = firstNum - secondNum;
               answer = String.format("%.2f", result);
               textField.setText(answer);
            }
            
            if(op == "*")
            {
               result = firstNum * secondNum;
               answer = String.format("%.2f", result);
               textField.setText(answer);
            }
            
            if(op == "/")
            {
               result = firstNum / secondNum;
               answer = String.format("%.2f", result);
               if(secondNum == 0)
                  textField.setText("Cannot divide by zero");
               else
                  textField.setText(answer);
            }
         }
      });
      btnEq.setFont(new Font("Times New Roman", Font.BOLD, 18));
      btnEq.setBounds(162, 295, 50, 50);
      frame.getContentPane().add(btnEq);
   }
}
