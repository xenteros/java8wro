package com.github.xenteros.service;

import com.github.xenteros.dto.RentDTO;
import com.github.xenteros.model.Rent;

public interface RentService {

    Rent createRent(RentDTO rentDTO);
}
