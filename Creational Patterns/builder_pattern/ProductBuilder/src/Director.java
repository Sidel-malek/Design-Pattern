public class Director {
    public Product construct(builder builder){
        builder.setName("Sports Car");
        builder.setPrice(963757);
        builder.setColor("Red");
        return builder.build();
    }
}
