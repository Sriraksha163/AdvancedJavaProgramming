import javax.swing.*;
import javax.swing.event.*;
import java.util.HashMap;

public class CountryCapitalListExample extends JFrame {
    private JList<String> countryList;
    private HashMap<String, String> countryCapitals;

    public CountryCapitalListExample() {
        setTitle("Country & Capital List");
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] countries = {"USA", "India", "Vietnam", "Canada", "Denmark", "France", 
                              "Great Britain", "Japan", "Africa", "Greenland", "Singapore"};

        countryCapitals = new HashMap<>();
        countryCapitals.put("USA", "Washington, D.C.");
        countryCapitals.put("India", "New Delhi");
        countryCapitals.put("Vietnam", "Hanoi");
        countryCapitals.put("Canada", "Ottawa");
        countryCapitals.put("Denmark", "Copenhagen");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Great Britain", "London");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("Africa", "Pretoria (administrative)");
        countryCapitals.put("Greenland", "Nuuk");
        countryCapitals.put("Singapore", "Singapore");

        countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        countryList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                java.util.List<String> selected = countryList.getSelectedValuesList();
                for (String country : selected) {
                    System.out.println(country + " -> Capital: " + countryCapitals.get(country));
                }
            }
        });

        add(new JScrollPane(countryList));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CountryCapitalListExample().setVisible(true));
    }
}
