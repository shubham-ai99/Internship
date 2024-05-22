package com.shubhtech.springbootwork.repository;

import com.shubhtech.springbootwork.model.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepository extends JpaRepository<MyEntity,Long> {
}
