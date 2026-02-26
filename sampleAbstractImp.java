package BasicPractice;

public class sampleAbstractImp 
        extends sampleAbstract 
        implements sampleInterface {

    @Override
    public void createObject() {

        Reviews reviews = new Reviews();
        reviews.setReviewerEmail("yuva@emailidd.com");
        reviews.setComment("dfghfgf");
        reviews.setDate("12/03/2026");

        System.out.println("Object created successfully");
        System.out.println(reviews);
    }

    @Override
    public void printFunction() {
        System.out.println("Implemented print function");
    }
}