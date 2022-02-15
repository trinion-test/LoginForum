package com.loginForum.repository;

import com.loginForum.dto.Sample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SampleRepository {
    List<Sample> selectAll();

    void insert(Sample sample);
}
