package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JButton next;
    JTextField textName, textFname, textEmail, textadd, textcit, textsta, textpin;
    JDateChooser dateChooser;

    Random random = new Random();
    long f4 = (random.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(f4);

    Signup(){
        super("Application Form");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/icons8-bank-100.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("Application Form No." + first);
        label1.setBounds(140,32,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(323,87,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.CENTER_BASELINE,16));
        label3.setBounds(294,119,600,30);
        add(label3);

        JLabel labelName = new JLabel("Applicant Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,17));
        labelName.setBounds(140,190,200,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,191,300,30);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway",Font.BOLD,17));
        labelfName.setBounds(150,240,200,30);
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,241,300,30);
        add(textFname);

        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway",Font.BOLD,17));
        DOB.setBounds(165,290,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,291,200,30);
        add(dateChooser);

        JLabel labelg = new JLabel("Gender :");
        labelg.setFont(new Font("Raleway",Font.BOLD,17));
        labelg.setBounds(207,340,200,30);
        add(labelg);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(245,213,169));
        r1.setBounds(300,341,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(245,213,169));
        r2.setBounds(379,341,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,17));
        labelEmail.setBounds(152,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,391,300,30);
        add(textEmail);

        JLabel labelms = new JLabel("Marital Status :");
        labelms.setFont(new Font("Raleway",Font.BOLD,17));
        labelms.setBounds(156,440,200,30);
        add(labelms);

        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(245,213,169));
        r3.setBounds(300,441,100,30);
        add(r3);

        r4 = new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(new Color(245,213,169));
        r4.setBounds(404,441,150,30);
        add(r4);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(r3);
        buttonGroup2.add(r4);

        JLabel labeladd = new JLabel("Address :");
        labeladd.setFont(new Font("Raleway",Font.BOLD,17));
        labeladd.setBounds(198,490,200,30);
        add(labeladd);

        textadd = new JTextField();
        textadd.setFont(new Font("Raleway",Font.BOLD,14));
        textadd.setBounds(300,491,300,30);
        add(textadd);

        JLabel labelcit = new JLabel("City :");
        labelcit.setFont(new Font("Raleway",Font.BOLD,17));
        labelcit.setBounds(236,540,200,30);
        add(labelcit);

        textcit = new JTextField();
        textcit.setFont(new Font("Raleway",Font.BOLD,14));
        textcit.setBounds(300,541,300,30);
        add(textcit);

        JLabel labelsta = new JLabel("State :");
        labelsta.setFont(new Font("Raleway",Font.BOLD,17));
        labelsta.setBounds(224,590,200,30);
        add(labelsta);

        textsta = new JTextField();
        textsta.setFont(new Font("Raleway",Font.BOLD,14));
        textsta.setBounds(300,591,300,30);
        add(textsta);

        JLabel labelpin = new JLabel("PIN Code :");
        labelpin.setFont(new Font("Raleway",Font.BOLD,17));
        labelpin.setBounds(192,640,200,30);
        add(labelpin);

        textpin = new JTextField();
        textpin.setFont(new Font("Raleway",Font.BOLD,14));
        textpin.setBounds(300,641,300,30);
        add(textpin);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.orange);
        next.setForeground(Color.black);
        next.setBounds(520,710,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(245,213,169));
        setLayout(null);
        setSize(750,800);
        setLocation(360,40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if(r3.isSelected()){
            marital = "Married";
        } else if (r4.isSelected()) {
            marital = "Unmarried";
        }
        String address = textadd.getText();
        String city = textcit.getText();
        String state = textsta.getText();
        String pincode = textpin.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please fill in all fields");
            }else{
                con con1 = new con();
                String q = "Insert into Signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
