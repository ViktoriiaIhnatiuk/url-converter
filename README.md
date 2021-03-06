# URL_CONVERTER
***
This simple web application imitates the work of the online url-shortener service.

Project structure
-----------
Application is designed according to SOLID, REST principles with next layers:
1. controllers layer;
2. services layer;
3. repositories layer;

Features
-----------
Convert any valid URL to the shortened format

Technologies
-----------
* Java 11
* Spring Boot
* Spring WEB
* Spring Security
* Apache Maven
* Thymeleaf


Usage
-----------
1. Install IntelliJ IDEA ultimate version;
2. Clone this project from GitHub and make sure that an absolute path doesn't include any white spaces and/or non-Latin
   symbols;
3. Run application;
4. Open your browser and go to http://localhost:8080/converter page;
5. Enter the url you want to convert and press "Convert" button;

![](images/converter.png)

6. You'll get the shortened clickable link on the results page;

![](images/result.png)

7. Follow the link. Page will be open in a new tab;
8. Press "Convert another URL" to convert another URL;
9. If you enter invalid URL you'll get an error. Press "Convert another URL" and try again with a valid URL. 

![](images/invalid_url.png)
_____________________________
* All incoming data converted to JSON format.
