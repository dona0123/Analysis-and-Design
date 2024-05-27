package ch07;

public class XMLBuilder extends Builder {

    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        sb.append("<document>\n\n<title>"); 
        sb.append(title);
        sb.append("</title>\n");
    }

    @Override
    public void makeString(String str) {
        sb.append("<string>");
        sb.append(str);
        sb.append("</string>\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        sb.append("<items>\n");
        for (String s : items) {
            sb.append("<item>");
            sb.append(s);
            sb.append("</item>\n");
        }
        sb.append("</items>\n\n");
    }

    @Override
    public void close() {
        sb.append("</document>\n");
    }

    public String geXMLResult() {
        return sb.toString();
    }

}
