package com.startyounguk.codefestbackend.repository;

import com.startyounguk.codefestbackend.entity.CommunicationEntity;
import com.startyounguk.codefestbackend.entity.UserMasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommunicationRepository extends
        JpaRepository<CommunicationEntity, Integer>, JpaSpecificationExecutor<CommunicationEntity> {

    List<CommunicationEntity> findByMsgStatus(String msgStatus);

}
