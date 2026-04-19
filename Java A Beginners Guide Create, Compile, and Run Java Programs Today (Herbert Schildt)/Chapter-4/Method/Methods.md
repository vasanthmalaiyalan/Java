சரி 👍 இந்த passageல என்ன எழுதப்பட்டதோ அதையே **simple தமிழில் மட்டும்** explain பண்ணுறேன் — extra விஷயம் இல்லாமல் 👇

---

## 🧠 Methods – Explanation (Tamil)

### 🔹 Methods என்ன?

👉 Classல இருக்கும்:

* variables (data)
* methods

👉 Methods:

* அந்த data மீது வேலை செய்யும் subroutines

👉 பெரும்பாலும்:

* programல மற்ற பகுதிகள் → class உடன் interact பண்ணுவது methods மூலம் தான்

---

### 🔹 Data-only class vs Method class

👉 `Vehicle` class:

* இப்போ வரை data மட்டும்

👉 ஆனால்:

* real-worldல classes → methods இருக்கும்

---

### 🔹 Method என்ன செய்யும்?

👉 Method:

* ஒரு அல்லது அதற்கு மேற்பட்ட statements கொண்டது
* ஒரு specific task மட்டும் செய்யும் (well-written codeல்)

---

### 🔹 Method name

👉 ஒவ்வொரு methodக்கும்:

* ஒரு பெயர் இருக்கும்

👉 அந்த பெயரால் தான்:

* method call பண்ணுவோம்

👉 rules:

* எந்த valid name வேண்டுமானாலும் வைக்கலாம்
* ஆனால்:

  * `main()` reserved
  * Java keywords use பண்ணக்கூடாது

---

### 🔹 Method notation

👉 புத்தகத்தில்:

* method name + `()` use பண்ணுவாங்க

📌 Example:

```id="g4t6vx"
getVal()
```

👉 இதனால்:

* method name vs variable name differentiate பண்ணலாம்

---

### 🔹 Method general form

```java id="kqz7x6"
ret-type name(parameter-list) {
    // method body
}
```

---

### 🔹 ret-type (return type)

👉 Method என்ன return பண்ணும் என்பதை சொல்லும்

👉 Example:

* int
* double
* class type

👉 value return இல்லையென்றால்:

```java id="mbi4k7"
void
```

---

### 🔹 name

👉 method பெயர்
👉 valid identifier ஆக இருக்க வேண்டும்

---

### 🔹 parameter-list

👉 parameters:

* type + variable name pairs

👉 இது:

* methodக்கு input வாங்கும் variables

👉 method call பண்ணும்போது:

* arguments pass பண்ணப்படும்

👉 parameters இல்லையெனில்:

* empty இருக்கும்

---

## ⚡ Final Summary

👉 Method = data மீது வேலை செய்யும் code
👉 Name மூலம் call பண்ணுவோம்
👉 `ret-type` = return value type
👉 `void` = return இல்லை
👉 parameters = input variables

---

இது தான் அந்த passageல exact meaning 👍

---

சரி 👍 இந்த முழு passageல என்ன எழுதப்பட்டதோ அதையே **simple தமிழில் மட்டும்** explain பண்ணுறேன் — extra concepts இல்லாமல் 👇

---

## 🧠 Adding a Method to the Vehicle Class – Explanation (Tamil)

### 🔹 ஏன் method சேர்க்க வேண்டும்?

👉 முன்பு:

* `main()`ல தான் range calculate பண்ணினோம்

👉 ஆனால்:

* அது best design இல்லை ❌

👉 ஏன்?

* range = fuelcap + mpg மீது depend
* இந்த data எல்லாம் `Vehicle` classக்குள் தான் இருக்கிறது

👉 அதனால்:

> range calculation → Vehicle class உள்ளே இருக்கணும் ✅

---

## 🔹 Method சேர்ப்பது

```java
class Vehicle { 
  int passengers; 
  int fuelcap;    
  int mpg;        

  void range() { 
    System.out.println("Range is " + fuelcap * mpg); 
  } 
}
```

👉 இங்கே:

* `range()` என்ற method add பண்ணப்பட்டுள்ளது
* இது range calculate செய்து print பண்ணும்

---

## 🔹 முக்கியமான point ⚠️

👉 `fuelcap` மற்றும் `mpg`:

* directஆ use பண்ணப்பட்டுள்ளது
* dot (`.`) use பண்ணவில்லை

👉 ஏன்?

* method classக்குள் இருக்கிறது
* அது எந்த objectக்கு call ஆகிறதோ அந்த object dataயே use பண்ணும்

---

## 🔹 Full Program

```java
class Vehicle { 
  int passengers; 
  int fuelcap;    
  int mpg;        

  void range() { 
    System.out.println("Range is " + fuelcap * mpg); 
  } 
} 

class AddMeth { 
  public static void main(String[] args) { 
    Vehicle minivan = new Vehicle(); 
    Vehicle sportscar = new Vehicle(); 

    // assign values
    minivan.passengers = 7; 
    minivan.fuelcap = 16; 
    minivan.mpg = 21; 

    sportscar.passengers = 2; 
    sportscar.fuelcap = 14; 
    sportscar.mpg = 12; 

    System.out.print("Minivan can carry " + minivan.passengers + ". "); 
    minivan.range(); 

    System.out.print("Sportscar can carry " + sportscar.passengers + ". "); 
    sportscar.range(); 
  } 
}
```

---

## 🔹 Output

```text
Minivan can carry 7. Range is 336
Sportscar can carry 2. Range is 168
```

---

## 🔹 range() method explanation

```java
void range() {
```

👉 இது:

* method name = `range`
* return type = `void` (value return இல்லை)
* parameters இல்லை

---

```java
System.out.println("Range is " + fuelcap * mpg);
```

👉 இது:

* fuelcap × mpg calculate பண்ணி print பண்ணும்

👉 ஒவ்வொரு objectக்கும்:

* தனி fuelcap & mpg இருக்கும்
  👉 அதனால் result objectக்கு object வேறாக வரும்

---

## 🔹 Method call

```java
minivan.range();
```

👉 இது:

* minivan objectக்கு method call

👉 flow:

1. control → methodக்கு போகும்
2. method execute ஆகும்
3. முடிந்ததும் → control back வரும்

---

## 🔹 Important concept ⚠️

👉 method உள்ளே:

* `fuelcap`, `mpg` directஆ use பண்ணலாம்

👉 காரணம்:

* method எப்போதும் ஒரு object மூலம் call ஆகும்

👉 அதனால்:

> அந்த object data automatically use ஆகும்

---

## ⚡ Final Summary

👉 range calculation → class உள்ளே இருக்க வேண்டும்
👉 method = class behavior
👉 method call → object மூலம்
👉 variables directஆ access பண்ணலாம் (dot இல்லாமல்)

---

இது தான் அந்த passageல exact meaning 👍

