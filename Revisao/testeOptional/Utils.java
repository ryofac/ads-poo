public class Utils {

    public static String constructMenu(String title, String[] options) {
        String menu = "";
        Integer optionNumber = 0;
        menu += "=========" + title + "=======" + '\n';
        for (String option : options) {
            optionNumber++;
            menu += optionNumber + " - " + option + "\n";
        }
        return menu;
    }

}
