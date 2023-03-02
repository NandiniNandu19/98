package nandini;
import java.awt.*;
import java.awt.event.*;
public class packages3 extends Frame
{
packages3()
{
	this.addWindowListener(new WindowAdapter()
			{
		public void windowClosing(WindowEvent  e)
		{
			System.exit(0);
		}
			});
}
	public static void main(String[] args) 
	{
		packages3 t=new packages3();
		t.setVisible(true);
		t.setSize(500,600);
		t.setTitle("bhavya computers");
		t.setBackground(Color.BLUE);
		t.setLayout(new FlowLayout());
		Label l=new Label("enter your name");
		TextField r=new TextField(20);
		Label l2=new Label("enter another  name");
		TextArea tx=new TextArea(4,100);
		tx.setText("pavan");
		tx.append("jeevan");
		System.out.println(tx.getText());
		t.add(l);
		t.add(r);
		t.add(l2);
		t.add(tx);
		Choice ch=new Choice();
		ch.add("ap");
		ch.add("tn");
		ch.add("ka");
		ch.add("hyd");
		t.add(ch);
		System.out.println(ch.getItem(0));
		System.out.println(ch.getSelectedItem());
		System.out.println(ch.getSelectedIndex());
		List l1=new List(4,true);
		l1.add("a");
		l1.add("cpp");
		l1.add("java");
		l1.add("python");
		System.out.println(l1.getItem(0));
		System.out.println(l1.getSelectedItem());
		t.add(l1);
		Checkbox cb=new Checkbox("mpc,true");
		t.add(cb);
		CheckboxGroup cg=new CheckboxGroup();
		Checkbox cb1=new Checkbox("female,cg,true");
		System.out.println(cb.getLabel());
		System.out.println(cb.getState());
		System.out.println(cb1.getLabel());
		System.out.println(cb1.getState());
		Button b=new Button("ok");
		t.add(b);
	}

}
