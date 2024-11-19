package adapter_attern;

import java.util.List;
import java.util.ArrayList;


public class CityHotel {
    private List <Room> availbleRooms = new ArrayList<>();
    private CityHotel (){
        availbleRooms.add(new Room(20));
        availbleRooms.add(new Room(30));
        availbleRooms.add(new Room(40));
        availbleRooms.add(new Room(50));
    };
    public List getAllAvailbleRooms (){
        return availbleRooms ;
    }

    public void bookRoom (int roomnumber){
        Room bookedRoom = (Room) availbleRooms.stream()
        .filter(room->room.getRoomnumber()==roomnumber)
        .findFirst()
        .orElse(null);

        if (bookedRoom != null){
            availbleRooms.remove(bookedRoom);
            System.out.println("Room"+roomnumber+"has been booked .");
        }else{
            System.out.println("Requested room has not available.");
        }
    }

}
