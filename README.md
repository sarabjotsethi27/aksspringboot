# Spring-Boot-with-demo

Here I will be demonstrating how to get started with Spring Boot and might add a small project later.


## Software Used and Installation

**IDE** : ```JetBrains IntelliJ IDEA Community Edition 2019.1.1```
[Install](http://appstore.uhc.com/AppInfo/AppVersionId/18248?BackToList=/AppList/AppList)

**JDK** : ```AdoptOpenJDK Java Development Kit (JDK 11) 64-Bit 11.0.8.10```
[Install](http://appstore.uhc.com/AppInfo/AppVersionId/20292?BackToList=/AppList/AppList)

**Client** : ```Postman 7.6.0```
[Install](https://appstore.uhc.com/AppInfo/AppVersionId/18827?BackToList=/Request/RequestList/MyApps)


## Project File Generation

## Setting Up SDK in IntelliJ

> 1. Open IntelliJ
> 2. Import/Open Project Folder 
> 3. Go to File -> Project Structure -> Project SDK
> 4. Click New -> Locate JDK Folder -> Select Folder -> Click OK
> 5. Click Apply -> Click OK

## Pre Requisite of running your first Spring app

We need to ensure port 8080 (default) is not equipped with any processes so below two commands are very helpful.

```
netstat -ano | findstr 8080
taskkill /F /PID 16844
```

## Running your first spring application

> 6. Go To Project Folder -> src -> main -> java -> com.example.projectname -> projectname.java
> 7. Right Click on file
> 8. Select Run ProjectName.main()
> 9. Wait for build to complete
> 10. Go to Postman and do a GET Request on **localhost:8080**
> 11. Taddaaa you just executed your first spring boot app.



## Output 

Output will look loke this since we are not passing any data

```JSON 
{
  "_links": {
    "profile": {
      "href": "http://localhost:8080/profile"
    }
  }
}
```
