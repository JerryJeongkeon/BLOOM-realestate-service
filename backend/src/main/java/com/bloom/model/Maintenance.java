package com.bloom.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Maintenance { // 프론트 <-> DB 데이터

    private String num;
    private String address;
    private String dong;
    private String ho;
    private String latitude;
    private String longitude;
    private String category; // 카테고리 [시설, 환경, 유지]
    private String details; // 상세 내용
    private String cost; // 발생 비용
    private String startDate; // 시작 날짜
    private String endDate; // 종료 날짜
    private String license;
    private String image;   // 건물 사진 파일명
    private String createdAt;
}
