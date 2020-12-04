package org.group3.parking.service;

import org.group3.parking.model.ParkingInfo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public interface ParkingInfoService {
    List<ParkingInfo> getAllParkingInfo();

    void updateParkingInfo(Long id, ParkingInfo parkingInfo) throws Exception;

    void deleteParkingInfo(Long id) throws Exception;

    void insertParkingInfo(ParkingInfo parkingInfo) throws Exception;

    ParkingInfo getParkingInfoById(Long id) throws Exception;

    void enterParkingLot(String plateNumber) throws Exception;

    void leaveParkingLot(String plateNumber) throws Exception;

    void payForLeave(String plateNumber, BigDecimal amount) throws Exception;

    BigDecimal getIncomeSumBetweenTwoTime(LocalDateTime startTime, LocalDateTime endTime);
}
