package IOC;

/**
 * Singleton is concept main reason not to create an object singleton class
 * useful to data connection class, class loader, loggers,
 * 
 * @author anupsarvade
 *
 */

public class Connection {

	private static Connection conn = null;

	private Connection() {

	}

	public static Connection createObject() {

		if (null == conn) {
			conn = new Connection();
		}

		return conn;
	}

}
