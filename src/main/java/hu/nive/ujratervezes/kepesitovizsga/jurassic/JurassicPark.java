package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JurassicPark {

    private DataSource dataSource;

    public JurassicPark(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public List<String>checkOverpopulation() {
        List<String> results = new ArrayList<>();

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT breed FROM dinosaur WHERE actual > 20 order by breed")) {
            //stmt.setString(1, "expected");
            addDinoToList(results, stmt);

        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not connect", sqle);
        }
        return results;
    }

    private void addDinoToList(List<String> results, PreparedStatement statement) throws SQLException {

        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                results.add(resultSet.getString("breed"));
            }
        }
    }
}
