package ui.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class User {

    private String userFullName;
    private String userEmail;
    private String userCurrentAddress;
    private String userPermanentAddress;

    static List<String> getNameOfList(List<User> listof ){
        List<String>listOfNames =
        listof.stream().map(name -> name.getUserFullName()).collect(Collectors.toList());
        return listOfNames;
    }
    static List<String> getEmailOfList(List<User> listof ){
        List<String>listOfNames =
                listof.stream().map(name -> name.getUserEmail()).collect(Collectors.toList());
        return listOfNames;
    }

    static List<String> getPermanentAddressOfList(List<User> listof ){
        List<String>listOfNames =
                listof.stream().map(name -> name.getUserPermanentAddress()).collect(Collectors.toList());
        return listOfNames;
    }

    public static void main(String[] args) {
        User user1 = User.builder().userFullName("Tilek").userPermanentAddress("Bishkek").build();
        User user2 = User.builder().userFullName("Aman").userCurrentAddress("Osh").userEmail("Asan@mail.ru").build();
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        System.out.println(getNameOfList(list));
        System.out.println(getEmailOfList(list));
    }

}

