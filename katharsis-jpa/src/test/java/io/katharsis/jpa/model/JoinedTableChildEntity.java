package io.katharsis.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import io.katharsis.resource.annotations.JsonApiResource;

@JsonApiResource(type = "tablePerClassChild")
@Entity
public class JoinedTableChildEntity extends JoinedTableBaseEntity {

	public static final String ATTR_intValue = "intValue";

	@Column
	private int intValue;

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

}