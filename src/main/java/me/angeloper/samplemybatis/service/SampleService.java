package me.angeloper.samplemybatis.service;

import lombok.AllArgsConstructor;
import me.angeloper.samplemybatis.repository.SampleRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SampleService {

    private final SampleRepository sampleRepository;

    public String retrieve() {
        return sampleRepository.retrieve();
    }

}
