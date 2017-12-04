/*
P8.4: Implement a class Address. An address has a house number, a street, an optional
apartment number, a city, a state, and a postal code. Supply two constructors: one
with an apartment number and one without. Supply a print method that prints the 
address with the street on one line and the city, state, and zip code on the next line.
Supply a method public boolean comesBefore(Address other) that tests whether this
address comes before another when the addresses are compared by postal code.
*/

public class Address
{
	private int houseNumber;
	private String street;
	private int optionalApartmentNumber;
	private String city;
	private String state;
	private int postalCode;

	//
	public Address(	int houseNumber,
					String street,
					int optionalApartmentNumber,
					String city,
					String state,
					int postalCode)
	{
		this.houseNumber = houseNumber;
		this.street = street;
		this.optionalApartmentNumber = optionalApartmentNumber;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}

	//
	public Address(	int houseNumber,
					String street,
					String city,
					String state,
					int postalCode)
	{
		this.houseNumber = houseNumber;
		this.street = street;
		this.optionalApartmentNumber = -1;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}

	public void print()
	{
		System.out.println(houseNumber + street);
		System.out.println(city + state + postalCode);
	}

	public boolean comesBefore(Address other)
	{
		boolean isBefore = false;
		if(this.postalCode < other.postalCode)
			isBefore = true;
		else 
			isBefore = false;
		return isBefore;
	}
}

