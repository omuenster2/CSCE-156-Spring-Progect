package com.fmt;
/**
 * @author oliviamuenster marywaller
 * 
 * 2023-24-02
 * 
 * Created a class to hold the equipment data. 
 *
 */
public class Equipment  {
	
	protected Item equipment;
	protected String model;
	
	public Equipment(Item equipment, String model) {
		super();
		this.equipment = equipment;
		this.model = model;
	}
	
	public Item getEquipment() {
		return equipment;
	}
	
	public String getModel() {
		return model;
	}
	
}