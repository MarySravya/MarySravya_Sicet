import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
                for(int i=0;i<students.length;i++)
                    System.out.println(Student[i]);
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
                if(students==null)
                    throw IllegalArgumentException;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
                if((index<0)&&(index>=students.length))
                    throw IllegalArgumentException;
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
                if((student == null)&&(index<0)&&(index>=students.length))
                    throw IllegalArgumentException;
                else
                    students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
                if(student == null)
                    throw IllegalArgumentException;
                else
                {
                    for(int k=0;k<students.length;k++)
                        students[k+1]=students[k];
                    students[0]=student;
                    students.length=students.length+1;
                }
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
                if(student == null)
                    throw IllegalArgumentException;
                else
                {
                    students.length=students.length+1;
                    students[students.length-1]=student;
                }
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
                if((student == null)&&(index<0)&&(index>=students.length))
                    throw IllegalArgumentException;
                else
                {
                    Student[index]=student;
                    students.length=students.length + 1;
                }
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
                if((student == null)&&(index<0)&&(index>=students.length))
                    throw IllegalArgumentException;
                else
                {
                for(int j=index; j<(students.length-1); j++)
               {
                   Student[j] = Student[j+1];
               }
                }
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
                if(student == null)
                    throw IllegalArgumentException;
                else
                {
                for(int l=0; l<students.length; l++)
       {
           if(Student[l] == student)
           {
               for(int j=l; j<(students.length-1); j++)
               {
                   Student[j] = Student[j+1];
               }
               count++;
               break;
           }
       }
       if(count==0)
       {
           throw IllegalArgumentException("student not exist");
       }
                }    
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
            
		// Add your implementation here
                if (date == null)
                    throw IllegalArgumentException;
               
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
                int ages=0;
                if (indexOfStudent == 0)
                    throw IllegalArgumentException;
                else
                {
           for(int j=Student[indexOfStudent].birthDate;j<=2017;j++)
           {
               ages++;
           }
           System.out.println(ages);
		return 0;
                }
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
                int ages=0;
                         for(int i=0; i<students.length; i++)
       {
           for(int j=Student[i].birthDate;j<=2017;j++)
           {
               ages++;
           if(ages == age)
           {
               return Student[i];
           }  
       }
       }
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
                 for(int i=0; i<students.length; i++)
       {
           if(Student[i].avgMark > Student[i+1].avgMark)
           {
               int max=Student[i].avgMark;
           }
       }
                  for(i=0; i<students.length; i++)
       {
           if(Student[i].avgMark == max)
           {
               return Student[i];
           }  
       }
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
                if(student == null)
                    throw IllegalArgumentException;
                else
                {
                for(int i=0; i<size; i++)
       {
           if(Student[i] == student)
           {
               System.out.println(Student[i+1]);
               break;
           }
		return null;
	}
                }
}
