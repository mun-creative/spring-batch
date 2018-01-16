package com.medha.batch.mapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.medha.batch.model.Tutorial;


public class TutorialFieldSetMapper implements FieldSetMapper<Tutorial> {

	public Tutorial mapFieldSet(FieldSet fieldSet) throws BindException {
		// TODO Auto-generated method stub
		Tutorial tutorials = new Tutorial();
		tutorials.setTutorial_id(fieldSet.readInt(0));

		tutorials.setTutorial_author(fieldSet.readString(1));
		tutorials.setTutorial_title(fieldSet.readString(2));
		tutorials.setTutorial_icon(fieldSet.readString(3));
		tutorials.setTutorial_description(fieldSet.readString(4));

		return tutorials;
	}

}
