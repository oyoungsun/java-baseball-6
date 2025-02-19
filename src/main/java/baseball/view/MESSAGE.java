package baseball.view;

public enum MESSAGE {

    GAME_START_MSG("숫자 야구 게임을 시작합니다."),
    INPUT_USER_NUM("숫자를 입력해주세요 : "),
    INPUT_RESTART("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    GAME_END_MSG("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    BALL("볼"),
    STRIKE("스트라이크"),
    NOTHING("낫싱")
    ;

    private final String message;
    MESSAGE(String message) {
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
}
