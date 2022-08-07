package com.demo.backendtestdemo.service;

import com.demo.backendtestdemo.model.CustomResponse;
import com.demo.backendtestdemo.model.Matrices;

public interface DemoService {
    CustomResponse invertirMatriz(Matrices m);
}
