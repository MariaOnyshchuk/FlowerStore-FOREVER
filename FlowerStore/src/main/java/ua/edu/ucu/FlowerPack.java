package ua.edu.ucu;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class FlowerPack {
    private Flower flower;
    private int count;

    public FlowerPack(Flower flower, int count){
        this.flower = new Flower(flower);
        this.count = count;
    }

    public double getPrice(){
        return flower.getPrice()*count;
    }

}
