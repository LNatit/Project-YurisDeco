package com.lnatit.yurisdeco.fabric;

import com.lnatit.yurisdeco.YurisDeco;
import net.fabricmc.api.ModInitializer;

public class YurisDecoFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        YurisDeco.init();
    }
}