package engine.window;

import engine.map.Din;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by USER on 20.02.2017.
 */
public class Window extends BasicGame{
    ArrayList<Integer> arr;
    Camera camera;
    Input input;

    public Window(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        gameContainer.setTargetFrameRate(60);
        gameContainer.setAlwaysRender(true);
        gameContainer.setVSync(true);




        camera = new Camera(0,0);
        input = gameContainer.getInput();

        arr = Din.getSmoothRandom(400,70,120,Din.PLAIN,Din.PLAIN);
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        input = gameContainer.getInput();
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        camera.translate(graphics, input);
        for(int i = 0; i < arr.size(); i++){
            graphics.drawRect(i*32, gameContainer.getHeight() - 32 * arr.get(i),32, 32 * arr.get(i));
        }

    }
}
