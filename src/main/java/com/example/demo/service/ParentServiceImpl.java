package com.example.demo.service;

import com.example.demo.entities.Parent;
import com.example.demo.repos.ParentRepo;
import com.example.demo.shared.ParentDTO;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class ParentServiceImpl implements ParentService {
    private final ParentRepo repo;

    @Override
    @Transactional
    public long save(ParentDTO parentDTO) {
        ModelMapper mapper = new ModelMapper();
        Parent parent = mapper.map(parentDTO, Parent.class);
        parent.getChilds().forEach(child -> child.setParent(parent));
        repo.save(parent);
        return parent.getId();
    }

    @Override
    @Transactional(readOnly = true)
    public ParentDTO find(long id) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(repo.getById(id), ParentDTO.class);
    }
}
