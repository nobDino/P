package com.cinema.mypage;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MypageDAO {
   CustomerDTO getCustomerInfo(int id);

}