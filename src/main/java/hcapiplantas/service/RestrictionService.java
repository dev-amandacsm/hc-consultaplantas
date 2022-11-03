package hcapiplantas.service;

import hcapiplantas.exception.DataAlreadyExistsException;
import hcapiplantas.exception.DataNotFoundException;
import hcapiplantas.model.entity.Restriction;

public interface RestrictionService {

    Restriction createRestriction(Restriction restriction) throws DataAlreadyExistsException;

    Restriction getRestrictionById(Long id) throws DataNotFoundException;
}
