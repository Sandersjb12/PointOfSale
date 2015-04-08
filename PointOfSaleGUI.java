import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

        setLayout(new GridLayout(productList.size()+2,3));

        switch(productList.size())
        {
            case 6:
                product6Name=new JLabel(productList.get(5).getName());
                product6Price=new JLabel(String.format("Price: $%.2f", productList.get(5).getPrice()));
                product6Quantity=new JLabel(String.format("Quantity: %d", productList.get(5).getQuantity()));

            case 5:
                product5Name=new JLabel(productList.get(4).getName());
                product5Price=new JLabel(String.format("Price: $%.2f", productList.get(4).getPrice()));
                product5Quantity=new JLabel(String.format("Quantity: %d", productList.get(4).getQuantity()));

            case 4:
                product4Name=new JLabel(productList.get(3).getName());
                product4Price=new JLabel(String.format("Price: $%.2f", productList.get(3).getPrice()));
                product4Quantity=new JLabel(String.format("Quantity: %d", productList.get(3).getQuantity()));

            case 3:
                product3Name=new JLabel(productList.get(2).getName());
                product3Price=new JLabel(String.format("Price: $%.2f", productList.get(2).getPrice()));
                product3Quantity=new JLabel(String.format("Quantity: %d", productList.get(2).getQuantity()));

            case 2:
                product2Name=new JLabel(productList.get(1).getName());
                product2Price=new JLabel(String.format("Price: $%.2f", productList.get(1).getPrice()));
                product2Quantity=new JLabel(String.format("Quantity: %d", productList.get(1).getQuantity()));

            case 1:
                product1Name=new JLabel(productList.get(0).getName());
                product1Price=new JLabel(String.format("Price: $%.2f", productList.get(0).getPrice()));
                product1Quantity=new JLabel(String.format("Quantity: %d", productList.get(0).getQuantity()));
                break;

            default:
                throw (new IndexOutOfBoundsException());
        }

        saleLabel=new JLabel("Enter a sale:");
        saleField=new JTextField();

        products=new String[productList.size()];
        int index=0;
        for(Product p:productList)
        {
            products[index]=p.getName();
            index++;
        }
        saleBox=new JComboBox<String>(products);
        recordButton=new JButton("Record Sale");

        revenueLabel=new JLabel("Revenue:");
        revenueNumber=new JLabel("");

        saveButton=new JButton("Save");
        quitButton=new JButton("Quit");

        recordButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {

            }
        });

        add(product1Name);
        add(product1Price);
        add(product1Quantity);

        if (productList.size()>=2)
        {
            add(product2Name);
            add(product2Price);
            add(product2Quantity);
        }

        if (productList.size()>=3)
        {
            add(product3Name);
            add(product3Price);
            add(product3Quantity);
        }

        if (productList.size()>=4)
        {
            add(product4Name);
            add(product4Price);
            add(product4Quantity);
        }

        if (productList.size()>=5)
        {
            add(product5Name);
            add(product5Price);
            add(product5Quantity);
        }

        if (productList.size()>=6)
        {
            add(product6Name);
            add(product6Price);
            add(product6Quantity);
        }

        add(saleLabel);
        add(saleBox);
        add(saleField);
        add(recordButton);

        add(saveButton);
        add(quitButton);
    }
}
