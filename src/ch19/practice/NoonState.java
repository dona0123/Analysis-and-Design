package ch19.practice;

public class NoonState implements State {

    private static NoonState singleton = new NoonState();

    private NoonState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 8 || 21 <= hour) { // 현재 시간이 야간에 해당되면 
            context.changeState(NightState.getInstance()); // 야간으로 변경
        } else  if (8 <= hour && hour < 21) { // 현재 시간이 주간에 해당하면 
            context.changeState(DayState.getInstance()); // 주간으로 변경 
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("비상상태(점심)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(점심)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("통화녹음");
    }
    
}
