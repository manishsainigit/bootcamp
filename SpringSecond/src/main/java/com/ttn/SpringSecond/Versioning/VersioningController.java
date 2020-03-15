package com.ttn.SpringSecond.Versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningController {
    //URI Versioning
    @GetMapping("v1/person")
    public PersonV1 personV1(){
        return new PersonV1("Manish Saini");
    }
    @GetMapping("v2/person")
    public PersonV2 personV2(){
        return new PersonV2(new Name("MANISH","SAINI"));
    }
    //Request Parameter versioning
    @GetMapping(value = "person/param",params = "v1")
    public PersonV1 personParamV1(){
        return new PersonV1("Atul Hoon");
    }
    @GetMapping(value="person/param",params="v2")
    public PersonV2 personParamV2(){
        return new PersonV2(new Name("Atul","Hoon"));
    }
    //Custom Header Versioning
    @GetMapping(value = "person/header",headers = "HV1")
    public PersonV1 personHeaderV1(){
        return new PersonV1("Akshay Gupta");
    }
    @GetMapping(value="person/header",headers="HV2")
    public PersonV2 personHeaderV2(){
        return new PersonV2(new Name("Akshay","Gupta"));
    }
    //MimeTypeORProduces Versioning
    @GetMapping(value = "person/produces",produces = "HV1")
    public PersonV1 personProducesV1(){
        return new PersonV1("Rishabh Jain");
    }
    @GetMapping(value="person/produces",produces="HV2")
    public PersonV2 personProducesV2(){
        return new PersonV2(new Name("Rishabh","Jain"));
    }
}
