package com.tts.foodapi.Controller;

import java.util.ArrayList;
import java.util.List;

import com.tts.foodapi.Model.ItemV1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/v1")
@Api(value="menuitems", description="Operations pertaining to Menu Items")
public class FoodControllerv1{
    @ApiResponses(value = {
    @ApiResponse(code = 200, message = "Successfully retrieved menu items"),
    @ApiResponse(code = 401, message = "You are not authorized to view the menu items")
            }) 
    @ApiOperation(value = "Get all menu items", response = ItemV1.class, 
              responseContainer = "List")       
    @GetMapping("/items")
    public ResponseEntity<List<ItemV1>> getItems() {
        return new ResponseEntity<>(new ArrayList<ItemV1>(), HttpStatus.OK);
}

    
}
