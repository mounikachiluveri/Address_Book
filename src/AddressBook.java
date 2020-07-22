import java.util.*;
import java.util.stream.Collectors;
public class AddressBook {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Map<String,List<Person>> cityMap = new HashMap<>();
        Map<String,List<Person>> stateMap = new HashMap<>();

        System.out.println("Welcome to Address Book program");
        boolean isContinue = true;
        while (isContinue == true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1)ADD   2)EDIT   3)DELETE  4)Sort By Name  5)Sort By City  6)Sort By State  7)Sort By Zip  8)Search by City & State  9)Search by City  10)Search by State ");
            int select = sc.nextInt();
            switch (select) {
                case 1:
                   PersonUtils.addPerson(personList);
                   cityMap = personList.stream().collect(Collectors.groupingBy(Person::getCity));
                   stateMap = personList.stream().collect(Collectors.groupingBy(Person::getState));
                break;
                case 2:
                    PersonUtils.editPersonRecord(personList);
                    cityMap = personList.stream().collect(Collectors.groupingBy(Person::getCity));
                    stateMap = personList.stream().collect(Collectors.groupingBy(Person::getState));
                    break;
                case 12:
                    isContinue = false;
                    break;

                default:
                    System.out.println("invalid input");
                    break;
            }
        }
    }
}

