package ch19;

public class NightMealState implements State {

    // singleton 패턴 적용 
    private static NightMealState singleton = new NightMealState();

    private NightMealState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (15 <= hour && hour < 16) {
            context.changeState(NoonState.getInstance());
        } else if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        } else if (hour < 9 || (17 <= hour && hour < 20)) {
            context.changeState(NightState.getInstance());
        } 
    }

    // 금고 사용 
    @Override
    public void doUse(Context context) {
        // 경비센터 기록 
        context.recordLog("금고사용(야식)");

        // 비상사태 통보 
        context.callSecurityCenter("비상：야식 금고 사용！");
    }

    // 비상벨 사용 
    @Override
    public void doAlarm(Context context) {
        // 경비센터에 비상벨 통보 
        context.callSecurityCenter("비상벨(야식)");
    }

    // 전화 사용 
    @Override
    public void doPhone(Context context) {
        // 경비센터의 자동응답기 호출 
        context.recordLog("자동응답기 호출(야식)");
    }

    // CCTV
    @Override
    public void doCCTV(Context context) {
        context.recordLog("CCTV: Off");
    }

    @Override
    public String toString() {
        return "[야식]";
    }
}
