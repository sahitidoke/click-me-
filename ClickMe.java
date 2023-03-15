import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;
public class ClickMe extends JFrame{
	JFrame frame;  
	MyPanel panel;
	public static void main(String[] args) {
		ClickMe sjf = new ClickMe();
		sjf.Run();
	}
	public void Run() {
		frame = new JFrame("ClickMe.java");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new MyPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER); 
		frame.addMouseListener(panel);
		frame.addMouseMotionListener(panel);
		frame.setSize(500, 500);  // explicitly set size in pixels
		frame.setVisible(true);
	}
}
class MyPanel extends JPanel implements MouseListener, MouseMotionListener {
	private int xloc, yloc; 
	private boolean bool = false;
	private boolean bool2 = false;
	private boolean bool3 = false;
	private boolean bool4 = false;
	private int xloc_2, yloc_2;
	private int xloc_3, yloc_3;
	private int xloc_4, yloc_4;
	private int width, height; 
	private int width_2, height_2;
	private int width_3, height_3;
	private int width_4, height_4;
	private boolean dragging;
	private boolean dragging_2; 
	private boolean dragging_3;
	private boolean dragging_4;// are we dragging?
	private int xMouse, yMouse;  // location of mouse
	private Rectangle rect;  // rectangle
	private Rectangle rect2;
	private Rectangle rect3;  // rectangle
	private Rectangle rect4;
	private Rectangle grid1 ; 
	private Rectangle grid2 ; 
	private Rectangle grid3 ; 
	private Rectangle grid4 ; 
	private Rectangle grid5 ; 
	private Rectangle grid6 ; 
	private Rectangle grid7 ; 
	private Rectangle grid8 ; 
	private Rectangle grid9 ; 
	private Rectangle grid10 ; 
	private Rectangle grid11 ; 
	private Rectangle grid12; 
	private Rectangle grid13; 
	private Rectangle grid14; 
	private Rectangle grid15; 
	private Rectangle grid16;
	private boolean color_on_1 = false;
	private boolean color_on_2 = false;
	private boolean color_on_3 = false;
	private boolean color_on_4 = false;
	int row =(int) (Math.random()*4+1) ;
	int column = (int)(Math.random()*4+1);
	int row2=(int)(Math.random()*4+1 );
	int column2= (int)(Math.random()*4+1);
	int row3 = (int)(Math.random()*4+1);
	int column3 = (int)(Math.random()*4+1);
	int row4 = (int)(Math.random()*4+1);
	int column4 = (int)(Math.random()*4+1);
	int count = 0;
	char letter;
	public MyPanel() {
		xloc = 0;
		yloc = 0;
		xloc_2 = 100;
		yloc_2 = 0;
		xloc_3 = 200;
		yloc_3 = 0;
		xloc_4 = 300;
		yloc_4 = 0;
		dragging = false;
		dragging_2 = false;
		dragging_3 = false;
		dragging_4 = false;
		xMouse = yMouse = 0;  
		System.out.print("\n\n\n");
		System.out.println("Please put the boxes in the following locations");
		System.out.println("Blue- "+convert(row)+column+" Red- "+convert(row2)+column2+ " Yellow- "+convert(row3)+column3+" Brown- "+convert(row4)+column4);
		System.out.print("\n\n\n");
	}	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		width = getWidth();   // width of JPanel
		height = getHeight(); 
		width_2 = getWidth();
		height_2 = getHeight();
		width_3 = getWidth();
		height_3 = getHeight();
		width_4 = getWidth();
		height_4 = getHeight(); // height of JPanel
		setBackground(Color.white);
		if(color_on_1)
			g.setColor(Color.green);
		else
			g.setColor(Color.blue);
		g.fillRect(xloc, yloc, 50, 50);
		if(color_on_2)
			g.setColor(Color.green);
		else
			g.setColor(Color.red);
		g.fillRect(xloc_2, yloc_2, 50, 50);
		if (color_on_3)
			g.setColor(Color.green);
		else
			g.setColor(Color.yellow);
		g.fillRect(xloc_3, yloc_3, 50, 50);
		if (color_on_4)
			g.setColor(Color.green);
		else
			g.setColor(new Color(165, 42, 42));
		g.fillRect(xloc_4, yloc_4, 50, 50);

		int yoffset = 24;   

