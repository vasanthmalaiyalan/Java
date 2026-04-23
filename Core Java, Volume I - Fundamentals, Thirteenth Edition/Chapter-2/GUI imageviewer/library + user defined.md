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

--------

சூப்பர் 🔥 இப்போ நீ கேட்டது **“இந்த programல என்ன என்ன pre-defined (Java libraryல இருக்கும்)?”** — இதை clear categories-ஆ break பண்ணுறேன் 👇

---

# 📘 முதலில் basic rule

```text
Pre-defined = Java libraryல already இருக்கும்
User-defined = நீ எழுதினது
```

---

# 🧱 1. User-defined (நீ எழுதியது)

👉 இவைகள் **pre-defined இல்ல ❌**

```java
public class ImageViewer
class ImageViewerFrame
DEFAULT_WIDTH
DEFAULT_HEIGHT
frame (variable)
label, chooser, menuBar போன்ற variables
```

👉 இவை எல்லாம்:
👉 **நீ create பண்ணியது**

---

# 📦 2. Pre-defined Classes (மிக முக்கியம் 🔥)

👉 Java libraryல இருந்து வரும் classes:

* EventQueue
* JFrame
* JLabel
* JFileChooser
* JMenuBar
* JMenu
* JMenuItem
* ImageIcon
* File
* System

👉 இவை எல்லாம்:

```text
Java API (pre-built library)
```

---

# ⚙️ 3. Pre-defined Methods

👉 இவை எல்லாம் Java already கொடுத்த methods ✅

```java
invokeLater()
setTitle()
setDefaultCloseOperation()
setVisible()
setSize()
add()
setCurrentDirectory()
setJMenuBar()
addActionListener()
showOpenDialog()
getSelectedFile()
getPath()
setIcon()
System.exit()
```

👉 இவை:
👉 **classல define பண்ணப்பட்ட functions**

---

# 🔢 4. Pre-defined Constants

👉 Java already define பண்ணிய values:

```java
JFrame.EXIT_ON_CLOSE
JFileChooser.APPROVE_OPTION
```

👉 இவை:

```text
static final variables (constants)
```

---

# 🧠 5. Pre-defined Concepts (hidden but important)

👉 இவையும் Java built-in:

* `String` class
* `var` (type inference keyword)
* Lambda (`() ->`)
* Event handling system

---

# 📊 Full classification table

| Type           | Example        | Pre-defined? |
| -------------- | -------------- | ------------ |
| Class          | JFrame, JLabel | ✅            |
| Method         | setTitle()     | ✅            |
| Constant       | EXIT_ON_CLOSE  | ✅            |
| Variable       | frame, label   | ❌            |
| Class (custom) | ImageViewer    | ❌            |

---

# 🔥 Important insight

👉 இந்த programல:

```text
90% code = Java library
10% code = உன் logic
```

👉 அதனால தான் Java powerful 😎

---

# 💡 Simple understanding

```text
நீ:
👉 objects create பண்ணுற
👉 methods call பண்ணுற

Java:
👉 actual வேலை எல்லாம் handle பண்ணுது
```

---

# 🚀 Final takeaway

```text
Java = Ready-made classes + methods + constants
```

👉 நீ just connect பண்ணுற 🔥

---

👉 நீ இப்போ next level question கேட்கப் போறாய் 😄

👉 “இந்த methods எல்லாம் எப்படி internal-ஆ வேலை செய்கிறது?”

அதை explain பண்ணலாமா? 🚀

