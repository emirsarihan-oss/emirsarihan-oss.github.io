public class MyProgram
{
    public static void main(String[] args)
    {
        String input = "PlA-420-275-610-350-495-210";//take the input 
        int firstdashloc = input.indexOf("-");//take this first dsh location
        String type = input.substring(0, firstdashloc); //take string of material
        int firstnum = Integer.parseInt(input.substring( firstdashloc + 1, firstdashloc + 4)); //take first number )
        int secondnum = Integer.parseInt(input.substring( firstdashloc + 5, firstdashloc + 8)); //take second number )
        int thirdnum = Integer.parseInt(input.substring( firstdashloc + 9, firstdashloc + 12)); //take third number )
        int fourthnum = Integer.parseInt(input.substring( firstdashloc + 13, firstdashloc + 16)); //take fourth number )
        int fifthnum = Integer.parseInt(input.substring( firstdashloc + 17, firstdashloc + 20)); //take fifth number )
        int sixthnum = Integer.parseInt(input.substring( firstdashloc + 21, firstdashloc + 24)); //take sixth number )
        
        
        int totalfilament = firstnum + secondnum + thirdnum + fourthnum + fifthnum + sixthnum;//take total filament amount
        double filamentavg = totalfilament / 6.0; //average
        System.out.println("Material:" + type);
        System.out.println("Total filament:" + totalfilament);
        System.out.println("Average filament per spool:" + filamentavg);
        
        
    }
}
