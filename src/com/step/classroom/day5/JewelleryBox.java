package com.step.classroom.day5;

public class JewelleryBox {
    private Jewellery jewellery;
    private JewelleryBox jewelleryBox;

    public JewelleryBox(Jewellery jewellery, JewelleryBox jewelleryBox) {
        this.jewellery = jewellery;
        this.jewelleryBox = jewelleryBox;
    }

    public JewelleryBox() {

    }

    public JewelleryBox(JewelleryBox jewelleryBox) {
        this(null, jewelleryBox);
    }

    public JewelleryBox(Jewellery jewellery) {
        this(jewellery, null);
    }

    public int totalJewelleries() {
        int totalJewelleries = 0;
        if (null != jewellery) {
            totalJewelleries += 1;
        }
        if (null != jewelleryBox) {
            totalJewelleries += this.jewelleryBox.totalJewelleries();
            return totalJewelleries;
        }
        return totalJewelleries;
    }
}
