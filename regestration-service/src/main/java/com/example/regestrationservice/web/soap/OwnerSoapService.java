package com.example.regestrationservice.web.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import com.example.regestrationservice.entites.Owner;
import com.example.regestrationservice.repositories.OwnerRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@WebService
@AllArgsConstructor
public class OwnerSoapService {
    private OwnerRepository ownerRepository;

    @WebMethod
    public List<Owner> getOwners(){
        return ownerRepository.findAll();
    }

    @WebMethod
    public Owner getOwnerById(@WebParam(name = "id") Long id){
        Owner owner = ownerRepository.findById(id).get();
        return owner;
    }

}
