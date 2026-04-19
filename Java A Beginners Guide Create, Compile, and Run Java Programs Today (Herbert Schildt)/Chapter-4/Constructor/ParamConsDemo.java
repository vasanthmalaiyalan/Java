class MyClass {
    int x;

    MyClass(int i) {
        x = i;
    }
}

class ParamConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(88);

        System.out.println(t1.x + " " + t2.x);
    }
}

/*
சரி 👍 இந்த passageல என்ன எழுதப்பட்டதோ அதையே **simple தமிழில் மட்டும்** explain பண்ணுறேன் — extra concepts இல்லாமல் 👇

---

## 🧠 Parameterized Constructors – Explanation (Tamil)

### 🔹 என்ன மாற்றம்?

👉 முன்பு:

* parameter இல்லாத constructor use பண்ணினோம்

👉 இப்போது:

> constructorக்கு **parameters சேர்க்கிறோம்**

---

## 🔹 Parameterized constructor என்ன?

👉 constructor:

* values accept பண்ணும்
* அந்த values கொண்டு object initialize பண்ணும்

👉 parameters:

* method மாதிரி தான் add பண்ணுவோம்

---

## 🔹 Example

```java id="f3n8x2"
class MyClass { 
  int x; 

  MyClass(int i) { 
    x = i; 
  } 
}
```

👉 இங்கே:

* `i` = parameter
* x = i assign ஆகுது

---

## 🔹 Full Program

```java id="k9p2v1"
class MyClass { 
  int x; 

  MyClass(int i) { 
    x = i; 
  } 
} 

class ParmConsDemo { 
  public static void main(String[] args) { 
    MyClass t1 = new MyClass(10); 
    MyClass t2 = new MyClass(88); 

    System.out.println(t1.x + " " + t2.x); 
  } 
}
```

---

## 🔹 என்ன நடக்கிறது?

👉 இந்த line:

```java id="u8m4q7"
MyClass t1 = new MyClass(10);
```

👉 இங்கே:

* `10` = argument
* `i` = parameter

👉 flow:

* i = 10
* x = i → x = 10

👉 அதே போல:

* t2 → x = 88

---

## 🔹 Output

```text id="v2z7k5"
10 88
```

---

## 🔹 முக்கியமான point ⚠️

👉 ஒவ்வொரு objectக்கும்:

* different values set பண்ணலாம்

👉 constructor:

* object create ஆகும் போது run ஆகும்
* parameters மூலம் values initialize ஆகும்

---

## ⚡ Final Summary

👉 parameterized constructor = input accept பண்ணும் constructor
👉 argument → parameter → variable assign
👉 object create போது value set ஆகும்
👉 different objects → different values

---

இது தான் அந்த passageல exact meaning 👍

 */