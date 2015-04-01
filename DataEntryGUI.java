import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class DataEntryGUI extends JFrame
{
    int numberOfProducts;
    Integer[] options={1,2,3,4,5,6};
    ArrayList<Product> productList=new ArrayList<Product>();

    private JLabel nameLabel;
    private JTextField nameField;

    private JLabel priceLabel;
    private JTextField priceField;

    private JLabel quantityLabel;
    private JTextField quantityField;

    private JLabel submitLabel;
    private JButton submitButton;

    public DataEntryGUI()
    {
        super("Point of Sale v0.01 - Data Entry");
        setLayout(new GridLayout(4,2));

        try
        {
            numberOfProducts = (Integer) JOptionPane.showInputDialog(null, "Select number of products:", "Products", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        }
        catch (NullPointerException npe)
        {
            System.exit(0);
        }

        nameLabel=new JLabel("Enter product name");
        nameField=new JTextField();

        priceLabel=new JLabel("Enter product price in dollars");
        priceField=new JTextField();

        quantityLabel=new JLabel("Enter product quantity");
        quantityField=new JTextField();

        submitLabel=new JLabel("Press submit when finished");
        submitButton=new JButton("Submit");

        submitButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                productList.add(new Product(nameField.getText(),Double.parseDouble(priceField.getText()),Integer.parseInt(quantityField.getText())));
                nameField.setText("");
                priceField.setText("");
                quantityField.setText("");
                nameField.requestFocus();

                if(productList.size()>=numberOfProducts)
                {
                    setVisible(false);
                    PointOfSaleGUI g=new PointOfSaleGUI(productList);
                    g.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    g.setLocationRelativeTo(null);
                    g.setSize(650,350);
                    g.setVisible(true);
                }
            }
        }
        );

        add(nameLabel);
        add(nameField);

        add(priceLabel);
        add(priceField);

        add(quantityLabel);
        add(quantityField);

        add(submitLabel);
        add(submitButton);
    }
}
