import javax.swing.*;
import java.util.*;

public class PointOfSaleGUI extends JFrame
{
    private JLabel product1Name;
    private JLabel product1Quantity;
    private JLabel product1Price;

    private JLabel product2Name;
    private JLabel product2Quantity;
    private JLabel product2Price;

    private JLabel product3Name;
    private JLabel product3Quantity;
    private JLabel product3Price;

    private JLabel product4Name;
    private JLabel product4Quantity;
    private JLabel product4Price;

    private JLabel product5Name;
    private JLabel product5Quantity;
    private JLabel product5Price;

    private JLabel product6Name;
    private JLabel product6Quantity;
    private JLabel product6Price;

    private JLabel saleLabel;
    private JComboBox saleBox;
    private JTextField saleField;
    private JButton recordButton;
    private String[] products;
    private ArrayList<Product> productList=new ArrayList<Product>();

    private JLabel revenueLabel;
    private JLabel revenueNumber;

    private JButton saveButton;
    private JButton quitButton;

    public PointOfSaleGUI(ArrayList<Product> productList)
    {
        super("Point of Sale v0.01");

        switch(productList.size())
        {
            case 6:
                product6Name=new JLabel(productList.get(5).getName());
                product6Price=new JLabel(Double.toString(productList.get(5).getPrice()));
                product6Quantity=new JLabel(Integer.toString(productList.get(5).getQuantity()));
            case 5:

        }

        System.out.println(productList);
    }
}
