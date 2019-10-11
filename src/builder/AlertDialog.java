package builder;

public class AlertDialog {
    private String title;
    private String text;
    private String applyButton;
    private String cancelButton;

    AlertDialog(String title, String text, String applyButton, String cancelButton) {
        this.title = title;
        this.text = text;
        this.applyButton = applyButton;
        this.cancelButton = cancelButton;
    }

    @Override
    public String toString() {
        String str = "";
        if (title != null) {
            str += "The title is: \"" + title + "\"\n";
        }
        if (text != null) {
            str += "The text is: \"" + text + "\"\n";
        }
        if (applyButton != null) {
            str += "The applyButton is: \"" + applyButton + "\"\n";
        }
        if (cancelButton != null) {
            str += "The cancelButton is: \"" + cancelButton + "\"\n";
        }

        return str;
    }

    public static class Builder {
        private String title;
        private String text;
        private String applyButton;
        private String cancelButton;

        public Builder() {}

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setText(String text) {
            this.text = text;
            return this;
        }

        public Builder setApplyButton(String applyButton) {
            this.applyButton = applyButton;
            return this;
        }

        public Builder setCancelButton(String cancelButton) {
            this.cancelButton = cancelButton;
            return this;
        }

        public AlertDialog build() {
            return new AlertDialog(title, text, applyButton, cancelButton);
        }
    }
}