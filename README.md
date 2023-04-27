# Project Description

In this project, I tested the registration and authorization of the account, as well as committed its removal.

## Modules

  - Selenium
  - ChromeDriver
  - JUnit
  - WebDriverManager
  
## Documentation

  ### core package
    Stores the initialization of tests and the base class for inheritance.
    - BaseSeleniumTest
    - BaseSeleniumPage
    
  ### helpDesk package
    Here are all the classes that describe the pages that were interacted with in the context of this project. 
    There is also a class "HelpDeskTest" with all the tests.
    - MainPage
    - SignUp
    - SignIn
    - ProfileConfig
    - AccountSettings
    - DestroyAccount
    
  ### helpers package
    Stores a class with basic data for working with the website.
    - Data
