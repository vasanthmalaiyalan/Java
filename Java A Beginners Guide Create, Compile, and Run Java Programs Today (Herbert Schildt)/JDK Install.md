சூப்பர் 🔥 இப்போ நாம practical step போகலாம் — **Linux-ல JDK 17 install பண்ணுவது**. நான் clean + direct steps கொடுக்கிறேன் 👇

---

# ☕ Method 1: OpenJDK 17 (Recommended ✅)

👉 இது easiest + free

## 🐧 Ubuntu / Debian

```bash
sudo apt update
sudo apt install openjdk-17-jdk -y
```

---

## 🐧 Arch Linux

```bash
sudo pacman -S jdk17-openjdk
```

---

## 🐧 Fedora / RHEL / CentOS

```bash
sudo dnf install java-17-openjdk-devel
```

---

# 🔍 Install check பண்ண

```bash
java -version
```

👉 Expected output:

```text
openjdk version "17..."
```

---

# 🔧 Compiler check

```bash
javac -version
```

👉 Output:

```text
javac 17...
```

---

# ⚙️ JAVA_HOME set பண்ண (important 🔥)

👉 First path கண்டுபிடிக்க:

```bash
readlink -f $(which java)
```

👉 Example output:

```text
/usr/lib/jvm/java-17-openjdk-amd64/bin/java
```

👉 அதிலிருந்து:

```bash
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
export PATH=$JAVA_HOME/bin:$PATH
```

👉 Permanent ஆக:

```bash
nano ~/.bashrc
```

👉 Add:

```bash
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
export PATH=$JAVA_HOME/bin:$PATH
```

👉 Apply:

```bash
source ~/.bashrc
```

---

# ☕ Method 2: Oracle JDK 17 (Optional)

👉 Official version

## Steps:

1. Download from Oracle site
2. Extract:

```bash
tar -xvf jdk-17_linux-x64_bin.tar.gz
```

3. Move:

```bash
sudo mv jdk-17 /opt/
```

4. Set JAVA_HOME:

```bash
export JAVA_HOME=/opt/jdk-17
export PATH=$JAVA_HOME/bin:$PATH
```

---

# ⚠️ Which one use?

👉 Recommended:

✔️ OpenJDK (default choice)
✔️ Stable + widely used

---

# 🔚 Final Summary

💡 Simple-ஆ:

👉 Linux-ல install:

```bash
sudo apt install openjdk-17-jdk
```

👉 Check:

```bash
java -version
javac -version
```

---

# 🔥 One-line

**“Install OpenJDK 17 → set JAVA_HOME → ready to code”**

---

👉 Ready 🔥
நாம் next step:
**Hello World → compile → run (real terminal demo style)** பண்ணலாமா? 😎
