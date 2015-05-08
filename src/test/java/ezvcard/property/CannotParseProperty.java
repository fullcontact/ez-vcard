package ezvcard.property;

public class CannotParseProperty extends VCardProperty {
	@Override
	public VCardProperty deepCopy() {
		return new CannotParseProperty();
	}
}
