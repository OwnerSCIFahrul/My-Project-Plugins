package Fahrul8676.utils;

import cn.nukkit.command.CommandSender;
import Fahrul8676.TempBanMute;

public class MessageUtil {

    public static String banScreen(String reason, String id, String time, String banner) {
        String str = TempBanMute.getInstance().getConfig().getString("BanScreen");
        str = str.replace("%reason%", reason);
        str = str.replace("%id%", id);
        str = str.replace("%time%", time);
        str = str.replace("%banner%", banner);
        return str.replace("&", "§");
    }

    public static String muteScreen(String reason, String id, String time, String banner) {
        String str = TempBanMute.getInstance().getConfig().getString("MuteScreen");
        str = str.replace("%reason%", reason);
        str = str.replace("%id%", id);
        str = str.replace("%time%", time);
        str = str.replace("%banner%", banner);
        return str.replace("&", "§");
    }

    public static void sendBanHelp(CommandSender sender, TempBanMute plugin) {
        int i = plugin.getConfig().getInt("BanReasons.Count");
        for (int p = 1; p < i; p++) {
            sender.sendMessage(plugin.getConfig().getString("Prefix").replace("&", "§") + convertBanHelp(String.valueOf(p), plugin.getConfig().getString("BanReasons." + p + ".Reason")));
        }
    }

    public static void sendMuteHelp(CommandSender sender, TempBanMute plugin) {
        int i = plugin.getConfig().getInt("MuteReasons.Count");
        for (int p = 1; p < i; p++) {
            sender.sendMessage(plugin.getConfig().getString("Prefix").replace("&", "§") + convertMuteHelp(String.valueOf(p), plugin.getConfig().getString("MuteReasons." + p + ".Reason")));
        }
    }

    private static String convertBanHelp(String id, String reason) {
        String str = TempBanMute.getInstance().getConfig().getString("BanReasonFormat");
        str = str.replace("%reason%", reason);
        str = str.replace("%id%", id);
        return str.replace("&", "§");
    }

    private static String convertMuteHelp(String id, String reason) {
        String str = TempBanMute.getInstance().getConfig().getString("MuteReasonFormat");
        str = str.replace("%reason%", reason);
        str = str.replace("%id%", id);
        return str.replace("&", "§");
    }
}
