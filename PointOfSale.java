import javax.swing.*;

public class PointOfSale
{
    public static void main(String[] args)
    {
        //record a sale, see list of products, calculate revenue, add product, delete product, save, quit

        DataEntryGUI d=new DataEntryGUI();
        d.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        d.setLocationRelativeTo(null);
        d.setSize(450,250);
        d.setVisible(true);
    }
}
