abstract class Price {
	abstract int getPriceCode();

	double getCharge(Rental daysRented) {
	    double result = 0;
	    switch (daysRented.getMovie().getPriceCode()) {
	        case Movie.REGULAR:
	            result += 2;
	            if (daysRented.getDaysRented() > 2)
	                result += (daysRented.getDaysRented() - 2) * 1.5;
	            break;
	        case Movie.NEW_RELEASE:
	            result += daysRented.getDaysRented() * 3;
	            break;
	        case Movie.CHILDRENS:
	            result += 1.5;
	            if (daysRented.getDaysRented() > 3)
	                result += (daysRented.getDaysRented() - 3) * 1.5;
	            break;
	    }
	    return result;
	}
}

class ChildrensPrice extends Price {
	int getPriceCode() {
		return Movie.CHILDRENS;
	}
}

class NewReleasePrice extends Price {
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
}

class RegularPrice extends Price {
	int getPriceCode() {
		return Movie.REGULAR;
	}
}