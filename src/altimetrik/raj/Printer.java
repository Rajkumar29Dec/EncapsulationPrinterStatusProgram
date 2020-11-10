package altimetrik.raj;

public class Printer {
    private String printerName;
    private int pagesPrinted=100;
    private String model;
    private String printType;
    private String sheetType;

    public Printer(String printerName, String model,String printType,String sheetType) {
        this.printerName = printerName;
        this.model = model;
        this.printType=printType;
        this.sheetType=sheetType;
    }
    public void powerOn(){
        System.out.println("Printer is on Working...");
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public String getPrintType() {
        return printType;
    }

    public String getSheetType() {
        return sheetType;
    }


    public void AsktoPrint(String printType, String sheetType, int noofpages) {
        if (sheetType=="a4" && printType=="duplex"){
            int totalpages=((noofpages/2)+(noofpages%2));
            System.out.println("cost for print for"+pagesPrinted+"pages in duplex mode is"+totalpages
            +"of sheettype a4"+(totalpages*5));
        }
    }
}
