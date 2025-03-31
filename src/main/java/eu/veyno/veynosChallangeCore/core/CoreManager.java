package eu.veyno.veynosChallangeCore.core;

public class CoreManager {

    private static boolean challangeActive = false;

    public static void startChallange(){
            challangeActive = true;
    }

    public static boolean isChallangeActive() {
        return challangeActive;
    }
}
