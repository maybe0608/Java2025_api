package uahb.m1gl.gestionscolarite.helper;

import org.springframework.stereotype.Component;
import uahb.m1gl.gestionscolarite.dto.ClasseRequest;
import uahb.m1gl.gestionscolarite.dto.ClasseResponse;
import uahb.m1gl.gestionscolarite.mapper.ClasseMapper;
import uahb.m1gl.gestionscolarite.model.Classe;
import uahb.m1gl.gestionscolarite.service.ClasseService;

import java.util.List;

@Component
public class ClasseHelper {
    private final ClasseService classeService;
    private final ClasseMapper classeMapper;
    public ClasseHelper(ClasseService classeService, ClasseMapper classeMapper) {
        this.classeService = classeService;
        this.classeMapper = classeMapper;
    }
    public List<ClasseResponse> findAllClasses(){
        return classeService.findAll().stream()
                .map(classeMapper::classeEntityToClasseResponse).toList();
    }
    public ClasseResponse saveClasse(ClasseRequest classeRequest){
        //verifier si le code existe dans la base de donne

        //verifier si le nom existe

        //verifier si le montant de l'inscription est >= 30k

        //verifier si la mensualite est >=30k

        //verifier si les autres frais est >=10k


        //enregistrement de la classe
    }
}
