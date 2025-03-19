package secondtask;

public class Phone {
    public static void main(String[] args) {

        Directory directory = new Directory();

        directory.add("cherkas", "375445452646");
        directory.add("kupsov", "375293939252");
        directory.add("smitich", "375446768787");
        directory.add("chernyak", "375295997768");
        directory.add("kupsov", "375297015065");
        directory.add("cherkas", "375446789504");
        directory.add("papovich", "375446978099");
        directory.add("demidov", "375446567474");
        directory.add("opalaya", "375296079870");

        System.out.println(directory.get("cherkas"));
        System.out.println(directory.get("kupsov"));
        System.out.println(directory.get("opalaya"));
        System.out.println(directory.get("chernyak"));
    }
}