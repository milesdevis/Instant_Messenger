import javax.swing.JFrame;

public class ClientTest {
	public static void main(String[] args) {
		Client slave;
		slave = new Client("172.25.35.12"); //  Server's IP: 
		slave.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		slave.startRunning();
	}
}