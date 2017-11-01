package de.unistuttgart.iaas.pse.ex01.p4;

public class ElectricRates {

	public static double calculateEnergyPricePerMonth(double minPricePerMonth,double pricePerKWh,double freeKWh,double usedEnergyPerMonth){
		double pricePerMonth = 0.0;
		pricePerMonth += minPricePerMonth;
		if(usedEnergyPerMonth>freeKWh){
		pricePerMonth += (usedEnergyPerMonth-freeKWh)*pricePerKWh; }
		return pricePerMonth;
	}
	
	public static double calculatePriceTarif1(double usedEnergyPerMonth){
		return calculateEnergyPricePerMonth(6.87, 0.5, 0, usedEnergyPerMonth);
	}
	
	public static double calculatePriceTarif2(double usedEnergyPerMonth){
		return calculateEnergyPricePerMonth(10.87, 0.25, 0, usedEnergyPerMonth);
	}
	
	public static double calculatePriceTarif3(double usedEnergyPerMonth){
		return calculateEnergyPricePerMonth(14.87, 0.37, 10, usedEnergyPerMonth);
	}
	
	public static void main(String[] args) {
		for(int i = 10; i<101; i += 10) {
			System.out.println("While using " + i + "KWh/month Tarif 1 costs " + calculatePriceTarif1(i));
			System.out.println("While using " + i + "KWh/month Tarif 2 costs " + calculatePriceTarif2(i));
			System.out.println("While using " + i + "KWh/month Tarif 3 costs " + calculatePriceTarif3(i));
		}
	}

}
