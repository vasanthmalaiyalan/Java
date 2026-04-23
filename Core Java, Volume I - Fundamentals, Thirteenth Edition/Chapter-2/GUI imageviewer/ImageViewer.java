// GUI related Classes (Windows, Components, events)
import java.awt.*;

// File handling (File class)
import java.io.*;

// Swing GUI library (JFrame, JLabel, Jmenu, etc. )
import javax.swing.*;

public class ImageViewer {
    public static void main(String[] args) {
        // runGUI Code safe UI Thread
        EventQueue.invokeLater(() -> {

            // Custom window object create
            var frame = new ImageViewerFrame();

            // windows title set
            frame.setTitle("ImageViewer");

            // Close Button Click
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // windows display view
            frame.setVisible(true);
        });
    }
}

// JFrame (windows) Connect extend Custom UI
class ImageViewerFrame extends JFrame {
    
    // windows width (constant)
    private static final int DEFAULT_WIDTH = 300;

    // windows height (constant)
    private static final int DEFAULT_HEIGHT = 400;

    // Constructor -> object create run
    public ImageViewerFrame() {

        //windows size set
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // Image Show need Label create
        var label = new JLabel();

        // label add to windows 
        add(label);

        // file chooser dialog create (file select)
        var chooser = new JFileChooser();

        // default folder -> current director
        chooser.setCurrentDirectory(new File("."));

        // menu bar create (top bar)
        var menuBar = new JMenuBar();

        // windows menu bar attach
        setJMenuBar(menuBar);

        // "File" menu create
        var menu = new Jmenu("File");

        // menu bar add
        menuBar.add(menu);

        // "Open" menu item create
        var openItem = new JMenuItem("Open");

        // File menu add
        menu.add(openItem);

        // Open click event handle
        openItem.addActionListener(event -> 
        {
            // file chooser open
            int result = chooser.ShowOpenDialog(null);

            // user file select 
            if (result == JFileChooser.APPROVE_OPTION)
            {
                // Selected file path
                String name = chooser.getSelectedFile().getPath();

                // image load label
                label.setIcon(new ImageIcon(name));
            }
        });

        // "Exit" menu item create
        var exitItem = new JMenuItem("Exit");

        // menu add
        menu.add(exitItem);

        // Exit Click -> program close
        exitItem.addActionListener(event -> System.exit(0));
    }
} 