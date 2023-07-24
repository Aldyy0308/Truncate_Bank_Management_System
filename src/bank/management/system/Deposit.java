package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
public class Deposit extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton b1,b2;
    Deposit(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/images (1).png"));
        Image i2 = i1.getImage().getScaledInstance(930,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);
        JLabel label1 = new JLabel("Enter the amount to be deposited");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(530,290,400,35);
        l3.add(label1);
        textField = new TextField();
        textField.setBackground(new Color(197, 197, 197));
        textField.setForeground(Color.BLACK);
        textField.setBounds(530,335,150,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(textField);
        b1 = new JButton("DEPOSIT");
        b1.setBounds(750,475,90,25);
        b1.setBackground(new Color(13, 87, 178));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);
        b2 = new JButton("BACK");
        b2.setBounds(750,507,90,25);
        b2.setBackground(new Color(13, 87, 178));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);
        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textField.getText();
            Date date = new Date();
            if (e.getSource() == b1){
                if (textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the amount that needs to be deposited");
                }else {
                    con c = new con();
                    c.statement.executeUpdate("Insert Into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs. "+amount+" deposited successfully ");
                    setVisible(false);
                    new main_class(pin);
                }
            } else if (e.getSource() == b2) {
                setVisible(false);
                new main_class(pin);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Deposit("");
    }
}
