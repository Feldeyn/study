package lesson23;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PhoneDAO {
    public static final String SQL_SELECT_ALL_USERS = "SELECT * FROM phones";


    public List<Phone> findAll() {
        List<Phone> phonesResult = new ArrayList<>();
        try (Connection connection = ConnectorDB.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL_USERS);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                int usersId = resultSet.getInt("user_id");
                String phoneNumber = resultSet.getString(3);
                Phone phone = new Phone(id, usersId, phoneNumber);
                phonesResult.add(phone);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return phonesResult;
    }
}
