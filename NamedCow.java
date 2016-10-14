class NamedCow extends Cow{
	private String myName;
	public NamedCow(String type,String cowName, String sound) {
		myName = cowName;
		myType = type;         
        mySound = sound;  
	}
	public String getName() {
		return myName;
	}
}