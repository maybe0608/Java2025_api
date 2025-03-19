package uahb.m1gl.gestionscolarite.mapper;

import uahb.m1gl.gestionscolarite.dto.ClasseRequest;
import uahb.m1gl.gestionscolarite.model.Classe;
import uahb.m1gl.gestionscolarite.model.Filiere;

public class ClasseMapper {
    public Classe classeRequestToClasseEntity(ClasseRequest classeRequest){
        return Classe.builder()
                .nom(classeRequest.getNom())
                .code(classeRequest.getCode())
                .frais(classeRequest.getFrais())
                .mensualite(classeRequest.getMensualite())
                .montantInscription(classeRequest.getMontantInscription())
                .filiere(Filiere.builder().id(classeRequest.getFiliereId()).build())
                .build();
    }
    public ClasseRequest classeEntityToClasseRequest(Classe classe){
        return ClasseRequest.builder()
                .nom(classe.getNom())
                .code(classe.getCode())
                .frais(classe.getFrais())
                .mensualite(classe.getMensualite())
                .montantInscription(classe.getMontantInscription())
                .filiereId(classe.getId())
                .build();
    }
}
