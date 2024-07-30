package it.lottomatica.controller;

import it.lottomatica.model.CustomDocument;
import it.lottomatica.request.DocumentoRequest;
import it.lottomatica.service.CustomMongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class LottomaticaController {

    @Autowired
    private CustomMongoService customMongoService;

    @RequestMapping(path="/document/{id}", method= RequestMethod.GET)
    public ResponseEntity<CustomDocument> getDocumentById(@PathVariable("id") String id) {
        return ResponseEntity.ok(customMongoService.findById(id));
    }

    @RequestMapping(path="/document", method= RequestMethod.POST)
    public ResponseEntity<String> insertDocument(@RequestBody DocumentoRequest documentoRequest) {
        return null;
    }



}
