package com.hospitalcrud.dao.repository.staticDAO;

import com.hospitalcrud.dao.model.Medication;
import com.hospitalcrud.dao.repository.MedicationDAO;

import java.util.List;

public class MedicationRepository implements MedicationDAO {
    //creando la lista estatica de medicamentos y sus dosis
    private static List<Medication> medications = List.of(
            new Medication(1, "Paracetamol", 1),
            new Medication(2, "Ibuprofeno", 2),
            new Medication(3, "Amoxicilina", 3),
            new Medication(4, "Dexametasona", 4)
    );

    @Override
    public List<Medication> getAll() {
        return List.of();
    }

    @Override
    public int save(Medication m) {
        return 0;
    }

    @Override
    public void update(Medication m) {

    }

    @Override
    public void delete(int id, boolean confirmation) {

    }
}
