package com.epam.enoteapp.service;

import com.epam.enoteapp.domain.Label;

public interface LabelService {

    Label addLabel(Label label);

    Label getLabel(Long id);

    boolean updateLabel(Label label);

    void deleteLabelById(Long id);

}
