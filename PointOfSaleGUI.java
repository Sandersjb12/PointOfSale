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
                product6Price=new JLabel(String.format("$%.2f", productList.get(5).getPrice()));
                product6Quantity=new JLabel(Integer.toString(productList.get(5).getQuantity()));
            case 5:
                product5Name=new JLabel(productList.get(4).getName());
                product5Price=new JLabel(String.format("$%.2f", productList.get(4).getPrice()));
                product5Quantity=new JLabel(Integer.toString(productList.get(4).getQuantity()));
            case 4:
                product4Name=new JLabel(productList.get(3).getName());
                product4Price=new JLabel(String.format("$%.2f", productList.get(3).getPrice()));
                product4Quantity=new JLabel(Integer.toString(productList.get(3).getQuantity()));

            case 3:
                product3Name=new JLabel(productList.get(2).getName());
                product3Price=new JLabel(String.format("$%.2f", productList.get(2).getPrice()));
                product3Quantity=new JLabel(Integer.toString(productList.get(2).getQuantity()));

            case 2:
                product2Name=new JLabel(productList.get(1).getName());
                product2Price=new JLabel(String.format("$%.2f", productList.get(1).getPrice()));
                product2Quantity=new JLabel(Integer.toString(productList.get(1).getQuantity()));

            case 1:
                product1Name=new JLabel(productList.get(0).getName());
                product1Price=new JLabel(String.format("$%.2f", productList.get(0).getPrice()));
                product1Quantity=new JLabel(Integer.toString(productList.get(0).getQuantity()));
                break;

            default:
                throw (new IndexOutOfBoundsException());
        }

        System.out.println(productList);
    }
}
