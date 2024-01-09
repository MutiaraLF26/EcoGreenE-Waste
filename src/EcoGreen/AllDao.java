package EcoGreen;

import db.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * Author: alif
 */
public class AllDao {
    private MySqlConnection mySqlConnection;

    public AllDao() {
        this.mySqlConnection = MySqlConnection.getInstance();
    }

    // Method to get user data
//    public void getUserData() {
//        String query = "SELECT username, email, alamat, tgl_lahir FROM user";
//
//        try (Connection connection = mySqlConnection.getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(query);
//             ResultSet resultSet = preparedStatement.executeQuery()) {
//
//            while (resultSet.next()) {
//                String username = resultSet.getString("username");
//                String email = resultSet.getString("email");
//                String alamat = resultSet.getString("alamat");
//                String tgl_lahir = resultSet.getString("tgl_lahir");
//
//                // Do something with the user data
//                System.out.println("Username: " + username + ", Email: " + email + ", Alamat: " + alamat + ", Tanggal Lahir: " + tgl_lahir);
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
    
        public ResultSet getUserData() {
        String query = "SELECT username, email, alamat, tgl_lahir FROM user";

        try {
            Connection connection = mySqlConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            return resultSet;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
