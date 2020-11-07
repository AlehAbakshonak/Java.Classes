package com.epam.abak.javaClasses;

import com.epam.abak.javaClasses.Mobile.Phone;
import com.epam.abak.javaClasses.Mobile.PhonesData;
import java.util.ArrayList;
import java.util.List;

public class Analyser {

   public static String[] summaryCallTimeMoreThan(List<Phone> phoneBook, int timeLimit) {

      ArrayList<String> listOfTimeExpiredPhones = new ArrayList<>();

      for (int i = 0; i < phoneBook.size(); i++) {
         if (phoneBook.get(i).getCityCalls() +
               phoneBook.get(i).getIntercityCalls() > timeLimit) {
            listOfTimeExpiredPhones.add(
                  Phone.getMainPhoneDataInString(phoneBook.get(i))
            );
         }
      }
      return listOfTimeExpiredPhones.toArray(new String[0]);
   }

   public static String[] intercityCallTimeMoreThan(List<Phone> phoneBook, int timeLimit) {

      ArrayList<String> listOfTimeExpiredPhones = new ArrayList<>();

      for (int i = 0; i < phoneBook.size(); i++) {
         if (phoneBook.get(i).getIntercityCalls() > timeLimit) {
            listOfTimeExpiredPhones.add(
                  Phone.getMainPhoneDataInString(phoneBook.get(i))
            );
         }
      }
      return listOfTimeExpiredPhones.toArray(new String[0]);
   }

   public static String[] cityCallTimeMoreThan(List<Phone> phoneBook, int timeLimit) {

      ArrayList<String> listOfTimeExpiredPhones = new ArrayList<>();

      for (int i = 0; i < phoneBook.size(); i++) {
         if (phoneBook.get(i).getCityCalls() > timeLimit) {
            listOfTimeExpiredPhones.add(
                  Phone.getMainPhoneDataInString(phoneBook.get(i))
            );
         }
      }
      return listOfTimeExpiredPhones.toArray(new String[0]);
   }

   public static String[] interCityCallsUsedPhones(List<Phone> phoneBook) {

      ArrayList<String> resultList = new ArrayList<>();

      for (int i = 0; i < phoneBook.size(); i++) {
         if (phoneBook.get(i).getIntercityCalls()>0) {
            resultList.add(
                  Phone.getMainPhoneDataInString(phoneBook.get(i))
            );
         }
      }
      return resultList.toArray(new String[0]);
   }

   public static String[] sortListByID(List<Phone> phoneBook) {

      String[] resultArray = new String[phoneBook.size()];

      for (int i = 0; i < resultArray.length; i++) {
         resultArray[i] = Phone.getMainPhoneDataInString(
               phoneBook.get(
                     phoneBook.get(i).getID()
               )
         );
      }

      return resultArray;
   }
}
