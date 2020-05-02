package com.bloom.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@JsonInclude(JsonInclude.Include.NON_ABSENT)
public class Building { // 프론트 <-> DB 데이터

	private String num;
    private String address;
    private String dong;
    private String ho;
    private String latitude; // 위도
    private String longitude; // 경도
    private String category; // 카테고리 [시설, 환경, 유지]
    private String supply; // 공급 면적
    private String exclusive; // 전용 면적
    private String details; // 계약 내용
    private String cost; // 계약 비용
    private String startDate; // 시작 날짜
    private String endDate; // 종료 날짜
    private String name; // 임대인
    private String license; // 공인중개사 번호
    private String image;   // 건물 사진 파일명
    private String type; // 건물 이력 or 상태
    private String createdAt;
}
