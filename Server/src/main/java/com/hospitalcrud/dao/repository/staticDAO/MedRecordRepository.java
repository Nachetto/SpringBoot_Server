package com.hospitalcrud.dao.repository.staticDAO;

import com.hospitalcrud.dao.model.MedRecord;
import com.hospitalcrud.dao.model.Medication;
import com.hospitalcrud.dao.repository.MedicationDAO;

import java.time.LocalDate;
import java.util.List;

public class MedRecordRepository implements MedicationDAO {
    //creando la lista estatica de medrecords
    private static List<MedRecord> medRecords = List.of(
            new MedRecord(1, 1, 1, "Gripe", LocalDate.now(), List.of(new Medication(1, "Paracetamol", 1))),
            new MedRecord(2, 2, 2, "Fiebre", LocalDate.now(), List.of(new Medication(2, "Ibuprofeno", 2))),
            new MedRecord(3, 3, 3, "Infeccion", LocalDate.now(), List.of(new Medication(3, "Amoxicilina", 3))),
            new MedRecord(4, 4, 4, "Alergia", LocalDate.now(), List.of(new Medication(4, "Dexametasona", 4)))

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
