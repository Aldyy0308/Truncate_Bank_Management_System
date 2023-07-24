package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
public class mini extends JFrame implements ActionListener {
    String pin;
    JButton button;
    mini(String pin){
        this.pin = pin;
        getContentPane().setBackground(new Color(250, 201, 112));
        setSize(400,600);
        setLocation(20,20);
        setLayout(null);
        JLabel label1 = new JLabel();
        label1.setBounds(20,130,400,200);
        add(label1);
        JLabel label2 = new JLabel("Truncate Bank");
        label2.setFont(new Font("System",Font.HANGING_BASELINE,15));
        label2.setBounds(150,20,200,20);
        add(label2);
        JLabel label3 = new JLabel();
        label3.setBounds(20,80,200,20);
        add(label3);
        JLabel label4 = new JLabel();
        label4.setBounds(20,400,300,20);
        add(label4);
        try{
            con c = new con();
            ResultSet resultSet = c.statement.executeQuery("select * from login where pin = '"+pin+"'");
            while(resultSet.next()){
                label3.setText("Card Number : "+resultSet.getString("card_no").substring(0,4) + "XXXXXXXX"+resultSet.getString("card_no").substring(12));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            int balance = 0;
            con c = new con();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while (resultSet.next()) {
                label1.setText(label1.getText() + "<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+ "<br><br><html>");


                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            label4.setText("Your total balance is Rs. "+balance);
        }catch (Exception e){
            e.printStackTrace();
        }
        button = new JButton("Exit");
        button.setBounds(20,500,100,25);
        button.addActionListener(this);
        button.setBackground(new Color(176, 1, 1));
        button.setForeground(Color.WHITE);
        add(button);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);

    }
    public static void main(String[] args) {
        new mini("");
    }
}
