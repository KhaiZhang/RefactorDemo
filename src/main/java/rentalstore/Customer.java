package rentalstore;

import java.util.ArrayList;
import java.util.List;

public class Customer extends CustomerTemplate{
//    private String name;
//    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        super(name);
//        this.name = name;
    }

//    public void addRental(Rental arg) {
//        rentals.add(arg);
//    }
//
//    public String getName() {
//        return name;
//    }

//    public String statement() {
//        double totalAmount = 0;
//        int frequentRenterPoints = 0;
//        String result = printHeader();
//        for (Rental each : this.rentals) {
//            double thisAmount = 0;
//            thisAmount = getMovieRentalAmount(each, thisAmount);
//            //add frequent renter points
//            frequentRenterPoints = calculateFrequentRenterPoints(frequentRenterPoints, each);
//            //show figures for this rental
//            result = printMovieTitleAndAmount(result, each, thisAmount);
//            totalAmount += thisAmount;
//        }
//        //add footer lines
//        result = printFooter(totalAmount, frequentRenterPoints, result);
//        return result;
//    }

//    private String printFooter(double totalAmount, int frequentRenterPoints, String result) {
//        result = printTotalAmount(totalAmount, result);
//        result = printFrequentRenterPoints(frequentRenterPoints, result);
//        return result;
//    }

    @Override
    protected String printHeader() {
        return "Rental Record for " + getName() + "\n";
    }
    @Override
    protected String printMovieTitleAndAmount(String result, Rental each, double thisAmount) {
        result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
        return result;
    }

//    protected int calculateFrequentRenterPoints(int frequentRenterPoints, Rental each) {
//        frequentRenterPoints++;
//        //add bonus for a two day new release rental
//        if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDayRented() > 1) {
//            frequentRenterPoints++;
//        }
//        return frequentRenterPoints;
//    }

//    protected double getMovieRentalAmount(Rental each, double thisAmount) {
//        switch (each.getMovie().getPriceCode()) {
//            case Movie.REGULAR:
//                thisAmount += 2;
//                if (each.getDayRented() > 2) {
//                    thisAmount += (each.getDayRented() - 2) * 1.5;
//                }
//                break;
//            case Movie.NEW_RELEASE:
//                thisAmount += each.getDayRented() * 3;
//                break;
//            case Movie.CHILDRENS:
//                thisAmount += 1.5;
//                if (each.getDayRented() > 3) {
//                    thisAmount += (each.getDayRented() - 3) * 1.5;
//                }
//                break;
//        }
//        return thisAmount;
//    }
    @Override
    protected String printFrequentRenterPoints(double frequentRenterPoints, String result) {
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }
    @Override
    protected String printTotalAmount(double totalAmount, String result) {
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        return result;
    }
}
