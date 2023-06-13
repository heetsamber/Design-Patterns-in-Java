package androidObserver;

public class Button {
    private OnClickListener onClickListener;
    public void onClick(){
        if(onClickListener != null){
            onClickListener.onClick(this);
        }
    }
    public interface OnClickListener{
        public void onClick(Button btn);
    }
    public void setOnclickListener(OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }
}
