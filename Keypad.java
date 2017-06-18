import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Enumeration;

public class Keypad implements SerialPortEventListener {

	String keybord;
	SerialPort serialPort;
	Keypad Keypad = null;
	/** The port we're normally going to use. */
	private static final String PORT_NAMES[] = { "COM1", "COM2", "COM3", "COM4", "COM5" };
	/**
	 * A BufferedReader which will be fed by a InputStreamReader converting the
	 * bytes into characters making the displayed results codepage independent
	 */
	private BufferedReader input;
	/** The output stream to the port */
	private OutputStream output;
	/** Milliseconds to block while waiting for port open */
	private static final int TIME_OUT = 3000;
	/** Default bits per second for COM port. */
	private static final int DATA_RATE = 9600;

	public void initialize() {
		CommPortIdentifier portId = null;
		Enumeration portEnum = CommPortIdentifier.getPortIdentifiers();
		// First, Find an instance of serial port as set in PORT_NAMES.
		while (portEnum.hasMoreElements()) {
			CommPortIdentifier currPortId = (CommPortIdentifier) portEnum.nextElement();
			for (String portName : PORT_NAMES) {
				if (currPortId.getName().equals(portName)) {
					portId = currPortId;
					break;
				}
			}
		}
		if (portId == null) {
			System.out.println("Could not find COM port.");
			return;
		}
		try {
			// open serial port, and use class name for the appName.
			serialPort = (SerialPort) portId.open(this.getClass().getName(), TIME_OUT);
			// set port parameters
			serialPort.setSerialPortParams(DATA_RATE, SerialPort.DATABITS_8, SerialPort.STOPBITS_1,
					SerialPort.PARITY_NONE);
			// open the streams
			input = new BufferedReader(new InputStreamReader(serialPort.getInputStream()));
			output = serialPort.getOutputStream();
			// add event listeners
			serialPort.addEventListener(this);
			serialPort.notifyOnDataAvailable(true);
		} catch (Exception e) {
			// System.err.println(e.toString());
		}
	}

	Keypad() {
		initialize();

	}

	public static void main(String args[]) {
		new Keypad();

	}

	public void serialEvent(SerialPortEvent spe) {
		if (spe.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
			try {
				String inputLine = input.readLine();
				System.out.println(inputLine);
				String pincoden = inputLine;
				
				Robot Robo = new Robot();

				switch (inputLine) {
				case "1":
					Robo.keyPress(KeyEvent.VK_NUMPAD1);
					break;
				case "2":
					Robo.keyPress(KeyEvent.VK_NUMPAD2);
					break;
				case "3":
					Robo.keyPress(KeyEvent.VK_NUMPAD3);
					break;
				case "4":
					Robo.keyPress(KeyEvent.VK_NUMPAD4);
					break;
				case "5":
					Robo.keyPress(KeyEvent.VK_NUMPAD5);
					break;
				case "6":
					Robo.keyPress(KeyEvent.VK_NUMPAD6);
					break;
				case "7":
					Robo.keyPress(KeyEvent.VK_NUMPAD7);
					break;
				case "8":
					Robo.keyPress(KeyEvent.VK_NUMPAD8);
					break;
				case "9":
					Robo.keyPress(KeyEvent.VK_NUMPAD9);
					break;
				case "0":
					Robo.keyPress(KeyEvent.VK_NUMPAD0);
					break;
				case "A":
					Robo.keyPress(KeyEvent.VK_A);
					break;
				case "B":
					Robo.keyPress(KeyEvent.VK_B);
					break;
				case "C":
					Robo.keyPress(KeyEvent.VK_C);
					break;
				case "D":
					Robo.keyPress(KeyEvent.VK_D);
					break;
				case "*":
					Robo.keyPress(KeyEvent.VK_BACK_SPACE);
					break;
				case "#":
					Robo.keyPress(KeyEvent.VK_TAB); 
					break;
				}

			} catch (Exception e) {
				 //e.printStackTrace();
			}


		}

	}

}