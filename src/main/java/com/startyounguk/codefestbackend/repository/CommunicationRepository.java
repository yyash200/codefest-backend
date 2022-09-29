package com.startyounguk.codefestbackend.repository;

import com.startyounguk.codefestbackend.entity.CommunicationEntity;
import com.startyounguk.codefestbackend.entity.UserMasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunicationRepository extends
        JpaRepository<CommunicationEntity, Integer>, JpaSpecificationExecutor<CommunicationEntity> {

//    Com findByEmail(String email);

}
