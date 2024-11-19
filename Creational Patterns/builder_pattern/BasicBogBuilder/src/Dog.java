import java.util.List;

public class Dog {
    private String name;
    private String type;
    private Integer age;
    private List<String> toys;

    private Dog(Builder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.age = builder.age;
        this.toys = builder.toys;
    }


    public static class Builder {
        private String name;
        private String type;
        private Integer age;
        private List<String> toys;

        public Builder(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder toys(List<String> toys) {
            this.toys = toys;
            return this;
        }


         public Dog build() {
        // Validate required fields
        if (name == null || type == null) {
            throw new IllegalStateException("Name and type are required fields.");
        }

        return new Dog(this);
    }
    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getToys() {
        return toys;
    }





 
}
