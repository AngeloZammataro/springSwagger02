/*
Primi passi - Swagger 02

    write a Spring Boot application that uses the following dependencies:
        Lombok
        Spring Boot DevTools
        Spring Web
    add just 1 necessary maven dependency for springfox
    add the right ant_path_matcher app configuration
    create an entity called ArithmeticOperation that has the following (described) values:
        a string name
        an integer minNumberOfOperands
        a string description
        an array of strings properties
    provide a default controller for the root with a welcome message (e.g. for someone who visit localhost:5050)
    provide a controller called MathController fro the mapping /math where you describe:
        mapping="": welcomeMathMsg()
        mapping="division-info": that returns a new ArithmeticOperation with all the details about the division
        mapping="multiplication": that takes to int parameters and returns the multiplication value
        mapping=square/{n}: that returns the square of the n
    document every method that can be called via API
    run the Spring application on port 5050


 */

package co.develhope.swagger2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Swagger2Application {

    public static void main(String[] args) {
        SpringApplication.run(Swagger2Application.class, args);
    }

}
