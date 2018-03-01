package au.phun.model;

import java.util.List;

public class Student {

		private String name;
		private String surname;
		private List<Subject> subjects;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSurname() {
			return surname;
		}
		public void setSurname(String surname) {
			this.surname = surname;
		}
		public List<Subject> getSubjects() {
			return subjects;
		}
		public void setSubject(List<Subject> subjects) {
			this.subjects = subjects;
		}
		
		
		
		
		
}
