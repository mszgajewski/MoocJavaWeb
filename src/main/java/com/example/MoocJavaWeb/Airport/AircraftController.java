package com.example.MoocJavaWeb.Airport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AircraftController {

    @Autowired
    private AircraftRepository aircraftRepository;

    @Autowired
    private AirportRepository airportRepository;

    @GetMapping("/aircrafts")
    public String list(Model model){
        model.addAttribute("aircrafts", aircraftRepository.findAll());
        model.addAttribute("airports", airportRepository.findAll());

        return "aircrafts";
    }
    @PostMapping("/aircrafts")
    public String create(@RequestParam String name){
        Aircraft aircraft = new Aircraft();
        aircraft.setName(name);

        aircraftRepository.save(aircraft);
        return "redirect:/aircrafts";
    }

    @PostMapping("/aircrafts/{aircraftId}/airports")
    public String assignAirport(@PathVariable Long aircraftId, @RequestParam Long airportId) {
        Aircraft aircraft = aircraftRepository.getById(aircraftId);
        Airport airport = airportRepository.getById(airportId);

        aircraft.setAirport(airport);
        aircraftRepository.save(aircraft);

        return "redirect:/aircrafts";
    }
}