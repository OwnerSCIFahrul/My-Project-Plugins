package Fahrul8676.utils;

public class MutedPlayer {

    private long end;
    private String reason;
    private String id;
    private String banner;

    public MutedPlayer(long end, String reason, String id, String banner) {
        this.end = end;
        this.reason = reason;
        this.id = id;
        this.banner = banner;
    }

    public long getEnd() {
        return end;
    }

    public String getReason() {
        return reason;
    }

    public String getId() {
        return id;
    }

    public String getBanner() {
        return banner;
    }
}
