package pojo;

public class Replay {
    private Integer replayIndex;

    private String context;

    private Integer userIndex;

    public Replay(Integer replayIndex, String context, Integer userIndex) {
        this.replayIndex = replayIndex;
        this.context = context;
        this.userIndex = userIndex;
    }

    public Replay() {
        super();
    }

    public Integer getReplayIndex() {
        return replayIndex;
    }

    public void setReplayIndex(Integer replayIndex) {
        this.replayIndex = replayIndex;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    public Integer getUserIndex() {
        return userIndex;
    }

    public void setUserIndex(Integer userIndex) {
        this.userIndex = userIndex;
    }
}