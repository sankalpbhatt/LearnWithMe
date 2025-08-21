package org.example.optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String [] args) {
        String middleName = "Clean";
        String firstName = getFirstName();
        String lastName = getLastName();

        Optional<String> optionalMiddleName = Optional.of(middleName);
        Optional<String> optionalFirstName = Optional.ofNullable(firstName);
        Optional<String> optionalLastName = Optional.ofNullable(lastName);

        System.out.println("Middle name is "+optionalMiddleName.get());
        System.out.println("First name is present? "+ optionalFirstName.isPresent());
        System.out.println("Last name is "+ optionalLastName.orElse("Codr"));
    }

    private static String getFirstName() {
        return null;
    }

    private static String getLastName() {
        return null;
    }
}

