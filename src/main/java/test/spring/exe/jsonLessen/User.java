package test.spring.exe.jsonLessen;


public class User {
    @JsonElement
    private String name;
    @JsonElement(key = "PersonAge")
    private String age;
    @JsonElement
    private String country;

    public User(String name, String age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }
}
