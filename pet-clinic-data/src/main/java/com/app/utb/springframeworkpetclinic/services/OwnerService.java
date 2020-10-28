package com.app.utb.springframeworkpetclinic.services;

import com.app.utb.springframeworkpetclinic.model.Owner;
import java.util.Set;
public interface OwnerService  extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
