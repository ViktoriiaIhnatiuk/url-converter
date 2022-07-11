package com.example.urlconverter.repository;

import com.example.urlconverter.model.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface URLRepository extends JpaRepository<Url, Long> {

}