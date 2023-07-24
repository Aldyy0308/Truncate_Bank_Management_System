package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class main_class extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    main_class(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/images (1).png"));
        Image i2 = i1.getImage().getScaledInstance(930,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);
        JLabel label = new JLabel("Please select your transaction");
        label.setBounds(496,310,700,35);
        label.setForeground(Color.white);
        label.setFont(new Font("System",Font.BOLD,22));
        l3.add(label);
        b1 = new JButton("DEPOSIT");
        b1.setBounds(475,403,150,25);
        b1.setBackground(new Color(26, 152, 11));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);
        b2 = new JButton("CASH WITHDRAWAL");
        b2.setBounds(688,403,150,25);
        b2.setBackground(new Color(26, 152, 11));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);
        b3 = new JButton("FAST CASH");
        b3.setBounds(475,437,150,25);
        b3.setBackground(new Color(26, 152, 11));
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        l3.add(b3);
        b4 = new JButton("MINI STATEMENT");
        b4.setBounds(688,437,150,25);
        b4.setBackground(new Color(26, 152, 11));
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        l3.add(b4);
        b5 = new JButton("PIN CHANGE");
        b5.setBounds(475,471,150,25);
        b5.setBackground(new Color(26, 152, 11));
        b5.setForeground(Color.WHITE);
        b5.addActionListener(this);
        l3.add(b5);
        b6 = new JButton("BALANCE ENQUIRY");
        b6.setBounds(688,471,150,25);
        b6.setBackground(new Color(26, 152, 11));
        b6.setForeground(Color.WHITE);
        b6.addActionListener(this);
        l3.add(b6);
        b7 = new JButton("EXIT");
        b7.setBounds(688,505,150,25);
        b7.setBackground(new Color(26, 152, 11));
        b7.setForeground(Color.WHITE);
        b7.addActionListener(this);
        l3.add(b7);
        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource().equals(b7)) {
            System.exit(0);
        } else if (e.getSource() == b2) {
            new Withdrawal(pin);
            setVisible(false);
        } else if (e.getSource() == b6) {
            new BalanceEnquiry(pin);
            setVisible(false);
        } else if (e.getSource() == b3) {
            new FastCash(pin);
            setVisible(false);
        } else if (e.getSource() == b5) {
            new Pin(pin);
            setVisible(false);
        } else if (e.getSource() == b4) {
            new mini(pin);
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new main_class("");
    }
}
