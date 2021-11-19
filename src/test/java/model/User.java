package model;

public class User {

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public static UserBuilder newBuilder() {
        return new User().new UserBuilder();
    }

    public class UserBuilder {
        public UserBuilder() {
        }

        public UserBuilder setName(String name) {
            User.this.name = name;
            return this;
        }

        public UserBuilder setPassword(String password) {
            User.this.password = password;
            return this;
        }

        public User build() {
            return User.this;
        }
    }
}
