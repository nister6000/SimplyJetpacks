package tonius.simplyjetpacks.config;

import tonius.simplyjetpacks.client.util.RenderUtils.HUDPosition;

public abstract class Defaults {
    
    // integration
    public static final boolean enableIntegrationTE = true;
    public static final boolean enableIntegrationEIO = true;
    public static final boolean enableIntegrationBC = true;
    
    // controls
    public static final boolean customControls = false;
    public static final String flyKey = "SPACE";
    public static final String descendKey = "LSHIFT";
    public static final boolean invertHoverSneakingBehavior = false;
    public static final boolean sneakChangesToggleBehavior = true;
    
    // sounds
    public static final boolean jetpackSounds = true;
    
    // gui
    public static final boolean enableStateChatMessages = false;
    public static final boolean enableEnergyHUD = true;
    public static final boolean enableStateHUD = true;
    public static final int energyHUDOffsetX = 0;
    public static final int energyHUDOffsetY = 0;
    public static final int energyHUDPosition = HUDPosition.TOP_LEFT.ordinal();
    public static final double energyHUDScale = 1.0D;
    public static final boolean holdShiftForDetails = true;
    public static final boolean minimalEnergyHUD = false;
    public static final boolean showEnergyHUDWhileChatting = true;
    public static final boolean showExactEnergyInHUD = false;
    
}
