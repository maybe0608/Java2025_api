package uahb.m1gl.gestionscolarite.mapper;

import org.springframework.stereotype.Component;
import uahb.m1gl.gestionscolarite.dto.ClasseRequest;
import uahb.m1gl.gestionscolarite.dto.ClasseResponse;
import uahb.m1gl.gestionscolarite.dto.FiliereDto;
import uahb.m1gl.gestionscolarite.model.Classe;
import uahb.m1gl.gestionscolarite.model.Filiere;

@Component
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
    public ClasseResponse classeEntityToClasseResponse(Classe classe){
        return ClasseResponse.builder()
                .id(classe.getId())
                .nom(classe.getNom())
                .code(classe.getCode())
                .frais(classe.getFrais())
                .mensualite(classe.getMensualite())
                .montantInscription(classe.getMontantInscription())
                .filiere(filiereEntityToFiliereDto(classe.getFiliere()))
                .build();
    }
    public FiliereDto filiereEntityToFiliereDto(Filiere filiere){
        return FiliereDto.builder()
                .id(filiere.getId())
                .nom(filiere.getNom())
                .build();
    }
}
