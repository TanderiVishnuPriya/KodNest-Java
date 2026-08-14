class Mobile {
    void unlock(String s) {
        System.out.println("Unlocked by using password");
    }

    void unlock(int a) {
        System.out.println("Unlocked by using pin");
    }

    void unlock(FaceId f) {
        System.out.println("Unlocked by using faceId");
    }

    void unlock(FingerPrint t) {
        System.out.println("Unlocked by using fingerPrint");
    }

    void unlock(Pattern p) {
        System.out.println("Unlocked by using pattern");
    }
}

class FaceId {

}

class Pattern {

}

class FingerPrint {

}

public class MobilePhone {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.unlock("123");
        m.unlock(123);
        FaceId f = new FaceId();
        m.unlock(f);
        FingerPrint fp = new FingerPrint();
        m.unlock(fp);
        Pattern p = new Pattern();
        m.unlock(p);
        System.out.println("Mobile Unlocked");

    }

}
