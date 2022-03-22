package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        NamedPoint2D point;
        List<NamedPoint2D> point2DList = new ArrayList<>();
        int x,y;
        String name;
        Scanner consoleInput = new Scanner(System.in);

        for(int i=0;i<2;i++) {
            System.out.println("Podaj nazwę punktu:");
            name = consoleInput.nextLine();
            System.out.println("Podaj x:");
            x = Integer.parseInt(consoleInput.nextLine());
            System.out.println("Podaj y:");
            y = Integer.parseInt(consoleInput.nextLine());
            point = new NamedPoint2D(name,x,y);
            point2DList.add(point);
        }

        for(int i=0;i<2;i++) {
            System.out.println("Punkt "+(i+1)+":");
            System.out.println(point2DList.get(i).toString());
        }





    }
}
