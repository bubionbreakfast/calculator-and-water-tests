public class Printer {

    private int sheetsRemaining;

    public Printer(int sheetsRemaining){
        this.sheetsRemaining = sheetsRemaining;
    }

    public int getSheetsRemaining(){
        return this.sheetsRemaining = sheetsRemaining;
    }

    public int print(Number pages, Number copies){
        if (this.sheetsRemaining >= pages.intValue() + copies.intValue()) {
            return this.sheetsRemaining - pages.intValue() - copies.intValue();
        } else {
            return sheetsRemaining;
        }

    }

}
