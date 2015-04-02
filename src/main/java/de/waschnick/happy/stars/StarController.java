package de.waschnick.happy.stars;

import de.waschnick.happy.stars.api.Star;
import de.waschnick.happy.stars.api.Stars;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class StarController {

    @RequestMapping(value = "/stars", method = RequestMethod.GET)
    public Stars getStars() {
        return new Stars();
    }

    @RequestMapping(value = "/star/{id}", method = RequestMethod.GET)
    public Star getStar(@PathVariable long id) {
        return new Star();
    }

    @RequestMapping(value = "/star/{id}", method = RequestMethod.PUT)
    public Star updateStar(@PathVariable long id) {
        return new Star();
    }

    @RequestMapping(value = "/stars", method = RequestMethod.GET)
    public Star addStar() {
        return new Star();
    }

    @RequestMapping(value = "/star/{id}", method = RequestMethod.DELETE)
    public void deleteStar(@PathVariable long id) {
    }

}
