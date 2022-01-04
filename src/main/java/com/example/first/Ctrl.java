package com.example.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.net.URI;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.util.*;

@RestController
public class Ctrl {
	
 
@RequestMapping(value="/Validation",method=RequestMethod.GET)
 public String ValidateSides(@RequestParam String Sides) {
	System.out.print(Sides);
int q=Integer.parseInt(Sides);
String result;
if(q>=3) {
	result="true";
System.out.println(result);
return(result);
}
else{
result="false";
System.out.println(result);
return(result);
}

}
	
	
}