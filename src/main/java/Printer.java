public class Printer {

    private int sheetsRemaining;
    private int toner;

    public Printer(int sheetsRemaining, int toner){
        this.sheetsRemaining = sheetsRemaining;
        this.toner = toner;
    }

    public int getSheetsRemaining(){
        return this.sheetsRemaining = sheetsRemaining;
    }

    public int getToner(){
        for (int i = 0, i < print.length, i = i + 1);
        return getToner() - i +=;
    }



    public int print(Number pages, Number copies){
        if (this.sheetsRemaining >= pages.intValue() + copies.intValue()) {
            return this.sheetsRemaining - pages.intValue() - copies.intValue();
        } else {
            return sheetsRemaining;
        }

    }

}
