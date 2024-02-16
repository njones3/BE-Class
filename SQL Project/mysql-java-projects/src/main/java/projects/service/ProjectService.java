package projects.service;

import projects.dao.ProjectDao;
import projects.entity.Project;

/*
 * Creating the DAO with the primary key value.
 */

public class ProjectService {
	
	private ProjectDao projectDao = new ProjectDao();
	
	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}

}
