package io.cucumber.skeleton;

import io.cucumber.java.en.Given;

import java.sql.SQLOutput;

public class StepDefinitions {
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        System.out.println(cukes);
    }
}
