package kodlamaioNLayeredApp;

import kodlamaioNLayeredApp.business.CategoryManager;
import kodlamaioNLayeredApp.business.CourseManager;
import kodlamaioNLayeredApp.business.InstructorManager;
import kodlamaioNLayeredApp.loggers.DatabaseLogger;
import kodlamaioNLayeredApp.loggers.FileLogger;
import kodlamaioNLayeredApp.loggers.Logger;
import kodlamaioNLayeredApp.loggers.EmailLogger;
import kodlamaioNLayeredApp.dataAccess.HibernateCategoryDao;
import kodlamaioNLayeredApp.dataAccess.HibernateCourseDao;
import kodlamaioNLayeredApp.dataAccess.HibernateInstructorDao;
import kodlamaioNLayeredApp.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Logger[] loggers = { new EmailLogger(), new DatabaseLogger(), new FileLogger() };

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);

		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);

		Instructor newInstructor = new Instructor(1, "Engin", "Demirog");

		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(newInstructor);
	}
}