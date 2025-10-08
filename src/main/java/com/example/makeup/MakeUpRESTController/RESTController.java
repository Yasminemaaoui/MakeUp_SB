package com.example.makeup.MakeUpRESTController;

import com.example.makeup.entities.MakeUp;
import com.example.makeup.service.MakeUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class RESTController {
    @Autowired
    MakeUpService makeUpService;

    @RequestMapping(method = RequestMethod.GET)
    public List<MakeUp> getAllMakeUp(){
        return makeUpService.getAllMakeUp();
    }

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public MakeUp getMakeUpById(@PathVariable("id") Long id) {
        return makeUpService.getMakeUp(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public MakeUp createMakeUp(@RequestBody MakeUp makeUp) {
        return makeUpService.saveMakeUp(makeUp);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public MakeUp updateMakeUp(@RequestBody MakeUp makeUp) {
        return makeUpService.updateMakeUp(makeUp);
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteMakeUp(@PathVariable("id") Long id)
    {
        makeUpService.deleteMakeUpById(id);
    }

    @RequestMapping(value="/prodscat/{idMrq}",method = RequestMethod.GET)
    public List<MakeUp> getMakeUpByCatId(@PathVariable("idMrq") Long idMrq) {
        return makeUpService.findByMarqueIdMarque(idMrq);
    }




}
