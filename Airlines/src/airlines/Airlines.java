/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package airlines;

/**
 *
 * @author SanaSheeraz
 */
class Booking
{
    int bookingId;
    String departureDate;
    int numberOfTickets;
    int price;
    boolean cabinType;
    long totalPrice;
    String destination;
    
    Booking(int Id,String Date,int noOfTickets,int Price,boolean cabin_Type,long total,String Destination)
    {
        bookingId=Id;
        departureDate=Date;
        numberOfTickets=noOfTickets;
        price=Price;
        cabinType=cabin_Type;
        totalPrice=total;
        destination=Destination;
    }
    void totalPrice()
    {
        
    }
    void ticketConfirmation()
    {
        
    }
}
public class Airlines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
