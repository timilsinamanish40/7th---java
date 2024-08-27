import java.awt.*;
class MyFrame extends Frame
{
    Label lbl_fn , lbl_sn , lbl_res;
    TextField txt_fn , txt_sn , txt_res;
    Button btn_add , btn_sub;



    public MyFrame()
{
    setSize(800,300);
    setLayout(new FlowLayout());
    lbl_fn = new Label("First Number");
    lbl_sn = new Label("Second Number");
    lbl_res = new Label("Result");
    txt_fn = new TextField();
    txt_sn = new TextField();
    txt_res = new TextField();
    btn_add = new Button("Add");
    btn_sub = new Button("Subtract");
    add(lbl_fn);
    add(txt_fn);
    add(lbl_sn);
    add(txt_sn);
    add(lbl_res);
    add(txt_res);
    add(btn_add);
    add(btn_sub);   
    setVisible(true);
}

}


class frame 
{
    public static void main(String[] args)
     {
        new MyFrame();
    }
}