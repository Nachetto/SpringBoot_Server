package com.hospitalcrud.domain.model;

import com.hospitalcrud.dao.model.MedRecord;
import com.hospitalcrud.dao.model.Medication;
import lombok.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MedRecordUI {
        private int id;
        private int idPatient;
        private int idDoctor;
        private String description;
        private String date;
        private List<String> medications;

        public MedRecord toMedRecord() {


                DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE; // El formateador con el formato correcto
                LocalDate datee = LocalDate.parse(this.date, formatter);
                return new MedRecord(id, idPatient, idDoctor, description, datee, medications.stream().map(m -> new Medication(0,m,id)).toList());
        }
}

