


public class Airport {
    private String FullName;
    private String FlightNumber;
    private int LuggageReceiptNumber;
    private int NumberOfPiecesOfBaggage;
    private int TotalBaggageWeight;


    enum flightNumber {
        A123,
        KM45,
        SL98,
        D56
    }

    Airport(){
        FullName = "DefaultFullName";
        FlightNumber = "DefaultFlight";
        LuggageReceiptNumber = 0;
        NumberOfPiecesOfBaggage = 0;
        TotalBaggageWeight = 0;
    }
    Airport(String FullName, String FlightNumber,int LuggageReceiptNumber,int NumberOfPiecesOfBaggage,int TotalBaggageWeight ){
       this.FullName = FullName;
       this.FlightNumber = FlightNumber;
       this.LuggageReceiptNumber = LuggageReceiptNumber;
       this.NumberOfPiecesOfBaggage = NumberOfPiecesOfBaggage;
       this.TotalBaggageWeight = TotalBaggageWeight;
    }



    public String getFullName(){
        return FullName;
    }
    public void setFullName(){
        this.FullName = FullName;
    }



    public String getFlightNumber(){
        return FlightNumber;
    }

    public void setFlightNumber(String FlightNumber){
        this.FlightNumber="DefautFlight";
        for(flightNumber variants: flightNumber.values()){
            if(FlightNumber.equalsIgnoreCase(variants.toString()))
                this.FlightNumber = variants.toString();
        }
    }



    public int getLuggageReceiptNumber(){
        return LuggageReceiptNumber;
    }

    public void setLuggageReceiptNumber(){
        if(LuggageReceiptNumber>=0){
        this.LuggageReceiptNumber=LuggageReceiptNumber;}
        else{
            System.out.println(" ! ERROR !");
        }
    }



    public int getNumberOfPiecesOfBaggage(){
        return NumberOfPiecesOfBaggage;
    }

    public void setNumberOfPiecesOfBaggage(){
        if(NumberOfPiecesOfBaggage >=0) {
            this.NumberOfPiecesOfBaggage = NumberOfPiecesOfBaggage;
        }
        else {
            System.out.println(" ! ERROR !");
        }

    }



    public int getTotalBaggageWeight(){
        return TotalBaggageWeight;
    }

    public void setTotalBaggageWeight(){
        if(TotalBaggageWeight >= 0) {
            this.TotalBaggageWeight = TotalBaggageWeight;
        }
        else {
            System.out.println(" ! ERROR !");
        }
    }

    @Override
    public String toString() {
        return "Airport{" +
                "FullName='" + FullName + '\'' +
                ", FlightNumber=" + FlightNumber +
                ", LuggageReceiptNumber=" + LuggageReceiptNumber +
                ", NumberOfPiecesOfBaggage=" + NumberOfPiecesOfBaggage +
                ", TotalBaggageWeight='" + TotalBaggageWeight + '\'' + "kg"+
                '}';
    }
}
