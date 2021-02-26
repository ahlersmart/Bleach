
package net.mcreator.bleach.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.bleach.itemgroup.BleachItemGroup;
import net.mcreator.bleach.BleachModElements;

@BleachModElements.ModElement.Tag
public class MetalIngotItem extends BleachModElements.ModElement {
	@ObjectHolder("bleach:metal_ingot")
	public static final Item block = null;
	public MetalIngotItem(BleachModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(BleachItemGroup.tab).maxStackSize(64).rarity(Rarity.RARE));
			setRegistryName("metal_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
