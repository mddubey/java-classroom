package com.step.classroom.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JewelleryBoxTest {

    @Test
    void name() {
        Jewellery earring = new Jewellery("earring");
        JewelleryBox _5thLevelBox = new JewelleryBox(earring);

        JewelleryBox _4thLevelBox = new JewelleryBox(_5thLevelBox);

        Jewellery nacklace = new Jewellery("necklace");
        JewelleryBox _3rdLevelBox = new JewelleryBox(nacklace, _4thLevelBox);

        Jewellery ring = new Jewellery("ring");
        JewelleryBox _2ndLevelBox = new JewelleryBox(ring, _3rdLevelBox);

        JewelleryBox _1stLevelBox = new JewelleryBox(_2ndLevelBox);

        assertEquals(3, _1stLevelBox.totalJewelleries());
    }
}