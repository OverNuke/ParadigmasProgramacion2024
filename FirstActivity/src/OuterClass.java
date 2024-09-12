public class OuterClass {

    String outerField = "Outer field";
    static String staticOuterField = "Static outer field";

    static class StaticNestedClass {
        void accessMembers(OuterClass outer) {
            // System.out.println(outerField);
            // Compiler error: Cannot make a static reference to the non-static
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
            //     field outerField
        }
    }
}