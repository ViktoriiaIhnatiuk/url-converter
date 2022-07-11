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
Convert any URL to the shortened format

Technologies
-----------
* Java 11
* Spring Boot
* Spring WEB
* Spring Security
* Apache Maven


Usage
-----------
1. Install IntelliJ IDEA ultimate version;
2. Clone this project from GitHub and make sure that an absolute path doesn't include any white spaces and/or non-Latin
   symbols;
3. Run application;
4. Open your browser and go to http://localhost:8080/converter page;
5. Enter the url you want to convert and press "Convert" button;

![](converter_page.png)

6. You'll get the shortened clickable link on the results page;

![](result_page.png)

7. Follow the link. Page will be open in a new tab;
8. Press "Convert another URL" to convert another URL.
_____________________________
* All incoming data converted to JSON format.
* Make sure that the URL you want to convert contains digits or Latin symbols only.
