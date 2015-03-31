import javax.swing.*;
import java.awt.*;

public class DataEntryGUI extends JFrame
{
    int numberOfProducts;
    Integer[] options={1,2,3,4,5,6};
    int count;

    private JLabel nameLabel;
    private JTextField nameField;

    private JLabel priceLabel;
    private JTextField priceField;

    private JLabel quantityLabel;
    private JTextField quantityField;

    public DataEntryGUI()
    {
        super("Point of Sale v0.01 - Data Entry");
        setLayout(new GridLayout(3,2));
        count=0;

        numberOfProducts=(Integer)JOptionPane.showInputDialog(null, "Select number of products:", "Products", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
    }
}
