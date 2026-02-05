interface IdentityVerification {
    void verify();
}

class HumanIdentity implements IdentityVerification {
    public void verify() {
        System.out.println("Human identity verification");
    }
}

class AIIdentity implements IdentityVerification {
    public void verify() {
        System.out.println("AI identity verification");
    }
}

interface EnvironmentCheck {
    void check();
}

class AIEnvironment implements EnvironmentCheck {
    public void check() {
        System.out.println("AI environment checking");
    }
}

interface BehaviourMonitoring {
    void monitor();
}

class AIBehaviour implements BehaviourMonitoring {
    public void monitor() {
        System.out.println("AI behaviour monitoring");
    }
}

class HumanBehaviour implements BehaviourMonitoring {
    public void monitor() {
        System.out.println("Human behaviour monitoring");
    }
}

class ProctoringController {

    IdentityVerification identity;
    EnvironmentCheck environment;
    BehaviourMonitoring behaviour;

    void setIdentity(IdentityVerification identity) {
        this.identity = identity;
    }

    void setEnvironment(EnvironmentCheck environment) {
        this.environment = environment;
    }

    void setBehaviour(BehaviourMonitoring behaviour) {
        this.behaviour = behaviour;
    }

    void startExam() {
        System.out.println("Exam proctoring started");

        if (identity != null)
            identity.verify();

        if (environment != null)
            environment.check();

        if (behaviour != null)
            behaviour.monitor();

        System.out.println("Exam in progress\n");
    }
}

public class ProctoringSystem {
    public static void main(String[] args) {

        ProctoringController controller = new ProctoringController();

        controller.setIdentity(new AIIdentity());
        controller.startExam();

        controller.setIdentity(new HumanIdentity());
        controller.setEnvironment(new AIEnvironment());
        controller.setBehaviour(new AIBehaviour());
        controller.startExam();

        controller.setBehaviour(new HumanBehaviour());
        controller.startExam();
    }
}
