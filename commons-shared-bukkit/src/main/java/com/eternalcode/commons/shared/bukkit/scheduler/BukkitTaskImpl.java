package com.eternalcode.commons.shared.bukkit.scheduler;

import com.eternalcode.commons.shared.scheduler.Task;
import org.bukkit.scheduler.BukkitTask;

class BukkitTaskImpl implements Task {

    private final BukkitTask rootTask;

    BukkitTaskImpl(BukkitTask rootTask) {
        this.rootTask = rootTask;
    }

    @Override
    public void cancel() {
        this.rootTask.cancel();
    }

    @Override
    public boolean isCanceled() {
        return this.rootTask.isCancelled();
    }

    @Override
    public boolean isAsync() {
        return !this.rootTask.isSync();
    }

}
