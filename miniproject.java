import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import java.util.regex.*;


public class finl2
{
		JFrame f,f1,j;
		JTextField tp1,t1,t2,t3,tt1,tt2,tt3;
		JPasswordField p2;
		JButton bp1,bp2,bp3,bs2,bs1,b1,b2,b3,u1,u2,u3,u4,u5,u21;
		JComboBox cb4,cb5,cb6,cb7,cb8,cb9,jb1,jb2,jb3,jb4,jb5,jb6;
		JRadioButton j1,j2,r1,r2;
		ButtonGroup bg,btn1;
		JScrollPane jsp;
		JLabel lp1,lp2,lp3,ls1,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,lt1,lt2,lt3,lt4,lt5,lt6,lt7,lt8,lt9,lt10;
		
		JTextArea ta1;
		String ur,pa;
		String regex1="(91)?[7-9][0-9]{9}";
	
	finl2()
	{
		display();
	}
	
	void display()
	{
			Font fo=new Font("Calibri",Font.BOLD,20);
			Font fo1=new Font("Calibri",Font.BOLD,15);
			Color c=new Color(220,220,220);
			Color c1=new Color(48,65,74);
			Color c2=new Color(255,99,71);
			Color c3=new Color(88,200,255);
			Color c4=new Color(255,128,0);
			
			JFrame f=new JFrame("Login Page");
			f.setSize(600,600);
			f.setVisible(true);
		    f.setBackground(Color.WHITE);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container con=f.getContentPane();
			con.setBackground(c1);
				
			JLabel lp1=new JLabel("LOGIN PAGE");
			lp1.setFont(fo);
			lp1.setForeground(c);
			lp1.setBounds(225,20,360,35);
					
			JLabel lp2=new JLabel("User Name");
			lp2.setBounds(80,70,100,20);
			lp2.setForeground(Color.white);
			lp2.setFont(fo1);
			
			JLabel lp3=new JLabel("Password");
			lp3.setBounds(80,100,100,20);
			lp3.setForeground(Color.white);
			lp3.setFont(fo1);
			
			JTextField tp1=new JTextField();
			tp1.setBounds(250,70,250,20); 
			tp1.setBackground(c);
			
			JPasswordField p2 = new JPasswordField();
			p2.setBackground(c);
			p2.setBounds(250,100,250,20);
			
			JButton bp1=new JButton("Login");
			bp1.setBounds(130,150,70,30);
			bp1.setBackground(c3);
			bp1.setFont(fo1);
			bp1.setForeground(Color.white);
				
			
			bp1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e1)
			{
				String user = tp1.getText();
				String pass = p2.getText();
					
				try
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");  
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");  
					PreparedStatement stmt=con.prepareStatement("select username,password from log3");  
					ResultSet rs=stmt.executeQuery();
					
					if(rs.next()) 
					{
						if(user.equals(rs.getString("username")) &&  pass.equals(rs.getString("password"))) 
						{
							JFrame j=new JFrame("select");
	
							j.setSize(600,600);
							j.setVisible(true);
							f.setVisible(false);
							j.setLayout(null);
							Container co=j.getContentPane();
							co.setBackground(c1);
							
							JLabel ls1=new JLabel("Select any one");
							ls1.setBounds(225,20,360,35);
							ls1.setFont(fo);
							ls1.setForeground(c);
						
							JButton btlog=new JButton("Logout");
							btlog.setBounds(250,150,90,40);
							btlog.setBackground(c2);
							btlog.setForeground(Color.white);
			btlog.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent q3)
			{
							f.setVisible(true);
							j.setVisible(false);
							tp1.setText("");
							p2.setText("");
			}
			});
							bs1=new JButton("User");
							bs1.setBounds(130,90,150,40);
							bs1.setForeground(Color.white);
							bs1.setBackground(c4);
							bs1.addActionListener(new ActionListener(){
									
			public void actionPerformed(ActionEvent x)
			{
							JFrame jj1=new JFrame("User information");					
							jj1.setSize(600,700);
							jj1.setVisible(true);
							jj1.setLayout(null);
							jj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							j.setVisible(false);
			
							JLabel lt3=new JLabel("USER INFORMATION");
							lt3.setFont(fo);
							lt3.setForeground(c);
							lt3.setBounds(225,20,360,35);
							jj1.add(lt3);
			
							Container cn=jj1.getContentPane();                    
							cn.setBackground(c1);
			
		    
							lt1=new JLabel("User Name:");
							lt1.setFont(fo1);
							lt1.setForeground(c);
			
							tt1=new JTextField();			
							lt1.setBounds(50,70,150,20);
							tt1.setBounds(250,70,300,20);
							tt1.setBackground(c);
							tt1.setForeground(Color.BLACK);
							jj1.add(lt1);
							jj1.add(tt1);
			
							lt2=new JLabel("Mobile No:");
							lt2.setFont(fo1);
							lt2.setForeground(c);
							
							tt2=new JTextField();		
							tt2.setBackground(c);
							tt2.setForeground(Color.BLACK);
							lt2.setBounds(50,100,150,20);
							tt2.setBounds(250,100,300,20);
							jj1.add(lt2);
							jj1.add(tt2);
			
			
							lt4=new JLabel("City of User:");
							lt4.setFont(fo1);
							lt4.setForeground(c);
							jb1=new JComboBox();
							jb1.addItem("");
							jb1.addItem("Sangli");
							jb1.addItem("Satara");
							jb1.addItem("Pune");
							jb1.addItem("Kolhapur");
							lt4.setBounds(50,130,150,20);				
							jb1.setBounds(250,130,300,20);
							jj1.add(lt4);
							jj1.add(jb1);
			
			
							lt5=new JLabel("Working Field of Worker:");
							lt5.setFont(fo1);
							lt5.setForeground(c);
			
							jb2=new JComboBox();
							jb2.addItem("");
							jb2.addItem("Plumber");
							jb2.addItem("Electrician");
							jb2.addItem("Fabricator");
							jb2.addItem("Welder");
							lt5.setBounds(50,160,180,20);
							jb2.setBounds(250,160,300,20);
							jj1.add(lt5);
							jj1.add(jb2);
							
							lt6=new JLabel("Workers Gender:");
							lt6.setFont(fo1)	;
							lt6.setForeground(c);
							lt6.setBounds(50,195,150,20);				
							jj1.add(lt6);
							r1=new JRadioButton("Male");
							r1.setFont(fo1);
							r1.setForeground(c);			
							r1.setBounds(250,190,150,30);				
							jj1.add(r1);
							r2=new JRadioButton("Female");
							r2.setFont(fo1);
							r2.setForeground(c);
							r2.setBounds(400,190,160,30);				
							jj1.add(r2);
							btn1=new ButtonGroup();
							r1.setBackground(c1);
							r2.setBackground(c1);
							btn1.add(r1);
							btn1.add(r2);
			
							lt7=new JLabel("Date of Order:");			
							lt7.setFont(fo1);
							lt7.setForeground(c);
							lt7.setBounds(50,215,250,50);				
							jj1.add(lt7);
			
							String[] arr2=new String[31];
							for(int i=1;i<=31;i++)
							{
								arr2[i-1]=Integer.toString(i);
								
							}
							lt8=new JLabel("Day:");						
							lt8.setFont(fo1);
							lt8.setForeground(c);
							jb3=new JComboBox(arr2);
							lt8.setBounds(200,230,150,20);				
							jb3.setBounds(235,230,150,20);
							jb3.setSize(40,20);
							jb3.setEditable(false);
							jj1.add(lt8);
							jj1.add(jb3);
			
			
							String[] arr3={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
							lt9=new JLabel("Month:");
							lt9.setFont(fo1);
							lt9.setForeground(c);
							jb4=new JComboBox(arr3);
							lt9.setBounds(300,230,150,20);				
							jb4.setBounds(355,230,150,20);
							jb4.setSize(50,20);
							jb4.setEditable(false);
							jj1.add(lt9);
							jj1.add(jb4);
							
			
							String[] arr4= new String[35];
							for(int k=1965;k<=1999;k++)
							{
								arr4[k-1965]=Integer.toString(k);			
								
							}
							lt10=new JLabel("Year:");
							lt10.setFont(fo1);
							lt10.setForeground(c);
							jb5=new JComboBox(arr4);
							lt10.setBounds(435,230,150,20);				
							jb5.setBounds(475,230,150,20);
							jb5.setSize(70,20);
							jb5.setEditable(false);
							jj1.add(lt10);
							jj1.add(jb5);
			
							u1=new JButton("Search");
							u2=new JButton("Reset");
							u3=new JButton("Back");
							u21=new JButton("Save Record");
							u21.setBackground(c3);
							u1.setBackground(c3);
							u2.setBackground(c4);
							u3.setBackground(c2);
							u21.setForeground(Color.white);
							u1.setForeground(Color.white);
							u2.setForeground(Color.white);
							u3.setForeground(Color.white);
			
							ta1=new JTextArea(10,20);
							ta1.setBackground(c);
							ta1.setEditable(false);
							jj1.add(ta1);
							jsp=new JScrollPane(ta1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
							jj1.add(jsp);
							jsp.setBounds(200,330,200,200);
			
			u1.setBounds(100,270,90,30);
			u1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent q1)
			{
					Pattern pmb1=Pattern.compile("^[7-9][0-9]{9}$");
					Matcher mmb1=pmb1.matcher(tt2.getText());	
				
					Pattern pnm1=Pattern.compile("^[a-zA-Z][a-zA-Z\\s]+$");
					Matcher mnm1=pnm1.matcher(tt1.getText());
				
					
					
					String wn=tt1.getText().toString();
					String mn=tt2.getText().toString();
					String cty=jb1.getSelectedItem().toString();
					String wf=jb2.getSelectedItem().toString();
				//String male=r1.getSelectedItem().toString();
				//String female=r2.getSelectedItem().toString();
				
				
					try
					{
						Class.forName("oracle.jdbc.driver.OracleDriver");  
						Connection con2=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
						Statement stmt2=con2.createStatement();
						ResultSet rst2=stmt2.executeQuery("select * from mp1 where CITY='"+cty+"' and FIELD='"+wf+"'");
						if(rst2.next())
						{
							do
							{
								ta1.append("name:");
								ta1.append(rst2.getString(1)+ "\n" );
								ta1.append("city:");
								ta1.append(rst2.getString(2)+ "\n" );
								ta1.append("Worker Field:");
								ta1.append(rst2.getString(3)+"\n" );
								ta1.append("mobile:");
								ta1.append(rst2.getString(4)+"\n" );
								ta1.append("************************************************\n");
							   // ta1.append(Integer.toString(rst2.getInt(4))+ "\n" );
					
							}while(rst2.next());
				
						}
						else if(wn.equals(""))
						{
								JOptionPane.showMessageDialog(null,"please enter your name!!");
				
						}
						else if(!mnm1.matches())
						{
								JOptionPane.showMessageDialog(null,"Please enter valid name!!");
					
				
						}
			
						else if(mn.equals(""))
						{
								JOptionPane.showMessageDialog(null,"please enter your mobile number!!");
				
						}
						
						else if(!mmb1.matches())
						{
							JOptionPane.showMessageDialog(null,"Please Enter valid Mobile No!!");
					
						}
			
						else if(cty.equals(""))
						{
							JOptionPane.showMessageDialog(null,"please select city!!");
						}
			
						else if(wf.equals(""))
						{
							JOptionPane.showMessageDialog(null,"please select field of worker");	
			
						}
							
						else if(r1.equals(""))
						{
							JOptionPane.showMessageDialog(null,"please select Gender");	
						
						}
						else if(r2.equals(""))
						{
							JOptionPane.showMessageDialog(null,"please select Gender");	
						
						}
			
						else
						{
							JOptionPane.showMessageDialog(null,"Worker doesn't exists");
						}
							
						rst2.close();
						con2.close();
			
			
             
			
					}catch(Exception g)
					{
						System.out.println(g);
					}
				
			}
			});	
			u2.setBounds(250,270,90,30);
			u2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent q2)
			{
					tt1.setText(null);
					tt2.setText(null);						
					jb1.setSelectedIndex(0);
					jb2.setSelectedIndex(0);
					btn1.clearSelection();
					jb3.setSelectedIndex(0);
					jb4.setSelectedIndex(0);
					jb5.setSelectedIndex(0);
					ta1.setText(null);
			}
			});
			u21.setBounds(250,550,150,30);
			u21.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent q21)
			{		String save=ta1.getText();
					String wn=tt1.getText().toString();
					String mn=tt2.getText().toString();
					String cty=jb1.getSelectedItem().toString();
					String wf=jb2.getSelectedItem().toString();
					String day=jb3.getSelectedItem().toString();
					String mon=jb4.getSelectedItem().toString();
					String year=jb5.getSelectedItem().toString();
							//String male=r1.getSelectedItem().toString();
							//String female=r2.getSelectedItem().toString();
							
							
					if(save.equals(""))
					{
						JOptionPane.showMessageDialog(null,"please fill the information");
						
					}
					else
					{
					
						try
						{
							FileWriter file=new FileWriter("H:/abc.txt",true);
							file.write("****Customer Information****");
							file.write(System.getProperty("line.separator"));
							file.write("Customer Name:"+wn);
							file.write(System.getProperty("line.separator"));
							file.write("Customer mobile no:"+mn);
							file.write(System.getProperty("line.separator"));
							file.write("Customer city:"+cty);
							file.write(System.getProperty("line.separator"));
							file.write("type of worker:"+wf);
							file.write(System.getProperty("line.separator"));
							file.write("Date of Order:"+day+"/"+mon+"/"+year);
							file.write(System.getProperty("line.separator"));
							file.write("****Order of Customer****");
							file.write(System.getProperty("line.separator"));
							file.write(save);
							file.write(System.getProperty("line.separator"));
							file.close();

						
						}catch(Exception e1)
						{
							System.out.println(e1);
						
						}
							JOptionPane.showMessageDialog(null,"record stored!!");
					}
			}
			});
			u3.setBounds(400,270,90,30);
			u3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent q3)
			{
				j.setVisible(true);
				jj1.setVisible(false);
			}
			});
				jj1.add(u1);
				jj1.add(u2);
				jj1.add(u3);
				jj1.add(u21);
			}
			});
				
				bs2=new JButton("Worker");
				bs2.setBounds(320,90,150,40);
				bs2.setForeground(Color.white);
				bs2.setBackground(c4);
				bs2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e5)
				{
										
					JFrame z=new JFrame();
					z.setTitle("worker information");
					z.setSize(600,600);
					z.setVisible(true);
					z.setLayout(null);
					z.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					j.setVisible(false);
					Container cn=z.getContentPane();
					cn.setBackground(c1);
			
			
					l3=new JLabel("WORKER INFORMATION");
					l3.setForeground(c);
					l3.setBounds(225,20,400,35);
					l3.setFont(fo);
					z.add(l3);
			
					l1=new JLabel("Worker Name");
					t1=new JTextField();
					l1.setBounds(50,70,150,20);
					t1.setBounds(250,70,250,20);
					t1.setBackground(c);
					t1.setForeground(Color.BLACK);
					l1.setFont(fo1);
					l1.setForeground(c);
					z.add(l1);
					z.add(t1);
			
					l2=new JLabel("Mobile number");
					t2=new JTextField();
					t2.setForeground(Color.BLACK);
					t2.setBackground(c);
					l2.setFont(fo1);
					l2.setForeground(c);
					l2.setBounds(50,100,150,20);
					t2.setBounds(250,100,250,20);
					z.add(l2);
					z.add(t2);
			
					l4=new JLabel("City");
					l4.setBounds(50,130,150,20);
					l4.setFont(fo1);
					l4.setForeground(c);
					z.add(l4);
					cb4=new JComboBox();
					cb4.addItem("");
					cb4.addItem("Sangli");
					cb4.addItem("Satara");
					cb4.addItem("Pune");
					cb4.addItem("Kolhapur");
					cb4.setBounds(250,130,250,20);
					cb4.setBackground(c);
					z.add(cb4);
			
					l5=new JLabel("Working Field");
					l5.setBounds(50,160,150,20);
					l5.setFont(fo1);
					l5.setForeground(c);
					z.add(l5);
					cb5=new JComboBox();
					cb5.addItem("");
					cb5.addItem("Plumber");
					cb5.addItem("Electrician");
					cb5.addItem("Fabricator");
					cb5.addItem("Welder");
					cb5.setBounds(250,160,250,20);
					cb5.setBackground(c);
					z.add(cb5);
			
					l6=new JLabel("Gender");
					l6.setBounds(50,195,150,20);
					l6.setFont(fo1);
					l6.setForeground(c);
					z.add(l6);
					j1=new JRadioButton("MALE");
					j1.setBounds(250,190,65,30);
					j1.setFont(fo1);
					j1.setForeground(c);
					z.add(j1);
					j2=new JRadioButton("FEMALE");
					j2.setBounds(400,190,160,30);
					j2.setFont(fo1);
					j2.setForeground(c);
					z.add(j2);
					bg=new ButtonGroup();
					j1.setBackground(c1);
					j2.setBackground(c1);
					bg.add(j1);
					bg.add(j2);
			
					l7=new JLabel("Birth Date");
					l7.setBounds(50,215,250,50);
					l7.setFont(fo1);
					l7.setForeground(c);
					z.add(l7);
			
					String[] arr2=new String[31];
					for(int i=1;i<=31;i++)
					{
						arr2[i-1]=Integer.toString(i);
						
					}
					l8=new JLabel("Day");
					l8.setFont(fo1);
					l8.setForeground(c);
					cb6=new JComboBox(arr2);
					l8.setBounds(200,230,150,20);
					cb6.setBounds(235,230,150,20);
					cb6.setSize(40,20);
					cb6.setEditable(false);
					z.add(l8);
					z.add(cb6);
			
					String[] arr3={"jan","feb","mar","apr","may","jun","jul","aug","sept","oct","nov","dec"};
					l9=new JLabel("Month");
					l9.setFont(fo1);
					l9.setForeground(c);
					cb7=new JComboBox(arr3);
					l9.setBounds(300,230,150,20);
					cb7.setBounds(355,230,150,20);
					cb7.setSize(50,20);
					cb7.setEditable(false);
					z.add(l9);
					z.add(cb7);
					
					
					String[] arr4= new String[35];
					for(int j=1965;j<=1999;j++)
					{
						arr4[j-1965]=Integer.toString(j);
						
					}
					l10=new JLabel("Year");
					l10.setFont(fo1);
					l10.setForeground(c);
					cb8=new JComboBox(arr4);
					l10.setBounds(435,230,150,20);
					cb8.setBounds(475,230,150,20);
					cb8.setSize(70,20);
					cb8.setEditable(false);
					z.add(l10);
					z.add(cb8);
			
					b1=new JButton("Save");
					b2=new JButton("Back");
					b3=new JButton("Reset");
					b1.setBackground(c3);
					b2.setBackground(c2);
					b3.setBackground(c4);
					b1.setForeground(Color.white);
					b2.setForeground(Color.white);
					b3.setForeground(Color.white);
		
			b1.setBounds(100,270,90,35);
			b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
					
					Pattern pmb=Pattern.compile("^[7-9][0-9]{9}$");
					Matcher mmb=pmb.matcher(t2.getText());	
					
					Pattern pnm=Pattern.compile("^[a-zA-Z][a-zA-Z\\s]+$");
					Matcher mnm=pnm.matcher(t1.getText());
					
					String wn=t1.getText().toString();
					String mn=t2.getText().toString();
					
					String cty=cb4.getSelectedItem().toString();
					String wf=cb5.getSelectedItem().toString();
				
					if(wn.equals(""))
					{
						JOptionPane.showMessageDialog(null,"Please enter Worker Name");
					}
					
					else if(!mnm.matches())
					{
						JOptionPane.showMessageDialog(null,"Please enter valid name!!");
						
					}
					
					else if(mn.equals(""))
					{
						JOptionPane.showMessageDialog(null,"Please Enter your Mobile No");
					}
					
					else if(!mmb.matches())
					{
						JOptionPane.showMessageDialog(null,"Please Enter valid Mobile No!!");
						
					}
					
					else if(cty.equals(""))
					{
						JOptionPane.showMessageDialog(null,"Please Select City");
					}
					
					else if(wf.equals(""))
					{
						JOptionPane.showMessageDialog(null,"Please select working field");
					}
					
				
					else
					{
						try
						{
							Class.forName("oracle.jdbc.driver.OracleDriver");  
							Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
							Statement stmt1=con1.createStatement();
							String sql="insert into mp1 values"+"('"+wn+"','"+cty+"','"+wf+"','"+mn+"')";
							int i1= stmt1.executeUpdate(sql);
							if(i1!=0)
							{
								JOptionPane.showMessageDialog(null,"Information Saved Successfully");
							}
							else
							{
								JOptionPane.showMessageDialog(null,"Information Saved Unsuccessfully");
							}
						
							stmt1.close();
							con1.close();
						}
						catch(Exception e1)
						{
							System.out.println(e1);
							
						}

					
					
					}
				
			}
			});
			b3.setBounds(250,270,90,35);
			b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e2)
			{
					t1.setText(null);
					t2.setText(null);
					cb4.setSelectedIndex(0);
					cb5.setSelectedIndex(0);
					cb4.setSelectedIndex(0);
					bg.clearSelection();
					cb6.setSelectedIndex(0);
					cb7.setSelectedIndex(0);
					cb8.setSelectedIndex(0);
					
			}
				
			});

			b2.setBounds(400,270,90,35);
			b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e3)
			{
					j.setVisible(true);
					z.setVisible(false);
			}
			});
					z.add(b1);
					z.add(b2);
					z.add(b3);
												
				}
									
				});
								
									

					j.add(ls1);
					j.add(bs1);
					j.add(bs2);
					j.add(btlog);
						}
				
				
			else if(user.equals("")&&pass.equals("")||user.equals("")||pass.equals(""))
			{
				JOptionPane.showMessageDialog(null,"enter fields");
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Incorrect username or password");
			}
			}
				}
				catch(Exception y1)
				{
					System.out.println(y1);
				}
						
		}
		});
			
				JButton bp2=new JButton("Exit");
				bp2.setBounds(330,150,70,30);
				bp2.setBackground(c2);
				bp2.setFont(fo1);
				bp2.setForeground(Color.white);
		bp2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
		{
				System.exit(0);
		}				
		});
				JButton bp3=new JButton("Reset");
				bp3.setBounds(230,150,70,30);
				bp3.setBackground(c4);
				bp3.setFont(fo1);
				bp3.setForeground(Color.white);
		bp3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
		{
				JFrame j2=new JFrame("Reset Password");
				j2.setSize(620,600);
				j2.setVisible(true);
				f.setVisible(false);
				j2.setLayout(null);
				Container cor=j2.getContentPane();
				cor.setBackground(c1);
					
				JLabel lr1=new JLabel("RESET PASSWORD");
				lr1.setBounds(150,25,220,30);
				lr1.setFont(fo);
				lr1.setForeground(c);
							
				JLabel lr3=new JLabel("Enter key:");
				lr3.setForeground(Color.white);
				lr3.setBounds(70,110,110,20);
				lr3.setFont(fo1);
							
				JTextField pr1=new JTextField();
				pr1.setBounds(200,110,200,20);
				pr1.setBackground(c);
								
				JLabel lr4=new JLabel("New username:");
				lr4.setForeground(Color.white);
				lr4.setBounds(70,150,110,20);
				lr4.setFont(fo1);
							
				JLabel lr5=new JLabel("New Password:");
				lr5.setForeground(Color.white);
				lr5.setBounds(70,190,110,20);
				lr5.setFont(fo1);
							
				JTextField tr2=new JTextField();
				tr2.setBackground(c);
				tr2.setBounds(200,150,200,20);
				JPasswordField tr3=new JPasswordField();
				tr3.setBackground(c);
				tr3.setBounds(200,190,200,20);
							
				JButton br1=new JButton("Set");
				br1.setBounds(150,230,80,30);
				br1.setBackground(c4);
				br1.setFont(fo1);
				br1.setForeground(Color.white);
				br1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
		{
										
			try
			{
				String ukey=pr1.getText();
				String uname=tr2.getText();
				String upass=tr3.getText();
				Class.forName("oracle.jdbc.driver.OracleDriver");  
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");  
				Statement stmt=con.createStatement();  							
				ResultSet rs=stmt.executeQuery("select * from log3 where urn='"+ukey+"'");
						
				while(rs.next())
				{
												
					String key2="update log3 set username='"+uname+"', password='"+upass+"'  where urn='"+ukey+"'";
					int i1=stmt.executeUpdate(key2);
												
					if(i1!=0)
					{
						JOptionPane.showMessageDialog(null,"username reset successfully!!");						
					}							
												
					else
					{
						JOptionPane.showMessageDialog(null,"username reset unsuccessfully!!");
								
					}
											
											
												
				}
						rs.close();					
						stmt.close();
						con.close();					
											
			}catch(Exception es)
			{
						System.out.println(es);
			}					
																		
			
		}				
		});
						JButton br2=new JButton("Back");
						br2.setBackground(c2);
						br2.setBounds(260,230,80,30);					
					
					
												
		br2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e3)
		{
					f.setVisible(true);
					j2.setVisible(false);
		}
		});
					j2.add(lr1);
					j2.add(lr5);
					j2.add(br2);
					j2.add(lr4);
					j2.add(pr1);
					j2.add(lr3);
					j2.add(tr3);
					j2.add(tr2);
					j2.add(br1);
		}
		});
					f.add(lp1);
					f.add(lp2);
					f.add(tp1);
					f.add(lp3);
					f.add(p2);
					f.add(bp1);
					f.add(bp2);
					f.add(bp3);
					f.setLayout(null);
	}
		
	

public static void main(String []args)
{
		finl2 l=new finl2();
		
		
}
}
