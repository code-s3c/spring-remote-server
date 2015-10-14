/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sab2i.sabremote.services;

import com.sab2i.demo.service.IComplexMathService;
import org.springframework.stereotype.Service;


@Service("complexMathCalculator")
public class ComplexMathCalculatorImpl implements IComplexMathService {

    @Override
    public int doComplexMath(int lhs, int rhs) {
        System.out.println("[i] Remote Method Invocation OK...");
        return lhs + rhs;
    }
}
