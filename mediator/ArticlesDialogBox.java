package com.mowithmosh.mediator;

public class ArticlesDialogBox {
    private ListBox listBox = new ListBox();
    private TextBox textBox = new TextBox();
    private Button saveButton = new Button();

    public ArticlesDialogBox() {
        listBox.addEventHandler(this::articleSelected);
        textBox.addEventHandler(this::titleChanged);
    }

    public void simulateUserInteration() {
        listBox.setSelection("Article 1");
        textBox.setContent("Article 2");
        System.out.println("Text Box: " + textBox.getContent());
        System.out.println("Button: " + saveButton.isEnabled());
    }

    private void titleChanged() {
        var content = textBox.getContent();
        var isEmpty = (content==null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }

    private void articleSelected() {
        textBox.setContent(listBox.getSelection());
        saveButton.setEnabled(true);
    }
}
