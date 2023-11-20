package Task3;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setBtnAction(l -> {
            updateView();
        });
    }

    public String getModelUsername() {
        return model.getUsername();
    }

    public void setModelUsername(String username) {
        model.setUsername(username);
    }

    public String getModelPassword() {
        return model.getPassword();
    }

    public void setModelPassword(String password) {
        model.setPassword(password);
    }

    public String getViewUsername() {
        return view.getInputUsername();
    }

    public String getViewPassword() {
        return view.getInputPassword();
    }

    public boolean checkViewData() {
        return getViewUsername().equals(getModelUsername()) && getViewPassword().equals(getModelPassword());
    }

    public void updateView() {
        if (checkViewData()) {
            view.updateOutput("Correct");
        }
        else {
            view.updateOutput("Incorrect");
        }
    }
}
