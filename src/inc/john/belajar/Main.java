package inc.john.belajar;

import inc.john.belajar.service.IEmployeeService;
import inc.john.belajar.view.Menu;
import inc.john.belajar.view.UserEntryForm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static IEmployeeService employeeService;

    public static void main(String[] args) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserEntryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserEntryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserEntryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserEntryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    // Implementasi Konfigurasi Spring framework
                    @SuppressWarnings("resource")
                    ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

                    // Initialize service
                    setEmployeeService((IEmployeeService) appContext.getBean("employeeService"));
                    
                    
                    
                    Menu menus = new Menu();
                    menus.setVisible(true);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                

            }
        });
    }

    public static IEmployeeService getEmployeeService() {
        return employeeService;
    }

    public static void setEmployeeService(IEmployeeService employeeService) {
        Main.employeeService = employeeService;
    }

}
