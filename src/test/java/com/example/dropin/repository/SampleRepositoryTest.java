package com.example.dropin.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class SampleRepositoryTest {

    private final SampleRepository sampleRepository;

    @Autowired
    SampleRepositoryTest(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    @Test
    void 삽입_테스트() {
        sampleRepository.save(
                Sample.builder()
                        .title("test")
                        .createDt(LocalDateTime.now())
                        .build()
        );
    }

    @Test
    void 조회_테스트() {

        List<Sample> test = sampleRepository.findByTitleOrderByIdDesc("test");

        System.out.println("test :: " + test);
    }

}