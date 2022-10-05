

class Wallet extends  Product
{
    private String Manufacturer;
    private String Color;
    private String Material;
    public Wallet(String n, int p, String company, String location, String Manufacturer,String Color,String Material)
                  
    {      super(n, p, company, location);
           this.Manufacturer=Manufacturer;
           this.Color=Color;
           this.Material=Material;
    }
    public String readType() {
    	return "Wallet";}
    public String readDescriptionPart1() {
    	return "Manufacturer : "+Manufacturer;}
    
    public String readDescriptionPart2() {
    	return "Color: "+ Color;
    }
    public String readDescriptionPart3() {
    	return "" + Material + " Material: ";}
}