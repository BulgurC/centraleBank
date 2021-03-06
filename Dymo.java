import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Dymo extends Bankgui{
	private PageFormat mPageFormat;
	public String[] message = { "Geek inc", " uw saldo:" + " \u20AC" + "250" };
	static boolean voorbeeld = false;

	//
	public static void main(String[] args) {
		Dymo ps = new Dymo();
		ps.preview();
		if (voorbeeld) {
			ps.preview();
		}
	}

	public void preview() {
		JFrame frame = new JFrame();
		frame.add(new OpScherm());
		frame.setTitle("Preview van label 99014");
		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public Dymo() {
		if (!voorbeeld) {
			PrinterJob pj = PrinterJob.getPrinterJob();
			mPageFormat = new PageFormat();
			Paper paper = new Paper();
			// mPageFormat.setOrientation(mPageFormat.LANDSCAPE);
			paper.setImageableArea(0, 0, 160, 290);
			paper.setSize(160, 290);
			mPageFormat.setPaper(paper);
			pj.setPrintable(new OutPrintable(), mPageFormat);
			// if (pj.printDialog())
			{
				try {
					pj.print();
				} catch (PrinterException e) {
					System.out.println(e);
				}
			}
		}
	}

	public void makeGraphics(Graphics2D g3) {
		g3.setColor(Color.white);
		g3.fillRect(0, 0, 160, 280);
		Image img = new ImageIcon("c:/logo.gif").getImage();
		g3.drawImage(img, 25, 15, 36, 36, null);
		g3.setColor(Color.black);
		g3.setFont(new Font("Monospaced", Font.BOLD, 25));
		g3.drawString(message[0], 25, 70);

		g3.setFont(new Font("Monospaced", Font.BOLD, 12));
		g3.drawString(message[1], 15, 100);
		g3.drawLine(10, 280, 150, 280);
	}

	class OutPrintable implements Printable {
		public int print(Graphics g, PageFormat pf, int pageIndex) {
			if (pageIndex != 0) {
				return NO_SUCH_PAGE;
			}
			Graphics2D g2 = (Graphics2D) g;
			makeGraphics(g2);
			return PAGE_EXISTS;
		}
	}

	class OpScherm extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			makeGraphics(g2);
		}
	}
}