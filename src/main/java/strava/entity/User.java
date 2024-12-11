package strava.entity;

import java.util.Objects;

public class User {
	 private Long id;
	 private String password;
	 private String email;
	    
	 public User() {
		 
	 }
	    
	 public User(String email, String password) {
		 this.email = email;
		 this.password = password;
	 }

	 public String getEmail() {
		 return email;
	 }

	 public void setEmail(String email) {
		 this.email = email;
	 }

	 public String getPassword() {
		 return password;
	 }

	 public void setPassword(String password) {
		 this.password = password;
	 }

	 @Override
	 public String toString() {
		 return "User [id=" + id + ", email=" + email + ", password=" + password + "]";
	 }

	 @Override
	 public int hashCode() {
		 return Objects.hash(email, id, password);
	 }

	 @Override
	 public boolean equals(Object obj) {
		 if (this == obj)
			 return true;
		 if (obj == null)
			 return false;
		 if (getClass() != obj.getClass())
			 return false;
		 User other = (User) obj;
		 return Objects.equals(email, other.email) && Objects.equals(id, other.id)
				 && Objects.equals(password, other.password);
		}
}
