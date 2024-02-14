package org.example;
//Student details are encapsuled here
class Student_Details
{
    private String name;
    private int Student_ID;
    private String address;

    //getter and setters for student details
    public String getName()
    {
        return name;
    }

    public void setName(String s_name)
    {
        this.name = s_name;
    }

    public int getStudent_ID()
    {
        return Student_ID;
    }

    public void setStudent_ID(int s_ID)
    {
        this.Student_ID = s_ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String s_address) {
        this.address = s_address;
    }
}
class Student
{
    public static void main(String[] args)
    {
        //create an object of student_Details class
        Student_Details s = new Student_Details();
        //Set the values by using setter method
        s.setName("adcd");
        s.setStudent_ID(12345);
        s.setAddress("bhjgfhv");
        //Print the values by using getter method
        System.out.println("Student Data:" +"Student Name:" + s.getName()
                + "\nStudent ID:" + s.getStudent_ID()
                +"Student Address:" +s.getAddress());

    }

}
