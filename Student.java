public class Student
{
    private String name;
    private int alter;
    private boolean weiblich;

    public Student()
    {
        setName("Thomas");
        setAlter(40);
        setWeiblich(true);
    }

    public Student(String name, int alter, boolean weiblich)
    {
        setName(name);
        setAlter(alter);
        setWeiblich(weiblich);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAlter(int alter)
    {
        this.alter = alter;
    }

    public void setWeiblich(boolean weiblich)
    {
        this.weiblich = weiblich;
    }

    public String getName()
    {
        return name;
    }

    public int getAlter()
    {
        return alter;
    }

    public boolean getWeiblich()
    {
        return weiblich;
    }

    public void printStudent()
    {
        System.out.println("Student:\t" + name + "\t" + alter + "\t" + weiblich);
    }
}
