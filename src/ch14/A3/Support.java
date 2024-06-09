package ch14.A3;

public abstract class Support {
    private String name;    // 이 트러블 해결자의 이름
    private Support next;   // 떠넘길 곳

    public Support(String name) {
        this.name = name;
        this.next = null;
    }

    // 떠넘길 곳을 설정한다
    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    // 트러블 해결 절차를 결정한다 
    public void support(Trouble trouble) {
        for (Support obj = this; true; obj = obj.next) { // 무한 루프 
            if (obj.resolve(trouble)) { // 내가 해결하면 
                obj.done(trouble);
                break;
            } else if (obj.next == null) { // 뒷사람이 없으면 
                obj.fail(trouble);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }

    // 해결하려고 한다 
    protected abstract boolean resolve(Trouble trouble);

    // 해결했다 
    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    // 해결되지 않았다
    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}

