package Gongsi.xiangmu.Dayinji;

public class Printer {
    //属性上的多态
    private Ink ink;
    private Paper paper;

    public Printer() {
    }

    public Printer(Ink ink, Paper paper) {
        this.ink = ink;
        this.paper = paper;
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    @Override
    public String toString() {
        return "使用"+ink.color() +"在"+paper.size()+"上打印";
    }
}
