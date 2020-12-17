package com.aonoasgard.test.testmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Blocco1 extends Block {
    public static final String NAME = "blocco";
    private static final String UNLOCALIZED_NAME = "blocco";
    private static final String REGISTRY_NAME = "blocco";

    public Blocco1() {
        super(Material.ROCK);

        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        this.setRegistryName(REGISTRY_NAME);
        this.setTranslationKey(UNLOCALIZED_NAME);
    }

    @Override
    public Block setCreativeTab(CreativeTabs tab) {
        return super.setCreativeTab(tab);
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {

        return BlockRenderLayer.SOLID;
    }
    



}
