package polymorphisminheritance;

/**
 *
 * @author mhddf
 */

abstract public class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

        public StaffMember(String eName, String eAddress, String ePhone){
            name = eName;
            address = eAddress;
            phone = ePhone;
        }

        @Override
        public String toString(){
            String result = "Name: " + name + "\n";
            result += "Address: " + address + "\n";
            result += "Phone: " + phone;
            return result;
        }

        public String getName(){
            return name;
        }

        public abstract double pay();
}