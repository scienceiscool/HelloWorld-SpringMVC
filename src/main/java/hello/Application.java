/* Making the application executable
 * Could package this service as a traditional WAR file for
 * deployment to an external application server, but the
 * simpler approach demonstrated below creates a standalone
 * application. One packages everything in a single, executable
 * JAR file, driven by Java main() method. Along the way, one
 * uses Spring's support for embedding the Tomcat servlet
 * container as the HTTP runtime, instead of deploying to an
 * external instance
 */

package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* @SpringBootApplication is a convenience annotation that adds the following:
 * @Configuration tags the class as a source of bean definitions for the application context
 * @EnableAutoConfiguration tells Spring Boot to start adding beans based on classpath settings,
 * other beans, and various property settings
 * Normally one would add @EnableWebMvc for a Spring MVC app, but Spring Boot adds it automatically
 * when it sees spring-webmvc on the classpath. This flags the application as a web application and
 * activates key behaviors such as setting up a DispatcherServlet
 * @ComponentScan tells Spring to look for other components, configurations, and services in the hello
 * package, allowing it to find the GreetingController
 */

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		// run method launches an application
		SpringApplication.run(Application.class, args);

	}

}