package ro.pub.cs.systems.eim.practicaltest02.model;

public class ServerInformation {

    private final String site;
    private String abilities;
    private String types;
    private String image_url;

    public ServerInformation(String site) {
        this.site = site;
    }

    public String getAbilities() {
        return abilities;
    }

    public String getTypes() {
        return types;
    }

    public String getImage_url() {
        return image_url;
    }
    public String getSite() {
        return site;
    }

    @Override
    public String toString() {
        return "ServerInformation{" +
                "site='" + site + '\'' +
                '}';
    }
}