		rect = new Rectangle(xloc, yloc+yoffset, 50, 50);
		rect2 = new Rectangle(xloc_2, yloc_2+yoffset, 50, 50);
		rect3 = new Rectangle(xloc_3, yloc_3+yoffset, 50, 50);
		rect4 = new Rectangle(xloc_4, yloc_4+yoffset, 50, 50);
		grid1 = new Rectangle(100, 50+yoffset, 60,60); 
		grid2 = new Rectangle(160, 50+yoffset, 60,60);
		grid3 = new Rectangle(220, 50+yoffset,  60,60);
		grid4 = new Rectangle(280, 50+yoffset, 60,60); 
		grid5 = new Rectangle(100, 110+yoffset, 60,60);
		grid6 = new Rectangle(160, 110+yoffset, 60,60);
		grid7 = new Rectangle(220, 110+yoffset, 60,60);
		grid8 = new Rectangle(280, 110+yoffset, 60,60);
		grid9 = new Rectangle(100, 170+yoffset, 60,60);
		grid10 = new Rectangle(160, 170+yoffset, 60,60);
		grid11 = new Rectangle(220, 170+yoffset, 60,60);
		grid12 = new Rectangle(280, 170+yoffset, 60,60);
		grid13 = new Rectangle(100, 230+yoffset, 60,60);
		grid14 = new Rectangle(160, 230+yoffset, 60,60);
		grid15 = new Rectangle(220, 230+yoffset, 60,60);
		grid16 = new Rectangle(280, 230+yoffset, 60,60);
		int num = 0;
		int col = 0;
		int xcoor = 100;
		int ycoor = 50;
		g.setColor(Color.black);
		g.drawString("A", 50, 80);
		g.drawString("B", 50, 140);
		g.drawString("C", 50, 200);
		g.drawString("D", 50, 260);
		g.drawString("1",130, 310);
		g.drawString("2",190, 310);
		g.drawString("3",250, 310);
		g.drawString("4",310, 310);
		while (num!=4){
			while(col!=4){
				((Graphics2D)g).setStroke(new BasicStroke(3));
				g.drawRect(xcoor, ycoor, 60, 60);
				ycoor +=60;
				col++;
			}
			xcoor +=60;
			ycoor= 50;
			num++;
			col=0;
		}
	} 
	public void mouseMoved (MouseEvent e) {
		xMouse = e.getX();
		yMouse = e.getY();
		if (rect.contains(e.getX(), e.getY()))
		{		 color_on_1 = true;
		}
		else 
			color_on_1 = false;
		if (rect2.contains(e.getX(), e.getY())) {
			color_on_2 = true;
		}	 
		else
			color_on_2 = false;
		if (rect3.contains(e.getX(), e.getY())) {
			color_on_3 = true;
		}	 
		else
			color_on_3 = false;
		if (rect4.contains(e.getX(), e.getY())) {
			color_on_4 = true;
		}	 
		else
			color_on_4 = false;
		repaint();
	}
	public void mousePressed (MouseEvent e) {
		xMouse = e.getX();
		yMouse = e.getY();
		if (rect.contains(e.getX(), e.getY()))
		{		
			dragging = true;
		}
		if (rect2.contains(e.getX(), e.getY())) {
			dragging_2 = true;
		}
		if (rect3.contains(e.getX(), e.getY())) {
			dragging_3 = true;
		}
		if (rect4.contains(e.getX(), e.getY())) {
			dragging_4 = true;
		}
		repaint();
	}
	public void mouseReleased (MouseEvent e) {
			Rectangle [] [] arr = {
					{grid1, grid2, grid3, grid4}, 
					{grid5, grid6, grid7, grid8}, 
					{grid9, grid10, grid11, grid12}, 
					{grid13, grid14, grid15, grid16}};
			if(arr[row-1][column-1].contains(rect)){
				bool = true;	  
			}
			else {
				bool = false;
			}
			if(arr[row2-1][column2-1].contains(rect2)){
				bool2 = true;	  
			}
			else {
				bool2 = false;
			}
			if(arr[row3-1][column3-1].contains(rect3)){
				bool3 = true;	  
			}
			else {
				bool3 = false;
			}
			if(arr[row4-1][column4-1].contains(rect4)){
				bool4 = true;	  
			}
			else {
				bool4 = false;
			}
			if (bool&&bool2&&bool3&&bool4)
				System.exit(0);
			else {
			dragging = false; 
			dragging_2 = false; 
			dragging_3 = false;
			dragging_4 = false;
			repaint();
		}
	} 
	public void mouseClicked (MouseEvent e) {}
	public void mouseEntered (MouseEvent e) {}
	public void mouseExited (MouseEvent e) {}
	public void mouseDragged (MouseEvent e) {
		if (dragging){
			xloc = xloc+ (e.getX() - xMouse);
			yloc = yloc + (e.getY() - yMouse);
			xMouse = e.getX();  
			yMouse = e.getY();
			repaint();  
		}
		if (dragging_2) {
			xloc_2 = xloc_2 + (e.getX() - xMouse);
			yloc_2 = yloc_2 + (e.getY() - yMouse);
			xMouse = e.getX();  
			yMouse = e.getY();
			repaint();
		}
		if (dragging_3) {
			xloc_3 = xloc_3 + (e.getX() - xMouse);
			yloc_3 = yloc_3 + (e.getY() - yMouse);
			xMouse = e.getX();  
			yMouse = e.getY();
			repaint();
		}
		if (dragging_4) {
			xloc_4 = xloc_4 + (e.getX() - xMouse);
			yloc_4 = yloc_4 + (e.getY() - yMouse);
			xMouse = e.getX();  
			yMouse = e.getY();
			repaint();
		}
	}
	public char convert (int num) {
		if (num == 1) {
			return 'A';
		}
		else if (num == 2) {
			return 'B';
		}
		else if (num == 3) {
			return 'C';
		}
		else  {
			return 'D';
		}	
	}
} 
