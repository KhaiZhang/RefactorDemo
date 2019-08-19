package rentalstore;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class HtmlPrintCustomerTest {

    @Test
    public void should_return_html_receipt_when_rental_one_movie(){
        List<Rental> rentals = new ArrayList<>();
        Movie tddMovie = new Movie("TDD", Movie.NEW_RELEASE);
        Rental tddRental = new Rental(tddMovie, 3);
        CustomerTemplate customer = new HtmlPrintCustomer("Zin");
        customer.addRental(tddRental);
        double amount = 9;
        String result = "<h1>Rental Record for <em>Zin</em></h1>\n" +
                "<p>\tTDD"+"\t"+amount+"</p>\n" +
                "<p>Amount owed is "+amount+ "<p>\n"+
                "<p>You earned 2.0" +" frequent renter points<p>";

        String statement = customer.statement();

        Assert.assertEquals(statement,result);
    }

    @Test
    public void should_return_html_receipt_when_rental_three_kind_movie(){
        List<Rental> rentals = new ArrayList<>();
        Movie tddMovie = new Movie("TDD", Movie.CHILDRENS);
        Movie cbdMovie = new Movie("CODE", Movie.NEW_RELEASE);
        Movie ddtMovie = new Movie("DDT", Movie.REGULAR);
        Rental tddRental = new Rental(tddMovie,2);
        Rental cbdTental = new Rental(cbdMovie, 3);
        Rental ddtRental = new Rental(ddtMovie, 3);
        CustomerTemplate customer = new HtmlPrintCustomer("Zin");
        customer.addRental(tddRental);
        customer.addRental(cbdTental);
        customer.addRental(ddtRental);
        String result = "<h1>Rental Record for <em>Zin</em></h1>\n" +
                "<p>\tTDD"+"\t"+"1.5"+"</p>\n" +
                "<p>\tCODE"+"\t"+"9.0"+"</p>\n" +
                "<p>\tDDT"+"\t"+"3.5"+"</p>\n" +
                "<p>Amount owed is "+"14.0"+ "<p>\n"+
                "<p>You earned 4.0" +" frequent renter points<p>";

        String statement = customer.statement();

        Assert.assertEquals(statement,result);
    }
}