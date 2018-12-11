/*
   0. showArrayList - вывод всего списка

   1. DeleteByName - удаление записей о пассажирах с заданной фамилией;

*  2. LuggageWeightPerPassenger - выдать сведения о пассажире, чей багаж больше 30 кг;
*
*  3. TotalBaggageAmount - выдать сведения о суммарном весе багажа всех пассажиров РЕЙСА;
*
*  4. LuggageLocation - сведения о местонахождении багажа(номер рейса) по заданному номеру
*  багажной квитанции (LuggageReceiptNumber);
  */

import java.util.ArrayList;
import java.lang.String;

public class AirportArrayList {
    private ArrayList<Airport> airports = new ArrayList<>();

    public void addNewAirportItem(Airport airportArrayList) {
        this.airports.add(airportArrayList);
    }

    public void  showArrayList() {
        for (Airport airportArrayList : airports) {
            System.out.println(airportArrayList);
            System.out.println("----------------------------");
        }
    }



   public void LuggageWeightPerPassenger()
   { int baggage = 30;
       for (int i = 0; i < airports.size(); i++)
       {
          if (airports.get(i).getTotalBaggageWeight() >= baggage)
          {
              System.out.println("Baggage > 30 kg: " + airports.get(i).getFullName() + "    "+ airports.get(i).getFlightNumber()+ "    "+ airports.get(i).getLuggageReceiptNumber()+ "    " + airports.get(i).getNumberOfPiecesOfBaggage());
              System.out.println("----------------------------");
          }
       }


   }


    public void TotalBaggageAmount( String  FlightNumber)
     { int sum = 0;
       int totalAmount =0;

    for (int i=0 ; i < airports.size(); i++)
    {
        if(airports.get(i).getFlightNumber().equalsIgnoreCase(FlightNumber))
        {
         totalAmount += airports.get(i).getTotalBaggageWeight();
         sum++;

       }

           System.out.println("Total weight of baggage on flight : " + totalAmount + " kg "+ " => Flight : " +airports.get(i).getFlightNumber());/* -???- */
        System.out.println("----------------------------");
    }

     }


     public void LuggageLocation(String LuggageReceiptNumber)
     {    for (int i=0 ; i < airports.size(); i++){
         if(airports.get(i).getLuggageReceiptNumber().equalsIgnoreCase(LuggageReceiptNumber))
         {System.out.println("Baggage : " + airports.get(i).getLuggageReceiptNumber() + " => Flight : " +airports.get(i).getFlightNumber());
             System.out.println("----------------------------");
         }
     }

     }




    public void deleteDeleteByName() {
        this.airports.remove(1);
        System.out.println(airports);
        System.out.println("----------------------------"); }/* задать index от 0 до 4, чтобы удалить пассажира */

}


