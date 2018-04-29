package com.databse.databasetools;

import lombok.experimental.var;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args){
        List<Integer> list = new ArrayList() {
            {
                add(12);
                add(20);
                add(12);
                add(12);
                add(22);
                add(23);
                add(12);
                add(12);
            }
        };

      list.stream().
              collect(Collectors.groupingBy(a -> a, Collectors.counting())).
              entrySet().stream().filter((k) -> k.getValue().intValue() >= 4).
              collect(Collectors.toList()).forEach((k)->{
                  System.out.println(k);
      });
    }
}
