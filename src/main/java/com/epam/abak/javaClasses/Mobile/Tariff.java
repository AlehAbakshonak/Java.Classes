package com.epam.abak.javaClasses.Mobile;

public enum Tariff {
   STANDARD("Standard", 100, 10, 20),
   PREMIUM("Premium", 200, 5, 10),
   VIP("VIP", 400, 0, 0);

   private final String NAME;
   private final int TARIFF_COST;
   private final int CITY_COST;
   private final int INTERCITY_COST;

   Tariff(String name, int tariffCost, int cityCost, int interCityCost) {
      this.NAME = name;
      this.TARIFF_COST = tariffCost;
      this.CITY_COST = cityCost;
      this.INTERCITY_COST = interCityCost;
   }

   public String getNAME() {
      return NAME;
   }

   public int getTARIFF_COST() {
      return TARIFF_COST;
   }

   public int getCITY_COST() {
      return CITY_COST;
   }

   public int getINTERCITY_COST() {
      return INTERCITY_COST;
   }

   @Override
   public String toString() {
      return "TariffEnum{" +
            "name='" + NAME + '\'' +
            ", tariffCost=" + TARIFF_COST +
            ", cityCost=" + CITY_COST +
            ", interCityCost=" + INTERCITY_COST +
            '}';
   }
}
