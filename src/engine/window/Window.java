package engine.window;

import engine.map.Din;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by USER on 20.02.2017.
 */
public class Window extends BasicGame{
    ArrayList<Integer> arr;


    public Window(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        gameContainer.setTargetFrameRate(60);

        arr = Din.getSmoothRandom(40,10,70,Din.PLAIN,Din.PLAIN);
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for(int i = 0; i < arr.size(); i++){
            graphics.drawRect(i*(gameContainer.getWidth())/arr.size(), gameContainer.getHeight() - 32 * arr.get(i),(gameContainer.getWidth())/arr.size(), 32 * arr.get(i));
        }
    }
}
