

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame2Product extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Mens online store ");
	private JLabel l1 = new JLabel("Brand Name ");
	private JTextField t1=new JTextField("0",12);
	private JLabel l2 = new JLabel("Price ");
	private JTextField t2=new JTextField("0",8);
	private JLabel l3 = new JLabel("Color ");
	private JTextField t3=new JTextField("0",8);
	private JLabel l4 = new JLabel("Location ");
	private JTextField t4=new JTextField("0",8);
	
	private JLabel l5 = new JLabel("# Ordered ");
	private JTextField t5=new JTextField("0",8);
	private JLabel l6 = new JLabel("Type ");
	//private JTextField t6=new JTextField("0",8);
	private String[] types= {"Wallet","Watch","Backpack",""};
	private JComboBox t6=new JComboBox(types);
	private JTextField t7=new JTextField("",23);
	private JTextField t8=new JTextField("0",23);
	private JTextField t9=new JTextField("0",23);
	private JCheckBox  cb_avail=new   JCheckBox("Available", true);
	
	
	// Menu
	JMenuBar mbar=new JMenuBar();

	JMenu    Abishek= new JMenu("Abishek");

	JMenuItem markAvail=new JMenuItem("mark Available");
	JMenuItem markUnavail=new JMenuItem("mark unavailable");
	JMenuItem exit=new JMenuItem("Exit");

	
	private JButton b1=new JButton("Next Product");
	private JButton b2=new JButton("Prev Product");        
	private JButton b4=new JButton("Clear");
    private JButton b3=new JButton("Insert");

    private JButton b5=new JButton("Order Item");
    private JButton b6=new JButton("Exit");
	private JPanel p1=new JPanel();
	private JPanel p2=new JPanel();
	private JPanel p3=new JPanel();

    private Product[] list = new Product[20];
    private int count = 8;
    private int current = 0;
    
	public MyFrame2Product(){
		super("Online Store");
		
		InitializeList();

		Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(6,2));
		l0.setFont(f); 
		content.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(l2); p1.add(t2);
		p1.add(l3); p1.add(t3);
		p1.add(l4); p1.add(t4);
		p1.add(l5); p1.add(t5);
		p1.add(l6); p1.add(t6);
		content.add(p1);
		p2.setLayout(new GridLayout(4,1));
		p2.add(t7); p2.add(t8);p2.add(t9);getContentPane().add(cb_avail);
		content.add(p2);
		p3.setLayout(new GridLayout(3,2));
		p3.add(b1); p3.add(b2);
		p3.add(b4); p3.add(b3);
		p3.add(b5); p3.add(b6);
		content.add(p3);
				
		
		b1.addActionListener(this);   b2.addActionListener(this); 
        b3.addActionListener(this);    b4.addActionListener(this); 
        b5.addActionListener(this);    b6.addActionListener(this); 
        t6.addActionListener(this); 
        markAvail.addActionListener(this); 
        markUnavail.addActionListener(this); 
        exit.addActionListener(this); 
        this.setJMenuBar(mbar);
        mbar.add(Abishek);                           // add Menu to MenuBar
        Abishek.add(markAvail);    
        Abishek.add(markUnavail);  
        refresh();
		setSize(351,500);   setVisible(true); }
	
	
    private void InitializeList()
  { 
      list[0] = new Wallet("Calvin Klein", 50, "Black", "US", "Calvin Klein", "Black", "leather");
      list[1] = new Wallet("Tommy Hilfinger", 60, "Brown", "Taiwan", "Tommy Hilfinger", "Brown", "leather");
      list[2] = new Wallet("Gucci", 430, "Black", "US", "Gucci", "Black", "leather");
      list[3] = new Watch("Rolex", 120, "Black",  "Japan", "Rolex", "Digital", "black");
      list[4] = new Watch("Fossil", 107, "blue",  "German", "Fossil", "Analog", "brown");
      list[5] = new Watch("Omega", 110, "Red",  "US", "Omega", "Analog", "red");
      list[6] = new Backpack("Nike", 60, "Red",  "UK", "Nike", "120", "water resistant");
      list[7] = new Backpack("Puma", 45, "Blue",  "Us", "Puma", "100", "waterproof");
      count = 8;
    }
    private void refresh()
    {
         t1.setText(""+list[current].readName());
         t2.setText(""+list[current].readPrice());
         t3.setText(""+list[current].readCompany());
         t4.setText(list[current].readHeadquarters());
         t5.setText(""+list[current].readOrdered());
         if (list[current].readType().equals("Wallet")) t6.setSelectedIndex(0);
         else  if (list[current].readType().equals("Watch"))  t6.setSelectedIndex(1);
         else t6.setSelectedIndex(2);
         t7.setText(list[current].readDescriptionPart1());
         t8.setText(list[current].readDescriptionPart2());
         t9.setText(list[current].readDescriptionPart3());
         if (list[current].readAvailable()==true)
        	 cb_avail.setSelected(true);
         else cb_avail.setSelected(false);
  }
	
	
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	  	
	 	if (target==markAvail){//next
	              list[current].markAvailable();
	              refresh();
	            }
	 	if (target==markUnavail){//next
            list[current].markUnavailable();
            refresh();
          }
	 	if (target==exit){//next
            System.exit(0);
          }
	  	
	 	if (target==b1){//next
	          if (current < (count - 1))
	          {
	              current++;
	              refresh();
	          }   }
	 	
	 	if (target==b2){                      //prev
	          if (current > 0)
	          {
	              current--;
	              refresh();
	          }           }
	
	 	if (target==b3){//insert
	          if (count < 20)
	          {
	        	  String nm = t1.getText();
	              int pr = Integer.parseInt(t2.getText());
	              String comp = t3.getText();
	              String na = t4.getText();	              
	              String desc1 = t7.getText();
	              String desc2 = t8.getText();
	              String desc3 = t9.getText();  
	              String type = (String)t6.getSelectedItem();
          
	              
	               if (type.contentEquals("Wallet"))list[count] = new Wallet(nm, pr, comp, na, desc1,desc2, desc3);
	               else            if (type.contentEquals("Watch"))list[count] = new Watch(nm, pr, comp, na, desc1,desc2, desc3);
	               else            list[count] = new Backpack(nm, pr, comp, na, desc1,desc2, desc3);
	               current = count;
	              count++;
	          }            }	 	
	 	
	 	if (target==b4){//clear
	          t1.setText("");
	          t2.setText("");
	          t3.setText("");
	          t4.setText("");
	          t5.setText("");
	          t6.setSelectedIndex(3);
	        t7.setText("");
	        t8.setText("");
	        t9.setText("");
      		}
	 	if (target==b5){//order item
	 		if (list[current].readAvailable()==true) {
      	        	list[current].stepOrdered();
      		       refresh();}
	             }
	 	if (target==b6){//exit
      		System.exit(0);}
	 	
	 	if (target==t6){//exit
	 		String type = (String)t6.getSelectedItem();
	 		if (type.contentEquals("Wallet")) {
	 			      t7.setText("Enter Brand");
	 			      t8.setText("Enter color");
	 			      t9.setText("Enter material");}
	 		
	 		if (type.contentEquals("Watch")) {
			      t7.setText("Enter type");
			      t8.setText("Enter brand");
			      t9.setText("Enter color");}
	 		
	 		if (type.contentEquals("Backpack")) {
			      t7.setText("Enter size");
			      t8.setText("Enter make");
			      t9.setText("Enter color");}
	 		}
      		
	 	
	 	
	 	}
	 	
	 	
	 	
	             
	 }

