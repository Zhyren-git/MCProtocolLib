package org.geysermc.mcprotocollib.protocol.data.game.item.component;

import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.Int2ObjectFunction;
import lombok.Getter;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.text.Component;
import org.cloudburstmc.nbt.NbtList;
import org.cloudburstmc.nbt.NbtMap;
import org.geysermc.mcprotocollib.auth.GameProfile;
import org.geysermc.mcprotocollib.protocol.codec.MinecraftTypes;
import org.geysermc.mcprotocollib.protocol.data.game.Holder;
import org.geysermc.mcprotocollib.protocol.data.game.item.ItemStack;
import org.geysermc.mcprotocollib.protocol.data.game.item.component.type.BooleanDataComponent;
import org.geysermc.mcprotocollib.protocol.data.game.item.component.type.IntDataComponent;
import org.geysermc.mcprotocollib.protocol.data.game.item.component.type.ObjectDataComponent;

import java.util.ArrayList;
import java.util.List;

@Getter
public class DataComponentTypes {
    private static final List<DataComponentType<?>> VALUES = new ArrayList<>();

    public static final DataComponentType<NbtMap> CUSTOM_DATA = register(id -> new DataComponentType<>(id, "custom_data", MinecraftTypes::readCompoundTag, MinecraftTypes::writeAnyTag, ObjectDataComponent::new));
    public static final IntComponentType MAX_STACK_SIZE = register(id -> new IntComponentType(id, "max_stack_size", MinecraftTypes::readVarInt, MinecraftTypes::writeVarInt, IntDataComponent::new));
    public static final IntComponentType MAX_DAMAGE = register(id -> new IntComponentType(id, "max_damage", MinecraftTypes::readVarInt, MinecraftTypes::writeVarInt, IntDataComponent::new));
    public static final IntComponentType DAMAGE = register(id -> new IntComponentType(id, "damage", MinecraftTypes::readVarInt, MinecraftTypes::writeVarInt, IntDataComponent::new));
    public static final DataComponentType<Unbreakable> UNBREAKABLE = register(id -> new DataComponentType<>(id, "unbreakable", ItemTypes::readUnbreakable, ItemTypes::writeUnbreakable, ObjectDataComponent::new));
    public static final DataComponentType<Component> CUSTOM_NAME = register(id -> new DataComponentType<>(id, "custom_name", MinecraftTypes::readComponent, MinecraftTypes::writeComponent, ObjectDataComponent::new));
    public static final DataComponentType<Component> ITEM_NAME = register(id -> new DataComponentType<>(id, "item_name", MinecraftTypes::readComponent, MinecraftTypes::writeComponent, ObjectDataComponent::new));
    public static final DataComponentType<Key> ITEM_MODEL = register(id -> new DataComponentType<>(id, "item_model", MinecraftTypes::readResourceLocation, MinecraftTypes::writeResourceLocation, ObjectDataComponent::new));
    public static final DataComponentType<List<Component>> LORE = register(id -> new DataComponentType<>(id, "lore", listReader(MinecraftTypes::readComponent), listWriter(MinecraftTypes::writeComponent), ObjectDataComponent::new));
    public static final IntComponentType RARITY = register(id -> new IntComponentType(id, "rarity", MinecraftTypes::readVarInt, MinecraftTypes::writeVarInt, IntDataComponent::new));
    public static final DataComponentType<ItemEnchantments> ENCHANTMENTS = register(id -> new DataComponentType<>(id, "enchantments", ItemTypes::readItemEnchantments, ItemTypes::writeItemEnchantments, ObjectDataComponent::new));
    public static final DataComponentType<AdventureModePredicate> CAN_PLACE_ON = register(id -> new DataComponentType<>(id, "can_place_on", ItemTypes::readAdventureModePredicate, ItemTypes::writeAdventureModePredicate, ObjectDataComponent::new));
    public static final DataComponentType<AdventureModePredicate> CAN_BREAK = register(id -> new DataComponentType<>(id, "can_break", ItemTypes::readAdventureModePredicate, ItemTypes::writeAdventureModePredicate, ObjectDataComponent::new));
    public static final DataComponentType<ItemAttributeModifiers> ATTRIBUTE_MODIFIERS = register(id -> new DataComponentType<>(id, "attribute_modifiers", ItemTypes::readItemAttributeModifiers, ItemTypes::writeItemAttributeModifiers, ObjectDataComponent::new));
    public static final DataComponentType<CustomModelData> CUSTOM_MODEL_DATA = register(id -> new DataComponentType<>(id, "custom_model_data", ItemTypes::readCustomModelData, ItemTypes::writeCustomModelData, ObjectDataComponent::new));
    public static final DataComponentType<Unit> HIDE_ADDITIONAL_TOOLTIP = register(id -> new DataComponentType<>(id, "hide_additional_tooltip", unitReader(), unitWriter(), ObjectDataComponent::new));
    public static final DataComponentType<Unit> HIDE_TOOLTIP = register(id -> new DataComponentType<>(id, "hide_tooltip", unitReader(), unitWriter(), ObjectDataComponent::new));
    public static final IntComponentType REPAIR_COST = register(id -> new IntComponentType(id, "repair_cost", MinecraftTypes::readVarInt, MinecraftTypes::writeVarInt, IntDataComponent::new));
    public static final DataComponentType<Unit> CREATIVE_SLOT_LOCK = register(id -> new DataComponentType<>(id, "creative_slot_lock", unitReader(), unitWriter(), ObjectDataComponent::new));
    public static final BooleanComponentType ENCHANTMENT_GLINT_OVERRIDE = register(id -> new BooleanComponentType(id, "enchantment_glint_override", ByteBuf::readBoolean, ByteBuf::writeBoolean, BooleanDataComponent::new));
    public static final DataComponentType<NbtMap> INTANGIBLE_PROJECTILE = register(id -> new DataComponentType<>(id, "intangible_projectile", MinecraftTypes::readCompoundTag, MinecraftTypes::writeAnyTag, ObjectDataComponent::new));
    public static final DataComponentType<FoodProperties> FOOD = register(id -> new DataComponentType<>(id, "food", ItemTypes::readFoodProperties, ItemTypes::writeFoodProperties, ObjectDataComponent::new));
    public static final DataComponentType<Consumable> CONSUMABLE = register(id -> new DataComponentType<>(id, "consumable", ItemTypes::readConsumable, ItemTypes::writeConsumable, ObjectDataComponent::new));
    public static final DataComponentType<ItemStack> USE_REMAINDER = register(id -> new DataComponentType<>(id, "use_remainder", MinecraftTypes::readItemStack, MinecraftTypes::writeItemStack, ObjectDataComponent::new));
    public static final DataComponentType<UseCooldown> USE_COOLDOWN = register(id -> new DataComponentType<>(id, "use_cooldown", ItemTypes::readUseCooldown, ItemTypes::writeUseCooldown, ObjectDataComponent::new));
    public static final DataComponentType<Key> DAMAGE_RESISTANT = register(id -> new DataComponentType<>(id, "damage_resistant", MinecraftTypes::readResourceLocation, MinecraftTypes::writeResourceLocation, ObjectDataComponent::new));
    public static final DataComponentType<ToolData> TOOL = register(id -> new DataComponentType<>(id, "tool", ItemTypes::readToolData, ItemTypes::writeToolData, ObjectDataComponent::new));
    public static final IntComponentType ENCHANTABLE = register(id -> new IntComponentType(id, "enchantable", MinecraftTypes::readVarInt, MinecraftTypes::writeVarInt, IntDataComponent::new));
    public static final DataComponentType<Equippable> EQUIPPABLE = register(id -> new DataComponentType<>(id, "equippable", ItemTypes::readEquippable, ItemTypes::writeEquippable, ObjectDataComponent::new));
    public static final DataComponentType<HolderSet> REPAIRABLE = register(id -> new DataComponentType<>(id, "repairable", MinecraftTypes::readHolderSet, MinecraftTypes::writeHolderSet, ObjectDataComponent::new));
    public static final DataComponentType<Unit> GLIDER = register(id -> new DataComponentType<>(id, "glider", unitReader(), unitWriter(), ObjectDataComponent::new));
    public static final DataComponentType<Key> TOOLTIP_STYLE = register(id -> new DataComponentType<>(id, "tooltip_style", MinecraftTypes::readResourceLocation, MinecraftTypes::writeResourceLocation, ObjectDataComponent::new));
    public static final DataComponentType<List<ConsumeEffect>> DEATH_PROTECTION = register(id -> new DataComponentType<>(id, "death_protection", listReader(ItemTypes::readConsumeEffect), listWriter(ItemTypes::writeConsumeEffect), ObjectDataComponent::new));
    public static final DataComponentType<ItemEnchantments> STORED_ENCHANTMENTS = register(id -> new DataComponentType<>(id, "stored_enchantments", ItemTypes::readItemEnchantments, ItemTypes::writeItemEnchantments, ObjectDataComponent::new));
    public static final DataComponentType<DyedItemColor> DYED_COLOR = register(id -> new DataComponentType<>(id, "dyed_color", ItemTypes::readDyedItemColor, ItemTypes::writeDyedItemColor, ObjectDataComponent::new));
    public static final IntComponentType MAP_COLOR = register(id -> new IntComponentType(id, "map_color", ByteBuf::readInt, ByteBuf::writeInt, IntDataComponent::new));
    public static final IntComponentType MAP_ID = register(id -> new IntComponentType(id, "map_id", MinecraftTypes::readVarInt, MinecraftTypes::writeVarInt, IntDataComponent::new));
    public static final DataComponentType<NbtMap> MAP_DECORATIONS = register(id -> new DataComponentType<>(id, "map_decorations", MinecraftTypes::readCompoundTag, MinecraftTypes::writeAnyTag, ObjectDataComponent::new));
    public static final IntComponentType MAP_POST_PROCESSING = register(id -> new IntComponentType(id, "map_post_processing", MinecraftTypes::readVarInt, MinecraftTypes::writeVarInt, IntDataComponent::new));
    public static final DataComponentType<List<ItemStack>> CHARGED_PROJECTILES = register(id -> new DataComponentType<>(id, "charged_projectiles", listReader(MinecraftTypes::readItemStack), listWriter(MinecraftTypes::writeItemStack), ObjectDataComponent::new));
    public static final DataComponentType<List<ItemStack>> BUNDLE_CONTENTS = register(id -> new DataComponentType<>(id, "bundle_contents", listReader(MinecraftTypes::readItemStack), listWriter(MinecraftTypes::writeItemStack), ObjectDataComponent::new));
    public static final DataComponentType<PotionContents> POTION_CONTENTS = register(id -> new DataComponentType<>(id, "potion_contents", ItemTypes::readPotionContents, ItemTypes::writePotionContents, ObjectDataComponent::new));
    public static final DataComponentType<List<SuspiciousStewEffect>> SUSPICIOUS_STEW_EFFECTS = register(id -> new DataComponentType<>(id, "suspicious_stew_effects", listReader(ItemTypes::readStewEffect), listWriter(ItemTypes::writeStewEffect), ObjectDataComponent::new));
    public static final DataComponentType<WritableBookContent> WRITABLE_BOOK_CONTENT = register(id -> new DataComponentType<>(id, "writable_book_content", ItemTypes::readWritableBookContent, ItemTypes::writeWritableBookContent, ObjectDataComponent::new));
    public static final DataComponentType<WrittenBookContent> WRITTEN_BOOK_CONTENT = register(id -> new DataComponentType<>(id, "written_book_content", ItemTypes::readWrittenBookContent, ItemTypes::writeWrittenBookContent, ObjectDataComponent::new));
    public static final DataComponentType<ArmorTrim> TRIM = register(id -> new DataComponentType<>(id, "trim", ItemTypes::readArmorTrim, ItemTypes::writeArmorTrim, ObjectDataComponent::new));
    public static final DataComponentType<NbtMap> DEBUG_STICK_STATE = register(id -> new DataComponentType<>(id, "debug_stick_state", MinecraftTypes::readCompoundTag, MinecraftTypes::writeAnyTag, ObjectDataComponent::new));
    public static final DataComponentType<NbtMap> ENTITY_DATA = register(id -> new DataComponentType<>(id, "entity_data", MinecraftTypes::readCompoundTag, MinecraftTypes::writeAnyTag, ObjectDataComponent::new));
    public static final DataComponentType<NbtMap> BUCKET_ENTITY_DATA = register(id -> new DataComponentType<>(id, "bucket_entity_data", MinecraftTypes::readCompoundTag, MinecraftTypes::writeAnyTag, ObjectDataComponent::new));
    public static final DataComponentType<NbtMap> BLOCK_ENTITY_DATA = register(id -> new DataComponentType<>(id, "block_entity_data", MinecraftTypes::readCompoundTag, MinecraftTypes::writeAnyTag, ObjectDataComponent::new));
    public static final DataComponentType<Holder<Instrument>> INSTRUMENT = register(id -> new DataComponentType<>(id, "instrument", ItemTypes::readInstrument, ItemTypes::writeInstrument, ObjectDataComponent::new));
    public static final IntComponentType OMINOUS_BOTTLE_AMPLIFIER = register(id -> new IntComponentType(id, "ominous_bottle_amplifier", MinecraftTypes::readVarInt, MinecraftTypes::writeVarInt, IntDataComponent::new));
    public static final DataComponentType<JukeboxPlayable> JUKEBOX_PLAYABLE = register(id -> new DataComponentType<>(id, "jukebox_playable", ItemTypes::readJukeboxPlayable, ItemTypes::writeJukeboxPlayable, ObjectDataComponent::new));
    public static final DataComponentType<NbtList<?>> RECIPES = register(id -> new DataComponentType<>(id, "recipes", ItemTypes::readRecipes, ItemTypes::writeRecipes, ObjectDataComponent::new));
    public static final DataComponentType<LodestoneTracker> LODESTONE_TRACKER = register(id -> new DataComponentType<>(id, "lodestone_tracker", ItemTypes::readLodestoneTarget, ItemTypes::writeLodestoneTarget, ObjectDataComponent::new));
    public static final DataComponentType<Fireworks.FireworkExplosion> FIREWORK_EXPLOSION = register(id -> new DataComponentType<>(id, "firework_explosion", ItemTypes::readFireworkExplosion, ItemTypes::writeFireworkExplosion, ObjectDataComponent::new));
    public static final DataComponentType<Fireworks> FIREWORKS = register(id -> new DataComponentType<>(id, "fireworks", ItemTypes::readFireworks, ItemTypes::writeFireworks, ObjectDataComponent::new));
    public static final DataComponentType<GameProfile> PROFILE = register(id -> new DataComponentType<>(id, "profile", ItemTypes::readResolvableProfile, ItemTypes::writeResolvableProfile, ObjectDataComponent::new));
    public static final DataComponentType<Key> NOTE_BLOCK_SOUND = register(id -> new DataComponentType<>(id, "note_block_sound", MinecraftTypes::readResourceLocation, MinecraftTypes::writeResourceLocation, ObjectDataComponent::new));
    public static final DataComponentType<List<BannerPatternLayer>> BANNER_PATTERNS = register(id -> new DataComponentType<>(id, "banner_patterns", listReader(ItemTypes::readBannerPatternLayer), listWriter(ItemTypes::writeBannerPatternLayer), ObjectDataComponent::new));
    public static final IntComponentType BASE_COLOR = register(id -> new IntComponentType(id, "base_color", MinecraftTypes::readVarInt, MinecraftTypes::writeVarInt, IntDataComponent::new));
    public static final DataComponentType<List<Integer>> POT_DECORATIONS = register(id -> new DataComponentType<>(id, "pot_decorations", listReader(MinecraftTypes::readVarInt), listWriter(MinecraftTypes::writeVarInt), ObjectDataComponent::new));
    public static final DataComponentType<List<ItemStack>> CONTAINER = register(id -> new DataComponentType<>(id, "container", listReader(MinecraftTypes::readOptionalItemStack), listWriter(MinecraftTypes::writeOptionalItemStack), ObjectDataComponent::new));
    public static final DataComponentType<BlockStateProperties> BLOCK_STATE = register(id -> new DataComponentType<>(id, "block_state", ItemTypes::readBlockStateProperties, ItemTypes::writeBlockStateProperties, ObjectDataComponent::new));
    public static final DataComponentType<List<BeehiveOccupant>> BEES = register(id -> new DataComponentType<>(id, "bees", listReader(ItemTypes::readBeehiveOccupant), listWriter(ItemTypes::writeBeehiveOccupant), ObjectDataComponent::new));
    public static final DataComponentType<NbtMap> LOCK = register(id -> new DataComponentType<>(id, "lock", MinecraftTypes::readCompoundTag, MinecraftTypes::writeAnyTag, ObjectDataComponent::new));
    public static final DataComponentType<NbtMap> CONTAINER_LOOT = register(id -> new DataComponentType<>(id, "container_loot", MinecraftTypes::readCompoundTag, MinecraftTypes::writeAnyTag, ObjectDataComponent::new));

