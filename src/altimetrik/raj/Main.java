package altimetrik.raj;

public class Main {

    public static void main(String[] args) {
        Printer printer=new Printer("Hp Duplex Printer","2020","duplex","a4");
        System.out.println("Poweron Printer");
        String PrintType= printer.getPrintType();
        String SheetType= printer.getSheetType();
        int noofpages= printer.getPagesPrinted();

        printer.AsktoPrint(PrintType,SheetType,noofpages);
    }
}
