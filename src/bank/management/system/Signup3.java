package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class Signup3 extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s,c;
    String formno;
    Signup3(String formno){
        this.formno = formno;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/icons8-bank-100.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(42,10,100,100);
        add(image);
        JLabel l1 = new JLabel("Page 3");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(377,25,400,40);
        add(l1);
        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway",Font.CENTER_BASELINE,20));
        l2.setBounds(340,61,400,40);
        add(l2);
        JLabel l3 = new JLabel("Account Type :");
        l3.setFont(new Font("Raleway",Font.CENTER_BASELINE,18));
        l3.setBounds(110,150,400,40);
        add(l3);
        r1 = new JRadioButton("Savings Account");
        r1.setFont(new Font("Raleway",Font.CENTER_BASELINE,15));
        r1.setBackground(new Color(206,147,216));
        r1.setBounds(270,156,190,30);
        add(r1);
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.CENTER_BASELINE,15));
        r2.setBackground(new Color(206,147,216));
        r2.setBounds(270,195,200,30);
        add(r2);
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.CENTER_BASELINE,15));
        r3.setBackground(new Color(206,147,216));
        r3.setBounds(495,156,200,30);
        add(r3);
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.CENTER_BASELINE,15));
        r4.setBackground(new Color(206,147,216));
        r4.setBounds(495,195,300,30);
        add(r4);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);
        JLabel l4 = new JLabel("Card Number :");
        l4.setFont(new Font("Raleway",Font.CENTER_BASELINE,18));
        l4.setBounds(116,250,400,40);
        add(l4);
        JLabel l5 = new JLabel("(Your 16-Digit Card Number)");
        l5.setFont(new Font("Arial",Font.ROMAN_BASELINE,11));
        l5.setBounds(87,275,400,40);
        add(l5);
        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-3723");
        l6.setFont(new Font("Arial",Font.CENTER_BASELINE,18));
        l6.setBounds(275,251,400,40);
        add(l6);
        JLabel l7 = new JLabel("This number appears on your ATM Card / ChequeBook and Bank Statement");
        l7.setFont(new Font("Arial",Font.ROMAN_BASELINE,11));
        l7.setBounds(277,275,400,40);
        add(l7);
        JLabel l8 = new JLabel("Security PIN :");
        l8.setFont(new Font("Arial",Font.CENTER_BASELINE,18));
        l8.setBounds(126,325,400,40);
        add(l8);
        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Arial",Font.CENTER_BASELINE,18));
        l9.setBounds(275,326,400,40);
        add(l9);
        JLabel l10 = new JLabel("(Your 4-Digit ATM PIN)");
        l10.setFont(new Font("Arial",Font.ROMAN_BASELINE,11));
        l10.setBounds(118,348,400,40);
        add(l10);
        JLabel l101 = new JLabel("The ATM PIN is sent to the account holders or card owners in paper mail, sealed in an envelope letter");
        l101.setFont(new Font("Arial",Font.ROMAN_BASELINE,10));
        l101.setBounds(277,348,2000,40);
        add(l101);
        JLabel l11 = new JLabel("Services required :");
        l11.setFont(new Font("Raleway",Font.CENTER_BASELINE,18));
        l11.setBounds(76,415,400,40);
        add(l11);
        c1 = new JCheckBox("ATM Card");
        c1.setBackground(new Color(206,147,216));
        c1.setFont(new Font("Arial",Font.CENTER_BASELINE,15));
        c1.setBounds(270,420,100,30);
        add(c1);
        c2 = new JCheckBox("Net Banking");
        c2.setBackground(new Color(206,147,216));
        c2.setFont(new Font("Arial",Font.CENTER_BASELINE,15));
        c2.setBounds(440,420,160,30);
        add(c2);
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(206,147,216));
        c3.setFont(new Font("Arial",Font.CENTER_BASELINE,15));
        c3.setBounds(270,470,160,30);
        add(c3);
        c4 = new JCheckBox("E-mail Alert Notifications");
        c4.setBackground(new Color(206,147,216));
        c4.setFont(new Font("Arial",Font.CENTER_BASELINE,15));
        c4.setBounds(440,470,380,30);
        add(c4);
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(206,147,216));
        c5.setFont(new Font("Arial",Font.CENTER_BASELINE,15));
        c5.setBounds(270,520,160,30);
        add(c5);
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(206,147,216));
        c6.setFont(new Font("Arial",Font.CENTER_BASELINE,15));
        c6.setBounds(440,520,380,30);
        add(c6);
        JCheckBox c7 = new JCheckBox("I hereby declare that the details entered above are correct to the best of my knowledge ",true);
        c7.setBackground(new Color(206,147,216));
        c7.setFont(new Font("Arial",Font.ITALIC,15));
        c7.setBounds(85,620,1000,30);
        add(c7);
        JLabel l12 = new JLabel("Form no :");
        l12.setFont(new Font("Raleway",Font.CENTER_BASELINE,18));
        l12.setBounds(650,20,120,30);
        add(l12);
        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.CENTER_BASELINE,17));
        l13.setBounds(735,20,60,30);
        add(l13);
        s = new JButton("Submit");
        s.setFont(new Font("Raleway",Font.BOLD,14));
        s.setBackground(Color.GREEN);
        s.setForeground(Color.black);
        s.setBounds(303,690,100,30);
        s.addActionListener(this);
        add(s);
        c = new JButton("Cancel");
        c.setFont(new Font("Raleway",Font.BOLD,14));
        c.setBackground(Color.red);
        c.setForeground(Color.black);
        c.setBounds(433,690,100,30);
        c.addActionListener(this);
        add(c);
        getContentPane().setBackground(new Color(206,147,216));
        setSize(850,800);
        setLayout(null);
        setLocation(400,20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if (r1.isSelected()){
            atype = "Savings Account";
        }else if (r2.isSelected()){
            atype = "Fixed Deposit Account";
        } else if (r3.isSelected()) {
            atype = "Current Account";
        } else if (r4.isSelected()) {
            atype = "Recurring Deposit Account";
        }
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 6241864000000000L;
        String cardno = "" + Math.abs(first7);
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);
        String fac = "";
        if(c1.isSelected()){
            fac = fac + "ATM Card";
        } else if (c2.isSelected()) {
            fac = fac + "Net Banking";
        } else if (c3.isSelected()) {
            fac = fac + "Mobile Banking";
        } else if (c4.isSelected()) {
            fac = fac + "E-mail Alert Notifications";
        } else if (c5.isSelected()) {
            fac = fac + "Cheque Book";
        } else if (c6.isSelected()) {
            fac = fac + "E-Statement";
        }
        try {
            if(e.getSource() == s){
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Please fill in all fields");
                }else {
                    con c1 = new con();
                    String q1 = "Insert into signupthree values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2 = "Insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n PIN : "+pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource() == c) {
                System.exit(0);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
