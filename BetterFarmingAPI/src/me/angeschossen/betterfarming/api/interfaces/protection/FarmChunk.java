package me.angeschossen.betterfarming.api.interfaces.protection;

import me.angeschossen.betterfarming.api.interfaces.farm.Farm;

public interface FarmChunk {

    boolean containsFarm(Farm farm);

    int getX();

    int getZ();

    FarmWorld getFarmWorld();

    Farm getAccessedFarm(int x, int y, int z);

    boolean isFarm(int x, int y, int z);
}
