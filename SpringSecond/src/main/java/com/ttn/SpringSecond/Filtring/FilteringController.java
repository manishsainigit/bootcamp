package com.ttn.SpringSecond.Filtring;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {
    @GetMapping("/filtering")
    public MappingJacksonValue filtering(){
        Data data= new Data("abc","abc@tothenew.com","Password");

        SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("name","email");
        FilterProvider filterProvider=new SimpleFilterProvider().addFilter("DataFilter",filter);
        MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(data);
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }
}
