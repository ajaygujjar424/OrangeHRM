# Testing OrangeHRM Demo 
# Website: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
# About
OrangeHRM is a Human Resource Management (HRM) application that includes both the Admin module and the Employee Self Service (ESS) module. As an Admin using this application, we can maintain employee data, such as job, organization, Qualifaction, nationality, create user roles for different regions and locations. The application also provides modules PIM module centralizes all your key employee datasuch as names, titles, addresses, salary and position history, reporting structures and other critical employee information, recruitment, onboarding, performance management, time and attendance tracking, and leave management
# Technology and Tool Used

• Testing: Automation Testing

•	Programming Language: Java

•	Automation Tool: Selenium Webdriver version: 3.141.59

•	Java Frameworks: TestNG, Page object Model (POM) Robot Class Parallel Testing

•	Version Control: GIT and GitHub

•	Defect Tacking Tool: JIRA

•	IDE Tool: Eclipse IDE

# Test Report 
HTML Report
![image (1)](https://github.com/ajaygujjar424/OrangeHRM/assets/127547339/0449a134-9336-401e-a32f-e0da3885aec5)

# Setting up TestNG in Eclipse involves a few steps to configure and use this testing framework for your Java projects. TestNG is a popular testing framework for Java that makes it easier to write and execute tests. Here's
**how you can set up TestNG in Eclipse:
1. **Install TestNG**:
   Before you begin, make sure you have Eclipse installed on your system. If you don't have TestNG installed in your Eclipse, you'll need to install it. To install TestNG, follow these steps:

   - Open Eclipse.
   - Go to the "Help" menu.
   - Select "Eclipse Marketplace."
   - In the "Eclipse Marketplace" dialog, search for "TestNG."
   - Install the TestNG plugin.

2. **Create a Java Project**:
   If you don't already have a Java project, create a new Java project in Eclipse. You can do this by going to "File" > "New" > "Java Project."

3. **Add Libraries**:
   Once you have your Java project created, you need to add the TestNG library to your project's build path:

   - Right-click on your project in the Project Explorer.
   - Select "Build Path" > "Configure Build Path."
   - In the "Libraries" tab, click on "Add Library."
   - Select "TestNG" from the list and click "Next."
   - Choose the TestNG version you want to use (if applicable) and click "Finish."
   - Click "Apply and Close" to save the changes.

4. **Create TestNG Test Classes**:
   Now you can create your TestNG test classes:

   - Right-click on your project or a specific package where you want to create the test class.
   - Go to "New" > "Other."
   - Search for "TestNG Class" and select it.
   - Click "Next."
   - Enter the class name and select the methods you want to include in this test class.
   - Click "Finish."

5. **Write TestNG Tests**:
   Open the created TestNG test class and start writing your test methods using the TestNG annotations like `@Test`, `@BeforeMethod`, `@AfterMethod`, etc.

6. **Run TestNG Tests**:
   You can now run your TestNG tests:

   - Right-click on the test class or test method.
   - Select "Run As" > "TestNG Test."

7. **View TestNG Results**:
   TestNG results will be displayed in the "TestNG" view in Eclipse. You can open this view by going to "Window" > "Show View" > "Other" > "TestNG."
