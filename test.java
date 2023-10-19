public class SQLvulnerability
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection(
			"jdbc:mysql://localhost/database",
			"username", "password");
		Scanner s = new Scanner(System.in);
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM table WHERE name = ?;");
		stmt.setString(1, s.next());

		stmt.executeQuery();
		conn.close();
	}
}
