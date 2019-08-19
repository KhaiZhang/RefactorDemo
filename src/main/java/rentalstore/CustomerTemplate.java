package rentalstore;

import java.util.ArrayList;
import java.util.List;

public abstract class CustomerTemplate {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public CustomerTemplate(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        double frequentRenterPoints = 0;
        String result = printHeader();
        for (Rental each : this.rentals) {
            double thisAmount = 0;
            thisAmount = getMovieRentalAmount(each, thisAmount);
            //add frequent renter points
            frequentRenterPoints = calculateFrequentRenterPoints(frequentRenterPoints, each);
            //show figures for this rental
            result = printMovieTitleAndAmount(result, each, thisAmount);
            totalAmount += thisAmount;
        }
        //add footer lines
        result = printFooter(totalAmount, frequentRenterPoints, result);
        return result;
    }

    private String printFooter(double totalAmount, double frequentRenterPoints, String result) {
        result = printTotalAmount(totalAmount, result);
        result = printFrequentRenterPoints(frequentRenterPoints, result);
        return result;
    }

    protected abstract String printHeader();

    protected abstract String printMovieTitleAndAmount(String result, Rental each, double thisAmount);

    protected double calculateFrequentRenterPoints(double frequentRenterPoints, Rental each) {
        frequentRenterPoints++;
        //add bonus for a two day new release rental
        if(isLiteraryMovieAndRentedDayisNotNull(each)){
            frequentRenterPoints += 0.5;
        }
        if (isNewReleaseMovieAndDayIsNotNull(each)) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }

    private boolean isNewReleaseMovieAndDayIsNotNull(Rental each) {
        return (each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDayRented() > 1;
    }

    private boolean isLiteraryMovieAndRentedDayisNotNull(Rental each) {
        return (each.getMovie().getPriceCode() == Movie.LITERARY) && each.getDayRented() > 1;
    }

    protected double getMovieRentalAmount(Rental each, double thisAmount) {
        switch (each.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (each.getDayRented() > 2) {
                    thisAmount += (each.getDayRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                thisAmount += each.getDayRented() * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (each.getDayRented() > 3) {
                    thisAmount += (each.getDayRented() - 3) * 1.5;
                }
                break;
            case Movie.LITERARY:
                thisAmount += each.getDayRented() * 6;
        }
        return thisAmount;
    }

    protected abstract String printFrequentRenterPoints(double frequentRenterPoints, String result);

    protected abstract String printTotalAmount(double totalAmount, String result);
}
