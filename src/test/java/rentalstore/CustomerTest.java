package rentalstore;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void should_general_receipt_when_rental_three_kind_movie(){
        Movie tddMovie = new Movie("TDD", Movie.CHILDRENS);
        Movie cbdMovie = new Movie("CBD", Movie.NEW_RELEASE);
        Movie ddtMovie = new Movie("DDT", Movie.REGULAR);
        Rental tddRental = new Rental(tddMovie,2);
        Rental cbdTental = new Rental(cbdMovie, 3);
        Rental ddtRental = new Rental(ddtMovie, 3);
        Customer customer = new Customer("Zin");
        customer.addRental(tddRental);
        customer.addRental(cbdTental);
        customer.addRental(ddtRental);
        String result = "Rental Record for Zin\n" +
                "\tTDD"+"\t"+"1.5"+"\n" +
                "\tCBD"+"\t"+"9.0"+"\n" +
                "\tDDT"+"\t"+"3.5"+"\n" +
                "Amount owed is 14.0"+ "\n"+
                "You earned 4.0" +" frequent renter points";

        String statement = customer.statement();

        Assert.assertEquals(statement,result);
    }

    @Test
    public void should_return_right_receipt_when_rental_CHILDRENS_movie_and_rendted_day_is_5(){
        List<Rental> rentals = new ArrayList<>();
        Movie tddMovie = new Movie("TDD", Movie.CHILDRENS);
        Rental tddRental = new Rental(tddMovie, 5);
        Customer customer = new Customer("Zin");
        customer.addRental(tddRental);
        double amount = (tddRental.getDayRented() - 3) * 1.5 + 1.5;
        String result = "Rental Record for Zin\n" +
                "\tTDD"+"\t"+amount+"\n" +
                "Amount owed is "+amount+ "\n"+
                "You earned 1.0" +" frequent renter points";

        String statement = customer.statement();

        Assert.assertEquals(statement,result);
    }
    @Test
    public void should_return_right_receipt_when_rental_CHILDRENS_movie_and_rendted_day_is_1(){
        List<Rental> rentals = new ArrayList<>();
        Movie tddMovie = new Movie("TDD", Movie.CHILDRENS);
        Rental tddRental = new Rental(tddMovie, 1);
        Customer customer = new Customer("Zin");
        customer.addRental(tddRental);
        double amount = 1.5;
        String result = "Rental Record for Zin\n" +
                "\tTDD"+"\t"+amount+"\n" +
                "Amount owed is "+amount+ "\n"+
                "You earned 1.0" +" frequent renter points";

        String statement = customer.statement();

        Assert.assertEquals(statement,result);
    }

    @Test
    public void should_return_right_receipt_when_rental_REGULAR_movie_and_rendted_day_is_gt_2(){
        List<Rental> rentals = new ArrayList<>();
        Movie tddMovie = new Movie("TDD", Movie.REGULAR);
        Rental tddRental = new Rental(tddMovie, 5);
        Customer customer = new Customer("Zin");
        customer.addRental(tddRental);
        double amount = (tddRental.getDayRented() - 2) * 1.5 + 2;
        String result = "Rental Record for Zin\n" +
                "\tTDD"+"\t"+amount+"\n" +
                "Amount owed is "+amount+ "\n"+
                "You earned 1.0" +" frequent renter points";

        String statement = customer.statement();

        Assert.assertEquals(statement,result);
    }

    @Test
    public void should_return_right_receipt_when_rental_REGULAR_movie_and_rendted_day_is_1(){
        List<Rental> rentals = new ArrayList<>();
        Movie tddMovie = new Movie("TDD", Movie.REGULAR);
        Rental tddRental = new Rental(tddMovie, 1);
        Customer customer = new Customer("Zin");
        customer.addRental(tddRental);
        double amount = 2;
        String result = "Rental Record for Zin\n" +
                "\tTDD"+"\t"+amount+"\n" +
                "Amount owed is "+amount+ "\n"+
                "You earned 1.0" +" frequent renter points";

        String statement = customer.statement();

        Assert.assertEquals(statement,result);
    }

    @Test
    public void should_return_right_frequentRenterPoints_when_rental_NEW_RELEASE_movie_and_rendted_day_is_1(){
        List<Rental> rentals = new ArrayList<>();
        Movie tddMovie = new Movie("TDD", Movie.NEW_RELEASE);
        Rental tddRental = new Rental(tddMovie, 1);
        Customer customer = new Customer("Zin");
        customer.addRental(tddRental);
        double amount = 3;
        String result = "Rental Record for Zin\n" +
                "\tTDD"+"\t"+amount+"\n" +
                "Amount owed is "+amount+ "\n"+
                "You earned 1.0" +" frequent renter points";

        String statement = customer.statement();

        Assert.assertEquals(statement,result);
    }

    @Test
    public void should_return_right_frequentRenterPoints_when_rental_NEW_RELEASE_movie_and_rendted_day_is_3(){
        List<Rental> rentals = new ArrayList<>();
        Movie tddMovie = new Movie("TDD", Movie.NEW_RELEASE);
        Rental tddRental = new Rental(tddMovie, 3);
        Customer customer = new Customer("Zin");
        customer.addRental(tddRental);
        double amount = 9;
        String result = "Rental Record for Zin\n" +
                "\tTDD"+"\t"+amount+"\n" +
                "Amount owed is "+amount+ "\n"+
                "You earned 2.0" +" frequent renter points";

        String statement = customer.statement();

        Assert.assertEquals(statement,result);
    }

    @Test
    public void should_return_right_receipt_when_rental_LITERARY_movie_day_is_3(){
        List<Rental> rentals = new ArrayList<>();
        Movie tddMovie = new Movie("TDD", Movie.LITERARY);
        Rental tddRental = new Rental(tddMovie, 3);
        Customer customer = new Customer("Zin");
        customer.addRental(tddRental);
        double amount = 18;
        String result = "Rental Record for Zin\n" +
                "\tTDD"+"\t"+amount+"\n" +
                "Amount owed is "+amount+ "\n"+
                "You earned 1.5" +" frequent renter points";

        String statement = customer.statement();

        Assert.assertEquals(statement,result);
    }





}