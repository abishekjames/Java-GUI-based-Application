

class Product
{
    private String name;
    private int price;
    private Company manufacturer;
    private int ordered;
    private boolean available;

    public Product(String n, int p, String company, String location)
    {
        name = n;
        price=p;
        manufacturer=new Company(company,location);
        ordered=0;
        available=true;
    }
    public boolean readAvailable() { return available;}
    
    public void markAvailable() {
    	available=true;}
    
    public void markUnavailable() {
    	available=false;}
    
    
    
    public String readName()
    {
        return name;
    }
    public int readPrice()
    {
        return price;
    }
    public void stepOrdered()
    {
        ordered++;
    }
    public int readOrdered()
    {
        return ordered;
    }
    public String readCompany()
    {
        return manufacturer.readName();
    }
    public String readHeadquarters()
    {
        return manufacturer.readHeadquarters();
    }
    public String readType() {return "";}
    
    
    public String readDescriptionPart1() {
    	return "";}
    
    public String readDescriptionPart2() {
    	return "";
    }
    public String readDescriptionPart3() {
    	return "";}
    

}