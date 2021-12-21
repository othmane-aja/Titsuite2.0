package ma.ensias.titsuite2_0.controllers;

import ma.ensias.titsuite2_0.entities.Offer;
import ma.ensias.titsuite2_0.services.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OfferController {

    @Autowired
    OfferService offerService;

    @GetMapping("/offers/all")
    List<Offer> getAllOffers()
    {

        return offerService.getAllOffers();
    }
    @GetMapping("/offers/city/{city}")
    List<Offer> getAllOffers(@PathVariable String city)
    {

        return offerService.getOffersByCity(city);
    }
    @GetMapping("/offers/id/{id}")
    Offer getOfferByID(@PathVariable Long id)
    {
        return offerService.getOffer(id);
    }
    @GetMapping("/offers/activity/{activity}")
    List<Offer>  getOfferByID(@PathVariable String activity)
    {
        return offerService.getOffersByActivity(activity);
    }


}
