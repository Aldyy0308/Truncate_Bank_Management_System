package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    String formno;
    JComboBox comboBox1, comboBox2, comboBox3, comboBox4, comboBox5;
    JRadioButton r1,r2,r3,r4;
    JButton next;
    JTextField textPan, textAad;
    Signup2(String formno){
        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/icons8-bank-100.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(42,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(325,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.CENTER_BASELINE,19));
        l2.setBounds(282,65,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway",Font.CENTER_BASELINE,17));
        l3.setBounds(170,150,100,30);
        add(l3);

        String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        comboBox1 = new JComboBox<>(religion);
        comboBox1.setBackground(new Color(255, 255, 255));
        comboBox1.setFont(new Font("Raleway", Font.BOLD,14));
        comboBox1.setBounds(280,151,320,30);
        add(comboBox1);

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Raleway",Font.CENTER_BASELINE,17));
        l4.setBounds(161,200,100,30);
        add(l4);

        String category[] = {"General","OBC","EWS","SC/ST","Other"};
        comboBox2 = new JComboBox<>(category);
        comboBox2.setBackground(new Color(255, 255, 255));
        comboBox2.setFont(new Font("Raleway", Font.BOLD,14));
        comboBox2.setBounds(280,201,320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Raleway",Font.CENTER_BASELINE,17));
        l5.setBounds(175,250,100,30);
        add(l5);

        String Income[] = {"less than 50,000","upto 1,50,000","upto 2,50,000","upto 5,00,000","More than 10,00,000"};
        comboBox3 = new JComboBox<>(Income);
        comboBox3.setBackground(new Color(255, 255, 255));
        comboBox3.setFont(new Font("Raleway", Font.BOLD,14));
        comboBox3.setBounds(280,252,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Education :");
        l6.setFont(new Font("Raleway",Font.CENTER_BASELINE,17));
        l6.setBounds(153,300,100,30);
        add(l6);

        String education[] = {"Non-Graduate","Undergraduate","Graduate","Post-Graduate","Other"};
        comboBox4 = new JComboBox<>(education);
        comboBox4.setBackground(new Color(255, 255, 255));
        comboBox4.setFont(new Font("Raleway", Font.BOLD,14));
        comboBox4.setBounds(280,303,320,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Raleway",Font.CENTER_BASELINE,17));
        l7.setBounds(142,350,150,30);
        add(l7);

        String occupation[] = {"Employee","Self-Employed","Buisness","Student","Retired","Other"};
        comboBox5 = new JComboBox<>(occupation);
        comboBox5.setBackground(new Color(255, 255, 255));
        comboBox5.setFont(new Font("Raleway", Font.BOLD,14));
        comboBox5.setBounds(280,354,320,30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN Number :");
        l8.setFont(new Font("Raleway",Font.CENTER_BASELINE,17));
        l8.setBounds(132,400,150,30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,18));
        textPan.setBounds(280,405,320,30);
        add(textPan);

        JLabel l9 = new JLabel("AADHAR Number :");
        l9.setFont(new Font("Raleway",Font.CENTER_BASELINE,17));
        l9.setBounds(96,453,200,30);
        add(l9);

        textAad = new JTextField();
        textAad.setFont(new Font("Raleway",Font.BOLD,18));
        textAad.setBounds(280,456,320,30);
        add(textAad);

        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway",Font.CENTER_BASELINE,17));
        l10.setBounds(124,503,150,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.CENTER_BASELINE,14));
        r1.setBackground(new Color(160,172,231));
        r1.setBounds(280,503,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.CENTER_BASELINE,14));
        r2.setBackground(new Color(160,172,231));
        r2.setBounds(390,503,100,30);
        add(r2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);

        JLabel l11 = new JLabel("Existing User :");
        l11.setFont(new Font("Raleway",Font.CENTER_BASELINE,17));
        l11.setBounds(129,553,150,30);
        add(l11);

        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway",Font.CENTER_BASELINE,14));
        r3.setBackground(new Color(160,172,231));
        r3.setBounds(280,553,100,30);
        add(r3);

        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway",Font.CENTER_BASELINE,14));
        r4.setBackground(new Color(160,172,231));
        r4.setBounds(390,553,100,30);
        add(r4);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(r3);
        buttonGroup2.add(r4);

        JLabel l12 = new JLabel("Form no :");
        l12.setFont(new Font("Raleway",Font.CENTER_BASELINE,17));
        l12.setBounds(565,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.CENTER_BASELINE,17));
        l13.setBounds(647,10,60,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.orange);
        next.setForeground(Color.BLACK);
        next.setBounds(508,620,95,30);
        next.addActionListener(this);
        add(next);











        setLayout(null);
        setSize(750,780);
        setLocation(360,40);
        getContentPane().setBackground(new Color(160, 172, 231));

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox1.getSelectedItem();
        String cat = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String aad = textAad.getText();

        String scitizen = null;
        if(r1.isSelected()){
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen = "No";
        }

        String eAccount = null;
        if(r3.isSelected()){
            eAccount = "Yes";
        } else if (r4.isSelected()) {
            eAccount = "No";
        }

        try{
            if(textPan.getText().equals("") || textAad.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please fill in all fields");
            }
            else {
                con c1 = new con();
                String q = "Insert into Signuptwo values('"+formno+"','"+rel+"','"+cat+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aad+"','"+scitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new Signup2("");
    }
}
