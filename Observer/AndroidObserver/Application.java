package androidObserver;

public class Application {
    public static void main(String[] args){
        Button button = new Button();

        // 익명 객체로 전달.
        button.setOnclickListener(new Button.OnClickListener() {

            public void onClick(Button btn){
                System.out.println(btn + "is clicked");
            }
        });

        button.onClick();
    }
}

