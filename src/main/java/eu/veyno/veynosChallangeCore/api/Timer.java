package eu.veyno.veynosChallangeCore.api;

import org.bukkit.Bukkit;

public class Timer {

    private static double currentTimer = 0.0;

    /**
     * @return seconds since timer start
     */
    public static double getCurrentTimer(){
        Bukkit.getLogger().info("Timer is:" + currentTimer);
        return currentTimer;
    }

    public static void pauseTimer(){
        Bukkit.getLogger().info("Timer paused");

    }

    public static void resetTimer(){
        Bukkit.getLogger().info("Timer reset");

    }

    public static void resumeTimer(){
        Bukkit.getLogger().info("Timer resumed");
    }

    /**
     * @param timer set the seconds since timer started
     */
    public static void setCurrentTimer(double timer){
        Bukkit.getLogger().info("Timer set to: " + timer);
        currentTimer = timer;
    }

}
