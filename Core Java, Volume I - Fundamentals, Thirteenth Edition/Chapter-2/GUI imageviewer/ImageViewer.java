// GUI related Classes (Windows, Components, events)
// ============ IMPORTS (Library package) =========
// java.awt package -> GUI event handling classes
import java.awt.*;  // (library)

// File handling (File class)
// java.io. package -> File handling
import java.io.*; // (library)

// Swing GUI library (JFrame, JLabel, Jmenu, etc. )
// Swing GUI Components
import javax.swing.*;   // (library)

//======== USER-DEFINED CLASS =========
public class ImageViewer {
    public static void main(String[] args) {

        // runGUI Code safe UI Thread
        // EvenQueue (library class) + invokeLater() (library method)
        EventQueue.invokeLater(() -> { // (class + method)

            // Custom window object create
            // ImageViewerFrame() -> constructor (user-defined class)
            var frame = new ImageViewerFrame(); // (constructor call)

            // windows title set
            // setTitle() -> library method (JFrame class )
            frame.setTitle("ImageViewer"); // (method)

            // Close Button Click
            // setDefaultCloseOperation() -> library method
            // JFrame.EXIT_ON_CLOSE -> library constant
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //(method + constant)

            // windows display view
            // setVisible() -> library method
            frame.setVisible(true); // (method)
        });
    }
}

// JFrame (windows) Connect extend Custom UI
// ===== User-Defined CLASS (inherits library  class)
class ImageViewerFrame extends JFrame { // JFrame -> (library class)

    // windows width (constant)
    // USER Constants
    private static final int DEFAULT_WIDTH = 300;

    // windows height (constant)
    private static final int DEFAULT_HEIGHT = 400;

    // Constructor -> object create run
    // ====== CONSTRUCTOR (user-defined) ========
    public ImageViewerFrame() {
        
        //windows size set
        // setSize() -> library method (JFrame)
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT); // (method)

        // Image Show need Label create
        // JLabel() -> library constructor
        var label = new JLabel(); // (class -> constructor)

        // label add to windows
        // add() -> library method (Constainer class via JFrame) 
        add(label); // (method)

        // file chooser dialog create (file select)
        // JFileChooser() -> library constructor
        var chooser = new JFileChooser();  // (class + constructor)

        // default folder -> current director
        // File() -> library constructor
        chooser.setCurrentDirectory(new File(".")); // (method + constructor)

        // menu bar create (top bar)
        // JMenuBar() -> library constructor
        var menuBar = new JMenuBar();  // (class + constructor)

        // windows menu bar attach
        // setJMenuBar() -> library method
        setJMenuBar(menuBar);   // (method)

        // "File" menu create
        // JMenu() -> library constructor
        var menu = new JMenu("File");   // (class + constructor)

        // menu bar add
        // add() -> library method
        menuBar.add(menu);   // (method)

        // "Open" menu item create
        // JMenuItem() -> library constructor
        var openItem = new JMenuItem("Open"); // (class + constructor)

        // File menu add
        // add() -> library method
        menu.add(openItem);  // (method)

        // Open click event handle
        // addActionListener() -> library method
        openItem.addActionListener(event ->  // (method + lambda)
        {
            // file chooser open
            // showOpenDialog() -> library method
            int result = chooser.showOpenDialog(null);  // (method)

            // user file select 
            // JFileChooser.APPROVE_OPTION -> library constant
            if (result == JFileChooser.APPROVE_OPTION)
            {
                // Selected file path
                // getSelectedFile() -> library method
                // getPath() ->library method
                String name = chooser.getSelectedFile().getPath(); // (method chain)

                // image load label
                // ImageIcon() -> library constructor
                // setIcon() -> library method
                label.setIcon(new ImageIcon("name")); // (constructor + method)
            }
        });

        // "Exit" menu item create
        // JMenuItem() -> library constructor
        var exitItem = new JMenuItem("Exit");  // (class + constructor)

        // menu add
        // add() -> library method
        menu.add(exitItem);   // (method)

        // Exit Click -> program close
        // addActionListener() -> library method
        // System.exit() -> library method
        exitItem.addActionListener(event -> System.exit(0)); // (method)
    }
} 