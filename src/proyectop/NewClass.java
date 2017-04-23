package proyectop;
import .application.Application;


public class NewClass extends Application {
    public static void main(String[]args)
    {
        launch(args);
    }
    public void start(final Stage stage)throws Exception
    {
        Group root = new Group();
         
        Media media = new Media("file:/Users/pc/Desktop/Video.mp4");
        final MediaPlayer player = new MediaPlayer(media);
        MediaView view = new MediaView(player);
      
        System.out.println("media.width: "+media.getWidth());
         
        root.getChildren().add(view);
        Scene scene = new Scene(root,400,400,Color.BLACK);
        stage.setScene(scene);
        stage.show();
         
        player.play();
        player.setOnReady(new Runnable()
        {
            @Override
            public void run()
            {
                int w = player.getMedia().getWidth();
                int h = player.getMedia().getHeight();
                 
                stage.setMinWidth(w);
                stage.setMaxHeight(h);
            }
        });
    }
    }
