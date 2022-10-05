

class Watch extends  Product
{
    private String Maker;
    private String Type;
    private String Color;
    public Watch(String n, int p, String company, String location,String Maker,String Type, String Color)
                  
    {      super(n, p, company, location);
           this.Maker=Maker;
           this.Type=Type;
           this.Color=Color;
    }
    public String readType() {
    	return "Watch";}
    public String readDescriptionPart1() {
    	return "Maker: "+Maker;}
    
    public String readDescriptionPart2() {
    	return "Type: "+ Type;
    }
    public String readDescriptionPart3() {
    	return "Color: "+Color;}
}