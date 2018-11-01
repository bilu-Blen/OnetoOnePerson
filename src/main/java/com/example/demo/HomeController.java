package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Autowired
    PersonRepository personRepository;

    @RequestMapping("/checkjson")
    public @ResponseBody  Iterable<Person> showPeople() {

        //creating new instance of person
        Person person = new Person();
        person.setName("Blen");
        person.setSsn(123456);

        //create a new instance of driverslicense
        DriversLicense driversLicense = new DriversLicense();
        driversLicense.setLocation("Maryland");
        driversLicense.setNumberDriversLicense("M123456");
        driversLicense.setYear(2019);

        //create a new instance of Passport
        Passport passport = new Passport();
        passport.setPassportNum("N12345");
        passport.setExpirationDate(2018);

        //creating an instance of NationalId
        NationalId nationalId = new NationalId();
        nationalId.setNationalIdNum("B1234");
        nationalId.setDateIssued(2018);

        //Adding the drivers license , the national id and the passport inside the person instance
        person.setDriversLicense(driversLicense);
        person.setNationalId(nationalId);
        person.setPassport(passport);

        //save the person to the database
        personRepository.save(person);

        person = new Person();
        person.setName("Seble");
        person.setSsn(7659);

        //create a new instance of driverslicense
        driversLicense = new DriversLicense();
        driversLicense.setLocation("Washington, DC");
        driversLicense.setNumberDriversLicense("D123456");
        driversLicense.setYear(2019);

        //create a new instance of Passport
        passport = new Passport();
        passport.setPassportNum("LM12345");
        passport.setExpirationDate(2018);

        //creating an instance of NationalId
        nationalId = new NationalId();
        nationalId.setNationalIdNum("BCC1234");
        nationalId.setDateIssued(2018);

        //Adding the drivers license , the national id and the passport inside the person instance
        person.setDriversLicense(driversLicense);
        person.setNationalId(nationalId);
        person.setPassport(passport);

        //save the person to the database
        personRepository.save(person);

        person = new Person();
        person.setName("Tim");
        person.setSsn(98765);

        //create a new instance of driverslicense
        driversLicense = new DriversLicense();
        driversLicense.setLocation("Virginia");
        driversLicense.setNumberDriversLicense("Va123456");
        driversLicense.setYear(2019);

        //create a new instance of Passport
        passport = new Passport();
        passport.setPassportNum("KH12345");
        passport.setExpirationDate(2018);

        //creating an instance of NationalId
        nationalId = new NationalId();
        nationalId.setNationalIdNum("BGB1234");
        nationalId.setDateIssued(2018);

        //Adding the drivers license , the national id and the passport inside the person instance
        person.setDriversLicense(driversLicense);
        person.setNationalId(nationalId);
        person.setPassport(passport);

        //save the person to the database
        personRepository.save(person);

        //get all the people from the database and send them to the database
        return personRepository.findAll();


    }


    @RequestMapping("/")
    public String index(Model model){

        //creating new instance of person
        Person person = new Person();
        person.setName("Blen");
        person.setSsn(123456);

        //create a new instance of driverslicense
        DriversLicense driversLicense = new DriversLicense();
        driversLicense.setLocation("Maryland");
        driversLicense.setNumberDriversLicense("M123456");
        driversLicense.setYear(2019);

        //create a new instance of Passport
        Passport passport = new Passport();
        passport.setPassportNum("N12345");
        passport.setExpirationDate(2018);

        //creating an instance of NationalId
        NationalId nationalId = new NationalId();
        nationalId.setNationalIdNum("B1234");
        nationalId.setDateIssued(2018);

        //Adding the drivers license , the national id and the passport inside the person instance
        person.setDriversLicense(driversLicense);
        person.setNationalId(nationalId);
        person.setPassport(passport);

        //save the person to the database
        personRepository.save(person);

        person = new Person();
        person.setName("Seble");
        person.setSsn(7659);

        //create a new instance of driverslicense
         driversLicense = new DriversLicense();
        driversLicense.setLocation("Washington, DC");
        driversLicense.setNumberDriversLicense("D123456");
        driversLicense.setYear(2019);

        //create a new instance of Passport
         passport = new Passport();
        passport.setPassportNum("LM12345");
        passport.setExpirationDate(2018);

        //creating an instance of NationalId
         nationalId = new NationalId();
        nationalId.setNationalIdNum("BCC1234");
        nationalId.setDateIssued(2018);

        //Adding the drivers license , the national id and the passport inside the person instance
        person.setDriversLicense(driversLicense);
        person.setNationalId(nationalId);
        person.setPassport(passport);

        //save the person to the database
        personRepository.save(person);

        person = new Person();
        person.setName("Tim");
        person.setSsn(98765);

        //create a new instance of driverslicense
        driversLicense = new DriversLicense();
        driversLicense.setLocation("Virginia");
        driversLicense.setNumberDriversLicense("Va123456");
        driversLicense.setYear(2019);

        //create a new instance of Passport
         passport = new Passport();
        passport.setPassportNum("KH12345");
        passport.setExpirationDate(2018);

        //creating an instance of NationalId
         nationalId = new NationalId();
        nationalId.setNationalIdNum("BGB1234");
        nationalId.setDateIssued(2018);

        //Adding the drivers license , the national id and the passport inside the person instance
        person.setDriversLicense(driversLicense);
        person.setNationalId(nationalId);
        person.setPassport(passport);

        //save the person to the database
        personRepository.save(person);

        //get all the people from the database and send them to the database
        model.addAttribute("persons", personRepository.findAll());
        return "index";


    }
}
