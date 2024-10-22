package com.hospitalcrud.dao.repository;

import com.hospitalcrud.dao.model.Credential;

import java.util.List;

public interface CredentialDAO {
    List<Credential> getAll();
    int save(Credential c);
    void delete(int id, boolean confirmation);
}
