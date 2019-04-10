/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.simplejava;

/**
 *
 * @author User
 */
public interface ICalculator {

    int sum(int a, int b);

    int subtraction(int a, int b);

    int multiplication(int a, int b);

    int divison(int a, int b) throws Exception;

    boolean equalIntegers(int a, int b);

}