    public static <T extends DataComponentType<?>> T register(Int2ObjectFunction<T> factory) {
        T value = factory.apply(VALUES.size());
        VALUES.add(value);
        return value;
    }

    private static <T> DataComponentType.Reader<List<T>> listReader(DataComponentType.Reader<T> reader) {
        return (input) -> {
            List<T> ret = new ArrayList<>();
            int size = MinecraftTypes.readVarInt(input);
            for (int i = 0; i < size; i++) {
                ret.add(reader.read(input));
            }

            return ret;
        };
    }

    private static <T> DataComponentType.Writer<List<T>> listWriter(DataComponentType.Writer<T> writer) {
        return (output, value) -> {
            MinecraftTypes.writeVarInt(output, value.size());
            for (T object : value) {
                writer.write(output, object);
            }
        };
    }

    private static DataComponentType.Reader<Unit> unitReader() {
        return (input) -> Unit.INSTANCE;
    }

    private static DataComponentType.Writer<Unit> unitWriter() {
        return (output, value) -> {
        };
    }

    public static DataComponentType<?> read(ByteBuf in) {
        int id = MinecraftTypes.readVarInt(in);
        if (id >= VALUES.size()) {
            throw new IllegalArgumentException("Received id " + id + " for DataComponentType when the maximum was " + VALUES.size() + "!");
        }

        return VALUES.get(id);
    }

    public static DataComponentType<?> from(int id) {
        return VALUES.get(id);
    }

    public static int size() {
        return VALUES.size();
    }
}
