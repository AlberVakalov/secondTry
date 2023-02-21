package day5;

class Motorbike {
    private String model;
    private String color;
    private int ageBike;

    public Motorbike(String model, String color, int ageBike) {
        this.model = model;
        this.color = color;
        this.ageBike = ageBike;
    }


    private String getModel() {
        return model;
    }

    private String getColor() {
        return color;
    }

    private int getAgeBike() {
        return ageBike;
    }

    void getInfo() {
        System.out.println(getModel() + " " + getColor() + " " + getAgeBike());
    }
}
