package com.example.demo.service;

import com.example.demo.shared.ParentDTO;
import org.springframework.transaction.annotation.Transactional;

public interface ParentService {
    @Transactional
    long save(ParentDTO parentDTO);

    @Transactional(readOnly = true)
    ParentDTO find(long id);
}
