# JDA Spring Boot Starter

This simple [JDA](https://github.com/DV8FromTheWorld/JDA) Spring Boot starter allows 
to register bots in spring context automatically and also use them as standard spring beans.

## How to use

Your main spring boot class should look like this:
```java
@SpringBootApplication
public class YourApplicationMainClass {

    public static void main(String[] args) {
        SpringApplication.run(YourApplicationMainClass.class, args);
    }
}
```

Your `application.properties` should look like this:
```yaml
spring.jda.token=PAST_YOUR_BOT_TOKEN
```

After that your `EventListener` will look like:
```java
@JDAEventListener
public class ReadyListener implements EventListener {

    @Override
    public void onEvent(GenericEvent event) {
        if (event instanceof ReadyEvent) {
            System.out.println("API is ready!");
        }
    }
}
```