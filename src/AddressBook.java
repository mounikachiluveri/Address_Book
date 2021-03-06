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
                case 3:
                    PersonUtils.deletePersonRecord(personList);
                    cityMap = personList.stream().collect(Collectors.groupingBy(Person::getCity));
                    stateMap = personList.stream().collect(Collectors.groupingBy(Person::getState));
                    break;
                case 4:
                    personList = personList.stream().sorted((p1 , p2) -> p1.getFname().compareTo(p2.getFname())).collect(Collectors.toList());
                    personList.stream().forEach(p->{
                        System.out.println(p);
                    });
                    break;
                case 5:
                    personList = personList.stream().sorted((p1 , p2) -> p1.getCity().compareTo(p2.getCity())).collect(Collectors.toList());
                    personList.stream().forEach(p->{
                        System.out.println(p);
                    });
                    break;
<<<<<<< HEAD
                    case 6:
=======
                case 6:
                case 6:
>>>>>>> UC9_ViewThePersonByStateOrCity
                    personList = personList.stream().sorted((p1 , p2) -> p1.getState().compareTo(p2.getState())).collect(Collectors.toList());
                    personList.stream().forEach(p->{
                        System.out.println(p);
                    });
                    break;
                case 7:
                    personList = personList.stream().sorted((p1 , p2) -> p1.getZip().compareTo(p2.getZip())).collect(Collectors.toList());
                    personList.stream().forEach(p->{
                        System.out.println(p);
                    });
                    break;
<<<<<<< HEAD
=======
                case 8:
                    sc.nextLine();
                    System.out.println("Enter the City");
                    String city = sc.nextLine();
                    System.out.println("Enter the State");
                    String state = sc.nextLine();
                    personList.stream().forEach(p->{
                        if(p.getCity().equals(city) && p.getState().equals(state)){
                            System.out.println(p);
                        }
                    });
                    break;
>>>>>>> UC9_ViewThePersonByStateOrCity
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

