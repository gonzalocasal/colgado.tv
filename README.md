# colgado.tv
Web application of TV media streaming.

![](https://i.ibb.co/zRMRm9p/Captura-de-Pantalla-2021-07-10-a-la-s-05-51-18.png)

### Prerequisites
* Apache Maven 3.6.3
* Java 8

### Frameworks & Libraries
* Gson 2.8.5
* Jsoup 1.13.1
* Lombok 1.18.4
* reCAPTCHA 3
* Spring Boot 2.2.2
* Sendgrid 3.0.9

### Install
```
 git clone https://github.com/gonzalocasal/colgado.tv
```

### Build
```
 mvn clean package
```

### Execute
```
mvn spring-boot:run
```

### YouTube Config
YouTube's channels are getting updated automatically reading YouTube API, for that is required to register your application, get the API key and set it in the application.properties.
You will find more information about YouTube API here:
https://developers.google.com/youtube/registering_an_application

### Emails Config
Emails are sent by Sendrid platform, to make it work you need to get your private api key. You will find more information about how to integrate Sendrid here:
https://docs.sendgrid.com/for-developers/sending-email/v3-java-code-example

### reCAPTCHA Config
For Emails form security, the application uses reCAPTCHA v3, you need a private api key and set it in the application.properties. You can find more info here:
https://developers.google.com/recaptcha/docs/v3
