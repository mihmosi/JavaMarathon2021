package day0.JmProjects.TextAnaliser;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    public Label processText(String text) {
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < getKeywords().length; j++) {
                if (text.contains(getKeywords()[j])) {
                    return getLabel();
                }
            }
        }
        return Label.OK;
    }
}

