package com.demo.backendtestdemo.service.impl;

import com.demo.backendtestdemo.model.CustomResponse;
import com.demo.backendtestdemo.model.Matrices;
import com.demo.backendtestdemo.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public CustomResponse invertirMatriz(Matrices m) {

        if(m.getMatriz().length == 0){
            return new CustomResponse("La matriz esta vacía",null);
        }

        int tamanio = m.getMatriz().length;

        int[][] newMatriz = new int[tamanio][tamanio];

        try {
            for (int x=0;x<tamanio;x++) {
                for (int y=0;y<tamanio;y++) {
                    newMatriz[tamanio-1-y][x] = m.getMatriz()[x][y];
                }
            }
        }catch(IndexOutOfBoundsException iex) {
            return new CustomResponse(iex.getMessage(),null);
        }

        return new CustomResponse("OK",newMatriz);
    }
}
