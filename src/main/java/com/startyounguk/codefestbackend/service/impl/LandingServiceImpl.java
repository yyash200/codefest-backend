package com.startyounguk.codefestbackend.service.impl;

import com.startyounguk.codefestbackend.entity.LandingEntity;
import com.startyounguk.codefestbackend.repository.LandingRepository;
import com.startyounguk.codefestbackend.service.LandingService;
import com.startyounguk.codefestbackend.service.dto.Contact;
import com.startyounguk.codefestbackend.service.dto.LandingInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LandingServiceImpl implements LandingService {

    @Autowired
    LandingRepository landingRepository;

    @Override
    public LandingInfo getLandingInfo() {

        Optional<LandingEntity> aboutUs = landingRepository.findById("AboutUs");
        Optional<LandingEntity> aim = landingRepository.findById("Aim");
        Optional<LandingEntity> address = landingRepository.findById("Address");
        Optional<LandingEntity> phoneNo = landingRepository.findById("PhoneNo");
        Optional<LandingEntity> email = landingRepository.findById("email");


        LandingInfo landingInfo = new LandingInfo();
        landingInfo.setAboutUs(aboutUs.get().getDescription());
        landingInfo.setAim(aim.get().getDescription());

        Contact contact = new Contact();
        contact.setPhoneNo(phoneNo.get().getDescription());
        contact.setAddress(address.get().getDescription());
        contact.setEmail(email.get().getDescription());

        landingInfo.setContact(contact);

        return landingInfo;
    }
}
