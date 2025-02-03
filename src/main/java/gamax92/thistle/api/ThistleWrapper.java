package gamax92.thistle.api;

import net.minecraft.nbt.NBTTagCompound;

import li.cil.oc.api.network.Environment;

public abstract class ThistleWrapper implements IThistleDevice {

    private Environment host;

    public ThistleWrapper(Environment host) {
        this.host = host;
    }

    public Environment host() {
        return host;
    }

    public void load(NBTTagCompound nbt) {}

    public void save(NBTTagCompound nbt) {}
}
