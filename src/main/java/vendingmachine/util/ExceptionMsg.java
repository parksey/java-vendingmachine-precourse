package vendingmachine.util;

public enum ExceptionMsg {
    NULL("아무 값도 입력하지 않았습니다."),
    NOT_NUMBER("숫자가 아닙니다."),
    CAN_NOT_BUY("살수있는 상품이 없습니다."),
    CAN_NOT_CHANGE("동전으로 변환이 불가능 합니다."),
    NOT_PRODUCT_FORMAT("각 상품은 `[`로 시작하고 `]`로 끝나야 합니다."),
    NOT_PRODUCT_INFO_FORMAT("상품 정보 규격이 맞지 않습니다."),
    NOT_PRODUCT_SIZE("상품에는 상품명,가격,수량 을 입력하여야 합니다."),
    NOT_CONTAIN("해당 제품을 포함하고 있지 않습니다."),
    CONTAIN("해당 제품은 이미 존재합니다. 중복은 허용하지 않습니다."),
    NOT_MIN_AMOUNT("100원보다 적은 금액입니다.");

    private final String msg;

    ExceptionMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
