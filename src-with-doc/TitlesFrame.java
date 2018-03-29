import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TitlesFrame extends JFrame {

   public TitlesFrame() {
      this.initUI();
   }

   /**
    * Provides routines which result to main windows
    */
   private void initUI() {
      this.setTitle("Кривые фигуры");
      this.setDefaultCloseOperation(3);
      this.add(new TitlesPanel(51));
      this.setSize(350, 350);
      this.setLocationRelativeTo((Component)null);
   }

   /**
    * Main method of the application
    * @param args Console application arguments
    */
   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            TitlesFrame ps = new TitlesFrame();
            ps.setVisible(true);
         }
      });
   }
}
