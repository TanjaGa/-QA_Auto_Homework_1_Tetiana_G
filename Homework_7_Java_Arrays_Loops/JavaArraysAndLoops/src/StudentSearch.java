public class StudentSearch {

    public static void main(String[] args) {
        int[] studentIDs = {12345, 67890, 54321, 98765, 24680};
        int searchID = 54321;
        boolean SearchID =false;

        for (int i = 0; i < studentIDs.length; i++) {
            if (studentIDs[i] == searchID) {
                SearchID = true;
                break;
            }
        }
        if (SearchID) {
            System.out.println("Номер залікової книжки" +searchID + "знайдено" );
        }
        else {
            System.out.println("Номер залікової книжки " +searchID + "не знайдено");
        }
    }
}

