package com.example.demo.servicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidades.Periodo;
import com.example.demo.repositorios.PeriodoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PeriodoService {
    @Autowired
    private PeriodoRepository periodoRepository; 

    public List<Periodo> findAllPeriodos() {
        return periodoRepository.findAll();
    }

    public Periodo getPeriodoById(Long id) {
        Optional<Periodo> optionalPeriodo = periodoRepository.findById(id);
        return optionalPeriodo.orElse(null);
    }

    public Periodo createPeriodo(Periodo periodo) {
        return periodoRepository.save(periodo);
    }

    public Periodo updatePeriodo(Long id, Periodo periodo) {
        if (periodoRepository.existsById(id)) {
            periodo.setId(id);
            return periodoRepository.save(periodo);
        } else {
            return null;
        }
    }

    public void deletePeriodo(Long id) {
        periodoRepository.deleteById(id);
    }
}

