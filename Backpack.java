

class Backpack extends  Product
{
    private String Brand;
    private String Size;
    private String Type;
    public Backpack(String n, int p, String company, String location,String Brand,String Size, String Type)
                  
    {      super(n, p, company, location);
           this.Brand=Brand;
           this.Size=Size;
           this.Type=Type;
    }
    public String readType() {
    	return "Backpack";}
    public String readDescriptionPart1() {
    	return "Brand: "+Brand;}
    
    public String readDescriptionPart2() {
    	return "Size: "+ Size;
    }
    public String readDescriptionPart3() {
    	return "Type: "+Type;}
}