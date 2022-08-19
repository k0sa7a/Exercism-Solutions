import java.util.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
class Meetup {
    int month;
    int year;
    HashMap<Integer, Integer> daysPerMonth = new HashMap<Integer, Integer>();
    LocalDate result;

    Meetup(int month, int year){
        this.month = month;
        this.year = year;
        daysPerMonth.put(1, 31);
        if(Year.isLeap(year)){
            daysPerMonth.put(2, 29);
        } else {
            daysPerMonth.put(2, 28);
        }
        daysPerMonth.put(3, 31);
        daysPerMonth.put(4, 30);
        daysPerMonth.put(5, 31);
        daysPerMonth.put(6, 30);
        daysPerMonth.put(7, 31);
        daysPerMonth.put(8, 31);
        daysPerMonth.put(9, 30);
        daysPerMonth.put(10, 31);
        daysPerMonth.put(11, 30);
        daysPerMonth.put(12, 31);

    }
    public LocalDate day(DayOfWeek weekDay, MeetupSchedule dayValue){

        if(dayValue == MeetupSchedule.FIRST){
            for(int i = 1; i <= daysPerMonth.get(this.month); i++){
                LocalDate check = LocalDate.of(this.year, this.month, i);
                DayOfWeek dayOfWeek = DayOfWeek.from(check);
                if(dayOfWeek == weekDay){
                    result = LocalDate.of(this.year, this.month, i);
                    break;
                }
            }
        }
        if(dayValue == MeetupSchedule.SECOND){
            int counter = 0;
            for(int i = 1; i <= daysPerMonth.get(this.month); i++){
                LocalDate check = LocalDate.of(this.year, this.month, i);
                DayOfWeek dayOfWeek = DayOfWeek.from(check);
                if(dayOfWeek == weekDay){
                    counter += 1;
                }
                if (counter == 2){
                    result = LocalDate.of(this.year, this.month, i);
                    break;
                }
            }
        }
        if(dayValue == MeetupSchedule.THIRD){
            int counter = 0;
            for(int i = 1; i <= daysPerMonth.get(this.month); i++){
                LocalDate check = LocalDate.of(this.year, this.month, i);
                DayOfWeek dayOfWeek = DayOfWeek.from(check);
                if(dayOfWeek == weekDay){
                    counter += 1;
                }
                if (counter == 3){
                    result = LocalDate.of(this.year, this.month, i);
                    break;
                }
            }
        }
        if(dayValue == MeetupSchedule.FOURTH){
            int counter = 0;
            for(int i = 1; i <= daysPerMonth.get(this.month); i++){
                LocalDate check = LocalDate.of(this.year, this.month, i);
                DayOfWeek dayOfWeek = DayOfWeek.from(check);
                if(dayOfWeek == weekDay){
                    counter += 1;
                }
                if (counter == 4){
                    result = LocalDate.of(this.year, this.month, i);
                    break;
                }
            }
        }
        if(dayValue == MeetupSchedule.TEENTH){
            Integer[] arr = new Integer[]{13, 14, 15, 16, 17, 18, 19};
            List<Integer> intList = new ArrayList<>(Arrays.asList(arr));

            for(int i = 1; i <= daysPerMonth.get(this.month); i++){
                LocalDate check = LocalDate.of(this.year, this.month, i);
                DayOfWeek dayOfWeek = DayOfWeek.from(check);
                if(dayOfWeek == weekDay && intList.contains(i)){
                    result = LocalDate.of(this.year, this.month, i);
                    break;
                }

            }
        }

        for(int i = daysPerMonth.get(this.month); i > 0; i--){
            LocalDate check = LocalDate.of(this.year, this.month, i);
            DayOfWeek dayOfWeek = DayOfWeek.from(check);
            if(dayOfWeek == weekDay && dayValue == MeetupSchedule.LAST){
                result = LocalDate.of(this.year, this.month, i);
                break;
            }
        }
        return result;
    }
}
