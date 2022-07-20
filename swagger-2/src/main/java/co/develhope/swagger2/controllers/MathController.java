package co.develhope.swagger2.controllers;

import co.develhope.swagger2.entities.ArithmeticOperation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping(value = "")
    @ApiOperation(value = "Welcome in Math", notes = "Print out a welcome message")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses({
            @ApiResponse(code = 400, message = "Bad imput data"),
            @ApiResponse(code = 500, message = "Internal error from Spring", response = String.class),
            @ApiResponse(code = 202, message = "Created")
    })
    public String welcomeMathMsg(){
        return "Welcome in Math";
    }

    @GetMapping("/math/division-info")
    public ArithmeticOperation DivisionInfo(){
        return new ArithmeticOperation("division-info",2,"does the division",
                new String[]{"distributive-property","invariant-property"});
    }

    @GetMapping("multiplication")
    public int multiplication(@RequestParam int a, int b){
        return Math.multiplyExact(a,b);
    }

    @GetMapping("square/{n}")
    public String ArithmeticSquare(){
        return "Execute multiplication operation";
    }

    //------------------------------------------------------------------------------------------------------------------
    /*
    @GetMapping(value = "/user")
    public User sayHelloToUser(){
        return new User("Angelo","Zammataro","Carini","Palermo");
    }

    @PostMapping(value = "/user")
    public void CreateAUser(@ApiParam(value = "The user request body") @RequestBody(required = false) User user){
    }

    @GetMapping(value = "/name")
    public String sayHelloWithName(@ApiParam(value = "The name of the user") @RequestParam String name){
        return "Hello " + name;
    }

    @GetMapping(value = "/name/{id}")
    public String sayHelloWithNamePath(@ApiParam(value = "The id of the user") @PathVariable String id){
        return "Hello " + id;
    }

     */
}