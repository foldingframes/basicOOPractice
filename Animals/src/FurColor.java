//Practicing enums with furcolors on an animal

public enum FurColor {
    BLACK("black"),
    GREY("grey"),
    WHITE("white"),
    BROWN("meh"),
    RED("i guess its alright"),
    YELLOW("only on certain animals");

    final String coolFactor;

    FurColor (String coolFactor){
        this.coolFactor = coolFactor;
    }
}
