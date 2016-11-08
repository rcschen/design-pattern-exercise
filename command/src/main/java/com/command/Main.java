package com.command;

import com.command.service.ImageService;
import com.command.command.AEffectCommand;
import com.command.command.BEffectCommand;
import com.command.command.CEffectCommand;

public class Main {
    public static void main(String[] args) {
        ImageService service = new ImageService();
        service.addCommand("AEffect", new AEffectCommand());
        service.addCommand("BEffect", new BEffectCommand());
        service.addCommand("CEffect", new CEffectCommand());
        // 在需要時指定使用某特效
        service.doEffect("AEffect");
        service.doEffect("BEffect");
        service.doEffect("CEffect");
    }
}