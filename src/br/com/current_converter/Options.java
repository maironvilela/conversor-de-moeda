package br.com.current_converter;

public class Options {
    private String description;

     private String code;

     private String continent;

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return """
            %s - %s
     """.formatted(code,description );
    }
}
