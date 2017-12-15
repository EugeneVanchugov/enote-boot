package com.epam.enoteapp.service.impl;

import com.epam.enoteapp.domain.Label;
import com.epam.enoteapp.repository.LabelRepository;
import com.epam.enoteapp.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LabelServiceImpl implements LabelService {

    private final LabelRepository labelRepository;

    @Autowired
    public LabelServiceImpl(LabelRepository labelRepository) {
        this.labelRepository = labelRepository;
    }

    @Override
    public Label addLabel(Label label) {
        return labelRepository.save(label);
    }

    @Override
    public Label getLabel(Long id) {
        return labelRepository.findOne(id);
    }

    @Override
    public boolean updateLabel(Label label) {
        if (label != null  && labelRepository.exists(label.getId())) {
            labelRepository.save(label);
            return true;
        }
        return false;
    }

    @Override
    public void deleteLabelById(Long id) {
        labelRepository.delete(id);
    }
}
