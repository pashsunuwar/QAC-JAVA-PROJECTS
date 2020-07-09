package com.qa.SOLID.dependency_inversion;

import java.util.List;

public class Project {

	private List<Developer> developers;

	public Project(List<Developer> devs) {
		this.developers = devs;
	}

	public void implement() {
		developers.forEach(d -> d.develop());
	}
}
