
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.*;

/**
 * Created by USER on 12.02.2017.
 */

public class test extends BasicGame{
    private Image img;
    public test(String title) {
        super(title);
    }

    public static void main(String[] args) throws SlickException {
        AppGameContainer gameContainer =new AppGameContainer(new test("HI"));
        gameContainer.setDisplayMode(800,600, false);
        gameContainer.start();
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        gameContainer.setVSync(true);


    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        GL11.glClearColor(0.3f,0.7f,0.8f,1);
        graphics.drawString("If you see this text, all Is good", 10,40);

    }
}
