package com.step.classroom.day7.nestedclasses;

public class Cycle {
    private String name;

    public Cycle(String name) {
        this.name = name;
    }

    static class Wheel {
        private double diameter;

        public Wheel(double diameter) {
            this.diameter = diameter;
        }

        public String toText() {
            return
                    String.format("Wheel of diameter %s for cycle ", this.diameter);
        }
    }


}
