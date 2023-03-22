package org.example.model;

public abstract class VendingMachineParameterized<T> {

    abstract T getVendingMach(T name, T volume);
}
