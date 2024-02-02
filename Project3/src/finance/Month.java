package finance;

public interface Month extends Finance{
	public default String getMoney() {
		return "$500k";
	}
	public default String getTax() {
		return"$1.2";
	}

}
