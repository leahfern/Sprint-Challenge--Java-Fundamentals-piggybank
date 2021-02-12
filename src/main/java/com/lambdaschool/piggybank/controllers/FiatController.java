package com.lambdaschool.piggybank.controllers;

import com.lambdaschool.piggybank.models.FiatMoney;
import com.lambdaschool.piggybank.repositories.FiatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FiatController {
  @Autowired
  FiatRepository fiatRepository;

  //********** END POINTS ************//

  //http://localhost:2019/total
  @GetMapping(value = "/total", produces = {"application/json"})
  public ResponseEntity<?> listAllFiatMoney() {
    List<FiatMoney> myList = new ArrayList<>();
    fiatRepository.findAll().iterator().forEachRemaining(myList::add);

    double total = 0.00;
    for(FiatMoney f : myList) {
      total += (f.getValue() * f.getQuantity());
      if (f.getQuantity() > 1) {
        System.out.println(f.getQuantity() + " " + f.getNameplural());
      } else {
        System.out.println(f.getQuantity() + " " + f.getName());
      }
    }
    System.out.println("The piggy bank holds " + total);

    return new ResponseEntity<>(HttpStatus.OK);
  }

}