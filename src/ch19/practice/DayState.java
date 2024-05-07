package ch19.practice;

// 주간 상태 
public class DayState implements State {
    private static DayState singleton = new DayState();

    private DayState() {
    }

    // singleton 패턴 적용 (인스턴스 하나만)
    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour) { // 현재 시간이 야간에 해당되면 
            context.changeState(NightState.getInstance()); // 야간으로 변경
        } else if(hour >= 12 && hour < 13) { // 현재 시간이 점심에 해당되면 
            context.changeState(NoonState.getInstance()); // 점심으로 변경 
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("금고사용(주간)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(주간)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("일반 통화(주간)");
    }

    @Override
    public String toString() {
        return "[주간]";
    }
}
