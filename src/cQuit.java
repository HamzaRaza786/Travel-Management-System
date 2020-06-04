import javax.swing.JFrame;
import javax.swing.JOptionPane;


class cQuit {
    private JFrame frame;
    
    public void quit()
    {
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Do you want to exit the Travel Manager?", "Travel Management System",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }
}
