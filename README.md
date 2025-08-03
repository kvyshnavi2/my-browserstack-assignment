# EL PAÍS Article Scraper and Translator

## 📌 Overview
This Java + Selenium + TestNG project scrapes the **first 5 articles** from the *Opinion* section of the EL PAÍS Spanish news website.

It:
- Prints the article titles and content (in Spanish)
- Translates article headers into **English** using the Rapid Translate Multi Traduction API
- Identifies words repeated more than twice
- Downloads the cover image (if available)
- Performs **cross-browser testing** on BrowserStack across **5 parallel threads**

---

## 💻 Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Maven
- BrowserStack
- Translation API

---

## 🧪 How to Run the Tests
1. Clone the project to your system  
2. Open it in **Eclipse** or any IDE  
3. Run `testng.xml`  
4. For BrowserStack testing, update credentials in:
   - `CrossBrowserStackTest.java`

---

## 🔐 Environment Variables
Store your BrowserStack credentials as:
```java
System.setProperty("browserstack.username", "<kothapallivyshna_f0uMdN>");
System.setProperty("browserstack.accesskey", "<pTtJfd7KoULx4xiS26YH>");

🌐 Resources
EL PAÍS Website

BrowserStack

Rapid Translate API

✅ Status
✔️ Fully functional
✔️ Tested locally and via BrowserStack
✔️ All requirements implemented

📦 Author
Developed by Kothapalli Vyshnavi
Aspiring Automation Test Engineer | Passionate about Selenium & Java
📧 Email: kothapallivyshnavi156@gmail.com
🌐 GitHub:

