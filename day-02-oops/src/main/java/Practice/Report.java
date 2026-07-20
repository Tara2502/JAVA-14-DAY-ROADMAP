package Practice;

public class Report implements Printable{
    private String title;
    private String content;
    public Report(String title,String content){
        if(title==null || title.isBlank()){
            throw new IllegalArgumentException("title cannot be blank");
        }
        if(content==null || content.isBlank()){
            throw new IllegalArgumentException("content cannot be blank");
        }
        this.title=title;
        this.content=content;
    }

    @Override
    public void print() {
        System.out.println("report title: "+title);
        System.out.println("report content: "+content);
    }
}
