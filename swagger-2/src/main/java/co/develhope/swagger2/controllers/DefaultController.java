package co.develhope.swagger2.controllers;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class DefaultController {

    @GetMapping(value = "")
    @ApiOperation(value = "Welcome in Swagger 2", notes = "Print out a welcome message for for someone who visit " +
            "localhost:5050")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses({
            @ApiResponse(code = 400, message = "Bad imput data"),
            @ApiResponse(code = 500, message = "Internal error from Spring", response = String.class),
            @ApiResponse(code = 202, message = "Created")
    })
    public String sayWelcome(){
        return "Welcome in Swagger 2";
    }
}