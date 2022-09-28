package com.startyounguk.codefestbackend.repository;

import com.startyounguk.codefestbackend.entity.UserMasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMasterRepository extends
        JpaRepository<UserMasterEntity, Integer>, JpaSpecificationExecutor<UserMasterEntity> {

    UserMasterEntity findByEmail(String email);

}
