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
    @ApiOperation(value = "Division Info", notes = "Print out Division Info")
    public ArithmeticOperation DivisionInfo(){
        return new ArithmeticOperation("division-info",2,"does the division",
                new String[]{"distributive-property","invariant-property"});
    }

    @GetMapping("multiplication")
    @ApiOperation(value = "Execute multiplication", notes = "Takes two int parameters and returns the multiplication result")
    public int multiplication(@RequestParam int a, int b){
        return Math.multiplyExact(a,b);
    }

    @GetMapping("square/{n}")
    @ApiOperation(value = "Execute square", notes = "Takes one int parameters and calculate square of a number")
    public double square(@ApiParam(value = "The id of the user") @PathVariable int n){
        return Math.pow(n,2);
    }
}