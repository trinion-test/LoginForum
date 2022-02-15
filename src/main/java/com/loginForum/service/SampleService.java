package com.loginForum.service;

import com.loginForum.dto.Sample;
import com.loginForum.form.SampleForm;
import com.loginForum.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleService {
    private final SampleRepository sampleRepository;

    @Autowired
    public SampleService(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    public List<Sample> findAll() {
        return sampleRepository.selectAll();
    }

    public void save(SampleForm sampleForm) {
        Sample sample = new Sample();
        sample.setTitle(sampleForm.getTitle());
        sample.setContent(sampleForm.getContent());
        sampleRepository.insert(sample);
    }
}
