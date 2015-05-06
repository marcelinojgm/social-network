import java.util.ArrayList;

public class  MessagePost extends Post
{
    private String username;
    private String message;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor de la clase MessagePost
     *
     * @param author el nombre de usuario que crea el post
     * @param text el mensaje del post
     *
     **/
    public MessagePost (String author, String text)
    {
        super(author);
        this.username = author;
        this.message = text;
        this.timestamp = System.currentTimeMillis();
        this.likes = 0;
        comments = new ArrayList<>();
    }

    /**
     * Devuelve el texto del post
     *
     * @return el texto del post
     **/
    public String getText()
    {
        return message;
    }

    /*
     * Muestra por pantalla los datos del post
     *
     */
    public void display()
    {
        System.out.println("Mensaje " + message);
        super.display();

    }

    public void printShortSummary(){
        String user = getUsername();
        System.out.println("Esto es un post de texto creado" + user + "donde" + user +" es el autor del post y consigue que funcione");
    }
    
}




