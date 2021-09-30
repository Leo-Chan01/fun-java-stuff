public class FormToAcceptUserDetails {
    public static void main(String[] args) {
        System.out.println("The Following Form Requests you to input your details");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            //TODO: handle exception
        }
        
        UserDetails studentDetails = new UserDetails();
        studentDetails.getName();
        studentDetails.getRegNo();
        studentDetails.getDepartment();
        try {
            insertData();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thank you For inputing your details");
    }

    public static void insertData() throws InterruptedException{
        Thread.sleep(1000);
        System.out.println("Initialising Data insertion...");
        Thread.sleep(500);
        System.out.println("Inserting Data.<15%>");
        Thread.sleep(500);
        System.out.println("Inserting Data..<50%>");
        Thread.sleep(200);
        System.out.println("Inserting Data...<75%>");
        Thread.sleep(3000);
        System.out.println("Inserting Data...<100%>");
        Thread.sleep(100);
        System.out.println("Successfully Inserted");
        Thread.sleep(500);
    }
}
