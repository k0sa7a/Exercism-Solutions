import java.util.List;
import java.util.ArrayList;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1,
                                                                 ProductionRemoteControlCar prc2) {
        List<ProductionRemoteControlCar> carList = new ArrayList<ProductionRemoteControlCar>();
        if (prc1.compareTo(prc2) == -1) {
            carList.add(prc1);
            carList.add(prc2);
        }   else if (prc1.compareTo(prc2) == 1) {
            carList.add(prc2);
            carList.add(prc1);
        }
        return carList;
    }
}
