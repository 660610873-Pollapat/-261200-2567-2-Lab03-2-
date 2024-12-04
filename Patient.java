public class Patient {
    private int id;
    private String name;
    private int brithYear;
    private double height;
    private double weight;
    private String bloodGroup;
    private String phoneNumber;

    public Patient(int id,String name,int brithYear,double height,double weight,String bloodGroup,String phoneNumber){
        if(brithYear < 0){
            brithYear *= -1;
        }
        if(height < 0){
            height *= -1;
        }
        if(weight < 0){
            weight *= -1;
        }
        this.id = id;
        this.name = name;
        this.brithYear = brithYear;
        this.height = height;
        this.weight = weight;
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;
    }


    public int getAge(int currentYear){
        if(brithYear < 0){
            System.out.println("Error");
        }
        return currentYear - this.brithYear;
    }

    public double getBMI(double weight,double height){
        if(height < 0 || weight < 0){
            return 0.0;
        }
        return weight/((height *= height)/10000);
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient bloodGroup: " + bloodGroup);
        System.out.println("Patient phoneNumber: " + phoneNumber);
        System.out.println("Patient BMI: " + getBMI(weight,height));
    }
}
