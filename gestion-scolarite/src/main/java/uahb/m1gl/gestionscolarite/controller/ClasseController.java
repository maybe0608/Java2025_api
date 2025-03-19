package uahb.m1gl.gestionscolarite.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import uahb.m1gl.gestionscolarite.dto.ClasseRequest;
import uahb.m1gl.gestionscolarite.model.Classe;
import uahb.m1gl.gestionscolarite.model.Personne;
import uahb.m1gl.gestionscolarite.service.ClasseService;

import java.util.List;

@RestController
@RequestMapping("/classe")
public class ClasseController {
    private final ClasseService classeService;

    public ClasseController(ClasseService classeService) {
        this.classeService = classeService;
    }

    @GetMapping
    public @ResponseBody List<ClasseRequest> allClasses(){

        return classeService.findAll();
    }
//    public @ResponseBody
}
