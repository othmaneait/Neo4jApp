package com.techprimers.springbootneo4jexample1.service;

import com.techprimers.springbootneo4jexample1.model.Station;
import com.techprimers.springbootneo4jexample1.model.User;
import com.techprimers.springbootneo4jexample1.repository.StationRepository;
import com.techprimers.springbootneo4jexample1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StationService {

    @Autowired
    StationRepository stationRepository;

    public Collection<Station> getAll() {
        return stationRepository.getAllStations();
    }
}
