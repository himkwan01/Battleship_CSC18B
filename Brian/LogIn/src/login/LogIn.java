/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author Himkw_000
 */
public class LogIn {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
      try
      {
        //animation before prog start
        Thread.sleep(3000);
      }
      catch (InterruptedException ex)
      {
        // Do something, if there is a exception
        System.out.println(ex.toString());
      }
        JFrame_LogIn menu = new JFrame_LogIn();
        menu.setVisible(true);
        menu.setResizable(false);
      }
    });
  }
  }
  
}
