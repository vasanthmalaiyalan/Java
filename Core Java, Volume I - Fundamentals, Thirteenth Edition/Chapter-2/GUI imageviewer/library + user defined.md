சரி 🔥 நீ கேட்ட மாதிரி **libraryல இருந்து வரும் class / method / constructor எல்லாத்தையும் side comments-ஆ clearly mark பண்ணி** full code கொடுக்குறேன் 👇

---

# 📘 ImageViewer (Library vs User Code – Fully Annotated)

```java id="annotated1"
// ===== IMPORTS (Library packages) =====

// java.awt package → GUI event handling classes
import java.awt.*;          // (library)

// java.io package → File handling
import java.io.*;           // (library)

// Swing GUI components
import javax.swing.*;       // (library)



// ===== USER-DEFINED CLASS =====
public class ImageViewer
{
   public static void main(String[] args)
   {
      // EventQueue (library class) + invokeLater() (library method)
      EventQueue.invokeLater(() ->   // (class + method)
      {
         // ImageViewerFrame() → constructor (user-defined class)
         var frame = new ImageViewerFrame();  // (constructor call)

         // setTitle() → library method (JFrame classல இருந்து வந்தது)
         frame.setTitle("ImageViewer");       // (method)

         // setDefaultCloseOperation() → library method
         // JFrame.EXIT_ON_CLOSE → library constant
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // (method + constant)

         // setVisible() → library method
         frame.setVisible(true);              // (method)
      });
   }
}



// ===== USER-DEFINED CLASS (inherits library class) =====
class ImageViewerFrame extends JFrame   // JFrame → (library class)
{
   // USER constants
   private static final int DEFAULT_WIDTH = 300;
   private static final int DEFAULT_HEIGHT = 400;


   // ===== CONSTRUCTOR (user-defined) =====
   public ImageViewerFrame()
   {
      // setSize() → library method (JFrame)
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);   // (method)

      // JLabel() → library constructor
      var label = new JLabel();                 // (class + constructor)

      // add() → library method (Container class via JFrame)
      add(label);                               // (method)


      // JFileChooser() → library constructor
      var chooser = new JFileChooser();         // (class + constructor)

      // File() → library constructor
      chooser.setCurrentDirectory(new File(".")); // (method + constructor)


      // JMenuBar() → library constructor
      var menuBar = new JMenuBar();             // (class + constructor)

      // setJMenuBar() → library method
      setJMenuBar(menuBar);                     // (method)


      // JMenu() → library constructor
      var menu = new JMenu("File");             // (class + constructor)

      // add() → library method
      menuBar.add(menu);                        // (method)


      // JMenuItem() → library constructor
      var openItem = new JMenuItem("Open");     // (class + constructor)

      // add() → library method
      menu.add(openItem);                       // (method)


      // addActionListener() → library method
      openItem.addActionListener(event ->      // (method + lambda)
      {
         // showOpenDialog() → library method
         int result = chooser.showOpenDialog(null);  // (method)

         // JFileChooser.APPROVE_OPTION → library constant
         if (result == JFileChooser.APPROVE_OPTION)
         {
            // getSelectedFile() → library method
            // getPath() → library method
            String name = chooser.getSelectedFile().getPath(); // (method chain)

            // ImageIcon() → library constructor
            // setIcon() → library method
            label.setIcon(new ImageIcon(name)); // (constructor + method)
         }
      });


      // JMenuItem() → library constructor
      var exitItem = new JMenuItem("Exit");     // (class + constructor)

      // add() → library method
      menu.add(exitItem);                       // (method)


      // addActionListener() → library method
      // System.exit() → library method
      exitItem.addActionListener(event -> System.exit(0)); // (method)
   }
}
```

---

# 📊 🔥 Summary (Crystal Clear)

## ✅ Library Classes

👉 JFrame, JLabel, JFileChooser, JMenuBar, JMenu, JMenuItem, ImageIcon, File, EventQueue, System

---

## ✅ Library Methods

👉 setTitle(), setVisible(), setSize(), add(),
👉 setDefaultCloseOperation(), showOpenDialog(),
👉 getSelectedFile(), getPath(), setIcon(),
👉 addActionListener(), System.exit()

---

## ✅ Library Constructors

👉 new JFrame() (indirect)
👉 new JLabel()
👉 new JFileChooser()
👉 new JMenuBar()
👉 new JMenu()
👉 new JMenuItem()
👉 new ImageIcon()
👉 new File()

---

## ✅ Library Constants

👉 JFrame.EXIT_ON_CLOSE
👉 JFileChooser.APPROVE_OPTION

---

## ❌ User-defined

👉 ImageViewer
👉 ImageViewerFrame
👉 constructor logic
👉 variables

---

# 💡 Ultimate புரிதல்

```text id="coreidea"
Class → structure
Constructor → object உருவாக்கும்
Method → action
Constant → fixed value
```

---

# 🚀 Final takeaway

```text id="bigtruth"
Java GUI program = Mostly library usage + little custom logic
```

---

👉 நீ இப்போ இந்த code முழுக்க **internals புரிஞ்ச stage** வந்துட்டே 🔥

👉 next level question ready 😎
👉 “இந்த event listener எப்படி internally வேலை செய்கிறது?”

அதை deep-ஆ போவோமா? 🚀
