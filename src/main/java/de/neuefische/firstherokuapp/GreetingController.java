package de.neuefische.firstherokuapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/greet")
public class GreetingController {

    private List<String> greetings = List.of("Moin", "Servus", "Hallo");

    @GetMapping("/{name}")
    public String greetMe(@PathVariable String name) {
        int index = (int) (Math.random() * 3);
        return greetings.get(index) + " " + name;
    }

}
