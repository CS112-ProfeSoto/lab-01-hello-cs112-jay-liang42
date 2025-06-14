public class Person {
    private String name;

    public Person()
    {
        this.name = "Unknown";
    }

    public Person(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return String.format(name);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public boolean equals(Person other)
    {
        if (other == null)
        {
            return false;
        }
        return this.name == other.name;
    }
}
