package org.jboss.seam.mail.core;

public class MailTestUtil
{
   public static String getAddressHeader(String address)
   {
      return address;
   }
   
   public static String getAddressHeader(String name, String address)
   {
      return name + " <" + address + ">";
   }
}
