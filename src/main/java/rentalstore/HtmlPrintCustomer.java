package rentalstore;

public class HtmlPrintCustomer extends CustomerTemplate{
    public HtmlPrintCustomer(String name) {
        super(name);
    }

    @Override
    protected String printHeader() {
        return "<h1>Rental Record for <em>" + getName() + "</em></h1>\n";
    }

    @Override
    protected String printMovieTitleAndAmount(String result, Rental each, double thisAmount) {
        result += "<p>\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "</p>\n";
        return result;
    }

    @Override
    protected String printFrequentRenterPoints(double frequentRenterPoints, String result) {
        result += "<p>You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points<p>";
        return result;
    }

    @Override
    protected String printTotalAmount(double totalAmount, String result) {
        result += "<p>Amount owed is " + String.valueOf(totalAmount) + "<p>\n";
        return result;
    }
}
